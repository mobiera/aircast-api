package com.mobiera.aircast.api.v1.node;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.api.vo.NodeVO;

@JsonInclude(Include.NON_NULL)
public class GetThisNodeRequestAnswer implements Serializable {


	private static final long serialVersionUID = 7944962553757092867L;
	
	private GetThisNodeRequestResult result;
	private String errorMessage;
	private NodeVO node;
	public GetThisNodeRequestResult getResult() {
		return result;
	}
	public void setResult(GetThisNodeRequestResult result) {
		this.result = result;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public NodeVO getNode() {
		return node;
	}
	public void setNode(NodeVO node) {
		this.node = node;
	}
	

	
}
