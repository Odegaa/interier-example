package uz.interier.repositories;

import uz.interier.models.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends JpaRepository<City, Long> {

    City getCityByCityName(String cityName);

    City findCityByCityName(String cityName);

    boolean existsByCityName(String cityName);

}