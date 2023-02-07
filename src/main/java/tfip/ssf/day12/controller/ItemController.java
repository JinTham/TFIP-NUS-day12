package tfip.ssf.day12.controller;

import tfip.ssf.day12.model.Item;
import tfip.ssf.day12.service.ItemService;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path={"/shoppingCart"})
public class ItemController {
    @Autowired
    ItemService itemService;

    @GetMapping(produces="text/html")
    public String displayCart(Model model){
        List<Item> items = itemService.retrieveItemList();
        model.addAttribute("cartItems",items);
        return "cartList";
    }

    //Access this path through URL: /shoppingCart/itemName, to show only the specified item
    @GetMapping("{itemName}")
    public String filterCart(@PathVariable("itemName") String itemName, Model model){
        List<Item> items = itemService.retrieveItemList();
        List<Item> foundItem = items.stream().filter(i->i.getItemName().equalsIgnoreCase(itemName)).collect(Collectors.toList());
        model.addAttribute("cartItems",foundItem);
        return "cartList";
    }
}
