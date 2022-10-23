package dev.common.linking;

import dev.common.exception.SoftException;

/**
 * @author Bloogefest
 * @version 1.0
 * @apiNote Not specified
 * @since 1.1.0
 */
public class LinkException extends SoftException {

    public LinkException() {
    }

    public LinkException(final String message) {
        super(message);
    }

    public LinkException(final Throwable cause) {
        super(cause);
    }

    public LinkException(final String message, final Throwable cause) {
        super(message, cause);
    }

    protected LinkException(final String message, final Throwable cause, final boolean suppression, final boolean writable) {
        super(message, cause, suppression, writable);
    }

}
