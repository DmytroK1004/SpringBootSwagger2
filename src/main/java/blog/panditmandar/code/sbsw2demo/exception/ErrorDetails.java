package blog.panditmandar.code.sbsw2demo.exception;

import java.util.Date;

/**
 * Common Error Details Class for All Exceptions
 * 
 * @author Mandar Pandit
 */
public class ErrorDetails {

	private Date timestamp;
	private String message;
	private String details;

	public ErrorDetails(Date timestamp, String message, String details) {
		super();
		this.timestamp = timestamp;
		this.message = message;
		this.details = details;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public String getMessage() {
		return message;
	}

	public String getDetails() {
		return details;
	}
}
