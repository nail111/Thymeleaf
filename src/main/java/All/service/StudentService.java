package All.service;

import All.model.Student;
import All.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepo studentRepo;

    public List<Student> getAll() {
        return studentRepo.findAll();
    }
    public void addStudent(Student student) {
        studentRepo.save(student);
    }
    public void deleteStudent(Integer id) {
        studentRepo.deleteById(id);
    }
    public void updateStudent(Integer id, Student student) {
        studentRepo.updateStudent(id,student.getName(),student.getLanguage(),student.getWay(),student.getActive());
    }
    public List<Student> findByKeyword(String keyword) {
        return studentRepo.findByKeyword(keyword);
    }
}
