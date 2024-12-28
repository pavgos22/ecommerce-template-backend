package com.example.order.translators;


import com.example.order.entity.BasketItemDTO;
import com.example.order.entity.OrderItems;
import org.springframework.stereotype.Component;

@Component
public class BasketItemDTOToOrderItems {

    public OrderItems toOrderItems(BasketItemDTO basketItemDTO) {
        return translate(basketItemDTO);
    }

    private OrderItems translate(BasketItemDTO basketItemDTO) {
        if (basketItemDTO == null) {
            return null;
        }

        OrderItems orderItems = new OrderItems();
        orderItems.setProduct(basketItemDTO.getUuid());
        orderItems.setPriceUnit(basketItemDTO.getPrice());
        orderItems.setPriceSummary(basketItemDTO.getSummaryPrice());
        orderItems.setQuantity(basketItemDTO.getQuantity());
        orderItems.setName(basketItemDTO.getName());

        return orderItems;
    }
}
