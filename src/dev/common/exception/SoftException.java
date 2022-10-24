package dev.common.exception;

/**
 * @author Bloogefest
 * @version 1.1
 * @apiNote Not specified
 * @since 1.0.0
 */
public class SoftException extends RuntimeException {

    public SoftException() {
        super("Not specified");
    }

    public SoftException(final String message) {
        super(message);
    }

    public SoftException(final Throwable cause) {
        super(cause);
    }

    public SoftException(final String message, final Throwable cause) {
        super(message, cause);
    }

    protected SoftException(final String message, final Throwable cause, final boolean suppression, final boolean writable) {
        super(message, cause, suppression, writable);
    }

}
