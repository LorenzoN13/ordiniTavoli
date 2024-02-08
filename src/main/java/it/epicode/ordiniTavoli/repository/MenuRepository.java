package it.epicode.ordiniTavoli.repository;

import it.epicode.ordiniTavoli.bean.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuRepository extends JpaRepository<Menu,Integer> {
}
