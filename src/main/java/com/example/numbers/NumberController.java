package com.example.numbers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.service.annotation.GetExchange;

import java.util.ArrayList;
import java.util.List;

@Controller
public class NumberController {
    @GetMapping("/Numbers")
    public String printAllNumbersThatCanBeDividedByThree(Model model , @RequestParam int n ){
        List<Integer> numbersDividedByThree = new ArrayList<>();
        for(int i = 2; i <= n;i++){
            if(i%3==0){
                numbersDividedByThree.add(i);
            }
        }
        model.addAttribute("numbersDividedByThree", numbersDividedByThree);
        return "DividedByThree";
    }
}
