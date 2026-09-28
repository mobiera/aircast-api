package com.mobiera.aircast.api.vo;


import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.commons.enums.AckType;
import com.mobiera.commons.enums.ClassType;
import com.mobiera.commons.enums.Mode;
import com.mobiera.commons.enums.WidgetType;
import com.mobiera.commons.introspection.Required;
import com.mobiera.commons.introspection.TargetClass;
import com.mobiera.commons.introspection.UI;
import com.mobiera.commons.introspection.Validator;

@JsonInclude(Include.NON_NULL)
public class RamDeleteParametersVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2348071851472395119L;
	/*@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_ONLY, 
			label="id", 
			description="id of Entity")
	private Long id;
	*/
	@UI( widgetType = WidgetType.SELECT, 
			mode = Mode.READ_WRITE, 
			label="Sim Profile", 
			description="Sim Profile")
	@TargetClass(type=ClassType.VO, name="SimProfileVO")
	@Required
	private Long simProfileFk;
	
	
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Instance AID", 
			description="AID of the applet instance to delete, hex. Instance AID, Package AID or both")
	@Validator(minSize=0, maxSize=100)
	private String instanceAid;

	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Package AID", 
			description="AID of the package (executable load file) to delete, hex. A card refuses to delete a package while one of its instances exists, unless Delete Deps is set")
	@Validator(minSize=0, maxSize=100)
	private String packageAid;

	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Delete Deps", 
			description="Delete the related objects too: with a Package AID, its instances are deleted with it")
	private Boolean deleteDeps;

	@UI( widgetType = WidgetType.SELECT, 
			mode = Mode.READ_WRITE, 
			label="Removed Applet On Success", 
			description="Applet the sim is no longer marked as carrying when the deletion succeeds. When set, the campaign runs on the sims marked as carrying it only")
	@TargetClass(type=ClassType.VO, name="AppletVO")
	private Long ramDeleteAppletToSimOnSuccessFk;
	
	@UI( widgetType = WidgetType.SELECT, 
			mode = Mode.READ_WRITE, 
			label="Ack Type", 
			description="Ack Type")
	@TargetClass(type=ClassType.ENUM, name="AckType")
	@Required
	private AckType ackType;
	
	@UI( widgetType = WidgetType.HIDDEN, 
			mode = Mode.READ_WRITE)
	private Long campaignFk;

	

	public Long getSimProfileFk() {
		return simProfileFk;
	}

	public void setSimProfileFk(Long simProfileFk) {
		this.simProfileFk = simProfileFk;
	}

	public String getInstanceAid() {
		return instanceAid;
	}
	public void setInstanceAid(String instanceAid) {
		this.instanceAid = instanceAid;
	}
	public String getPackageAid() {
		return packageAid;
	}
	public void setPackageAid(String packageAid) {
		this.packageAid = packageAid;
	}
	public Long getRamDeleteAppletToSimOnSuccessFk() {
		return ramDeleteAppletToSimOnSuccessFk;
	}
	public void setRamDeleteAppletToSimOnSuccessFk(Long ramDeleteAppletToSimOnSuccessFk) {
		this.ramDeleteAppletToSimOnSuccessFk = ramDeleteAppletToSimOnSuccessFk;
	}
	public Boolean getDeleteDeps() {
		return deleteDeps;
	}

	public void setDeleteDeps(Boolean deleteDeps) {
		this.deleteDeps = deleteDeps;
	}

	public AckType getAckType() {
		return ackType;
	}

	public void setAckType(AckType ackType) {
		this.ackType = ackType;
	}

	public Long getCampaignFk() {
		return campaignFk;
	}

	public void setCampaignFk(Long campaignFk) {
		this.campaignFk = campaignFk;
	}
	
	
	
}
