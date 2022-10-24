package dev.common.validation;

/**
 * @author Bloogefest
 * @version 1.0
 * @apiNote Not specified
 * @since 1.1.3
 */
public class NotEqualsException extends ValidationException {

    public static final String LAYOUT_MESSAGE = "The %s must be equal to %s";

    public static final String DEFAULT_MESSAGE = "The source object must be equal to the subsequent object";

    /**
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.3
     */
    public NotEqualsException() {
        super(DEFAULT_MESSAGE);
    }

    /**
     * @param message The description of an exceptional situation
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.3
     */
    public NotEqualsException(final String message) {
        super(message);
    }

    /**
     * @param cause The reason of an exceptional situation
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.3
     */
    public NotEqualsException(final Throwable cause) {
        super(cause);
    }

    /**
     * @param message The description of an exceptional situation
     * @param cause   The reason of an exceptional situation
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.3
     */
    public NotEqualsException(final String message, final Throwable cause) {
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
    protected NotEqualsException(final String message, final Throwable cause, final boolean suppression, final boolean writable) {
        super(message, cause, suppression, writable);
    }

}
