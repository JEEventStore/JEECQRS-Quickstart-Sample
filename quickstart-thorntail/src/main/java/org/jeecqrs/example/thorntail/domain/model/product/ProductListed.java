package org.jeecqrs.example.thorntail.domain.model.product;

import org.jeecqrs.common.domain.model.AbstractDomainEvent;

import java.math.BigDecimal;

/**
 * A product has been listed in the shop.
 */
public final class ProductListed extends AbstractDomainEvent<ProductListed> {

    private final ProductId productId;
    private final String name;
    private final String description;
    private final BigDecimal price;

    public ProductListed(ProductId productId, String name, String description, BigDecimal price) {
        this.productId = productId;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public ProductId productId() {
        return productId;
    }

    public String name() {
        return name;
    }

    public String description() {
        return description;
    }

    public BigDecimal price() {
        return price;
    }

}
