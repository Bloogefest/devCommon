package dev.common.valid;

/**
 * @author Bloogefest
 * @version 1.0
 * @apiNote Not specified
 * @since 1.0.0
 */
public class NotLessException extends ValidationException {

    public NotLessException() {
    }

    public NotLessException(final String message) {
        super(message);
    }

    public NotLessException(final Throwable cause) {
        super(cause);
    }

    public NotLessException(final String message, final Throwable cause) {
        super(message, cause);
    }

    protected NotLessException(final String message, final Throwable cause, final boolean suppression, final boolean writable) {
        super(message, cause, suppression, writable);
    }

}
