package dev.common.base;

import dev.common.exception.SoftException;

/**
 * @author Bloogefest
 * @version 1.2
 * @apiNote Not specified
 * @since 1.0.0
 */
public class CancelException extends SoftException {

    public CancelException() {
    }

    public CancelException(final String message) {
        super(message);
    }

    public CancelException(final Throwable cause) {
        super(cause);
    }

    public CancelException(final String message, final Throwable cause) {
        super(message, cause);
    }

    protected CancelException(final String message, final Throwable cause, final boolean suppression, final boolean writable) {
        super(message, cause, suppression, writable);
    }

}
