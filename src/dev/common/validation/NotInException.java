package dev.common.validation;

/**
 * @author Bloogefest
 * @version 1.0
 * @apiNote Not specified
 * @since 1.0.0
 */
public class NotInException extends ValidationException {

    public NotInException() {
    }

    public NotInException(final String message) {
        super(message);
    }

    public NotInException(final Throwable cause) {
        super(cause);
    }

    public NotInException(final String message, final Throwable cause) {
        super(message, cause);
    }

    protected NotInException(final String message, final Throwable cause, final boolean suppression, final boolean writable) {
        super(message, cause, suppression, writable);
    }

}
