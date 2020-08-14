package com.weifengcui.demo.controller;

import com.weifengcui.demo.entity.BlogMessage;
import com.weifengcui.demo.repository.BlogMessageRepository;
import com.weifengcui.demo.response.GeneralResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.Optional;

/**
 * CRUD APIs for blog message data.
 */
@Controller
@RequestMapping(path = "/blog")
public class BlogMessageController {
    @Autowired
    private BlogMessageRepository messageRepository;

    @PostMapping(path = "/create")
    public @ResponseBody
    GeneralResponse create(
            @RequestParam int userId,
            @RequestParam String title,
            @RequestParam String description) {

        Date now = new Date();
        messageRepository.save(new BlogMessage(userId, title, description, now));
        return GeneralResponse.SUCCESS;
    }

    @PostMapping(path = "/update")
    public @ResponseBody
    BlogMessage update(
            @RequestParam int messageId,
            @RequestParam String title,
            @RequestParam String description) {

        Optional<BlogMessage> messageOptional = messageRepository.findById(messageId);
        if (!messageOptional.isPresent()) {
            return new BlogMessage();
        }

        BlogMessage message = messageOptional.get();
        message.setTitle(title);
        message.setDescription(description);
        return messageRepository.save(message);
    }

    @GetMapping(path = "/list")
    public @ResponseBody
    Iterable<BlogMessage> list(@RequestParam int num) {
        return messageRepository.listReverseOrderByCreatedTS(num);
    }

    // For debug only.
    @GetMapping(path = "/all")
    public @ResponseBody
    Iterable<BlogMessage> getAllMessages() {
        return messageRepository.findAll();
    }
}