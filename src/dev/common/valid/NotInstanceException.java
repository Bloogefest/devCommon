package dev.common.valid;

/**
 * @author Bloogefest
 * @version 1.0
 * @apiNote Not specified
 * @since 1.0.2
 */
@Deprecated
public class NotInstanceException extends ValidationException {

    public NotInstanceException() {
    }

    public NotInstanceException(final String message) {
        super(message);
    }

    public NotInstanceException(final Throwable cause) {
        super(cause);
    }

    public NotInstanceException(final String message, final Throwable cause) {
        super(message, cause);
    }

    protected NotInstanceException(final String message, final Throwable cause, final boolean suppression, final boolean writable) {
        super(message, cause, suppression, writable);
    }

}
