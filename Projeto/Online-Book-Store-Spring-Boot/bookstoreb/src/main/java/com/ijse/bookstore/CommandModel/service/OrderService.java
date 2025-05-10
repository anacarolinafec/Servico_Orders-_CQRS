package com.ijse.bookstore.CommandModel.service;


import com.ijse.bookstore.CommandModel.dto.NewOrderDTO;
import com.ijse.bookstore.CommandModel.entity.Order;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface OrderService {
    Order createOrderDetails(NewOrderDTO newOrderDTO);
    Order getOrderByUserId(Long userId);
}
