package Assignment2.server;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ClientImpl extends UnicastRemoteObject implements ServerClient {

    protected ClientImpl() throws RemoteException {
        super();
        // TODO Auto-generated constructor stub
    }

}
