package tfip.ssf.day12.repository;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;
import tfip.ssf.day12.model.Item;

@Repository
public class ItemRepo {
    private List<Item> itemList;

    public List<Item> getCartItems(){
        itemList = new ArrayList<>();
        //Add item1
        Item item = new Item();
        item.setItemName("Louis Vuitton");
        item.setQuantity(5);
        itemList.add(item);
        //Add item2
        item = new Item();
        item.setItemName("Prada");
        item.setQuantity(10);
        itemList.add(item);
        //Add item3
        item = new Item();
        item.setItemName("Hermes");
        item.setQuantity(15);
        itemList.add(item);
        //Add item4
        item = new Item();
        item.setItemName("Bottega");
        item.setQuantity(25);
        itemList.add(item);

        return itemList;
    }
}
