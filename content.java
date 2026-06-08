package com.example.demo.controller;

import com.example.demo.model.Contact;
import com.example.demo.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * REST controller for managing contact form submissions.
 */
@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api") // base path for all endpoints
public class ContactController {

    private final ContactRepository contactRepository;

    @Autowired
    public ContactController(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    /**
     * Save a new contact submission.
     */
    @PostMapping("/contacts")
    public Contact saveContact(@RequestBody Contact contact) {
        return contactRepository.save(contact);
    }

    /**
     * Retrieve all saved contacts.
     */
    @GetMapping("/contacts")
    public List<Contact> getAllContacts() {
        return contactRepository.findAll();
    }
}
