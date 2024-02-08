package it.epicode.ordiniTavoli.service;

import it.epicode.ordiniTavoli.bean.Item;
import it.epicode.ordiniTavoli.bean.Menu;
import it.epicode.ordiniTavoli.repository.ItemRepository;
import it.epicode.ordiniTavoli.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuService {
    @Autowired
    private MenuRepository menuRepository;

    public void salvaMenu(Menu menu){
        menuRepository.save(menu);
    }

    public Menu cercaMenuPerId(int id){
        return menuRepository.findById(id).get();
    }

    public List<Menu> cercaTuttiGliMenu(){
        return menuRepository.findAll();
    }

    public void cancellaMenuPerId(int id){
        menuRepository.deleteById(id);
    }

}
