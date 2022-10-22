package dev.common.base;

import dev.common.exception.SoftException;
import dev.docs.ApiNote;
import dev.docs.Author;
import dev.docs.Since;
import dev.docs.Version;

/**
 * @author Bloogefest
 * @version 1.1
 * @apiNote Not specified
 * @since 1.0.0
 */
@Author("Bloogefest")
@Version("1.1")
@ApiNote
@Since("1.0.0")
public class ConvertException extends SoftException {

    public ConvertException() {
    }

    public ConvertException(final String message) {
        super(message);
    }

    public ConvertException(final Throwable cause) {
        super(cause);
    }

    public ConvertException(final String message, final Throwable cause) {
        super(message, cause);
    }

    protected ConvertException(final String message, final Throwable cause, final boolean suppression, final boolean writable) {
        super(message, cause, suppression, writable);
    }

}
