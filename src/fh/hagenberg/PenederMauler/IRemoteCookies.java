package fh.hagenberg.PenederMauler;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by Mark on 07.12.2016.
 */
public interface IRemoteCookies extends Remote{
    public String getCookie() throws RemoteException;
}
