package com.hammons.PhoneCombos;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PhoneNumberController {

    @GetMapping("/number")
    public String numberForm(Model model){
        model.addAttribute("number", new Number());
        return "number";
    }

    @PostMapping("/number")
    public String numberSubmit(@ModelAttribute Number number){
        return "result";
    }
}
