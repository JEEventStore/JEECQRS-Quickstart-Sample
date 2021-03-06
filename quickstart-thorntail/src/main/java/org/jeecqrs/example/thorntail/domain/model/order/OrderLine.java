package org.jeecqrs.example.thorntail.domain.model.order;

import org.jeecqrs.common.domain.model.AbstractEntity;
import org.jeecqrs.example.thorntail.domain.model.product.ProductId;

import java.math.BigDecimal;

/**
 * A line within an order.
 */
public final class OrderLine extends AbstractEntity<OrderLine, OrderLineId> {

    private final OrderLineId lineId;
    private final ProductId productId;
    private final String productName;
    private final BigDecimal pricePerItem;
    private final Integer quantity;

    public OrderLine(OrderLineId lineId, ProductId productId,
            String productName, BigDecimal pricePerItem, Integer quantity) {
        this.lineId = lineId;
        this.productId = productId;
        this.productName = productName;
        this.pricePerItem = pricePerItem;
        this.quantity = quantity;
    }

    @Override
    public OrderLineId id() {
        return lineId;
    }

    public ProductId productId() {
        return productId;
    }

    public String productName() {
        return productName;
    }

    public BigDecimal pricePerItem() {
        return pricePerItem;
    }

    public Integer quantity() {
        return quantity;
    }
    
}
