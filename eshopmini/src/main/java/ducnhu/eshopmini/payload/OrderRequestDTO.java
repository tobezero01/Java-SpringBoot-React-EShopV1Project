package ducnhu.eshopmini.payload;

public class OrderRequestDTO {
    private Long addressId;
    private String paymentMethod;
    private String pgName;
    private String pgPaymentId;
    private String pgStatus;
    private String pgResponseMessage;

    public OrderRequestDTO(Long addressId, String paymentMethod, String pgName, String pgPaymentId, String pgStatus, String pgResponseMessage) {
        this.addressId = addressId;
        this.paymentMethod = paymentMethod;
        this.pgName = pgName;
        this.pgPaymentId = pgPaymentId;
        this.pgStatus = pgStatus;
        this.pgResponseMessage = pgResponseMessage;
    }

    public OrderRequestDTO() {
    }

    public Long getAddressId() {
        return this.addressId;
    }

    public String getPaymentMethod() {
        return this.paymentMethod;
    }

    public String getPgName() {
        return this.pgName;
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

    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void setPgName(String pgName) {
        this.pgName = pgName;
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

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof OrderRequestDTO)) return false;
        final OrderRequestDTO other = (OrderRequestDTO) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$addressId = this.getAddressId();
        final Object other$addressId = other.getAddressId();
        if (this$addressId == null ? other$addressId != null : !this$addressId.equals(other$addressId)) return false;
        final Object this$paymentMethod = this.getPaymentMethod();
        final Object other$paymentMethod = other.getPaymentMethod();
        if (this$paymentMethod == null ? other$paymentMethod != null : !this$paymentMethod.equals(other$paymentMethod))
            return false;
        final Object this$pgName = this.getPgName();
        final Object other$pgName = other.getPgName();
        if (this$pgName == null ? other$pgName != null : !this$pgName.equals(other$pgName)) return false;
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
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof OrderRequestDTO;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $addressId = this.getAddressId();
        result = result * PRIME + ($addressId == null ? 43 : $addressId.hashCode());
        final Object $paymentMethod = this.getPaymentMethod();
        result = result * PRIME + ($paymentMethod == null ? 43 : $paymentMethod.hashCode());
        final Object $pgName = this.getPgName();
        result = result * PRIME + ($pgName == null ? 43 : $pgName.hashCode());
        final Object $pgPaymentId = this.getPgPaymentId();
        result = result * PRIME + ($pgPaymentId == null ? 43 : $pgPaymentId.hashCode());
        final Object $pgStatus = this.getPgStatus();
        result = result * PRIME + ($pgStatus == null ? 43 : $pgStatus.hashCode());
        final Object $pgResponseMessage = this.getPgResponseMessage();
        result = result * PRIME + ($pgResponseMessage == null ? 43 : $pgResponseMessage.hashCode());
        return result;
    }

    public String toString() {
        return "OrderRequestDTO(addressId=" + this.getAddressId() + ", paymentMethod=" + this.getPaymentMethod() + ", pgName=" + this.getPgName() + ", pgPaymentId=" + this.getPgPaymentId() + ", pgStatus=" + this.getPgStatus() + ", pgResponseMessage=" + this.getPgResponseMessage() + ")";
    }
}
