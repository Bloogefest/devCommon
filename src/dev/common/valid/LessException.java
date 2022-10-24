package dev.common.valid;

/**
 * @author Bloogefest
 * @version 1.0
 * @apiNote Not specified
 * @since 1.0.0
 */
public class LessException extends ValidationException {

    public LessException() {
    }

    public LessException(final String message) {
        super(message);
    }

    public LessException(final Throwable cause) {
        super(cause);
    }

    public LessException(final String message, final Throwable cause) {
        super(message, cause);
    }

    protected LessException(final String message, final Throwable cause, final boolean suppression, final boolean writable) {
        super(message, cause, suppression, writable);
    }

}
