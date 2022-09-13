package net.atos.weatherapplication.repository;

import net.atos.weatherapplication.model.Entity.City;
import org.springframework.data.jpa.repository.JpaRepository;
import javax.transaction.Transactional;

@Transactional
public interface CityRepository extends JpaRepository<City,Integer> {



}
