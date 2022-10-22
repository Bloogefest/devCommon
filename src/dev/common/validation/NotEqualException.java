package dev.common.validation;

/**
 * @author Bloogefest
 * @version 1.0
 * @apiNote Not specified
 * @since 1.0.0
 */
public class NotEqualException extends ValidationException {

    public NotEqualException() {
    }

    public NotEqualException(final String message) {
        super(message);
    }

    public NotEqualException(final Throwable cause) {
        super(cause);
    }

    public NotEqualException(final String message, final Throwable cause) {
        super(message, cause);
    }

    protected NotEqualException(final String message, final Throwable cause, final boolean suppression, final boolean writable) {
        super(message, cause, suppression, writable);
    }

}
