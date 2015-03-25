package com.github.rapito.mtp.consumer;

import com.github.rapito.mtp.commons.TradeMessage;
import com.github.rapito.mtp.processor.TradeProcessor;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.logging.Logger;

/**
 * Service to consumer Trade Messages sent as POST
 * Created by Robert Peralta on 3/24/2015.
 *
 * @See com.github.rapito.mtp.commons.TradeMessage
 */
@Path("/market")
public class TradeConsumer
{

    final static Logger logger = Logger.getLogger(TradeConsumer.class.getName());

    @POST
    @Path("/trade")
    @Produces("application/json")
    @Consumes("application/json")
    public TradeMessage trade(TradeMessage message)
    {
        logger.info("trade: " + message);
        TradeProcessor.get().process(message);

        return message;
    }

}
