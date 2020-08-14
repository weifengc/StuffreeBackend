package com.weifengcui.demo.controller;

import com.weifengcui.demo.entity.BlogMessage;
import com.weifengcui.demo.repository.BlogMessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@Controller
@RequestMapping(path="/blog")
public class BlogMessageController {
    @Autowired
    private BlogMessageRepository messageRepository;

    @PostMapping(path="/add") // Map ONLY POST Requests
    public @ResponseBody String addMessage (@RequestParam int userId
            , @RequestParam String title, @RequestParam String description) {

        Date now = new Date();
        BlogMessage message = new BlogMessage(userId, title, description, now);
        messageRepository.save(message);
        return "Saved";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<BlogMessage> getAllMessages() {
        // This returns a JSON or XML with the users
        return messageRepository.findAll();
    }
}