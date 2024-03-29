package exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NO_CONTENT, reason = "No user with this login found")
public class NoUserFoundException extends RuntimeException {

    public NoUserFoundException(String message) {
        super(message);
    }
}
