package com.presldn.ProductService.command.data;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Objects;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
public class Product {

    @Id
    private String productId;
    private String name;
    private BigDecimal price;
    private Integer quantity;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Product product = (Product) o;
        return productId != null && Objects.equals(productId, product.productId);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
