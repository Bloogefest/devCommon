package dev.common.function;

/**
 * @param <T> The type of the value
 * @author Bloogefest
 * @version 1.0
 * @apiNote The getter of the value
 * @since 1.0.0
 */
@Deprecated
@FunctionalInterface
public interface IGetter<T> {

    /**
     * @return Value
     * @author Bloogefest
     * @apiNote Returns the value
     * @since 1.0.0
     */
    T get();

}
