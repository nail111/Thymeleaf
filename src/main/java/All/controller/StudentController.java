package All.controller;

import All.model.Student;
import All.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

import javax.validation.Valid;

@Controller
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping
    public String getAll(Model model, String keyword) {
        if(keyword != null) {
            model.addAttribute("all",studentService.findByKeyword(keyword));
        }
        else {
            model.addAttribute("all",studentService.getAll());
        }
        return "homepage";
    }

    @GetMapping("add")
    public String addStudent(Model model) {
        Student student = new Student();
        model.addAttribute("obj",student);
        return "add";
    }

    @GetMapping("finalOfAdding")
    public String finalOfAdding(@Valid @ModelAttribute("obj") Student student, BindingResult bindingResult) {
        if(bindingResult.hasErrors()) {
            return "add";
        }
        studentService.addStudent(student);
        return "redirect:/";
    }
    @GetMapping("delete/{id}")
    public String deleteStudent(@PathVariable("id") Integer id) {
        studentService.deleteStudent(id);
        return "redirect:/";
    }
    @GetMapping("update/{id}")
    public String updateStudent(@PathVariable("id") Integer id,Model model) {
        Student student = new Student();
        student.setId(id);
        model.addAttribute("obj",student);
        return "update";
    }

    @GetMapping("finalOfUpdating/{id}")
    public String finalOfUpdating(@PathVariable("id") Integer id,@Valid @ModelAttribute("obj") Student student, BindingResult bindingResult) {
        if(bindingResult.hasErrors()) {
            return "update";
        }
        studentService.updateStudent(id,student);
        return "redirect:/";
    }
}
