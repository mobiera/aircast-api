package com.mobiera.mno.adapters.kinetic.server.json;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class AmountTransaction {
	private PaymentAmount paymentAmount;
	private String endUserId;
	private String identifierClass; // LANDING_NO_HE, LANDING_HE, LANDING, KEYWORD, API_IDENTIFIER
	private String identifierLabel;
	private String identifierId;
	private String mandateId;
	private String serviceIdentifierId;
	private String resourceURL;
	private String transactionOperationStatus; // CHARGED or NO_FUNDS
	private String chargingServiceException;
	private String chargingPolicyException;
	public PaymentAmount getPaymentAmount() {
		return paymentAmount;
	}
	public void setPaymentAmount(PaymentAmount paymentAmount) {
		this.paymentAmount = paymentAmount;
	}
	public String getEndUserId() {
		return endUserId;
	}
	public void setEndUserId(String endUserId) {
		this.endUserId = endUserId;
	}
	public String getIdentifierClass() {
		return identifierClass;
	}
	public void setIdentifierClass(String identifierClass) {
		this.identifierClass = identifierClass;
	}
	public String getIdentifierLabel() {
		return identifierLabel;
	}
	public void setIdentifierLabel(String identifierLabel) {
		this.identifierLabel = identifierLabel;
	}
	
	public String getResourceURL() {
		return resourceURL;
	}
	public void setResourceURL(String resourceURL) {
		this.resourceURL = resourceURL;
	}
	public String getTransactionOperationStatus() {
		return transactionOperationStatus;
	}
	public void setTransactionOperationStatus(String transactionOperationStatus) {
		this.transactionOperationStatus = transactionOperationStatus;
	}
	public String getChargingServiceException() {
		return chargingServiceException;
	}
	public void setChargingServiceException(String chargingServiceException) {
		this.chargingServiceException = chargingServiceException;
	}
	public String getChargingPolicyException() {
		return chargingPolicyException;
	}
	public void setChargingPolicyException(String chargingPolicyException) {
		this.chargingPolicyException = chargingPolicyException;
	}
	public String getIdentifierId() {
		return identifierId;
	}
	public void setIdentifierId(String identifierId) {
		this.identifierId = identifierId;
	}
	public String getMandateId() {
		return mandateId;
	}
	public void setMandateId(String mandateId) {
		this.mandateId = mandateId;
	}
	public String getServiceIdentifierId() {
		return serviceIdentifierId;
	}
	public void setServiceIdentifierId(String serviceIdentifierId) {
		this.serviceIdentifierId = serviceIdentifierId;
	}
	
	
	
}
