package Step7;

import org.springframework.stereotype.Service;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Service
public class Users {

    @NotNull(message = "Id cannot be null")
    private Integer id;

    @NotBlank(message = "")
    @Size(min=5,max=10,message = "Min=5 and Max=10")
    private String name;

    public Users() {
    }

    public Users(@NotNull(message = "Id cannot be null") Integer id, @NotBlank @Size(min = 5, max = 10, message = "Min=5 and Max=10") String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
