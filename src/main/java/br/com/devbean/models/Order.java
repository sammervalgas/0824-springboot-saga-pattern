package br.com.devbean.models;

import br.com.devbean.enums.OrderStatus;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

public class Order {

    private UUID publicId;

    private String customerName;

    private LocalDateTime orderDate;

    private BigDecimal totalAmout;

    private OrderStatus status;

    public Order() { }

    public Order(UUID publicId, String customerName, LocalDateTime orderDate, BigDecimal totalAmout, OrderStatus status) {
        this.publicId = publicId;
        this.customerName = customerName;
        this.orderDate = orderDate;
        this.totalAmout = totalAmout;
        this.status = status;
    }

    public Order(String customerName, LocalDateTime orderDate, BigDecimal totalAmout, OrderStatus status) {
        this.customerName = customerName;
        this.orderDate = orderDate;
        this.totalAmout = totalAmout;
        this.status = status;
    }

    public UUID getPublicId() {
        return publicId;
    }

    public void setPublicId(UUID publicId) {
        this.publicId = publicId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }

    public BigDecimal getTotalAmout() {
        return totalAmout;
    }

    public void setTotalAmout(BigDecimal totalAmout) {
        this.totalAmout = totalAmout;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }
}
