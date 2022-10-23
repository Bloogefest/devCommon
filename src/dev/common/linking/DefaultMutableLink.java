package dev.common.linking;

import dev.common.base.DefaultMutable;
import dev.common.base.MutateException;
import dev.common.base.Objects;

/**
 * @author Bloogefest
 * @version 1.0
 * @apiNote Not specified
 * @since 1.1.1
 */
public class DefaultMutableLink<T> extends DefaultMutable implements IMutableLink<T> {

    protected T value;

    protected ILink<T> next;

    protected ILink<T> previous;

    public DefaultMutableLink(final T value, final ILink<T> link, final boolean previous) {
        this(value, previous ? null : link, previous ? link : null);
    }

    public DefaultMutableLink(final T value, final ILink<T> link, final boolean previous, final boolean mutable) {
        this(value, previous ? null : link, previous ? link : null, mutable);
    }

    public DefaultMutableLink(final T value, final ILink<T> next, final ILink<T> previous) {
        this.value = value;
        this.next = next;
        this.previous = previous;
    }

    public DefaultMutableLink(final T value, final ILink<T> next, final ILink<T> previous, final boolean mutable) {
        super(mutable);
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
     * @param value Not specified
     * @throws MutateException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.1
     */
    @Override
    public void set(final T value) throws MutateException {
        this.value = value;
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
     * @param link Not specified
     * @return Not specified
     * @throws LinkException   Not specified
     * @throws MutateException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.1
     */
    @Override
    public ILink<T> next(final ILink<T> link) throws MutateException {
        return null;
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
     * @param link
     * @return Not specified
     * @throws LinkException   Not specified
     * @throws MutateException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.1
     */
    @Override
    public ILink<T> previous(final ILink<T> link) throws MutateException {
        return null;
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

    /**
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.1
     */
    @Override
    public boolean mutable() {
        return false;
    }

}
