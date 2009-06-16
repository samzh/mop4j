package test.vo;

public class Message {
	
	private Long id;
	
	private String text;
	
	private Message nextMessage;
	
	public Message(String word) {
		this.text = word;
	}
	
	public Message() {
		this.text = "Hello Sam";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Message getNextMessage() {
		return nextMessage;
	}

	public void setNextMessage(Message nextMessage) {
		this.nextMessage = nextMessage;
	}

}
