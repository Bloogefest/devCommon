package dev.common.function;

import dev.common.exception.SoftException;

/**
 * @author Bloogefest
 * @version 1.0
 * @apiNote Not specified
 * @since 1.0.0
 */
@Deprecated
public class ConvertException extends SoftException {

    public ConvertException() {
    }

    public ConvertException(final String message) {
        super(message);
    }

    public ConvertException(final Throwable cause) {
        super(cause);
    }

    public ConvertException(final String message, final Throwable cause) {
        super(message, cause);
    }

    protected ConvertException(final String message, final Throwable cause, final boolean suppression, final boolean writable) {
        super(message, cause, suppression, writable);
    }

}
