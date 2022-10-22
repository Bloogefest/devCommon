package dev.common.validation;

/**
 * @author Bloogefest
 * @version 1.0
 * @apiNote Not specified
 * @since 1.0.0
 */
public class InRangeException extends ValidationException {

    public InRangeException() {
    }

    public InRangeException(final String message) {
        super(message);
    }

    public InRangeException(final Throwable cause) {
        super(cause);
    }

    public InRangeException(final String message, final Throwable cause) {
        super(message, cause);
    }

    protected InRangeException(final String message, final Throwable cause, final boolean suppression, final boolean writable) {
        super(message, cause, suppression, writable);
    }

}
