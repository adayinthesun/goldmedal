package com.codecademy.goldmedal.repositories;

import com.codecademy.goldmedal.model.Country;
import com.codecademy.goldmedal.model.GoldMedal;
import org.springframework.data.repository.CrudRepository;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

public interface CountryRepository extends CrudRepository<GoldMedal, Long>{
    public List<Country> findByName(String name);
    public List<Country> findByCode(String code);
    public List<Country> findByGdp(BigDecimal gdp);
    public List<Country> findByPopulation(Integer population);
//    public List<GoldMedal> findByYear();
//    public List<GoldMedal> findByCity();
//    public List<GoldMedal> findBySeason();
//    public List<GoldMedal> findByName();
//    public Optional<List<GoldMedal>> findByCountry(String countryName);
//    public List<GoldMedal> findByGender();
//    public List<GoldMedal> findBySport();
//    public List<GoldMedal> findByDiscipline();
//    public List<GoldMedal> findByEvent();
//    public List<GoldMedal> findBySeasonIsSummerAndOrderByYearAscending();
//    public List<GoldMedal> findBySeasonIsWinter();
//    public Long findEventsBySeasonIsSummer();
//    public Long findEventsBySeasonIsWinterAndOrderByYearAscending();
//    public Long findEventsByGenderIsFemale();
//    public Long findEventsByGenderIsMale();
}
