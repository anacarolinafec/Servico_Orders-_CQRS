package com.ijse.bookstore.QueryModel.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ijse.bookstore.QueryModel.entity.OrderQuery;
import com.ijse.bookstore.QueryModel.repository.OrderQueryRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;

@Service
public class OrderServiceQueryImpl implements OrderServiceQuery {

    private static final Logger log = LoggerFactory.getLogger(OrderServiceQueryImpl.class);

    //@Autowired
    //private MessageProducer messageProducer;
    @Autowired
    private OrderQueryRepository orderqueryRepository;
    @Autowired
    ObjectMapper objectMapper;


    @Override
    public OrderQuery getOrderByUserId(Long userId) {
        List<OrderQuery> orders = orderqueryRepository.findByUserIdWithDetails(userId);

        if (orders.isEmpty()) {
            throw new IllegalArgumentException("Order não existe");
        }

        // Devolve a encomenda mais recente
        orders.sort(Comparator.comparing(OrderQuery::getOrderDate).reversed());
        return orders.get(0);
    }

}
