package dev.common.exception;

/**
 * @author Bloogefest
 * @version 1.1
 * @apiNote Not specified
 * @since 1.0.0
 */
@Deprecated
public class SoftError extends Error {

    public SoftError() {
        super("Not specified");
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
