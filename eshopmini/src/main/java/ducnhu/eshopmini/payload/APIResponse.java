package ducnhu.eshopmini.payload;

public class APIResponse {
    public String message;
    private boolean status;

    public APIResponse(String message, boolean status) {
        this.message = message;
        this.status = status;
    }

    public APIResponse() {
    }

    public String getMessage() {
        return this.message;
    }

    public boolean isStatus() {
        return this.status;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof APIResponse)) return false;
        final APIResponse other = (APIResponse) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$message = this.getMessage();
        final Object other$message = other.getMessage();
        if (this$message == null ? other$message != null : !this$message.equals(other$message)) return false;
        if (this.isStatus() != other.isStatus()) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof APIResponse;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $message = this.getMessage();
        result = result * PRIME + ($message == null ? 43 : $message.hashCode());
        result = result * PRIME + (this.isStatus() ? 79 : 97);
        return result;
    }

    public String toString() {
        return "APIResponse(message=" + this.getMessage() + ", status=" + this.isStatus() + ")";
    }
}
