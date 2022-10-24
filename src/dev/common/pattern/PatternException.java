package dev.common.pattern;

import dev.common.exception.SoftException;

/**
 * @author Bloogefest
 * @version 1.0
 * @apiNote Not specified
 * @since 1.1.3
 */
@Deprecated
public class PatternException extends SoftException {

    public PatternException() {
    }

    public PatternException(final String message) {
        super(message);
    }

    public PatternException(final Throwable cause) {
        super(cause);
    }

    public PatternException(final String message, final Throwable cause) {
        super(message, cause);
    }

    protected PatternException(final String message, final Throwable cause, final boolean suppression, final boolean writable) {
        super(message, cause, suppression, writable);
    }

}
