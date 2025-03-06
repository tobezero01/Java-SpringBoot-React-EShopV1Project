package ducnhu.eshopmini.payload;

public class StripePaymentDto {
    private Long amount;
    private String currency;

    public StripePaymentDto() {
    }

    public Long getAmount() {
        return this.amount;
    }

    public String getCurrency() {
        return this.currency;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof StripePaymentDto)) return false;
        final StripePaymentDto other = (StripePaymentDto) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$amount = this.getAmount();
        final Object other$amount = other.getAmount();
        if (this$amount == null ? other$amount != null : !this$amount.equals(other$amount)) return false;
        final Object this$currency = this.getCurrency();
        final Object other$currency = other.getCurrency();
        if (this$currency == null ? other$currency != null : !this$currency.equals(other$currency)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof StripePaymentDto;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $amount = this.getAmount();
        result = result * PRIME + ($amount == null ? 43 : $amount.hashCode());
        final Object $currency = this.getCurrency();
        result = result * PRIME + ($currency == null ? 43 : $currency.hashCode());
        return result;
    }

    public String toString() {
        return "StripePaymentDto(amount=" + this.getAmount() + ", currency=" + this.getCurrency() + ")";
    }
}
