package Step5;

import org.springframework.stereotype.Service;

@Service
public class Employee {
    private String name;
    private String programLang;

    public Employee() {
    }

    public Employee(String name, String programLang) {
        this.name = name;
        this.programLang = programLang;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProgramLang() {
        return programLang;
    }

    public void setProgramLang(String programLang) {
        this.programLang = programLang;
    }
}
