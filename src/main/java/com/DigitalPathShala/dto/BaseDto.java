package com.DigitalPathShala.dto;

import java.io.Serializable;

public class BaseDto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String msgId = "EF400000";
	
	public String msgDesc = "OK";

	public String getMsgId() {
		return msgId;
	}

	public void setMsgId(String msgId) {
		this.msgId = msgId;
	}

	public String getMsgDesc() {
		return msgDesc;
	}

	public void setMsgDesc(String msgDesc) {
		this.msgDesc = msgDesc;
	}
	
	
}
