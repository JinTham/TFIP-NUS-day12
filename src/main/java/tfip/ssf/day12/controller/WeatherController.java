package tfip.ssf.day12.controller;

import javax.swing.plaf.TreeUI;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/weather")
public class WeatherController {
    //http://localhost:8080/weather?city=Singapore&units=cm
    @GetMapping
    public String weather(@RequestParam(required=true) String city, @RequestParam(name="units", defaultValue="kilometers") String units, Model model){
        model.addAttribute("city", city);
        model.addAttribute("units", units);
        return "weather";        
    }

    //http://localhost:8080/weather/Singapore?units=metres
    @GetMapping("{city}")
    public String weather2(@PathVariable(name="city", required=true) String city, @RequestParam(name="units", defaultValue="kilometers") String units, Model model){
        model.addAttribute("city", city);
        model.addAttribute("units", units);
        return "weather";        
    }
}
