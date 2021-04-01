package Step7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import javax.validation.Valid;

@Controller
public class AppController {

    @Autowired
  private Users users;

    @GetMapping("/")
    public String HomePage(Model model) {
        model.addAttribute("us",users);
        return "step7/homepage";
    }

    @GetMapping("/result")
    public String result(@Valid @ModelAttribute("us") Users users1, BindingResult bindingResult, Model model) {
        if(bindingResult.hasErrors()) {
            return "step7/homepage";
        }
        model.addAttribute("emp",users1);
        return "step7/final";
    }
}
