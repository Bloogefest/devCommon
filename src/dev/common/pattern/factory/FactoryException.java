package dev.common.pattern.factory;

import dev.common.pattern.PatternException;

/**
 * @author Bloogefest
 * @version 1.0
 * @apiNote Not specified
 * @since 1.1.3
 */
public class FactoryException extends PatternException {

    public FactoryException() {
    }

    public FactoryException(final String message) {
        super(message);
    }

    public FactoryException(final Throwable cause) {
        super(cause);
    }

    public FactoryException(final String message, final Throwable cause) {
        super(message, cause);
    }

    protected FactoryException(final String message, final Throwable cause, final boolean suppression, final boolean writable) {
        super(message, cause, suppression, writable);
    }

}
