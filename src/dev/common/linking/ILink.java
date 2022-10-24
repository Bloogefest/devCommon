package dev.common.linking;

import dev.common.function.IGetter;

/**
 * @author Bloogefest
 * @version 1.0
 * @apiNote Not specified
 * @since 1.1.0
 */
@Deprecated
public interface ILink<T> extends IGetter<T> {

    /**
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.0
     */
    @Override
    T get();

    /**
     * @return Not specified
     * @throws LinkException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.0
     */
    ILink<T> next() throws LinkException;

    /**
     * @return Not specified
     * @throws LinkException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.0
     */
    ILink<T> previous() throws LinkException;

    /**
     * @return Not specified
     * @throws LinkException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.0
     */
    boolean hasNext() throws LinkException;

    /**
     * @return Not specified
     * @throws LinkException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.0
     */
    boolean hasPrevious() throws LinkException;

}
