package JavaBasics.Accounts;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Account {

    private int accountNumber;
    private float accountBalance ;
    @Override
    public String toString() {
        return "Account Number = " + accountNumber + ", accountBalance = " + accountBalance + "]";
    }


}