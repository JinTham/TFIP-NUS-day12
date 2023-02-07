package tfip.ssf.day12.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import tfip.ssf.day12.model.Country;
import tfip.ssf.day12.service.CountryService;

@Controller
@RequestMapping("/countries")
public class CountryController {
    CountryService countryService;
    public CountryController(){
        countryService = new CountryService();
    }

    //@GetMapping(produces = {"application/xml"})
    @GetMapping
    public @ResponseBody List<Country> getAllCountries(){
        return countryService.getAllCountries();
    }

    @PostMapping()
    public @ResponseBody Boolean createCountry(@RequestBody Country country){
        return countryService.createCountry(country);
    }

    @GetMapping("/list")
    public String displayCountryList(Model model){
        List<Country> countryList = countryService.getAllCountries();
        model.addAttribute("countryList",countryList);
        return "countries";
    }
}
