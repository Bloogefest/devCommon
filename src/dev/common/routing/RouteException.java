package dev.common.routing;

import dev.common.exception.SoftException;

/**
 * @author Bloogefest
 * @version 1.0
 * @apiNote Not specified
 * @since 1.0.6
 */
@Deprecated
public class RouteException extends SoftException {

    public RouteException() {
    }

    public RouteException(final String message) {
        super(message);
    }

    public RouteException(final Throwable cause) {
        super(cause);
    }

    public RouteException(final String message, final Throwable cause) {
        super(message, cause);
    }

    protected RouteException(final String message, final Throwable cause, final boolean suppression, final boolean writable) {
        super(message, cause, suppression, writable);
    }

}
