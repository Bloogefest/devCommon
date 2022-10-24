package dev.common.pattern;

import dev.common.exception.SoftError;

/**
 * @author Bloogefest
 * @version 1.0
 * @apiNote Not specified
 * @since 1.1.3
 */
@Deprecated
public class PatternError extends SoftError {

    public PatternError() {
    }

    public PatternError(final String message) {
        super(message);
    }

    public PatternError(final Throwable cause) {
        super(cause);
    }

    public PatternError(final String message, final Throwable cause) {
        super(message, cause);
    }

    protected PatternError(final String message, final Throwable cause, final boolean suppression, final boolean writable) {
        super(message, cause, suppression, writable);
    }

}
