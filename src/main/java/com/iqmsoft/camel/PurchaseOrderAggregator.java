package com.iqmsoft.camel;

import java.util.List;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PurchaseOrderAggregator implements Processor {

	private static final Logger LOG = LoggerFactory.getLogger(PurchaseOrderAggregator.class);
	
	@Override
	public void process(final Exchange exchange) throws Exception {
		
		final PurchaseOrder po = exchange.getIn().getBody(PurchaseOrder.class);
		
		LOG.info("PurchaseOrder just before Aggregate {}",po);
		
		aggregateItemWise(po.getItems());
		
		exchange.getIn().setBody("");

	}

	private void aggregateItemWise(final List<PurchaseItem> items) {
		
		LOG.info("PurchaseOrder is Aggregated.");
		
	}

}
