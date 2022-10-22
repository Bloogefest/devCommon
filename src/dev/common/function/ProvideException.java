package dev.common.function;

import dev.common.exception.StrictException;

/**
 * @author Bloogefest
 * @version 1.0
 * @apiNote Not specified
 * @since 1.0.0
 */
public class ProvideException extends StrictException {

    public ProvideException() {
    }

    public ProvideException(final String message) {
        super(message);
    }

    public ProvideException(final Throwable cause) {
        super(cause);
    }

    public ProvideException(final String message, final Throwable cause) {
        super(message, cause);
    }

    protected ProvideException(final String message, final Throwable cause, final boolean suppression, final boolean writable) {
        super(message, cause, suppression, writable);
    }

}
