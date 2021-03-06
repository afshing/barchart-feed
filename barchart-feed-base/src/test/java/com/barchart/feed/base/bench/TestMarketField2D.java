/**
 * Copyright (C) 2011-2012 Barchart, Inc. <http://www.barchart.com/>
 *
 * All rights reserved. Licensed under the OSI BSD License.
 *
 * http://www.opensource.org/licenses/bsd-license.php
 */
package com.barchart.feed.base.bench;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestMarketField2D {

	static final Logger log = LoggerFactory.getLogger(TestMarketField2D.class);

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test1() {

		for (MarketField2D field : MarketField2D.valuesUnsafe()) {
			log.info("field {}", field);
			log.info("row {} col {}", field.row(), field.col());
		}

		assertTrue(true);

	}

}
