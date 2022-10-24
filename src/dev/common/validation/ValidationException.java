package dev.common.validation;

import dev.common.throwable.SoftException;

/**
 * @author Bloogefest
 * @version 1.0
 * @apiNote Not specified
 * @since 1.1.3
 */
public class ValidationException extends SoftException {

    /**
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.3
     */
    public ValidationException() {
    }

    /**
     * @param message The description of an exceptional situation
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.3
     */
    public ValidationException(final String message) {
        super(message);
    }

    /**
     * @param cause The reason of an exceptional situation
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.3
     */
    public ValidationException(final Throwable cause) {
        super(cause);
    }

    /**
     * @param message The description of an exceptional situation
     * @param cause   The reason of an exceptional situation
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.3
     */
    public ValidationException(final String message, final Throwable cause) {
        super(message, cause);
    }

    /**
     * @param message     The description of an exceptional situation
     * @param cause       The reason of an exceptional situation
     * @param suppression The requirement to keep suppressed stack trace
     * @param writable    The requirement to keep the stack trace
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.3
     */
    protected ValidationException(final String message, final Throwable cause, final boolean suppression, final boolean writable) {
        super(message, cause, suppression, writable);
    }

}
