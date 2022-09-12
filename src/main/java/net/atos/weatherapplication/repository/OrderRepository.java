package net.atos.weatherapplication.repository;

import net.atos.weatherapplication.model.Entity.City;
import net.atos.weatherapplication.model.UserOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<UserOrder,Integer> {
}
