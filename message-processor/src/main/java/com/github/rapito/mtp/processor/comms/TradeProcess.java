package com.github.rapito.mtp.processor.comms;

import com.github.rapito.mtp.commons.TradeMessage;

/**
 * Specifies behaviour for all Trade Processes.
 * <i>Runnable</i> process that executes the
 * required communication with the frontend.
 * Created by Robert Peralta on 3/24/2015.
 */
public abstract class TradeProcess implements Runnable
{

    /**
     * Every TradeProcess must be instantiated only
     * by the implementing class, assuring that communication
     * logic is restricted to only on <i>code-entry</i> point.
     *
     * @param message {@link com.github.rapito.mtp.commons.TradeMessage}
     * @return Implemented <code>runnable</code> instance to be started.
     */
    public static TradeProcess createWithMessage(TradeMessage message){return null;}
}
