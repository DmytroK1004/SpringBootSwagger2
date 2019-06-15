package blog.panditmandar.code.sbsw2demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * 
 * @author Mandar Pandit
 */
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends AppException {

	private static final long serialVersionUID = 6163954829128056766L;

	public ResourceNotFoundException(String message) {
		super(message);
	}

}
