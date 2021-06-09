package Assignment2.common;

//import java.rmi.*;

public abstract class Account {

    String username;
    String password;
    int accountType; // 0 = customer, 1 = admin

    public Account(String username, String password, int accountType) {
        this.accountType = accountType;
        this.username = username;
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAccountType(int accountType) {
        this.accountType = accountType;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public int getAccountType() {
        return accountType;
    }

}