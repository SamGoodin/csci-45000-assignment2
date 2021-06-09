package Assignment2.server;

import java.rmi.registry.Registry;
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
//import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
//import Assignment2.server.Hello;

import Assignment2.client.Client;

public class Server implements Hello {

    public Server() {
        ;
    }

    public String sayHello() {
        return "Hello, world!";
    }

    public static void main(String[] args) {

        try {

            Client remote_obj = new ClientImpl();
            String name = "//in-csci-rrpc01:9876/RemoteClient";
            Naming.rebind(name, remote_obj);

            System.out.println("Server is ready");

        } catch (Exception e) {
            System.out.println("Server err: " + e.getMessage());
            e.printStackTrace();
        }

    }

}