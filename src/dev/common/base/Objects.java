package dev.common.base;

import dev.common.validation.NullException;
import dev.common.validation.Validator;

/**
 * @author Bloogefest
 * @version 1.0
 * @apiNote Not specified
 * @since 1.1.4
 */
public final class Objects {

    /**
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    private Objects() {}

    /**
     * @param source Not specified
     * @param subsequent Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static boolean equals(final Object source, final Object subsequent) {
        return source == subsequent;
    }

    /**
     * @param source Not specified
     * @param subsequent Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static boolean notEquals(final Object source, final Object subsequent) {
        return source != subsequent;
    }

    /**
     * @param source Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static boolean isNull(final Object source) {
        return equals(source, null);
    }

    /**
     * @param source Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static boolean notNull(final Object source) {
        return notEquals(source, null);
    }

    /**
     * @param <T> Not specified
     * @param source Not specified
     * @param subsequent Not specified
     * @return Not specified
     * @throws NullException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static <T extends Comparable<T>> int compare(final T source, final T subsequent) throws NullException {
        return Validator.notNull(source, "source").compareTo(Validator.notNull(subsequent, "subsequent"));
    }

    /**
     * @param source Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static int hashCode(final Object source) {
        return notNull(source) ? source.hashCode() : 0;
    }

}
