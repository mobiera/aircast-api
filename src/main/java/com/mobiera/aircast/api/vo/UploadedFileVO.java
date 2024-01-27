package com.mobiera.aircast.api.vo;

import java.io.Serializable;
import java.time.Instant;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mobiera.aircast.commons.enums.FileType;
import com.mobiera.commons.enums.Mode;
import com.mobiera.commons.enums.WidgetType;
import com.mobiera.commons.introspection.Condition;
import com.mobiera.commons.introspection.Conditions;
import com.mobiera.commons.introspection.Description;
import com.mobiera.commons.introspection.DisplayWhen;
import com.mobiera.commons.introspection.Label;
import com.mobiera.commons.introspection.Required;
import com.mobiera.commons.introspection.Section;
import com.mobiera.commons.introspection.SectionEnum;
import com.mobiera.commons.introspection.UI;
import com.mobiera.commons.introspection.Validator;

@JsonInclude(Include.NON_NULL)
@SectionEnum(name="FileSection")
@Label(singular="File", plural="Files", newEntityLabel="New File", newEntityDescription="Upload a new File")
@Description(data="Upload here lists of users for using in Campaigns, massive Campaign creation files, or Applet files.")
public class UploadedFileVO implements Serializable {

	private static final long serialVersionUID = 7476987588867736414L;
	/**
	 * 
	 */
	
	@UI( widgetType = WidgetType.TEXT, mode = Mode.READ_ONLY)
	@Section( name = "HEADER")
	private String description;
	
	@UI( widgetType = WidgetType.TEXT, mode = Mode.READ_ONLY)
	@Section( name = "HEADER")
	private String label;
	
	
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_ONLY, 
			label="Id", 
			description="Id of file")
	@Section(name = "BASIC_INFORMATION")
	@Required
	private Long id;
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_ONLY, 
			label="Type", 
			description="Type of File, List, Custom List, Advertising Campaigns or Applet")
	@Section(name = "BASIC_INFORMATION")
	private FileType type;
	
	
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_WRITE, 
			label="Name", 
			description="Name of File")
	@Section(name = "BASIC_INFORMATION")
	@Validator(minSize=1, maxSize=100)
	@Required
	private String name;
	
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_ONLY, 
			label="Header", 
			description="Header")
	@Section(name = "BASIC_INFORMATION")
	private String header;
	
	
	
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_ONLY, 
			label="Lines", 
			description="Total lines")
	@Section(name = "BASIC_INFORMATION")
	private Integer lines;
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_ONLY, 
			label="Unparsable Lines", 
			description="Unparsable Lines")
	@Section(name = "BASIC_INFORMATION")
	private Integer unparsableLines;
	
	
	
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_ONLY, 
			label="Created or Updated Campaigns", 
			description="Created or Updated Campaigns")
	@Section(name = "BASIC_INFORMATION")
	private Integer createdCampaigns;
	
	
	
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_ONLY, 
			label="Scheduled Campaigns", 
			description="Scheduled Campaigns")
	@Section(name = "BASIC_INFORMATION")
	private Integer scheduledCampaigns;
	
	
	
	
	
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_ONLY, 
			label="Used by", 
			description="Used by")
	@Section(name = "BASIC_INFORMATION")
	private String usedBy;
	
	
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_ONLY, 
			label="Created", 
			description="Created")
	@Section(name = "BASIC_INFORMATION")
	private Instant createdTs;
	
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_ONLY, 
			label="Validated", 
			description="Validated")
	@Section(name = "BASIC_INFORMATION")
	private Instant validatedTs;
	
	
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_ONLY, 
			label="Processed", 
			description="Processed")
	@Section(name = "BASIC_INFORMATION")
	private Instant processedTs;
	
	
	@UI( widgetType = WidgetType.TEXT, 
			mode = Mode.READ_ONLY, 
			label="Deleted", 
			description="Deleted")
	@Section(name = "BASIC_INFORMATION")
	private Instant deletedTs;

	
	@UI( widgetType = WidgetType.TEXTAREA, 
			mode = Mode.READ_ONLY, 
			label="Error Log", 
			description="Error Log")
	@Section(name = "BASIC_INFORMATION")
	private String errorLog;
	
	@UI( widgetType = WidgetType.SPECIAL, 
			mode = Mode.READ_ONLY, 
			label="Delete File", 
			description="Delete File")
	@Section(name = "MENU")
	private Boolean delete;
	
	@UI( widgetType = WidgetType.SPECIAL, 
			mode = Mode.READ_ONLY, 
			label="Delete created campaigns and schedules", 
			description="Delete created campaigns and schedules")
	@Section(name = "MENU")
	@DisplayWhen({
		@Conditions({
			@Condition(field="type", values = {"CAMPAIGNS_LIST"})
		})
	})
	private Boolean purgeRelatedObjects;
	
	@UI( widgetType = WidgetType.SPECIAL, 
			mode = Mode.READ_ONLY, 
			label="Refresh", 
			description="Refresh")
	@Section(name = "MENU")
	private Boolean refresh;
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public FileType getType() {
		return type;
	}
	public void setType(FileType type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getLines() {
		return lines;
	}
	public void setLines(Integer lines) {
		this.lines = lines;
	}
	public Integer getUnparsableLines() {
		return unparsableLines;
	}
	public void setUnparsableLines(Integer unparsableLines) {
		this.unparsableLines = unparsableLines;
	}
	public Instant getCreatedTs() {
		return createdTs;
	}
	public void setCreatedTs(Instant createdTs) {
		this.createdTs = createdTs;
	}
	public Instant getProcessedTs() {
		return processedTs;
	}
	public void setProcessedTs(Instant processedTs) {
		this.processedTs = processedTs;
	}
	public Instant getValidatedTs() {
		return validatedTs;
	}
	public void setValidatedTs(Instant validatedTs) {
		this.validatedTs = validatedTs;
	}
	public Instant getDeletedTs() {
		return deletedTs;
	}
	public void setDeletedTs(Instant deletedTs) {
		this.deletedTs = deletedTs;
	}
	public Boolean getDelete() {
		return delete;
	}
	public void setDelete(Boolean delete) {
		this.delete = delete;
	}
	public Boolean getPurgeRelatedObjects() {
		return purgeRelatedObjects;
	}
	public void setPurgeRelatedObjects(Boolean purgeRelatedObjects) {
		this.purgeRelatedObjects = purgeRelatedObjects;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getHeader() {
		return header;
	}
	public void setHeader(String header) {
		this.header = header;
	}
	public String getErrorLog() {
		return errorLog;
	}
	public void setErrorLog(String errorLog) {
		this.errorLog = errorLog;
	}
	public String getUsedBy() {
		return usedBy;
	}
	public void setUsedBy(String usedBy) {
		this.usedBy = usedBy;
	}
	public Integer getCreatedCampaigns() {
		return createdCampaigns;
	}
	public void setCreatedCampaigns(Integer createdCampaigns) {
		this.createdCampaigns = createdCampaigns;
	}
	public Integer getScheduledCampaigns() {
		return scheduledCampaigns;
	}
	public void setScheduledCampaigns(Integer scheduledCampaigns) {
		this.scheduledCampaigns = scheduledCampaigns;
	}
	public Boolean getRefresh() {
		return refresh;
	}
	public void setRefresh(Boolean refresh) {
		this.refresh = refresh;
	}
	
	
	
	
}
