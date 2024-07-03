package com.test1;

public class SparkFlume {
	private String graphProcessing;
	private String graphProcessingSubCatName;
	private String graphProcessingSubCatDescription;
	private String graphProcessingSubCatDefinition;
	private String graphProcessingSubCatRefAuthName;
	private long hdfsCode;
	private String s3Space;
	private String kinesisIntegrated;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public SparkFlume() {

	}

	public SparkFlume(String graphProcessing, String graphProcessingSubCatName, String graphProcessingSubCatDescription,
			String graphProcessingSubCatDefinition, String graphProcessingSubCatRefAuthName, long hdfsCode,
			String s3Space, String kinesisIntegrated, String creationDate, String modifiedDate, String entityState) {
		super();
		this.graphProcessing = graphProcessing;
		this.graphProcessingSubCatName = graphProcessingSubCatName;
		this.graphProcessingSubCatDescription = graphProcessingSubCatDescription;
		this.graphProcessingSubCatDefinition = graphProcessingSubCatDefinition;
		this.graphProcessingSubCatRefAuthName = graphProcessingSubCatRefAuthName;
		this.hdfsCode = hdfsCode;
		this.s3Space = s3Space;
		this.kinesisIntegrated = kinesisIntegrated;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public String getGraphProcessing() {
		return graphProcessing;
	}

	public void setGraphProcessing(String graphProcessing) {
		this.graphProcessing = graphProcessing;
	}

	public String getGraphProcessingSubCatName() {
		return graphProcessingSubCatName;
	}

	public void setGraphProcessingSubCatName(String graphProcessingSubCatName) {
		this.graphProcessingSubCatName = graphProcessingSubCatName;
	}

	public String getGraphProcessingSubCatDescription() {
		return graphProcessingSubCatDescription;
	}

	public void setGraphProcessingSubCatDescription(String graphProcessingSubCatDescription) {
		this.graphProcessingSubCatDescription = graphProcessingSubCatDescription;
	}

	public String getGraphProcessingSubCatDefinition() {
		return graphProcessingSubCatDefinition;
	}

	public void setGraphProcessingSubCatDefinition(String graphProcessingSubCatDefinition) {
		this.graphProcessingSubCatDefinition = graphProcessingSubCatDefinition;
	}

	public String getGraphProcessingSubCatRefAuthName() {
		return graphProcessingSubCatRefAuthName;
	}

	public void setGraphProcessingSubCatRefAuthName(String graphProcessingSubCatRefAuthName) {
		this.graphProcessingSubCatRefAuthName = graphProcessingSubCatRefAuthName;
	}

	public long getHdfsCode() {
		return hdfsCode;
	}

	public void setHdfsCode(long hdfsCode) {
		this.hdfsCode = hdfsCode;
	}

	public String getS3Space() {
		return s3Space;
	}

	public void setS3Space(String s3Space) {
		this.s3Space = s3Space;
	}

	public String getKinesisIntegrated() {
		return kinesisIntegrated;
	}

	public void setKinesisIntegrated(String kinesisIntegrated) {
		this.kinesisIntegrated = kinesisIntegrated;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
