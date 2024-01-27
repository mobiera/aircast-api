package com.mobiera.aircast.api.v1.node;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.api.vo.NodeVO;

@JsonInclude(Include.NON_NULL)
public class ListNodesRequestAnswer implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5850441376773111676L;
	
	private ListNodesRequestResult result;
	private String errorMessage;
	private List<NodeVO> nodes;
	public ListNodesRequestResult getResult() {
		return result;
	}
	public void setResult(ListNodesRequestResult result) {
		this.result = result;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public List<NodeVO> getNodes() {
		return nodes;
	}
	public void setNodes(List<NodeVO> nodes) {
		this.nodes = nodes;
	}
	
	
	

}
