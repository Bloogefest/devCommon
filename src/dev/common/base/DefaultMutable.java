package dev.common.base;

/**
 * @author Bloogefest
 * @version 1.0
 * @apiNote Not specified
 * @since 1.1.1
 */
public class DefaultMutable implements IMutable {

    private final boolean mutable;

    public DefaultMutable() {
        this(true);
    }

    public DefaultMutable(final boolean mutable) {
        this.mutable = mutable;
    }

    /**
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.1
     */
    @Override
    public boolean mutable() {
        return mutable;
    }

}
