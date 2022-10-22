package dev.common.base;

import dev.common.exception.SoftException;

/**
 * @author Bloogefest
 * @version 1.3
 * @apiNote Not specified
 * @since 1.0.0
 */
public class CloseException extends SoftException {

    public CloseException() {
    }

    public CloseException(final String message) {
        super(message);
    }

    public CloseException(final Throwable cause) {
        super(cause);
    }

    public CloseException(final String message, final Throwable cause) {
        super(message, cause);
    }

    protected CloseException(final String message, final Throwable cause, final boolean suppression, final boolean writable) {
        super(message, cause, suppression, writable);
    }

}
