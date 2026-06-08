package com.example.demo.repository;

import com.example.demo.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Repository interface for Contact entities.
 * Provides built-in CRUD operations and allows custom queries.
 */
@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {

    // Find a contact by email
    Optional<Contact> findByEmail(String email);

    // Check if a contact with a given email exists
    boolean existsByEmail(String email);
}
