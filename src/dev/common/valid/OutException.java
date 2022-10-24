package dev.common.valid;

/**
 * @author Bloogefest
 * @version 1.0
 * @apiNote Not specified
 * @since 1.0.0
 */
@Deprecated
public class OutException extends ValidationException {

    public OutException() {
    }

    public OutException(final String message) {
        super(message);
    }

    public OutException(final Throwable cause) {
        super(cause);
    }

    public OutException(final String message, final Throwable cause) {
        super(message, cause);
    }

    protected OutException(final String message, final Throwable cause, final boolean suppression, final boolean writable) {
        super(message, cause, suppression, writable);
    }

}
