package com.example.order.repository;

import com.example.order.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface OrderRepository extends JpaRepository<Order,Long> {
    Optional<Order> findOrderByOrders(String orders);
    Optional<Order> findOrderByUuid(String uuid);
    List<Order> findOrderByClient(String client);
}
