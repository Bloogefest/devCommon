package dev.common.base;

/**
 * @author Bloogefest
 * @version 1.0
 * @apiNote Not specified
 * @since 1.1.4
 */
public final class Longs {

    public static final long MIN = -9223372036854775808L;

    public static final long MAX = 9223372036854775807L;

    public static final long ZERO = 0L;

    /**
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    private Longs() {}

    /**
     * @param source Not specified
     * @param subsequent Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static boolean equals(final long source, final long subsequent) {
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
    public static boolean notEquals(final long source, final long subsequent) {
        return source != subsequent;
    }

    /**
     * @param source Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static boolean positive(final long source) {
        return notLess(source, ZERO);
    }

    /**
     * @param source Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static boolean negative(final long source) {
        return less(source, ZERO);
    }

    /**
     * @param source Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static boolean min(final long source) {
        return equals(source, MIN);
    }

    /**
     * @param source Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static boolean notMin(final long source) {
        return notEquals(source, MIN);
    }

    /**
     * @param source Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static boolean max(final long source) {
        return equals(source, MAX);
    }

    /**
     * @param source Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static boolean notMax(final long source) {
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
    public static boolean more(final long source, final long subsequent) {
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
    public static boolean notMore(final long source, final long subsequent) {
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
    public static boolean less(final long source, final long subsequent) {
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
    public static boolean notLess(final long source, final long subsequent) {
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
    public static boolean in(final long source, final long min, final long max) {
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
    public static boolean notIn(final long source, final long min, final long max) {
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
    public static boolean out(final long source, final long min, final long max) {
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
    public static boolean notOut(final long source, final long min, final long max) {
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
    public static long min(final long source, final long subsequent) {
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
    public static long max(final long source, final long subsequent) {
        return more(source, subsequent) ? source : subsequent;
    }

}
