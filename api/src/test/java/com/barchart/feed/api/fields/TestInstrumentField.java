/**
 * Copyright (C) 2011-2013 Barchart, Inc. <http://www.barchart.com/>
 *
 * All rights reserved. Licensed under the OSI BSD License.
 *
 * http://www.opensource.org/licenses/bsd-license.php
 */
package com.barchart.feed.api.fields;

import static org.junit.Assert.*;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.barchart.feed.api.framework.fields.InstrumentField;
import com.barchart.missive.api.Tag;

public class TestInstrumentField implements InstrumentField {

	protected final Logger log = LoggerFactory.getLogger(getClass());

	@Test
	public void tearDown() throws Exception {

		assertTrue(InstrumentField.FIELDS.length > 0);

		for (final Tag<?> tag : InstrumentField.FIELDS) {
			// log.info("tag : {}", tag);
			assertTrue(tag.name() != null);
		}

	}

}
