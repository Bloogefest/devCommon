package dev.common.function;

import dev.common.base.MutateException;

/**
 * @author Bloogefest
 * @version 1.0
 * @apiNote Not specified
 * @since 1.0.9
 */
@Deprecated
public interface IMutableAccessor<T> extends IAccessor<T>, IMutableSetter<T> {

    /**
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.9
     */
    @Override
    T get();

    /**
     * @param value Not specified
     * @throws MutateException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.9
     */
    @Override
    void set(final T value) throws MutateException;

    /**
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.9
     */
    @Override
    boolean mutable();

}
