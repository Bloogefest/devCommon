package dev.common.function;

import dev.common.base.IMutable;
import dev.common.base.MutateException;

/**
 * @author Bloogefest
 * @version 1.0
 * @apiNote Not specified
 * @since 1.0.9
 */
public interface IMutableSetter<T> extends ISetter<T>, IMutable {

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
