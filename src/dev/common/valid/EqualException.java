package dev.common.valid;

/**
 * @author Bloogefest
 * @version 1.0
 * @apiNote Not specified
 * @since 1.0.0
 */
@Deprecated
public class EqualException extends ValidationException {

    public EqualException() {
    }

    public EqualException(final String message) {
        super(message);
    }

    public EqualException(final Throwable cause) {
        super(cause);
    }

    public EqualException(final String message, final Throwable cause) {
        super(message, cause);
    }

    protected EqualException(final String message, final Throwable cause, final boolean suppression, final boolean writable) {
        super(message, cause, suppression, writable);
    }

}
