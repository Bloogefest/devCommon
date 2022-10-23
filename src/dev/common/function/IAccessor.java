package dev.common.function;

/**
 * @author Bloogefest
 * @version 1.0
 * @apiNote Not specified
 * @since 1.0.6
 */
public interface IAccessor<T> extends IGetter<T>, ISetter<T> {

    /**
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.6
     */
    @Override
    T get();

    /**
     * @param value Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.6
     */
    @Override
    void set(final T value);

}
