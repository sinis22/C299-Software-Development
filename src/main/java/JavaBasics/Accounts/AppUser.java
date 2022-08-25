package JavaBasics.Accounts;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class AppUser {

    private Account account;
    private Address address;

    @Override
    public String toString() {
        return "AppUser [account=" + account.toString() + ", address=" + address.toString() + "]";
    }


}
