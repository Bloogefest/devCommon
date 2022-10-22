package dev.common.validation;

import dev.common.exception.SoftException;

/**
 * @author Bloogefest
 * @version 1.0
 * @apiNote Not specified
 * @since 1.0.0
 */
public class ValidationException extends SoftException {

    public ValidationException() {
    }

    public ValidationException(final String message) {
        super(message);
    }

    public ValidationException(final Throwable cause) {
        super(cause);
    }

    public ValidationException(final String message, final Throwable cause) {
        super(message, cause);
    }

    protected ValidationException(final String message, final Throwable cause, final boolean suppression, final boolean writable) {
        super(message, cause, suppression, writable);
    }

}
