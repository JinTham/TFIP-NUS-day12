package tfip.ssf.day12.controller;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(path="/workshop")
public class WorkshopController {
    @GetMapping
    public String workshop(Model model){
        return "workshop";
    }

    @PostMapping("/processNumber")
    public String processNumber(@RequestParam(name="inputNum",defaultValue="1") Integer inputNum, Model model){
        //Set<Integer> randSet = new HashSet<>();
        List<Integer> randList = new ArrayList<>();
        Random rand = new SecureRandom();
        Integer currentValue = 1;
        while(currentValue<=inputNum){
            Integer randNum = rand.nextInt(20)+1;
            if (!randList.contains(randNum)){
                randList.add(randNum);
                currentValue ++;
            }
        }
        model.addAttribute("randList",randList);
        return "workshopResult";
    }
}
