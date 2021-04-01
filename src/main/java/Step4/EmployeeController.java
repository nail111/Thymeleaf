package Step4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;


// Selection


@Controller
public class EmployeeController {
    @Autowired
    private Employee employee;

    @GetMapping("/")
    public String HomePage(Model model) {
        model.addAttribute("user",employee);
        return "step4/homepage";
    }

    @GetMapping("/result")
    public String result(@ModelAttribute("user") Employee employee1, Model model) {
        model.addAttribute("emp",employee1);
        return "step4/final";
    }
}
