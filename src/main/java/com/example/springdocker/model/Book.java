package com.example.springdocker.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book{
    String id;
    String title;
    String author;
    boolean isFiction;
    boolean isGood;
}
