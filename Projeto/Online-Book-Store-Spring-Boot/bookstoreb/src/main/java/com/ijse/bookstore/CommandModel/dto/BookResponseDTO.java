package com.ijse.bookstore.CommandModel.dto;

import lombok.Data;

@Data
public class BookResponseDTO {
    private long id;
    private String title;
    private String isbnNumber;
    private double price;
    private int quantity;
}
