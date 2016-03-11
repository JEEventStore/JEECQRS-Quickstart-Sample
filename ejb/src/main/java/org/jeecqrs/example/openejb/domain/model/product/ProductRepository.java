package org.jeecqrs.example.openejb.domain.model.product;

import org.jeecqrs.common.Identity;
import org.jeecqrs.common.domain.model.Repository;

public interface ProductRepository extends Repository<Product, ProductId, Identity> {

}
