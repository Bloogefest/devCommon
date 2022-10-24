package dev.common.function;

import dev.common.exception.SoftException;

/**
 * @author Bloogefest
 * @version 1.0
 * @apiNote Not specified
 * @since 1.0.0
 */
@Deprecated
public class HandleException extends SoftException {

    public HandleException() {
    }

    public HandleException(final String message) {
        super(message);
    }

    public HandleException(final Throwable cause) {
        super(cause);
    }

    public HandleException(final String message, final Throwable cause) {
        super(message, cause);
    }

    protected HandleException(final String message, final Throwable cause, final boolean suppression, final boolean writable) {
        super(message, cause, suppression, writable);
    }

}
