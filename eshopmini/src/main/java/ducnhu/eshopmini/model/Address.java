package ducnhu.eshopmini.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "addresses")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long addressId;

    @NotBlank
    @Size(min = 5, message = "Street name must be atleast 5 characters")
    private String street;

    @NotBlank
    @Size(min = 5, message = "Building name must be atleast 5 characters")
    private String buildingName;

    @NotBlank
    @Size(min = 4, message = "City name must be atleast 4 characters")
    private String city;

    @NotBlank
    @Size(min = 2, message = "State name must be atleast 2 characters")
    private String state;

    @NotBlank
    @Size(min = 2, message = "Country name must be atleast 2 characters")
    private String country;

    @NotBlank
    @Size(min = 5, message = "Pincode must be atleast 5 characters")
    private String pincode;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public Address(String street, String buildingName, String city, String state, String country, String pincode) {
        this.street = street;
        this.buildingName = buildingName;
        this.city = city;
        this.state = state;
        this.country = country;
        this.pincode = pincode;
    }

    public Address(Long addressId, @NotBlank @Size(min = 5, message = "Street name must be atleast 5 characters") String street, @NotBlank @Size(min = 5, message = "Building name must be atleast 5 characters") String buildingName, @NotBlank @Size(min = 4, message = "City name must be atleast 4 characters") String city, @NotBlank @Size(min = 2, message = "State name must be atleast 2 characters") String state, @NotBlank @Size(min = 2, message = "Country name must be atleast 2 characters") String country, @NotBlank @Size(min = 5, message = "Pincode must be atleast 5 characters") String pincode, User user) {
        this.addressId = addressId;
        this.street = street;
        this.buildingName = buildingName;
        this.city = city;
        this.state = state;
        this.country = country;
        this.pincode = pincode;
        this.user = user;
    }

    public Address() {
    }

    public Long getAddressId() {
        return this.addressId;
    }

    public @NotBlank @Size(min = 5, message = "Street name must be atleast 5 characters") String getStreet() {
        return this.street;
    }

    public @NotBlank @Size(min = 5, message = "Building name must be atleast 5 characters") String getBuildingName() {
        return this.buildingName;
    }

    public @NotBlank @Size(min = 4, message = "City name must be atleast 4 characters") String getCity() {
        return this.city;
    }

    public @NotBlank @Size(min = 2, message = "State name must be atleast 2 characters") String getState() {
        return this.state;
    }

    public @NotBlank @Size(min = 2, message = "Country name must be atleast 2 characters") String getCountry() {
        return this.country;
    }

    public @NotBlank @Size(min = 5, message = "Pincode must be atleast 5 characters") String getPincode() {
        return this.pincode;
    }

    public User getUser() {
        return this.user;
    }

    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }

    public void setStreet(@NotBlank @Size(min = 5, message = "Street name must be atleast 5 characters") String street) {
        this.street = street;
    }

    public void setBuildingName(@NotBlank @Size(min = 5, message = "Building name must be atleast 5 characters") String buildingName) {
        this.buildingName = buildingName;
    }

    public void setCity(@NotBlank @Size(min = 4, message = "City name must be atleast 4 characters") String city) {
        this.city = city;
    }

    public void setState(@NotBlank @Size(min = 2, message = "State name must be atleast 2 characters") String state) {
        this.state = state;
    }

    public void setCountry(@NotBlank @Size(min = 2, message = "Country name must be atleast 2 characters") String country) {
        this.country = country;
    }

    public void setPincode(@NotBlank @Size(min = 5, message = "Pincode must be atleast 5 characters") String pincode) {
        this.pincode = pincode;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Address)) return false;
        final Address other = (Address) o;
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
        final Object this$user = this.getUser();
        final Object other$user = other.getUser();
        if (this$user == null ? other$user != null : !this$user.equals(other$user)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Address;
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
        final Object $user = this.getUser();
        result = result * PRIME + ($user == null ? 43 : $user.hashCode());
        return result;
    }

    public String toString() {
        return "Address(addressId=" + this.getAddressId() + ", street=" + this.getStreet() + ", buildingName=" + this.getBuildingName() + ", city=" + this.getCity() + ", state=" + this.getState() + ", country=" + this.getCountry() + ", pincode=" + this.getPincode() + ", user=" + this.getUser() + ")";
    }
}
