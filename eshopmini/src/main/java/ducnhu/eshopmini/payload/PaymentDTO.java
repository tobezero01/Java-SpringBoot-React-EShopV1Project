package ducnhu.eshopmini.payload;

public class PaymentDTO {
    private Long paymentId;
    private String paymentMethod;
    private String pgPaymentId;
    private String pgStatus;
    private String pgResponseMessage;
    private String pgName;

    public PaymentDTO(Long paymentId, String paymentMethod, String pgPaymentId, String pgStatus, String pgResponseMessage, String pgName) {
        this.paymentId = paymentId;
        this.paymentMethod = paymentMethod;
        this.pgPaymentId = pgPaymentId;
        this.pgStatus = pgStatus;
        this.pgResponseMessage = pgResponseMessage;
        this.pgName = pgName;
    }

    public PaymentDTO() {
    }

    public Long getPaymentId() {
        return this.paymentId;
    }

    public String getPaymentMethod() {
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

    public void setPaymentMethod(String paymentMethod) {
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
        if (!(o instanceof PaymentDTO)) return false;
        final PaymentDTO other = (PaymentDTO) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$paymentId = this.getPaymentId();
        final Object other$paymentId = other.getPaymentId();
        if (this$paymentId == null ? other$paymentId != null : !this$paymentId.equals(other$paymentId)) return false;
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
        return other instanceof PaymentDTO;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $paymentId = this.getPaymentId();
        result = result * PRIME + ($paymentId == null ? 43 : $paymentId.hashCode());
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
        return "PaymentDTO(paymentId=" + this.getPaymentId() + ", paymentMethod=" + this.getPaymentMethod() + ", pgPaymentId=" + this.getPgPaymentId() + ", pgStatus=" + this.getPgStatus() + ", pgResponseMessage=" + this.getPgResponseMessage() + ", pgName=" + this.getPgName() + ")";
    }
}
