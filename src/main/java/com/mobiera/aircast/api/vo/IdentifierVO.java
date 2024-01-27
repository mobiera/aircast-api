package com.mobiera.aircast.api.vo;

import java.io.Serializable;
import java.time.Instant;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.commons.enums.IdentifierType;
import com.mobiera.commons.enums.ClassType;
import com.mobiera.commons.enums.EntityState;
import com.mobiera.commons.enums.Mode;
import com.mobiera.commons.enums.WidgetType;
import com.mobiera.commons.introspection.Description;
import com.mobiera.commons.introspection.Filter;
import com.mobiera.commons.introspection.Label;
import com.mobiera.commons.introspection.Required;
import com.mobiera.commons.introspection.Section;
import com.mobiera.commons.introspection.SectionEnum;
import com.mobiera.commons.introspection.TargetClass;
import com.mobiera.commons.introspection.UI;
import com.mobiera.commons.introspection.Validator;

@SectionEnum(name="IdentifierSection")
@Label(singular="Identifier", plural="Identifiers", newEntityLabel="New Identifier", newEntityDescription="Create a new Identifier")
@Description(data="Identifier are linked to Pricepoints (KEYWORD, SIM) or to Landings (LANDING_HE, LANDING_OTP)")
@JsonInclude(Include.NON_NULL)
public class IdentifierVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3123667467679189800L;
	
	@UI( widgetType = WidgetType.TEXT, mode = Mode.READ_ONLY)
	@Section( name = "HEADER")
	private String title;
	
	@UI( widgetType = WidgetType.TEXT, mode = Mode.READ_ONLY)
	@Section( name = "HEADER")
	private String description;
	
	
	
	@UI( widgetType = WidgetType.SELECT, mode = Mode.READ_ONLY, label="State", description="State")
	@Section( name = "HEADER")
	private EntityState state;
	
	private List<EntityState> allowedTransitionStates;

	
	private String label;
	
	
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_ONLY, 
			label="id", 
			description="id of Entity")
	@Section(name = "BASIC_INFORMATION")
	private Long id;
	
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Name", 
			description="Name of Identifier")
	@Section(name = "BASIC_INFORMATION")
	@Required
	@Validator(minSize=1, maxSize=100)
	private String name;
	
	
	
	private Instant deletedTs;
	
	@UI( widgetType = WidgetType.SELECT, 
			mode = Mode.READ_WRITE, 
			label="Type", 
			description="Identifier Type")
	@Section(name = "BASIC_INFORMATION")
	@Validator(allowedValues = {"KEYWORD", "SIM"})
	@Required
	private IdentifierType type;

	
	
	@UI( widgetType = WidgetType.SELECT, 
			mode = Mode.READ_WRITE, 
			label="Pricepoint", 
			description="Pricepoint")
	@Section(name = "BASIC_INFORMATION")
	@TargetClass(type=ClassType.VO, name="PricepointVO")
	@Required
	private Long pricepointFk;
	
	
	private Boolean failover;
	
	
	private Long landingFk;
	
	/*
	@UI( widgetType = WidgetType.SELECT, 
			mode = Mode.READ_WRITE, 
			label="Action", 
			description="Identifier Action")
	@Section(name = "BASIC_INFORMATION")
	@Required
	private IdentifierAction action;
	*/
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public EntityState getState() {
		return state;
	}

	public void setState(EntityState state) {
		this.state = state;
	}

	public List<EntityState> getAllowedTransitionStates() {
		return allowedTransitionStates;
	}

	public void setAllowedTransitionStates(List<EntityState> allowedTransitionStates) {
		this.allowedTransitionStates = allowedTransitionStates;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Instant getDeletedTs() {
		return deletedTs;
	}

	public void setDeletedTs(Instant deletedTs) {
		this.deletedTs = deletedTs;
	}

	public IdentifierType getType() {
		return type;
	}

	public void setType(IdentifierType type) {
		this.type = type;
	}

	public Long getPricepointFk() {
		return pricepointFk;
	}

	public void setPricepointFk(Long pricepointFk) {
		this.pricepointFk = pricepointFk;
	}

	public Boolean getFailover() {
		return failover;
	}

	public void setFailover(Boolean failover) {
		this.failover = failover;
	}

	public Long getLandingFk() {
		return landingFk;
	}

	public void setLandingFk(Long landingFk) {
		this.landingFk = landingFk;
	}

	
	
	
	
	
	
	
}
