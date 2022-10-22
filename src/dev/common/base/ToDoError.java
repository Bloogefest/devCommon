package dev.common.base;

import dev.common.error.SoftError;

/**
 * @author Bloogefest
 * @version 1.0
 * @apiNote Not specified
 * @since 1.0.0
 */
public class ToDoError extends SoftError {

    public ToDoError() {
    }

    public ToDoError(final String message) {
        super(message);
    }

    public ToDoError(final Throwable cause) {
        super(cause);
    }

    public ToDoError(final String message, final Throwable cause) {
        super(message, cause);
    }

    protected ToDoError(final String message, final Throwable cause, final boolean suppression, final boolean writable) {
        super(message, cause, suppression, writable);
    }

}