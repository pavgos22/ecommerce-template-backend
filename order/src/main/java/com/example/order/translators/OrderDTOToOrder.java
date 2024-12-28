package com.example.order.translators;

import com.example.order.entity.Deliver;
import com.example.order.entity.DeliverDTO;
import com.example.order.entity.Order;
import com.example.order.entity.OrderDTO;
import org.springframework.stereotype.Component;

@Component
public class OrderDTOToOrder {

    public Order toOrder(OrderDTO orderDTO) {
        return translate(orderDTO);
    }

    private Order translate(OrderDTO orderDTO) {
        if (orderDTO == null) {
            return null;
        }

        Order order = new Order();
        order.setFirstName(orderDTO.getCustomerDetails().getFirstName());
        order.setLastName(orderDTO.getCustomerDetails().getLastName());
        order.setEmail(orderDTO.getCustomerDetails().getEmail());
        order.setPhone(orderDTO.getCustomerDetails().getPhone());
        order.setCity(orderDTO.getAddress().getCity());
        order.setNumber(orderDTO.getAddress().getNumber());
        order.setStreet(orderDTO.getAddress().getStreet());
        order.setPostCode(orderDTO.getAddress().getPostCode());
        order.setDeliver(translate(orderDTO.getDeliver()));
        return order;
    }

    private Deliver translate(DeliverDTO deliverDTO) {
        if (deliverDTO == null) {
            return null;
        }

        Deliver deliver = new Deliver();
        deliver.setUuid(deliverDTO.getUuid());
        deliver.setName(deliverDTO.getName());
        deliver.setPrice(deliverDTO.getPrice());

        return deliver;
    }
}
