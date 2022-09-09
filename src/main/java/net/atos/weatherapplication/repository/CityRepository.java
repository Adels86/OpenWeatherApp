package net.atos.weatherapplication.repository;

import net.atos.weatherapplication.model.Entity.City;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CityRepository extends JpaRepository<City,Integer> {


}
