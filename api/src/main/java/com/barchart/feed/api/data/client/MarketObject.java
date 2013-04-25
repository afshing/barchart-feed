package com.barchart.feed.api.data.client;

import org.joda.time.DateTime;

import com.barchart.feed.api.data.framework.Instrument;

public interface MarketObject extends MarketDataObject {

	public Instrument instrument();
	public DateTime lastChangeTime();
	public TradeObject lastTrade();
	public OrderBookObject orderBook();
	public PriceLevelObject lastBookUpdate();
	public TopOfBookObject topOfBook();
	public CuvolObject cuvol();
	public CurrentSessionObject currentSession();
	public PreviousSessionObject extraSession();
	public ExtendedSessionObject previousSession();
	
}