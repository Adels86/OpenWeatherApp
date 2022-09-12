package net.atos.weatherapplication.repository;

import net.atos.weatherapplication.model.Entity.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;
import java.util.List;
@Transactional
public interface CityRepository extends JpaRepository<City,Integer> {
    @Modifying
    @Query("update City c set c.isSelected = ?1  where c.id = ?2")
    void setCityByID(boolean isSelected, Integer cityId);


}
