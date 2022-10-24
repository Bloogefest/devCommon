package dev.common.base;

import dev.common.exception.SoftException;

/**
 * @author Bloogefest
 * @version 1.0
 * @apiNote Not specified
 * @since 1.0.0
 */
@Deprecated
public class OpenException extends SoftException {

    public OpenException() {
    }

    public OpenException(final String message) {
        super(message);
    }

    public OpenException(final Throwable cause) {
        super(cause);
    }

    public OpenException(final String message, final Throwable cause) {
        super(message, cause);
    }

    protected OpenException(final String message, final Throwable cause, final boolean suppression, final boolean writable) {
        super(message, cause, suppression, writable);
    }

}
