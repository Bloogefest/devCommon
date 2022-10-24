package dev.common.function;

import dev.common.exception.SoftException;

/**
 * @author Bloogefest
 * @version 1.0
 * @apiNote Not specified
 * @since 1.0.0
 */
@Deprecated
public class InvokeException extends SoftException {

    public InvokeException() {
    }

    public InvokeException(final String message) {
        super(message);
    }

    public InvokeException(final Throwable cause) {
        super(cause);
    }

    public InvokeException(final String message, final Throwable cause) {
        super(message, cause);
    }

    protected InvokeException(final String message, final Throwable cause, final boolean suppression, final boolean writable) {
        super(message, cause, suppression, writable);
    }

}
