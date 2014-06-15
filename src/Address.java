public class Address {
    private String addressCountry;
    private String addressCity;
    private String addressStreet;
    private String addressHouseNumber;

    public Address(String addressCountry, String addressCity, String addressStreet, String addressHouseNumber) {
        this.addressCountry = addressCountry;
        this.addressCity = addressCity;
        this.addressStreet = addressStreet;
        this.addressHouseNumber = addressHouseNumber;
    }

    public String getAddressCountry() {
        return addressCountry;
    }

    public String getAddressCity() {
        return addressCity;
    }

    public String getAddressStreet() {
        return addressStreet;
    }

    public String getAddressHouseNumber() {
        return addressHouseNumber;
    }

    public void setAddressCountry(String addressCountry) {
        this.addressCountry = addressCountry;
    }

    public void setAddressCity(String addressCity) {
        this.addressCity = addressCity;
    }

    public void setAddressStreet(String addressStreet) {
        this.addressStreet = addressStreet;
    }

    public void setAddressHouseNumber(String addressHouseNumber) {
        this.addressHouseNumber = addressHouseNumber;
    }

    // 1 some new line for test
    // 2 first do local commit
    // 3 then push local changes to remote repository
    // if file is shown as red it means that git doesnt see for file
    // Blue - file was changed but not commited


}
