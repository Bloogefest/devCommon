package dev.common.base;

/**
 * @author Bloogefest
 * @version 1.0
 * @apiNote Not specified
 * @since 1.1.4
 */
public final class Integers {

    public static final int MIN = -2147483648;

    public static final int MAX = 2147483647;

    public static final int ZERO = 0;

    /**
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    private Integers() {}

    /**
     * @param source Not specified
     * @param subsequent Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static boolean equals(final int source, final int subsequent) {
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
    public static boolean notEquals(final int source, final int subsequent) {
        return source != subsequent;
    }

    /**
     * @param source Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static boolean positive(final int source) {
        return notLess(source, ZERO);
    }

    /**
     * @param source Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static boolean negative(final int source) {
        return less(source, ZERO);
    }

    /**
     * @param source Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static boolean min(final int source) {
        return equals(source, MIN);
    }

    /**
     * @param source Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static boolean notMin(final int source) {
        return notEquals(source, MIN);
    }

    /**
     * @param source Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static boolean max(final int source) {
        return equals(source, MAX);
    }

    /**
     * @param source Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static boolean notMax(final int source) {
        return notEquals(source, MAX);
    }

    /**
     * @param source Not specified
     * @param subsequent Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static boolean more(final int source, final int subsequent) {
        return source > subsequent;
    }

    /**
     * @param source Not specified
     * @param subsequent Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static boolean notMore(final int source, final int subsequent) {
        return source <= subsequent;
    }

    /**
     * @param source Not specified
     * @param subsequent Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static boolean less(final int source, final int subsequent) {
        return source < subsequent;
    }

    /**
     * @param source Not specified
     * @param subsequent Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static boolean notLess(final int source, final int subsequent) {
        return source >= subsequent;
    }

    /**
     * @param source Not specified
     * @param min Not specified
     * @param max Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static boolean in(final int source, final int min, final int max) {
        return Booleans.and(more(source, min), less(source, max));
    }

    /**
     * @param source Not specified
     * @param min Not specified
     * @param max Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static boolean notIn(final int source, final int min, final int max) {
        return Booleans.and(notMore(source, min), notLess(source, max));
    }

    /**
     * @param source Not specified
     * @param min Not specified
     * @param max Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static boolean out(final int source, final int min, final int max) {
        return Booleans.and(less(source, min), more(source, max));
    }

    /**
     * @param source Not specified
     * @param min Not specified
     * @param max Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static boolean notOut(final int source, final int min, final int max) {
        return Booleans.and(notLess(source, min), notMore(source, max));
    }

    /**
     * @param source Not specified
     * @param subsequent Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static int min(final int source, final int subsequent) {
        return less(source, subsequent) ? source : subsequent;
    }

    /**
     * @param source Not specified
     * @param subsequent Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static int max(final int source, final int subsequent) {
        return more(source, subsequent) ? source : subsequent;
    }

}
