package dev.common.base;

import dev.common.exception.SoftError;

/**
 * @author Bloogefest
 * @version 1.3
 * @apiNote Not specified
 * @since 1.0.0
 */
public class CreationError extends SoftError {

    public CreationError() {
    }

    public CreationError(final String message) {
        super(message);
    }

    public CreationError(final Throwable cause) {
        super(cause);
    }

    public CreationError(final String message, final Throwable cause) {
        super(message, cause);
    }

    protected CreationError(final String message, final Throwable cause, final boolean suppression, final boolean writable) {
        super(message, cause, suppression, writable);
    }

}
