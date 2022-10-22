package dev.common.function;

/**
 * @param <T> The type of the value
 * @param <R> The type of handling the value
 * @author Bloogefest
 * @version 1.0
 * @apiNote The handler of the value
 * @since 1.0.0
 */
@FunctionalInterface
public interface IHandler<T, R> {

    /**
     * @param value Value to handle
     * @return Result of handling the value
     * @throws HandleException Unhandled exception when handling
     * @author Bloogefest
     * @apiNote Handles the value
     * @since 1.0.0
     */
    R handle(final T value) throws HandleException;

}
