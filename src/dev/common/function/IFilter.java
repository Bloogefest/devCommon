package dev.common.function;

/**
 * @param <T> The type of the value
 * @author Bloogefest
 * @version 1.0
 * @apiNote The filter of the value
 * @since 1.0.0
 */
@Deprecated
@FunctionalInterface
public interface IFilter<T> extends IHandler<T, Boolean> {

    /**
     * @param value Value to handle
     * @return Result of handling the value
     * @throws HandleException Unhandled exception when handling
     * @author Bloogefest
     * @apiNote Handles the value
     * @since 1.0.0
     */
    @Override
    Boolean handle(final T value) throws HandleException;

}
