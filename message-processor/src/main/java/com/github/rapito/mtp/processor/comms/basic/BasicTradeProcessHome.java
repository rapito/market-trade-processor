package com.github.rapito.mtp.processor.comms.basic;

import javax.ejb.CreateException;
import javax.ejb.EJBHome;
import java.rmi.RemoteException;

/**
 * Created by Robert Peralta on 3/24/2015.
 */
public interface BasicTradeProcessHome extends EJBHome
{

    public BasicTradeProcess create() throws RemoteException, CreateException;
}
