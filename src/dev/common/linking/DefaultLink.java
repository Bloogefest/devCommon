package dev.common.linking;

import dev.common.base.Objects;

/**
 * @author Bloogefest
 * @version 1.0
 * @apiNote Not specified
 * @since 1.1.1
 */
public class DefaultLink<T> implements ILink<T> {

    private final T value;

    private final ILink<T> next;

    private final ILink<T> previous;

    public DefaultLink(final T value, final ILink<T> link, final boolean previous) {
        this(value, previous ? null : link, previous ? link : null);
    }

    public DefaultLink(final T value, final ILink<T> next, final ILink<T> previous) {
        this.value = value;
        this.next = next;
        this.previous = previous;
    }

    /**
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.1
     */
    @Override
    public T get() {
        return value;
    }

    /**
     * @return Not specified
     * @throws LinkException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.1
     */
    @Override
    public ILink<T> next() throws LinkException {
        return next;
    }

    /**
     * @return Not specified
     * @throws LinkException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.1
     */
    @Override
    public ILink<T> previous() throws LinkException {
        return previous;
    }

    /**
     * @return Not specified
     * @throws LinkException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.1
     */
    @Override
    public boolean hasNext() throws LinkException {
        return Objects.notNull(next);
    }

    /**
     * @return Not specified
     * @throws LinkException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.1
     */
    @Override
    public boolean hasPrevious() throws LinkException {
        return Objects.notNull(previous);
    }

}
