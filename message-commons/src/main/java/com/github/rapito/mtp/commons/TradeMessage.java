package com.github.rapito.mtp.commons;

import java.sql.Timestamp;

/**
 * Created by Robert Peralta on 3/24/2015.
 */
public class TradeMessage
{

    String    transactionId;
    String    userId;
    String    currencyFrom;
    String    currencyTo;
    long      amountSell;
    long      amountBuy;
    float     rate;
    Timestamp timePlaced;
    String    originatingCountry;

    public TradeMessage()
    {
    }

    public TradeMessage(String userId, String currencyFrom, String currencyTo, long amountSell, long amountBuy, float rate, Timestamp timePlaced, String originatingCountry)
    {
        this.userId = userId;
        this.currencyFrom = currencyFrom;
        this.currencyTo = currencyTo;
        this.amountSell = amountSell;
        this.amountBuy = amountBuy;
        this.rate = rate;
        this.timePlaced = timePlaced;
        this.originatingCountry = originatingCountry;
    }

    public String getTransactionId()
    {
        return transactionId;
    }

    public void setTransactionId(String transactionId)
    {
        this.transactionId = transactionId;
    }

    public String getUserId()
    {
        return userId;
    }

    public void setUserId(String userId)
    {
        this.userId = userId;
    }

    public String getCurrencyFrom()
    {
        return currencyFrom;
    }

    public void setCurrencyFrom(String currencyFrom)
    {
        this.currencyFrom = currencyFrom;
    }

    public String getCurrencyTo()
    {
        return currencyTo;
    }

    public void setCurrencyTo(String currencyTo)
    {
        this.currencyTo = currencyTo;
    }

    public long getAmountSell()
    {
        return amountSell;
    }

    public void setAmountSell(long amountSell)
    {
        this.amountSell = amountSell;
    }

    public long getAmountBuy()
    {
        return amountBuy;
    }

    public void setAmountBuy(long amountBuy)
    {
        this.amountBuy = amountBuy;
    }

    public float getRate()
    {
        return rate;
    }

    public void setRate(float rate)
    {
        this.rate = rate;
    }

    public Timestamp getTimePlaced()
    {
        return timePlaced;
    }

    public void setTimePlaced(Timestamp timePlaced)
    {
        this.timePlaced = timePlaced;
    }

    public String getOriginatingCountry()
    {
        return originatingCountry;
    }

    public void setOriginatingCountry(String originatingCountry)
    {
        this.originatingCountry = originatingCountry;
    }
}
