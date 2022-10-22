package dev.common.base;

import dev.common.error.SoftError;

/**
 * @author Bloogefest
 * @version 1.0
 * @apiNote Not specified
 * @since 1.0.0
 */
public class ToFixError extends SoftError {

    public ToFixError() {
    }

    public ToFixError(final String message) {
        super(message);
    }

    public ToFixError(final Throwable cause) {
        super(cause);
    }

    public ToFixError(final String message, final Throwable cause) {
        super(message, cause);
    }

    protected ToFixError(final String message, final Throwable cause, final boolean suppression, final boolean writable) {
        super(message, cause, suppression, writable);
    }

}
