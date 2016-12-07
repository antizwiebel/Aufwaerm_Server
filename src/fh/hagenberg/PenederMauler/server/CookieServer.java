package fh.hagenberg.PenederMauler.server;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created by Mark on 07.12.2016.
 */
public class CookieServer
        extends UnicastRemoteObject
        implements IRemoteCookies
{
    public CookieServer() throws RemoteException {super();}

    @Override
    public String getCookie() throws RemoteException {
        return "COOKIES!";
    }

    public static void main(String[] args) {
        try {
            CookieServer cookieServer= new CookieServer();
            Registry registry= LocateRegistry.createRegistry(Registry.REGISTRY_PORT);
            registry.rebind("CookieServer", cookieServer);
            System.out.println("Server is waiting for cookies!");
        } catch (Exception _e) {
            _e.printStackTrace();
        }
    }
}
