package com.example.BookMyShowApplication.Repositories;

import com.example.BookMyShowApplication.Entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.swing.text.html.parser.Entity;

public interface UserRepository extends JpaRepository<UserEntity,Integer> {
}
