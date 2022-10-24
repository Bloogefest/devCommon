package dev.common.valid;

/**
 * @author Bloogefest
 * @version 1.0
 * @apiNote Not specified
 * @since 1.0.0
 */
@Deprecated
public class MoreException extends ValidationException {

    public MoreException() {
    }

    public MoreException(final String message) {
        super(message);
    }

    public MoreException(final Throwable cause) {
        super(cause);
    }

    public MoreException(final String message, final Throwable cause) {
        super(message, cause);
    }

    protected MoreException(final String message, final Throwable cause, final boolean suppression, final boolean writable) {
        super(message, cause, suppression, writable);
    }

}
