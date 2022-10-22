package dev.common.error;

/**
 * @author Bloogefest
 * @version 1.0
 * @apiNote Not specified
 * @since 1.0.0
 */
public class StrictError extends Throwable {

    public StrictError() {
    }

    public StrictError(final String message) {
        super(message);
    }

    public StrictError(final Throwable cause) {
        super(cause);
    }

    public StrictError(final String message, final Throwable cause) {
        super(message, cause);
    }

    protected StrictError(final String message, final Throwable cause, final boolean suppression, final boolean writable) {
        super(message, cause, suppression, writable);
    }

}
