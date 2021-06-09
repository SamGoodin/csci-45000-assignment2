package Assignment2.client;

import java.util.Scanner;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

import Assignment2.common.Account;
import Assignment2.client.Admin;
//import Assignment2.client.Customer;
import Assignment2.server.Hello;
import Assignment2.client.Registration;

public class Client {

    // boolean accountFile = false;

    public static void main(String[] args) {

        /*
         * String host = (args.length < 1) ? null : args[0]; try { Registry registry =
         * LocateRegistry.getRegistry(host); Hello stub = (Hello)
         * registry.lookup("Hello"); String response = stub.sayHello();
         * System.out.println("response: " + response); } catch (Exception e) {
         * System.err.println("Client exception: " + e.toString()); e.printStackTrace();
         * }
         */

        // File f = new File("accounts.txt");
        File f = new File("accounts.txt");
        if (f.isFile()) {
            String[][] accounts = {};
            try {
                Scanner fileReader = new Scanner(f);
                while (fileReader.hasNextLine()) {
                    String data = fileReader.nextLine();
                    String[] accountInfo = data.split("@~|~@");
                    accounts = Arrays.copyOf(accounts, accounts.length + 1);
                    accounts[accounts.length - 1] = accountInfo;
                }
            } catch (FileNotFoundException e) {
                System.out.println("Error occurred when reading account data");
            }
        }

        Account[] userAccounts = {};
        Account[] adminAccounts = {};
        boolean bool = Registration.register(userAccounts, adminAccounts);

        Scanner input = new Scanner(System.in);

        input.close();
    }

}