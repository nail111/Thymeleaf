package Step6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;


// checkbox

@Controller
public class AppController {
    @Autowired
    private Users users;

    @GetMapping("/")
    public String HomePage(Model model) {
        model.addAttribute("us",users);
        return "step6/homepage";
    }

    @GetMapping("/result")
    public String result(@ModelAttribute("us") Users users1, Model model) {
        model.addAttribute("emp",users1);
        return "step6/final";
    }

}
