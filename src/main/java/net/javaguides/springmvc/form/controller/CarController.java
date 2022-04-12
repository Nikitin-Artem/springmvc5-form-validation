package net.javaguides.springmvc.form.controller;

import net.javaguides.springmvc.form.model.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/car")
public class CarController {

    @RequestMapping("/showForm")
    public String showForm(Model model) {
        model.addAttribute("car", new Car());

        return "car-form";
    }

    @RequestMapping("/processForm")
    public String processForm(@Valid @ModelAttribute("car") Car car,
                              BindingResult theBindingResult) {
        System.out.println("Last name: | " + car.getLastName() + " |");
        if (theBindingResult.hasErrors()) {
            return "car-form";
        }else
            return "car-confirmation";
    }
}
