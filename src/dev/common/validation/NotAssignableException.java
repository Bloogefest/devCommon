package dev.common.validation;

/**
 * @author Bloogefest
 * @version 1.0
 * @apiNote Not specified
 * @since 1.0.0
 */
public class NotAssignableException extends ValidationException {

    public NotAssignableException() {
    }

    public NotAssignableException(final String message) {
        super(message);
    }

    public NotAssignableException(final Throwable cause) {
        super(cause);
    }

    public NotAssignableException(final String message, final Throwable cause) {
        super(message, cause);
    }

    protected NotAssignableException(final String message, final Throwable cause, final boolean suppression, final boolean writable) {
        super(message, cause, suppression, writable);
    }

}
