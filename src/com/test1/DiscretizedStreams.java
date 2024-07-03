package com.test1;

public class DiscretizedStreams {
	private long dStreamCode;
	private String graphProcessingCatCode;
	private String graphProcessingSubCatCode;
	private String continuousStream;
	private String inputSource;
	private String immutableSource;
	private String underlyingRDS;
	private long linesDStream;
	private Integer wordsDStream;
	private String sequenceCode;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public DiscretizedStreams() {

	}

	public DiscretizedStreams(long dStreamCode, String graphProcessingCatCode, String graphProcessingSubCatCode,
			String continuousStream, String inputSource, String immutableSource, String underlyingRDS,
			long linesDStream, Integer wordsDStream, String sequenceCode, String creationDate, String modifiedDate,
			String entityState) {
		super();
		this.dStreamCode = dStreamCode;
		this.graphProcessingCatCode = graphProcessingCatCode;
		this.graphProcessingSubCatCode = graphProcessingSubCatCode;
		this.continuousStream = continuousStream;
		this.inputSource = inputSource;
		this.immutableSource = immutableSource;
		this.underlyingRDS = underlyingRDS;
		this.linesDStream = linesDStream;
		this.wordsDStream = wordsDStream;
		this.sequenceCode = sequenceCode;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public long getdStreamCode() {
		return dStreamCode;
	}

	public void setdStreamCode(long dStreamCode) {
		this.dStreamCode = dStreamCode;
	}

	public String getGraphProcessingCatCode() {
		return graphProcessingCatCode;
	}

	public void setGraphProcessingCatCode(String graphProcessingCatCode) {
		this.graphProcessingCatCode = graphProcessingCatCode;
	}

	public String getGraphProcessingSubCatCode() {
		return graphProcessingSubCatCode;
	}

	public void setGraphProcessingSubCatCode(String graphProcessingSubCatCode) {
		this.graphProcessingSubCatCode = graphProcessingSubCatCode;
	}

	public String getContinuousStream() {
		return continuousStream;
	}

	public void setContinuousStream(String continuousStream) {
		this.continuousStream = continuousStream;
	}

	public String getInputSource() {
		return inputSource;
	}

	public void setInputSource(String inputSource) {
		this.inputSource = inputSource;
	}

	public String getImmutableSource() {
		return immutableSource;
	}

	public void setImmutableSource(String immutableSource) {
		this.immutableSource = immutableSource;
	}

	public String getUnderlyingRDS() {
		return underlyingRDS;
	}

	public void setUnderlyingRDS(String underlyingRDS) {
		this.underlyingRDS = underlyingRDS;
	}

	public long getLinesDStream() {
		return linesDStream;
	}

	public void setLinesDStream(long linesDStream) {
		this.linesDStream = linesDStream;
	}

	public Integer getWordsDStream() {
		return wordsDStream;
	}

	public void setWordsDStream(Integer wordsDStream) {
		this.wordsDStream = wordsDStream;
	}

	public String getSequenceCode() {
		return sequenceCode;
	}

	public void setSequenceCode(String sequenceCode) {
		this.sequenceCode = sequenceCode;
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
