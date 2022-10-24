package dev.common.throwable;

/**
 * @author Bloogefest
 * @version 1.0
 * @apiNote A strict exception that requires processing
 * @since 1.1.3
 */
public class StrictException extends Exception {

    public static final String DEFAULT_MESSAGE = "Not specified";

    /**
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.3
     */
    public StrictException() {
        super(DEFAULT_MESSAGE);
    }

    /**
     * @param message The description of an exceptional situation
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.3
     */
    public StrictException(final String message) {
        super(message);
    }

    /**
     * @param cause The reason of an exceptional situation
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.3
     */
    public StrictException(final Throwable cause) {
        super(cause);
    }

    /**
     * @param message The description of an exceptional situation
     * @param cause The reason of an exceptional situation
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.3
     */
    public StrictException(final String message, final Throwable cause) {
        super(message, cause);
    }

    /**
     * @param message The description of an exceptional situation
     * @param cause The reason of an exceptional situation
     * @param suppression The requirement to keep suppressed stack trace
     * @param writable The requirement to keep the stack trace
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.3
     */
    protected StrictException(final String message, final Throwable cause, final boolean suppression, final boolean writable) {
        super(message, cause, suppression, writable);
    }

}
