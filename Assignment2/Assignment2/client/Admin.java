package Assignment2.client;

import Assignment2.common.Account;

public class Admin extends Account {

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

    public Admin(String username, String password) {
        super(username, password, 1);
    }

}