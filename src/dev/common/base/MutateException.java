package dev.common.base;

import dev.common.exception.SoftException;

/**
 * @author Bloogefest
 * @version 1.0
 * @apiNote Not specified
 * @since 1.0.8
 */
@Deprecated
public class MutateException extends SoftException {

    public MutateException() {
    }

    public MutateException(final String message) {
        super(message);
    }

    public MutateException(final Throwable cause) {
        super(cause);
    }

    public MutateException(final String message, final Throwable cause) {
        super(message, cause);
    }

    protected MutateException(final String message, final Throwable cause, final boolean suppression, final boolean writable) {
        super(message, cause, suppression, writable);
    }

}
