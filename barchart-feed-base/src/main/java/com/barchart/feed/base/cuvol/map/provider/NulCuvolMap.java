/**
 * Copyright (C) 2011-2012 Barchart, Inc. <http://www.barchart.com/>
 *
 * All rights reserved. Licensed under the OSI BSD License.
 *
 * http://www.opensource.org/licenses/bsd-license.php
 */
package com.barchart.feed.base.cuvol.map.provider;

import com.barchart.feed.base.cuvol.map.api.MarketCuvolMap;
import com.barchart.feed.base.provider.MarketConst;
import com.barchart.util.anno.NotMutable;
import com.barchart.util.values.api.PriceValue;
import com.barchart.util.values.api.SizeValue;
import com.barchart.util.values.provider.ValueConst;
import com.barchart.util.values.provider.ValueFreezer;

@NotMutable
public class NulCuvolMap extends ValueFreezer<MarketCuvolMap> implements MarketCuvolMap {

	@Override
	public SizeValue getCuvol(PriceValue price) {
		return ValueConst.NULL_SIZE;
	}

	@Override
	public PriceValue priceFirst() {
		return ValueConst.NULL_PRICE;
	}

	@Override
	public PriceValue priceStep() {
		return ValueConst.NULL_PRICE;
	}

	@Override
	public SizeValue[] entries() {
		return ValueConst.NULL_SIZE_ARRAY;
	}

	@Override
	public final String toString() {

		final StringBuilder text = new StringBuilder(512);

		text.append("Cumulative Volume");
		text.append("\n");
		text.append("Price Step :  ");
		text.append(priceStep());
		text.append("\n");
		text.append("Price First : ");
		text.append(priceFirst());
		text.append("\n");

		for (final SizeValue entry : entries()) {
			text.append(entry);
			text.append("\n");
		}

		return text.toString();

	}
	
	@Override
	public final boolean isNull() {
		return this == MarketConst.NULL_CUVOL_MAP;
	}
	
}
