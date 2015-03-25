package com.github.rapito.mtp.processor.comms.basic;

import com.github.rapito.mtp.commons.TradeMessage;
import com.github.rapito.mtp.processor.comms.TradeProcess;

import javax.ejb.EJBException;
import javax.ejb.SessionBean;
import javax.ejb.SessionContext;
import java.rmi.RemoteException;
import java.util.logging.Logger;

/**
 * Dummy Process that doesn't do anything :).
 * Created by Robert Peralta on 3/24/2015.
 */
public class BasicTradeProcess extends TradeProcess implements SessionBean
{

    private final static Logger logger = Logger.getLogger(BasicTradeProcess.class.getName());

    private final TradeMessage   message;
    private       SessionContext sessionContext;

    private BasicTradeProcess(TradeMessage message)
    {
        this.message = message;
    }

    /**
     * Creates a new BasicTradeProcess
     *
     * @param message {@link com.github.rapito.mtp.commons.TradeMessage}
     */
    public static TradeProcess createWithMessage(TradeMessage message)
    {
        return new BasicTradeProcess(message);
    }

    /**
     * Executes the communication process.
     */
    public void run()
    {
        logger.info("run: with message: " + message);
    }

    @Override
    public void setSessionContext(SessionContext sessionContext) throws EJBException, RemoteException
    {
        this.sessionContext = sessionContext;
    }

    @Override
    public void ejbRemove() throws EJBException, RemoteException
    {
    }

    @Override
    public void ejbActivate() throws EJBException, RemoteException
    {
    }

    @Override
    public void ejbPassivate() throws EJBException, RemoteException
    {
    }
}
