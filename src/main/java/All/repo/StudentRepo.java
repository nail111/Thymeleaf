package All.repo;

import All.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface StudentRepo extends JpaRepository<Student,Integer> {
    @Query(nativeQuery = true, value = "UPDATE student SET name = :name,language = :language,way = :way,active = :active WHERE id = :id")
    @Modifying
    @Transactional
     void updateStudent(Integer id, String name, String language, String way, String active);

    @Query(value = "SELECT * FROM student s WHERE s.name LIKE %:keyword%",nativeQuery = true)
    List<Student> findByKeyword(@Param("keyword") String keyword);
}
