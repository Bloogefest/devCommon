package dev.common.linking;

import dev.common.base.MutateException;
import dev.common.function.IMutableAccessor;

/**
 * @author Bloogefest
 * @version 1.1
 * @apiNote Not specified
 * @since 1.1.0
 */
@Deprecated
public interface IMutableLink<T> extends ILink<T>, IMutableAccessor<T> {

    /**
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.0
     */
    @Override
    T get();

    /**
     * @param value Not specified
     * @throws MutateException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.0
     */
    @Override
    void set(final T value) throws MutateException;

    /**
     * @return Not specified
     * @throws LinkException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.0
     */
    @Override
    ILink<T> next() throws LinkException;

    /**
     * @param link Not specified
     * @return Not specified
     * @throws LinkException Not specified
     * @throws MutateException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.1
     */
    ILink<T> next(final ILink<T> link) throws MutateException;

    /**
     * @return Not specified
     * @throws LinkException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.0
     */
    @Override
    ILink<T> previous() throws LinkException;

    /**
     * @return Not specified
     * @throws LinkException Not specified
     * @throws MutateException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.1
     */
    ILink<T> previous(final ILink<T> link) throws MutateException;

    /**
     * @return Not specified
     * @throws LinkException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.0
     */
    @Override
    boolean hasNext() throws LinkException;

    /**
     * @return Not specified
     * @throws LinkException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.0
     */
    @Override
    boolean hasPrevious() throws LinkException;

    /**
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.0
     */
    @Override
    boolean mutable();

}
