package dev.common.error;

/**
 * @author Bloogefest
 * @version 1.0
 * @apiNote Not specified
 * @since 1.0.0
 */
public class SoftError extends Error {

    public SoftError() {
    }

    public SoftError(final String message) {
        super(message);
    }

    public SoftError(final Throwable cause) {
        super(cause);
    }

    public SoftError(final String message, final Throwable cause) {
        super(message, cause);
    }

    protected SoftError(final String message, final Throwable cause, final boolean suppression, final boolean writable) {
        super(message, cause, suppression, writable);
    }

}
