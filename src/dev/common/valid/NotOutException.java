package dev.common.valid;

/**
 * @author Bloogefest
 * @version 1.0
 * @apiNote Not specified
 * @since 1.0.0
 */
@Deprecated
public class NotOutException extends ValidationException {

    public NotOutException() {
    }

    public NotOutException(final String message) {
        super(message);
    }

    public NotOutException(final Throwable cause) {
        super(cause);
    }

    public NotOutException(final String message, final Throwable cause) {
        super(message, cause);
    }

    protected NotOutException(final String message, final Throwable cause, final boolean suppression, final boolean writable) {
        super(message, cause, suppression, writable);
    }

}
