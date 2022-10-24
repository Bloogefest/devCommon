package dev.common.function;

/**
 * @param <T> The type of the argument
 * @param <R> The type of the return value
 * @author Bloogefest
 * @version 1.0
 * @apiNote The function with an argument
 * @since 1.0.0
 */
@Deprecated
@FunctionalInterface
public interface IFunction<T, R> {

    /**
     * @param argument Argument to handle
     * @return Result of handling the value
     * @throws InvokeException Unhandled exception when invoking
     * @author Bloogefest
     * @apiNote Handles the value
     * @since 1.0.0
     */
    R invoke(final T argument) throws InvokeException;

}
