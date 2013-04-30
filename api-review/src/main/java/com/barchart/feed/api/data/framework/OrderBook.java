package com.barchart.feed.api.data.framework;

import com.barchart.feed.api.data.client.OrderBookObject;
import com.barchart.feed.api.market.FrameworkElement;

public interface OrderBook extends OrderBookObject, FrameworkElement<OrderBook> {

	void setEntry(PriceLevel entry);
	// UniBookResult setSnapshot(PriceLevel[]);
	
	// void clear()
	
}
