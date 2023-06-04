package cart.dto;

import java.time.LocalDateTime;
import java.util.Objects;

public class PurchaseOrderInfoResponse {

    private Long orderId;
    private int payAmount;
    private LocalDateTime orderAt;
    private String productName;
    private String productImageUrl;
    private int totalProductCount;

    public PurchaseOrderInfoResponse(Long orderId, int payAmount, LocalDateTime orderAt,
                                     String productName, String productImageUrl, int totalProductCount) {
        this.orderId = orderId;
        this.payAmount = payAmount;
        this.orderAt = orderAt;
        this.productName = productName;
        this.productImageUrl = productImageUrl;
        this.totalProductCount = totalProductCount;
    }

    public Long getOrderId() {
        return orderId;
    }

    public int getPayAmount() {
        return payAmount;
    }

    public LocalDateTime getOrderAt() {
        return orderAt;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductImageUrl() {
        return productImageUrl;
    }

    public int getTotalProductCount() {
        return totalProductCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PurchaseOrderInfoResponse that = (PurchaseOrderInfoResponse) o;
        return payAmount == that.payAmount && totalProductCount == that.totalProductCount && Objects.equals(orderId, that.orderId) && Objects.equals(orderAt, that.orderAt) && Objects.equals(productName, that.productName) && Objects.equals(productImageUrl, that.productImageUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, payAmount, orderAt, productName, productImageUrl, totalProductCount);
    }

    @Override
    public String toString() {
        return "PurchaseOrderInfoResponse{" +
                "orderId=" + orderId +
                ", payAmount=" + payAmount +
                ", orderAt=" + orderAt +
                ", productName='" + productName + '\'' +
                ", productImageUrl='" + productImageUrl + '\'' +
                ", totalProductCount=" + totalProductCount +
                '}';
    }
}