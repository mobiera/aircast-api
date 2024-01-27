package com.mobiera.mno.adapters.kinetic.server.json;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class PaymentNotificationRequest {
	private AmountTransaction amountTransaction;

	public AmountTransaction getAmountTransaction() {
		return amountTransaction;
	}

	public void setAmountTransaction(AmountTransaction amountTransaction) {
		this.amountTransaction = amountTransaction;
	}
	
}
