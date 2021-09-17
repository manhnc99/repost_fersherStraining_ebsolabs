package dto;

public class Call {
	private char callId;
	private int callType;
	private int channelId;
	private int conversationType;
	
	public Call(char callId, int callType, int channelId, int conversationType) {
		super();
		this.callId = callId;
		this.callType = callType;
		this.channelId = channelId;
		this.conversationType = conversationType;
	}
	
	
}
