package dev.common.wrapping;

import dev.common.exception.SoftException;

/**
 * @author Bloogefest
 * @version 1.0
 * @apiNote Not specified
 * @since 1.1.2
 */
public class WrapperException extends SoftException {

    public WrapperException() {
    }

    public WrapperException(final String message) {
        super(message);
    }

    public WrapperException(final Throwable cause) {
        super(cause);
    }

    public WrapperException(final String message, final Throwable cause) {
        super(message, cause);
    }

    protected WrapperException(final String message, final Throwable cause, final boolean suppression, final boolean writable) {
        super(message, cause, suppression, writable);
    }

}
