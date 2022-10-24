package dev.common.pattern.adapter;

import dev.common.pattern.PatternException;

/**
 * @author Bloogefest
 * @version 1.0
 * @apiNote Not specified
 * @since 1.1.3
 */
@Deprecated
public class AdapterException extends PatternException {

    public AdapterException() {
    }

    public AdapterException(final String message) {
        super(message);
    }

    public AdapterException(final Throwable cause) {
        super(cause);
    }

    public AdapterException(final String message, final Throwable cause) {
        super(message, cause);
    }

    protected AdapterException(final String message, final Throwable cause, final boolean suppression, final boolean writable) {
        super(message, cause, suppression, writable);
    }

}
