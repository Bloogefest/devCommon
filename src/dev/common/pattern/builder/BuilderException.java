package dev.common.pattern.builder;

import dev.common.pattern.PatternException;

/**
 * @author Bloogefest
 * @version 1.0
 * @apiNote Not specified
 * @since 1.1.3
 */
public class BuilderException extends PatternException {

    public BuilderException() {
    }

    public BuilderException(final String message) {
        super(message);
    }

    public BuilderException(final Throwable cause) {
        super(cause);
    }

    public BuilderException(final String message, final Throwable cause) {
        super(message, cause);
    }

    protected BuilderException(final String message, final Throwable cause, final boolean suppression, final boolean writable) {
        super(message, cause, suppression, writable);
    }

}
