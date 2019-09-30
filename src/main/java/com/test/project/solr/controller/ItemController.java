package com.test.project.solr.controller;

import com.test.project.solr.model.Item;
import com.test.project.solr.repo.ItemRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
@RequestMapping(value = "api/")
public class ItemController {

    @Autowired
    ItemRepo itemRepo;

    @RequestMapping(value="items", method = RequestMethod.POST)
    @ResponseBody
    public void allItems() {
        Item item = new Item();
        itemRepo.save(item);
    }

    @RequestMapping(value ="item", method = RequestMethod.GET)
    @ResponseBody
    public List<Item> getItems() {
        return itemRepo.getItem();
    }

    @RequestMapping(value ="item", method = RequestMethod.DELETE)
    @ResponseBody
    public void deleteUser(@RequestParam String id) {
        itemRepo.deleteById(id);
    }


}
