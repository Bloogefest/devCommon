package dev.common.throwable;

/**
 * @author Bloogefest
 * @version 1.0
 * @apiNote A soft exception that does not require processing
 * @since 1.1.3
 */
public class SoftException extends RuntimeException {

    public static final String DEFAULT_MESSAGE = "Not specified";

    /**
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.3
     */
    public SoftException() {
        super(DEFAULT_MESSAGE);
    }

    /**
     * @param message The description of an exceptional situation
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.3
     */
    public SoftException(final String message) {
        super(message);
    }

    /**
     * @param cause The reason of an exceptional situation
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.3
     */
    public SoftException(final Throwable cause) {
        super(cause);
    }

    /**
     * @param message The description of an exceptional situation
     * @param cause The reason of an exceptional situation
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.3
     */
    public SoftException(final String message, final Throwable cause) {
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
    protected SoftException(final String message, final Throwable cause, final boolean suppression, final boolean writable) {
        super(message, cause, suppression, writable);
    }

}
