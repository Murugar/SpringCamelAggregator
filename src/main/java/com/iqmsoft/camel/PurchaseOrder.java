package com.iqmsoft.camel;

import java.util.Date;
import java.util.List;

public class PurchaseOrder {

	private Date time;
	
	private List<PurchaseItem> items;
	
	private double totalAmount;
	
	public Date getTime() {
		return time;
	}

	public List<PurchaseItem> getItems() {
		return items;
	}

	public void setItems(List<PurchaseItem> items) {
		this.items = items;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "PurchaseOrder [time=" + time + ", items=" + items
				+ ", totalAmount=" + totalAmount + "]";
	}

	
}
