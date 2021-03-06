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
package com.barchart.feed.base.provider;

import com.barchart.feed.base.market.api.MarketDo;
import com.barchart.feed.base.market.api.MarketFactory;
import com.barchart.feed.base.market.api.MarketProvider;

/**
 * Keeping this for now, but need to revisit. It seems fine to let
 * MarketMakerProvider just take a MarketFactory, which can be defined in
 * DDF-feed. If this is sufficient, this can be removed. It is not currently
 * used anywhere.
 * 
 * @author g-litchfield
 * 
 */
public class MarketProviderImpl implements MarketProvider {

	@Override
	public MarketFactory makeFactory(final Class<? extends MarketDo> clazz) {

		return new MarketFactory() {

			@Override
			public MarketDo newMarket() {
				try {
					return clazz.newInstance();
				} catch (final InstantiationException e) {
					e.printStackTrace();
				} catch (final IllegalAccessException e) {
					e.printStackTrace();
				}
				return null;
			}

		};
	}
}
