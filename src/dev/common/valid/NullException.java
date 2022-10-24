package dev.common.valid;

/**
 * @author Bloogefest
 * @version 1.0
 * @apiNote Not specified
 * @since 1.0.0
 */
public class NullException extends ValidationException {

    public NullException() {
    }

    public NullException(final String message) {
        super(message);
    }

    public NullException(final Throwable cause) {
        super(cause);
    }

    public NullException(final String message, final Throwable cause) {
        super(message, cause);
    }

    protected NullException(final String message, final Throwable cause, final boolean suppression, final boolean writable) {
        super(message, cause, suppression, writable);
    }

}
