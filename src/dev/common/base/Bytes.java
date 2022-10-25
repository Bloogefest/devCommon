package dev.common.base;

/**
 * @author Bloogefest
 * @version 1.0
 * @apiNote Not specified
 * @since 1.1.4
 */
public final class Bytes {

    public static final byte MIN = -128;

    public static final byte MAX = 127;

    public static final byte ZERO = 0;

    /**
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    private Bytes() {}

    /**
     * @param source Not specified
     * @param subsequent Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static boolean equals(final byte source, final byte subsequent) {
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
    public static boolean notEquals(final byte source, final byte subsequent) {
        return source != subsequent;
    }

    /**
     * @param source Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static boolean positive(final byte source) {
        return notLess(source, ZERO);
    }

    /**
     * @param source Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static boolean negative(final byte source) {
        return less(source, ZERO);
    }

    /**
     * @param source Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static boolean min(final byte source) {
        return equals(source, MIN);
    }

    /**
     * @param source Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static boolean notMin(final byte source) {
        return notEquals(source, MIN);
    }

    /**
     * @param source Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static boolean max(final byte source) {
        return equals(source, MAX);
    }

    /**
     * @param source Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static boolean notMax(final byte source) {
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
    public static boolean more(final byte source, final byte subsequent) {
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
    public static boolean notMore(final byte source, final byte subsequent) {
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
    public static boolean less(final byte source, final byte subsequent) {
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
    public static boolean notLess(final byte source, final byte subsequent) {
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
    public static boolean in(final byte source, final byte min, final byte max) {
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
    public static boolean notIn(final byte source, final byte min, final byte max) {
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
    public static boolean out(final byte source, final byte min, final byte max) {
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
    public static boolean notOut(final byte source, final byte min, final byte max) {
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
    public static byte min(final byte source, final byte subsequent) {
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
    public static byte max(final byte source, final byte subsequent) {
        return more(source, subsequent) ? source : subsequent;
    }

}
