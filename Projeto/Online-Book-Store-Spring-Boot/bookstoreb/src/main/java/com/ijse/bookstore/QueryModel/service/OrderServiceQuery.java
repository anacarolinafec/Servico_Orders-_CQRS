package com.ijse.bookstore.QueryModel.service;


import com.ijse.bookstore.CommandModel.dto.NewOrderDTO;
import com.ijse.bookstore.QueryModel.entity.OrderQuery;

import org.springframework.stereotype.Service;

@Service
public interface OrderServiceQuery {
    OrderQuery getOrderByUserId(Long userId);
}
