package com.example.order.translators;

import com.example.order.entity.OrderItems;
import com.example.order.entity.PayuProduct;
import org.springframework.stereotype.Component;

@Component
public class OrderItemsToPayuProduct {

    public PayuProduct toPayuProduct(OrderItems orderItems) {
        return translate(orderItems);
    }

    private PayuProduct translate(OrderItems orderItems) {
        if (orderItems == null) {
            return null;
        }

        PayuProduct payuProduct = new PayuProduct();
        payuProduct.setName(orderItems.getName());
        payuProduct.setQuantity(orderItems.getQuantity());
        // Casting priceUnit from double to long, assuming the unit price is expected in cents or a similar scale
        payuProduct.setUnitPrice((long) orderItems.getPriceUnit());
        return payuProduct;
    }
}

