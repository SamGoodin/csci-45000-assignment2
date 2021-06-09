package Assignment2.client;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.Scanner;

import Assignment2.common.Account;

public class Registration {

    public static boolean register(Account[] userAccounts, Account[] adminAccounts) {

        Scanner input = new Scanner(System.in);

        System.out.println("========Registration========");

        System.out.println("Enter a username: ");
        String username = input.nextLine();

        System.out.println("Enter a password: ");
        String password = input.nextLine();

        int accountType;
        while (true) {
            // While loop to make sure accountType entered is either 1 or 0
            System.out.println("What account do you want? (0 for customer, 1 for admin): ");
            accountType = input.nextInt();
            if (accountType == 0) {
                Customer customer = new Customer(username, password);
                userAccounts = Arrays.copyOf(userAccounts, userAccounts.length + 1);
                userAccounts[userAccounts.length - 1] = customer;
                break;
            } else if (accountType == 1) {
                Admin admin = new Admin(username, password);
                adminAccounts = Arrays.copyOf(adminAccounts, adminAccounts.length + 1);
                adminAccounts[adminAccounts.length - 1] = admin;
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
        input.close();

        String[] accountInfo = { username, password, Integer.toString(accountType) };
        System.out.println("Success! Your account is now registered. Taking you back to the main page...");
        System.out.println("===========End Registration==========");

        // Store account data for future use
        String textToWrite = accountInfo[0] + "@~|~@" + accountInfo[1] + "@~|~@" + accountInfo[2];
        try {
            Files.write(Paths.get("accounts.txt"), textToWrite.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            // exception handling left as an exercise for the reader
        }

        return true;
    }

}