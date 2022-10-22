package dev.common.base;

import dev.common.exception.SoftException;

/**
 * @author Bloogefest
 * @version 1.0
 * @apiNote Not specified
 * @since 1.0.0
 */
public class CloneException extends SoftException {

    public CloneException() {
    }

    public CloneException(final String message) {
        super(message);
    }

    public CloneException(final Throwable cause) {
        super(cause);
    }

    public CloneException(final String message, final Throwable cause) {
        super(message, cause);
    }

    protected CloneException(final String message, final Throwable cause, final boolean suppression, final boolean writable) {
        super(message, cause, suppression, writable);
    }

}