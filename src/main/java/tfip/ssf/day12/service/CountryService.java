package tfip.ssf.day12.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tfip.ssf.day12.model.Country;
import tfip.ssf.day12.repository.CountryRepo;

@Service
public class CountryService {
    //@Autowired
    CountryRepo countryRepo;

    public CountryService(){
        countryRepo = new CountryRepo();
    }

    public List<Country> getAllCountries(){
        return countryRepo.getAllCountries();
    }

    public Boolean createCountry(Country country){
        Boolean result = countryRepo.createCountry(country);
        return result;
    }
}
