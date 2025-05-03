import java.util.Objects;

public class Address {
    public String страна;
    public String город;

    public Address(String страна, String город) {
        this.страна = страна;
        this.город = город;
    }

    @Override
    public boolean equals(Object object) {
        Address address = (Address) object;
        return Objects.equals(страна, address.страна) && Objects.equals(город, address.город);
    }

    @Override
    public int hashCode() {
        return Objects.hash(страна, город);
    }
}
