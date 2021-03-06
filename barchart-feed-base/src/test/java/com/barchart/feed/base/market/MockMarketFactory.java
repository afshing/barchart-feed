/**
 * Copyright (C) 2011-2012 Barchart, Inc. <http://www.barchart.com/>
 *
 * All rights reserved. Licensed under the OSI BSD License.
 *
 * http://www.opensource.org/licenses/bsd-license.php
 */
/**
 * 
 */
package com.barchart.feed.base.market;

import com.barchart.feed.base.market.api.MarketDo;
import com.barchart.feed.base.market.api.MarketFactory;
import com.barchart.feed.base.market.provider.MockMarket;

/**
 * @author g-litchfield
 * 
 */
public class MockMarketFactory implements MarketFactory {

	@Override
	public MarketDo newMarket() {
		return new MockMarket();
	}

}
