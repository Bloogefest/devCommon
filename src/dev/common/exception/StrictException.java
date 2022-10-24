package dev.common.exception;

/**
 * @author Bloogefest
 * @version 1.1
 * @apiNote Not specified
 * @since 1.0.0
 */
public class StrictException extends Exception {

    public StrictException() {
        super("Not specified");
    }

    public StrictException(final String message) {
        super(message);
    }

    public StrictException(final Throwable cause) {
        super(cause);
    }

    public StrictException(final String message, final Throwable cause) {
        super(message, cause);
    }

    protected StrictException(final String message, final Throwable cause, final boolean suppression, final boolean writable) {
        super(message, cause, suppression, writable);
    }

}
