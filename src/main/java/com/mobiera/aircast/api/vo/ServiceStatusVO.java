package com.mobiera.aircast.api.vo;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.commons.enums.ResourceLoad;
import com.mobiera.commons.enums.EntityState;
import com.mobiera.commons.enums.ServiceSanity;
import com.mobiera.commons.enums.ServiceStatus;

@JsonInclude(Include.NON_NULL)
public class ServiceStatusVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 482935584529862370L;
	
	private String beanName;
	private String serviceName;
	private Short threadNumber;
	private ServiceStatus serviceStatus;
	private Long entityId;
	private String entityName;
	private Integer queueMaxSize;
	private Integer queueCurrentSize;
	private ResourceLoad queueLoad;
	private List<ServiceStatusVO> subServices;
	private EntityState entityState;
	private ServiceSanity serviceSanity;
	
	public String getBeanName() {
		return beanName;
	}
	public void setBeanName(String beanName) {
		this.beanName = beanName;
	}
	public String getServiceName() {
		return serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	public Long getEntityId() {
		return entityId;
	}
	public void setEntityId(Long entityId) {
		this.entityId = entityId;
	}
	public String getEntityName() {
		return entityName;
	}
	public void setEntityName(String entityName) {
		this.entityName = entityName;
	}
	public Integer getQueueMaxSize() {
		return queueMaxSize;
	}
	public void setQueueMaxSize(Integer queueMaxSize) {
		this.queueMaxSize = queueMaxSize;
	}
	public Integer getQueueCurrentSize() {
		return queueCurrentSize;
	}
	public void setQueueCurrentSize(Integer queueCurrentSize) {
		this.queueCurrentSize = queueCurrentSize;
	}
	public ResourceLoad getQueueLoad() {
		return queueLoad;
	}
	public void setQueueLoad(ResourceLoad queueLoad) {
		this.queueLoad = queueLoad;
	}
	
	public ServiceStatus getServiceStatus() {
		return serviceStatus;
	}
	public void setServiceStatus(ServiceStatus serviceStatus) {
		this.serviceStatus = serviceStatus;
	}
	public List<ServiceStatusVO> getSubServices() {
		return subServices;
	}
	public void setSubServices(List<ServiceStatusVO> subServices) {
		this.subServices = subServices;
	}
	public EntityState getEntityState() {
		return entityState;
	}
	public void setEntityState(EntityState entityState) {
		this.entityState = entityState;
	}
	public Short getThreadNumber() {
		return threadNumber;
	}
	public void setThreadNumber(Short threadNumber) {
		this.threadNumber = threadNumber;
	}
	public ServiceSanity getServiceSanity() {
		return serviceSanity;
	}
	public void setServiceSanity(ServiceSanity serviceSanity) {
		this.serviceSanity = serviceSanity;
	}
	
	
	
}
