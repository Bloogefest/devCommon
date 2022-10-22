package dev.common.validation;

/**
 * @author Bloogefest
 * @version 1.0
 * @apiNote Not specified
 * @since 1.0.0
 */
public class InException extends ValidationException {

    public InException() {
    }

    public InException(final String message) {
        super(message);
    }

    public InException(final Throwable cause) {
        super(cause);
    }

    public InException(final String message, final Throwable cause) {
        super(message, cause);
    }

    protected InException(final String message, final Throwable cause, final boolean suppression, final boolean writable) {
        super(message, cause, suppression, writable);
    }

}
