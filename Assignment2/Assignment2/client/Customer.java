package Assignment2.client;

import Assignment2.common.Account;
import Assignment2.client.ShoppingCart;

public class Customer extends Account {

    /*
     * Declared in Account String username; String password; int accountType; //0 =
     * customer, 1 = admin
     * 
     * public void setUsername(String username) { this.username = username; }
     * 
     * public void setPassword(String password) { this.password = password; }
     * 
     * public void setAccountType(int accountType) { this.accountType = accountType;
     * }
     * 
     * public String getUsername() { return username; }
     * 
     * public String getPassword() { return password; }
     * 
     * public int getAccountType() { return accountType; }
     */

    ShoppingCart cart;

    public Customer(String username, String password) {
        super(username, password, 0);
        cart = new ShoppingCart();

    }

}