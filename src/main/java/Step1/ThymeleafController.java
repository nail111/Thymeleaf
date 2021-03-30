package Step1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ThymeleafController {

    @GetMapping("/{name}")
    public String HelloWorld(@PathVariable String name, Model model) {
    model.addAttribute("TheName",name);

    return "step1/Hello";
    }
}