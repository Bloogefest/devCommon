package dev.common.validation;

/**
 * @author Bloogefest
 * @version 1.0
 * @apiNote Not specified
 * @since 1.0.2
 */
public class InstanceException extends ValidationException {

    public InstanceException() {
    }

    public InstanceException(final String message) {
        super(message);
    }

    public InstanceException(final Throwable cause) {
        super(cause);
    }

    public InstanceException(final String message, final Throwable cause) {
        super(message, cause);
    }

    protected InstanceException(final String message, final Throwable cause, final boolean suppression, final boolean writable) {
        super(message, cause, suppression, writable);
    }

}
