package dev.common.valid;

/**
 * @author Bloogefest
 * @version 1.0
 * @apiNote Not specified
 * @since 1.0.0
 */
@Deprecated
public class NotMoreException extends ValidationException {

    public NotMoreException() {
    }

    public NotMoreException(final String message) {
        super(message);
    }

    public NotMoreException(final Throwable cause) {
        super(cause);
    }

    public NotMoreException(final String message, final Throwable cause) {
        super(message, cause);
    }

    protected NotMoreException(final String message, final Throwable cause, final boolean suppression, final boolean writable) {
        super(message, cause, suppression, writable);
    }

}
