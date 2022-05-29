package com.codecademy.goldmedal.repositories;

import com.codecademy.goldmedal.model.GoldMedal;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface GoldMedalRepository extends CrudRepository<GoldMedal, Long>{
    public List<GoldMedal> findByYear();
    public List<GoldMedal> findByCity();
    public List<GoldMedal> findBySeason();
    public List<GoldMedal> findByName();
    public Optional<List<GoldMedal>> findByCountry(String countryName);
    public List<GoldMedal> findByGender();
    public List<GoldMedal> findBySport();
    public List<GoldMedal> findByDiscipline();
    public List<GoldMedal> findByEvent();
    public List<GoldMedal> findBySeasonIsSummerAndOrderByYearAscending();
    public List<GoldMedal> findBySeasonIsWinter();
    public Long findEventsBySeasonIsSummer();
    public Long findEventsBySeasonIsWinterAndOrderByYearAscending();
    public Long findEventsByGenderIsFemale();
    public Long findEventsByGenderIsMale();
}
