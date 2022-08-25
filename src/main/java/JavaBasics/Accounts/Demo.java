package JavaBasics.Accounts;

import java.util.ArrayList;
import java.util.List;

public class Demo {

    public static void main(String[] args) {
        System.out.println("Lets Play");


        List<AppUser> AccountList = new ArrayList<AppUser>();

        for (int i = 0; i < 10; i++) {

            AppUser tempAppUser = new AppUser();

            Account account = new Account();
            account.setAccountNumber(i);
            account.setAccountBalance(i ^ i);

            Address address = new Address();
            address.setCountry("Country_Name_" + i);

            tempAppUser.setAccount(account);
            tempAppUser.setAddress(address);

            System.out.println(tempAppUser);

            AccountList.add(tempAppUser);
        }
    }
}