package Step6;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Users {
    List<String> choose;

    public Users() {
    }

    public Users(List<String> choose) {
        this.choose = choose;
    }

    public List<String> getChoose() {
        return choose;
    }

    public void setChoose(List<String> choose) {
        this.choose = choose;
    }
}
