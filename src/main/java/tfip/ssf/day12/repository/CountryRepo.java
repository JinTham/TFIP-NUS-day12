package tfip.ssf.day12.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import tfip.ssf.day12.model.Country;

@Repository
public class CountryRepo {
    List<Country> countryList;
    public List<Country> getAllCountries(){
        countryList = new ArrayList<>();
        //Add country1
        Country country = new Country("SG","Singapore",6000000);
        countryList.add(country);
        //Add country2
        country = new Country("MY","Malaysia",33000000);
        countryList.add(country);
        //Add country3
        country = new Country("CN","China",140000000);
        countryList.add(country);
        //Add country4
        country = new Country("JP","Japan",10000000);
        countryList.add(country);
        //Add country5
        country = new Country("KR","Korea",80000000);
        countryList.add(country);

        return countryList;
    }

    public Boolean createCountry(Country country){
        if (countryList == null){
            countryList = new ArrayList<>();
        }
        countryList.add(country);
        return true;
    } 
}
