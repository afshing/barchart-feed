package com.barchart.feed.api.client.marketplace;

import com.barchart.feed.api.commons.enums.MarketEventType;
import com.barchart.feed.api.framework.inst.Instrument;

public interface Marketplace {
	
	void bindAgent(MarketAgent agent);
	void unbindAgent(MarketAgent agent);
	
	
	// EXAMPLE FACTORY METHODS BELOW, AUTO-BIND
	
	// Determine callback <V> parameter via reflection?
	
	// ***** ***** No Filter/All Markets ***** *****
	
	// All events
	MarketAgent forAllMarkets(MarketCallback<?> callback);
	
	// Specific events
	MarketAgent forAllMarketsOnTrade(MarketCallback<?> callback);
	MarketAgent forAllMarketsOnBookUpdate(MarketCallback<?> callback);
	
	// Events enum, not a fan
	MarketAgent forAllMarketsOnEvent(MarketCallback<?> callback, MarketEventType eventType);
	
	// ***** ***** Filter agent binding by instrument ***** *****
	
	// All events
	MarketAgent forInstrument(MarketCallback<?> callback, Instrument instruments);
	MarketAgent forInstruments(MarketCallback<?> callback, Instrument[] instruments);
	
	// Specific events
	MarketAgent forInstrumentOnTrade(MarketCallback<?> callback, Instrument instruments);
	MarketAgent forInstrumentOnBookUpdate(MarketCallback<?> callback, Instrument instruments);
	
	// Events enum, not a fan
	MarketAgent forInstrumentOnEvent(MarketCallback<?> callback, Instrument instrument,
			MarketEventType eventType);
	
	// ***** ***** Filter agent binding by exchange ***** *****
	
	MarketAgent forExchange(MarketCallback<?> callback, String exchangeID);
	//...
	//...
	//...
	//...
	//...
	//...

}
