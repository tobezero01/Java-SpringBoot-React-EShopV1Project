package ducnhu.eshopmini.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "payments")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long paymentId;

    @OneToOne(mappedBy = "payment", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private Order order;

    @NotBlank
    @Size(min = 4, message = "Payment method must contain at least 4 characters")
    private String paymentMethod;
	
    private String pgPaymentId;
    private String pgStatus;
    private String pgResponseMessage;

    private String pgName;


    public Payment(String paymentMethod, String pgPaymentId, String pgStatus,
                   String pgResponseMessage, String pgName) {
        this.paymentMethod = paymentMethod;
        this.pgPaymentId = pgPaymentId;
        this.pgStatus = pgStatus;
        this.pgResponseMessage = pgResponseMessage;
        this.pgName = pgName;
    }

    public Payment(Long paymentId, Order order, @NotBlank @Size(min = 4, message = "Payment method must contain at least 4 characters") String paymentMethod, String pgPaymentId, String pgStatus, String pgResponseMessage, String pgName) {
        this.paymentId = paymentId;
        this.order = order;
        this.paymentMethod = paymentMethod;
        this.pgPaymentId = pgPaymentId;
        this.pgStatus = pgStatus;
        this.pgResponseMessage = pgResponseMessage;
        this.pgName = pgName;
    }

    public Payment() {
    }

    public Long getPaymentId() {
        return this.paymentId;
    }

    public Order getOrder() {
        return this.order;
    }

    public @NotBlank @Size(min = 4, message = "Payment method must contain at least 4 characters") String getPaymentMethod() {
        return this.paymentMethod;
    }

    public String getPgPaymentId() {
        return this.pgPaymentId;
    }

    public String getPgStatus() {
        return this.pgStatus;
    }

    public String getPgResponseMessage() {
        return this.pgResponseMessage;
    }

    public String getPgName() {
        return this.pgName;
    }

    public void setPaymentId(Long paymentId) {
        this.paymentId = paymentId;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public void setPaymentMethod(@NotBlank @Size(min = 4, message = "Payment method must contain at least 4 characters") String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void setPgPaymentId(String pgPaymentId) {
        this.pgPaymentId = pgPaymentId;
    }

    public void setPgStatus(String pgStatus) {
        this.pgStatus = pgStatus;
    }

    public void setPgResponseMessage(String pgResponseMessage) {
        this.pgResponseMessage = pgResponseMessage;
    }

    public void setPgName(String pgName) {
        this.pgName = pgName;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Payment)) return false;
        final Payment other = (Payment) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$paymentId = this.getPaymentId();
        final Object other$paymentId = other.getPaymentId();
        if (this$paymentId == null ? other$paymentId != null : !this$paymentId.equals(other$paymentId)) return false;
        final Object this$order = this.getOrder();
        final Object other$order = other.getOrder();
        if (this$order == null ? other$order != null : !this$order.equals(other$order)) return false;
        final Object this$paymentMethod = this.getPaymentMethod();
        final Object other$paymentMethod = other.getPaymentMethod();
        if (this$paymentMethod == null ? other$paymentMethod != null : !this$paymentMethod.equals(other$paymentMethod))
            return false;
        final Object this$pgPaymentId = this.getPgPaymentId();
        final Object other$pgPaymentId = other.getPgPaymentId();
        if (this$pgPaymentId == null ? other$pgPaymentId != null : !this$pgPaymentId.equals(other$pgPaymentId))
            return false;
        final Object this$pgStatus = this.getPgStatus();
        final Object other$pgStatus = other.getPgStatus();
        if (this$pgStatus == null ? other$pgStatus != null : !this$pgStatus.equals(other$pgStatus)) return false;
        final Object this$pgResponseMessage = this.getPgResponseMessage();
        final Object other$pgResponseMessage = other.getPgResponseMessage();
        if (this$pgResponseMessage == null ? other$pgResponseMessage != null : !this$pgResponseMessage.equals(other$pgResponseMessage))
            return false;
        final Object this$pgName = this.getPgName();
        final Object other$pgName = other.getPgName();
        if (this$pgName == null ? other$pgName != null : !this$pgName.equals(other$pgName)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Payment;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $paymentId = this.getPaymentId();
        result = result * PRIME + ($paymentId == null ? 43 : $paymentId.hashCode());
        final Object $order = this.getOrder();
        result = result * PRIME + ($order == null ? 43 : $order.hashCode());
        final Object $paymentMethod = this.getPaymentMethod();
        result = result * PRIME + ($paymentMethod == null ? 43 : $paymentMethod.hashCode());
        final Object $pgPaymentId = this.getPgPaymentId();
        result = result * PRIME + ($pgPaymentId == null ? 43 : $pgPaymentId.hashCode());
        final Object $pgStatus = this.getPgStatus();
        result = result * PRIME + ($pgStatus == null ? 43 : $pgStatus.hashCode());
        final Object $pgResponseMessage = this.getPgResponseMessage();
        result = result * PRIME + ($pgResponseMessage == null ? 43 : $pgResponseMessage.hashCode());
        final Object $pgName = this.getPgName();
        result = result * PRIME + ($pgName == null ? 43 : $pgName.hashCode());
        return result;
    }

    public String toString() {
        return "Payment(paymentId=" + this.getPaymentId() + ", order=" + this.getOrder() + ", paymentMethod=" + this.getPaymentMethod() + ", pgPaymentId=" + this.getPgPaymentId() + ", pgStatus=" + this.getPgStatus() + ", pgResponseMessage=" + this.getPgResponseMessage() + ", pgName=" + this.getPgName() + ")";
    }
}
