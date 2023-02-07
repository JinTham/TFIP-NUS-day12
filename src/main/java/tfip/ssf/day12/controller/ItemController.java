package tfip.ssf.day12.controller;

import tfip.ssf.day12.model.Item;
import tfip.ssf.day12.service.ItemService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
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
}
