package dev.common.valid;

/**
 * @author Bloogefest
 * @version 1.0
 * @apiNote Not specified
 * @since 1.0.0
 */
public class AssignableException extends ValidationException {

    public AssignableException() {
    }

    public AssignableException(final String message) {
        super(message);
    }

    public AssignableException(final Throwable cause) {
        super(cause);
    }

    public AssignableException(final String message, final Throwable cause) {
        super(message, cause);
    }

    protected AssignableException(final String message, final Throwable cause, final boolean suppression, final boolean writable) {
        super(message, cause, suppression, writable);
    }

}
