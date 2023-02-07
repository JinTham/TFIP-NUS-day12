package tfip.ssf.day12.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tfip.ssf.day12.model.Item;
import tfip.ssf.day12.repository.ItemRepo;

@Service
public class ItemService {
    @Autowired
    ItemRepo itemRepo;

    public List<Item> retrieveItemList(){
        return itemRepo.getCartItems();
    }
}
