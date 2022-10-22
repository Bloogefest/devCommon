package dev.common.validation;

/**
 * @author Bloogefest
 * @version 1.0
 * @apiNote Not specified
 * @since 1.0.0
 */
public class NotNullException extends ValidationException {

    public NotNullException() {
    }

    public NotNullException(final String message) {
        super(message);
    }

    public NotNullException(final Throwable cause) {
        super(cause);
    }

    public NotNullException(final String message, final Throwable cause) {
        super(message, cause);
    }

    protected NotNullException(final String message, final Throwable cause, final boolean suppression, final boolean writable) {
        super(message, cause, suppression, writable);
    }

}
