package dev.common.validation;

/**
 * @author Bloogefest
 * @version 1.0
 * @apiNote Not specified
 * @since 1.0.0
 */
public class OutOfRangeException extends ValidationException {

    public OutOfRangeException() {
    }

    public OutOfRangeException(final String message) {
        super(message);
    }

    public OutOfRangeException(final Throwable cause) {
        super(cause);
    }

    public OutOfRangeException(final String message, final Throwable cause) {
        super(message, cause);
    }

    protected OutOfRangeException(final String message, final Throwable cause, final boolean suppression, final boolean writable) {
        super(message, cause, suppression, writable);
    }

}
