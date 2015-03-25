package com.github.rapito.mtp.processor;

import com.github.rapito.mtp.commons.TradeMessage;
import com.github.rapito.mtp.processor.comms.basic.BasicTradeProcess;

import java.util.Random;
import java.util.logging.Logger;

/**
 * Handles business logic with received
 * {@link com.github.rapito.mtp.commons.TradeMessage TradeMessages}.
 * Created by Robert Peralta on 3/24/2015.
 */
public class TradeProcessor
{

    private final static Logger logger = Logger.getLogger(TradeProcessor.class.getName());

    private static TradeProcessor instance;

    public TradeProcessor()
    {
        logger.info("TradeProcessor: Created!");
    }

    public static TradeProcessor get()
    {
        return instance == null ? instance = new TradeProcessor() : instance;
    }

    /**
     * Persists message into a database and
     * then communicate it to frontend.
     */
    public void process(TradeMessage message)
    {
        if (message == null) return;
        String id;

        // Persists
        id = new Random().nextInt(100) + "";
        message.setTransactionId(id);

        // Start Comms with frontend
        BasicTradeProcess.createWithMessage(message).run();

    }
}
