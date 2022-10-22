package dev.common.base;

import dev.common.error.SoftError;
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
public class BugError extends SoftError {

    public BugError() {
    }

    public BugError(final String message) {
        super(message);
    }

    public BugError(final Throwable cause) {
        super(cause);
    }

    public BugError(final String message, final Throwable cause) {
        super(message, cause);
    }

    protected BugError(final String message, final Throwable cause, final boolean suppression, final boolean writable) {
        super(message, cause, suppression, writable);
    }

}
