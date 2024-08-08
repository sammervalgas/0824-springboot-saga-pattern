package br.com.devbean.persistence.entities;

import br.com.devbean.enums.OrderStatus;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "TB_ORDERS")
@NoArgsConstructor
@Data
@EqualsAndHashCode(callSuper = true)
public class OrderEntity extends EntityCore {

    @Column(name = "CUSTOMER_NAME")
    private String customerName;

    @Column(name = "TOTAL_AMOUNT", nullable = false)
    private BigDecimal totalAmount;

    @Column(name = "ORDER_DATE")
    private LocalDateTime orderDate;

    @Enumerated(EnumType.STRING)
    @Column(name = "STATUS", nullable = false)
    private OrderStatus status;

    // Constructor
    public OrderEntity(
            String customerName,
            LocalDateTime orderDate,
            BigDecimal totalAmount,
            OrderStatus status,
                 UUID publicId,
            LocalDateTime createdAt,
            LocalDateTime updatedAt) {
        super(publicId, createdAt, updatedAt);
        this.customerName = customerName;
        this.orderDate = orderDate;
        this.totalAmount = totalAmount;
        this.status = status;
    }
}
