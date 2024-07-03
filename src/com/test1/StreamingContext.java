package com.test1;

public class StreamingContext {
	private Integer sparkConfId;
	private Integer sparkName;
	private String clusterUI;
	private String appName;
	private String setMaster;
	private String inProcessStreaming;
	private String awaitTermination;
	private String stopContext;
	private String entityState;

	public StreamingContext() {

	}

	public StreamingContext(Integer sparkConfId, Integer sparkName, String clusterUI, String appName, String setMaster,
			String inProcessStreaming, String awaitTermination, String stopContext, String entityState) {
		super();
		this.sparkConfId = sparkConfId;
		this.sparkName = sparkName;
		this.clusterUI = clusterUI;
		this.appName = appName;
		this.setMaster = setMaster;
		this.inProcessStreaming = inProcessStreaming;
		this.awaitTermination = awaitTermination;
		this.stopContext = stopContext;
		this.entityState = entityState;
	}

	public Integer getSparkConfId() {
		return sparkConfId;
	}

	public void setSparkConfId(Integer sparkConfId) {
		this.sparkConfId = sparkConfId;
	}

	public Integer getSparkName() {
		return sparkName;
	}

	public void setSparkName(Integer sparkName) {
		this.sparkName = sparkName;
	}

	public String getClusterUI() {
		return clusterUI;
	}

	public void setClusterUI(String clusterUI) {
		this.clusterUI = clusterUI;
	}

	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getSetMaster() {
		return setMaster;
	}

	public void setSetMaster(String setMaster) {
		this.setMaster = setMaster;
	}

	public String getInProcessStreaming() {
		return inProcessStreaming;
	}

	public void setInProcessStreaming(String inProcessStreaming) {
		this.inProcessStreaming = inProcessStreaming;
	}

	public String getAwaitTermination() {
		return awaitTermination;
	}

	public void setAwaitTermination(String awaitTermination) {
		this.awaitTermination = awaitTermination;
	}

	public String getStopContext() {
		return stopContext;
	}

	public void setStopContext(String stopContext) {
		this.stopContext = stopContext;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
