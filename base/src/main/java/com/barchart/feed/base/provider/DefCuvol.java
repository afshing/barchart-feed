/**
 * Copyright (C) 2011-2013 Barchart, Inc. <http://www.barchart.com/>
 *
 * All rights reserved. Licensed under the OSI BSD License.
 *
 * http://www.opensource.org/licenses/bsd-license.php
 */
package com.barchart.feed.base.provider;

import java.util.ArrayList;
import java.util.List;

import com.barchart.feed.api.model.meta.Instrument;
import com.barchart.util.anno.NotMutable;
import com.barchart.util.values.api.PriceValue;
import com.barchart.util.values.api.SizeValue;

@NotMutable
class DefCuvol extends NulCuvol {

	private final SizeValue[] entries;

	private final PriceValue priceFirst;
	private final PriceValue priceStep;
	
	private final Instrument instrument;

	DefCuvol(final Instrument instrument, final SizeValue[] entries, 
			final PriceValue priceFirst, final PriceValue priceStep) {

		assert entries != null;
		assert priceFirst != null;
		assert priceStep != null;
		assert priceStep.mantissa() != 0;

		this.instrument = instrument;
		
		this.entries = entries;
		this.priceFirst = priceFirst;
		this.priceStep = priceStep;

	}

	@Override
	public PriceValue priceFirst() {
		return priceFirst;
	}

	@Override
	public PriceValue priceStep() {
		return priceStep;
	}

	@Override
	public SizeValue[] entries() {
		return entries;
	}
	
	@Override
	public Instrument instrument() {
		return instrument;
	}
	
	@Override
	public List<Entry> entryList() {
		
		final List<Entry> result = new ArrayList<Entry>();
		
		int counter = 0;
		for(final SizeValue size : entries) {
			
			PriceValue newPrice = priceFirst.freeze();
			PriceValue newStep = priceStep.freeze();
			
			result.add(new DefCuvolEntry(counter, 
					newPrice.add(newStep.mult(counter)), size));
			
			counter++;
		}
			
		
		return result;
		
	}
}
