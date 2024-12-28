package com.example.order.repository;

import com.example.order.entity.Order;
import com.example.order.entity.OrderItems;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemRepository extends JpaRepository<OrderItems,Long> {

    List<OrderItems> findOrderItemsByOrder(Order order);
}
