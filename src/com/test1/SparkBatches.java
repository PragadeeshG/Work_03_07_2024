package com.test1;

public class SparkBatches {
	private String coreApi;
	private String batchCode;
	private String tcpSocket;
	private String udpTransferCode;
	private long mapFunction;
	private String reduceFunction;
	private String joinFunction;
	private long windowFunction;
	private String creationDate;
	private String modifiedDate;

	public SparkBatches() {

	}

	public SparkBatches(String coreApi, String batchCode, String tcpSocket, String udpTransferCode, long mapFunction,
			String reduceFunction, String joinFunction, long windowFunction, String creationDate, String modifiedDate) {
		super();
		this.coreApi = coreApi;
		this.batchCode = batchCode;
		this.tcpSocket = tcpSocket;
		this.udpTransferCode = udpTransferCode;
		this.mapFunction = mapFunction;
		this.reduceFunction = reduceFunction;
		this.joinFunction = joinFunction;
		this.windowFunction = windowFunction;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
	}

	public String getCoreApi() {
		return coreApi;
	}

	public void setCoreApi(String coreApi) {
		this.coreApi = coreApi;
	}

	public String getBatchCode() {
		return batchCode;
	}

	public void setBatchCode(String batchCode) {
		this.batchCode = batchCode;
	}

	public String getTcpSocket() {
		return tcpSocket;
	}

	public void setTcpSocket(String tcpSocket) {
		this.tcpSocket = tcpSocket;
	}

	public String getUdpTransferCode() {
		return udpTransferCode;
	}

	public void setUdpTransferCode(String udpTransferCode) {
		this.udpTransferCode = udpTransferCode;
	}

	public long getMapFunction() {
		return mapFunction;
	}

	public void setMapFunction(long mapFunction) {
		this.mapFunction = mapFunction;
	}

	public String getReduceFunction() {
		return reduceFunction;
	}

	public void setReduceFunction(String reduceFunction) {
		this.reduceFunction = reduceFunction;
	}

	public String getJoinFunction() {
		return joinFunction;
	}

	public void setJoinFunction(String joinFunction) {
		this.joinFunction = joinFunction;
	}

	public long getWindowFunction() {
		return windowFunction;
	}

	public void setWindowFunction(long windowFunction) {
		this.windowFunction = windowFunction;
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

}
