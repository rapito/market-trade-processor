package com.github.rapito.mtp.processor.comms.basic;

import javax.ejb.EJBObject;
import java.rmi.RemoteException;

/**
 * Created by Robert Peralta on 3/24/2015.
 */
public interface BasicTradeProcessObject extends EJBObject
{

    public void run() throws RemoteException;
//    TradeProcess createWithMessage(TradeMessage message) throws RemoteException;
}
