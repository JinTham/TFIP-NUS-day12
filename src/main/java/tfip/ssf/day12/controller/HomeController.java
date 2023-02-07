package tfip.ssf.day12.controller;

import java.util.Date;
import java.util.Calendar;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path={"/home","/index"})
public class HomeController {
    @GetMapping()
    public String home(Model model){
        Calendar cal = Calendar.getInstance();

        //Bind the Date info with the variable named "currTime" then pass this variable to index.html to be used there
        model.addAttribute("currTime",new Date().toString());
        model.addAttribute("currHour",cal.get(Calendar.HOUR_OF_DAY));
        return "index";
    }
}
