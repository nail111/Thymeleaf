package Step9;

import org.springframework.stereotype.Service;

@Service
public class Users {

    @Nail(value = "HeyBro",message = "must start with HeyBro")
    private String nail;

    public String getNail() {
        return nail;
    }

    public void setNail(String nail) {
        this.nail = nail;
    }
}
