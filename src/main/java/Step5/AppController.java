package Step5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class AppController {
    @Autowired
    private Employee employee;

    @GetMapping("/")
    public String HomePage(Model model) {
        model.addAttribute("emp",employee);
        return "step5/homepage";
    }
    @GetMapping("/result")
    public String result(@ModelAttribute("emp") Employee employee1,Model model) {
        model.addAttribute("us",employee1);
        return "step5/final";
    }

    // radio added
}
