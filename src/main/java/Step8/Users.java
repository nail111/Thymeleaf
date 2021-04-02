package Step8;

import org.springframework.stereotype.Service;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Service
public class Users {

    @Min(value = 0)
    @Max(value = 10)
    @NotNull
    private Integer number;

    public Users() {
    }

    public Users(Integer number) {
        this.number = number;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}
