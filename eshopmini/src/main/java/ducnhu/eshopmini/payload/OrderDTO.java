package ducnhu.eshopmini.payload;

import java.time.LocalDate;
import java.util.List;

public class OrderDTO {
    private Long orderId;
    private String email;
    private List<OrderItemDTO> orderItems;
    private LocalDate orderDate;
    private PaymentDTO payment;
    private Double totalAmount;
    private String orderStatus;
    private Long addressId;

    public OrderDTO(Long orderId, String email, List<OrderItemDTO> orderItems, LocalDate orderDate, PaymentDTO payment, Double totalAmount, String orderStatus, Long addressId) {
        this.orderId = orderId;
        this.email = email;
        this.orderItems = orderItems;
        this.orderDate = orderDate;
        this.payment = payment;
        this.totalAmount = totalAmount;
        this.orderStatus = orderStatus;
        this.addressId = addressId;
    }

    public OrderDTO() {
    }

    public Long getOrderId() {
        return this.orderId;
    }

    public String getEmail() {
        return this.email;
    }

    public List<OrderItemDTO> getOrderItems() {
        return this.orderItems;
    }

    public LocalDate getOrderDate() {
        return this.orderDate;
    }

    public PaymentDTO getPayment() {
        return this.payment;
    }

    public Double getTotalAmount() {
        return this.totalAmount;
    }

    public String getOrderStatus() {
        return this.orderStatus;
    }

    public Long getAddressId() {
        return this.addressId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setOrderItems(List<OrderItemDTO> orderItems) {
        this.orderItems = orderItems;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public void setPayment(PaymentDTO payment) {
        this.payment = payment;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof OrderDTO)) return false;
        final OrderDTO other = (OrderDTO) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$orderId = this.getOrderId();
        final Object other$orderId = other.getOrderId();
        if (this$orderId == null ? other$orderId != null : !this$orderId.equals(other$orderId)) return false;
        final Object this$email = this.getEmail();
        final Object other$email = other.getEmail();
        if (this$email == null ? other$email != null : !this$email.equals(other$email)) return false;
        final Object this$orderItems = this.getOrderItems();
        final Object other$orderItems = other.getOrderItems();
        if (this$orderItems == null ? other$orderItems != null : !this$orderItems.equals(other$orderItems))
            return false;
        final Object this$orderDate = this.getOrderDate();
        final Object other$orderDate = other.getOrderDate();
        if (this$orderDate == null ? other$orderDate != null : !this$orderDate.equals(other$orderDate)) return false;
        final Object this$payment = this.getPayment();
        final Object other$payment = other.getPayment();
        if (this$payment == null ? other$payment != null : !this$payment.equals(other$payment)) return false;
        final Object this$totalAmount = this.getTotalAmount();
        final Object other$totalAmount = other.getTotalAmount();
        if (this$totalAmount == null ? other$totalAmount != null : !this$totalAmount.equals(other$totalAmount))
            return false;
        final Object this$orderStatus = this.getOrderStatus();
        final Object other$orderStatus = other.getOrderStatus();
        if (this$orderStatus == null ? other$orderStatus != null : !this$orderStatus.equals(other$orderStatus))
            return false;
        final Object this$addressId = this.getAddressId();
        final Object other$addressId = other.getAddressId();
        if (this$addressId == null ? other$addressId != null : !this$addressId.equals(other$addressId)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof OrderDTO;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $orderId = this.getOrderId();
        result = result * PRIME + ($orderId == null ? 43 : $orderId.hashCode());
        final Object $email = this.getEmail();
        result = result * PRIME + ($email == null ? 43 : $email.hashCode());
        final Object $orderItems = this.getOrderItems();
        result = result * PRIME + ($orderItems == null ? 43 : $orderItems.hashCode());
        final Object $orderDate = this.getOrderDate();
        result = result * PRIME + ($orderDate == null ? 43 : $orderDate.hashCode());
        final Object $payment = this.getPayment();
        result = result * PRIME + ($payment == null ? 43 : $payment.hashCode());
        final Object $totalAmount = this.getTotalAmount();
        result = result * PRIME + ($totalAmount == null ? 43 : $totalAmount.hashCode());
        final Object $orderStatus = this.getOrderStatus();
        result = result * PRIME + ($orderStatus == null ? 43 : $orderStatus.hashCode());
        final Object $addressId = this.getAddressId();
        result = result * PRIME + ($addressId == null ? 43 : $addressId.hashCode());
        return result;
    }

    public String toString() {
        return "OrderDTO(orderId=" + this.getOrderId() + ", email=" + this.getEmail() + ", orderItems=" + this.getOrderItems() + ", orderDate=" + this.getOrderDate() + ", payment=" + this.getPayment() + ", totalAmount=" + this.getTotalAmount() + ", orderStatus=" + this.getOrderStatus() + ", addressId=" + this.getAddressId() + ")";
    }
}
