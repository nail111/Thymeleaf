package Step3;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;


// bootstrap


@Controller
public class EmployeeController {
   private List<Employee> theEmployees;

   @PostConstruct
    private void loadData() {
       Employee emp1 = new Employee(1,"Bill","Gates","Bill@mail.ru");
       Employee emp2 = new Employee(2,"Elvis","Presley","Elvis@mail.ru");
       Employee emp3 = new Employee(3,"Albert","Einstein","Albert@mail.ru");
       theEmployees = new ArrayList<Employee>();
       theEmployees.add(emp1);
       theEmployees.add(emp2);
       theEmployees.add(emp3);

   }

   @GetMapping
    public String AllEmployees(Model model) {
       model.addAttribute("employees",theEmployees);
       return "step3/bootstrap";
   }
}