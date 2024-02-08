package it.epicode.ordiniTavoli.service;

import it.epicode.ordiniTavoli.bean.Item;
import it.epicode.ordiniTavoli.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {
    @Autowired
    private ItemRepository itemRepository;

    public void salvaItem(Item item){
        itemRepository.save(item);
    }

    public Item cercaItemPerId(int id){
        return itemRepository.findById(id).get();
    }

    public List<Item> cercaTuttiGliItem(){
        return itemRepository.findAll();
    }

    public void cancellaItemPerId(int id){
        itemRepository.deleteById(id);
    }


}
