package ducnhu.eshopmini.payload;

public class AddressDTO {
    private Long addressId;
    private String street;
    private String buildingName;
    private String city;
    private String state;
    private String country;
    private String pincode;

    public AddressDTO(Long addressId, String street, String buildingName, String city, String state, String country, String pincode) {
        this.addressId = addressId;
        this.street = street;
        this.buildingName = buildingName;
        this.city = city;
        this.state = state;
        this.country = country;
        this.pincode = pincode;
    }

    public AddressDTO() {
    }

    public Long getAddressId() {
        return this.addressId;
    }

    public String getStreet() {
        return this.street;
    }

    public String getBuildingName() {
        return this.buildingName;
    }

    public String getCity() {
        return this.city;
    }

    public String getState() {
        return this.state;
    }

    public String getCountry() {
        return this.country;
    }

    public String getPincode() {
        return this.pincode;
    }

    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof AddressDTO)) return false;
        final AddressDTO other = (AddressDTO) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$addressId = this.getAddressId();
        final Object other$addressId = other.getAddressId();
        if (this$addressId == null ? other$addressId != null : !this$addressId.equals(other$addressId)) return false;
        final Object this$street = this.getStreet();
        final Object other$street = other.getStreet();
        if (this$street == null ? other$street != null : !this$street.equals(other$street)) return false;
        final Object this$buildingName = this.getBuildingName();
        final Object other$buildingName = other.getBuildingName();
        if (this$buildingName == null ? other$buildingName != null : !this$buildingName.equals(other$buildingName))
            return false;
        final Object this$city = this.getCity();
        final Object other$city = other.getCity();
        if (this$city == null ? other$city != null : !this$city.equals(other$city)) return false;
        final Object this$state = this.getState();
        final Object other$state = other.getState();
        if (this$state == null ? other$state != null : !this$state.equals(other$state)) return false;
        final Object this$country = this.getCountry();
        final Object other$country = other.getCountry();
        if (this$country == null ? other$country != null : !this$country.equals(other$country)) return false;
        final Object this$pincode = this.getPincode();
        final Object other$pincode = other.getPincode();
        if (this$pincode == null ? other$pincode != null : !this$pincode.equals(other$pincode)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof AddressDTO;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $addressId = this.getAddressId();
        result = result * PRIME + ($addressId == null ? 43 : $addressId.hashCode());
        final Object $street = this.getStreet();
        result = result * PRIME + ($street == null ? 43 : $street.hashCode());
        final Object $buildingName = this.getBuildingName();
        result = result * PRIME + ($buildingName == null ? 43 : $buildingName.hashCode());
        final Object $city = this.getCity();
        result = result * PRIME + ($city == null ? 43 : $city.hashCode());
        final Object $state = this.getState();
        result = result * PRIME + ($state == null ? 43 : $state.hashCode());
        final Object $country = this.getCountry();
        result = result * PRIME + ($country == null ? 43 : $country.hashCode());
        final Object $pincode = this.getPincode();
        result = result * PRIME + ($pincode == null ? 43 : $pincode.hashCode());
        return result;
    }

    public String toString() {
        return "AddressDTO(addressId=" + this.getAddressId() + ", street=" + this.getStreet() + ", buildingName=" + this.getBuildingName() + ", city=" + this.getCity() + ", state=" + this.getState() + ", country=" + this.getCountry() + ", pincode=" + this.getPincode() + ")";
    }
}
