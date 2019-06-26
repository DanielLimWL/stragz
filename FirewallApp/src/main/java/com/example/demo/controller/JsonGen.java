package com.example.demo.controller;

import com.example.demo.config.Feed;
import com.example.demo.entity.Email;
import com.example.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class JsonGen {

    @Autowired
    private Feed feed;

    @GetMapping(value = "/")
    public String showCheckbox(Model model) {
        model.addAttribute("feedToStages", feed.getFeedToStages());
        model.addAttribute("email", new Email());
        return "index";
    }

    @PostMapping(value = "/")
    public String create(@ModelAttribute Email email) {
        return "jsonCreated";
    }

}
