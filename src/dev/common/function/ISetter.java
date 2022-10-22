package dev.common.function;

/**
 * @param <T> The type of the value
 * @author Bloogefest
 * @version 1.0
 * @apiNote The setter of the value
 * @since 1.0.0
 */
@FunctionalInterface
public interface ISetter<T> {

    /**
     * @param value Value to set
     * @author Bloogefest
     * @apiNote Sets the value
     * @since 1.0.0
     */
    void set(final T value);

}
