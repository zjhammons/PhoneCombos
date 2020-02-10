package com.hammons.PhoneCombos;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Controller
public class PhoneNumberController {

    @GetMapping("/number")
    public String numberForm( Model model){
        model.addAttribute("number", new Number());
        return "number";
    }

    @PostMapping("/number")
    public String numberSubmit(@ModelAttribute Number number, Model model){
        String num = number.getPhoneNumber();
        List<String> result = number.getCombos((num));
        int count = result.size();
        model.addAttribute("result", result);
        model.addAttribute("count", count);
        return "result";
    }
}