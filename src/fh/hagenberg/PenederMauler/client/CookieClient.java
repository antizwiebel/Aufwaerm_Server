package fh.hagenberg.PenederMauler.client;

import fh.hagenberg.PenederMauler.server.IRemoteCookies;

import java.rmi.AccessException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * Created by Mark on 07.12.2016.
 */
public class CookieClient {
    public static void main (String[] _args) {
        try {
            System.setSecurityManager(new SecurityManager());
            String adr= "CookieServer";
            Registry reg = LocateRegistry.getRegistry();
            IRemoteCookies cookieObject= (IRemoteCookies) reg.lookup(adr);
            String cookie=cookieObject.getCookie();
            System.out.println("Cookies? " + cookie);
        } catch (Exception _e) {
            _e.printStackTrace();
        }
    }
}
