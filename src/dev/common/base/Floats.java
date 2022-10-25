package dev.common.base;

/**
 * @author Bloogefest
 * @version 1.0
 * @apiNote Not specified
 * @since 1.1.4
 */
public final class Floats {

    public static final float MIN = 0.0000000000000000000000000000000000000117549435F;

    public static final float MAX = 340282350000000000000000000000000000000F;

    public static final float ZERO = 0F;

    public static final float NaN = Float.NaN;

    /**
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    private Floats() {}

    /**
     * @param source Not specified
     * @param subsequent Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static boolean equals(final float source, final float subsequent) {
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
    public static boolean notEquals(final float source, final float subsequent) {
        return source != subsequent;
    }

    /**
     * @param source Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static boolean isNaN(final float source) {
        return equals(source, NaN);
    }

    /**
     * @param source Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static boolean notNaN(final float source) {
        return notEquals(source, NaN);
    }

    /**
     * @param source Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static boolean positive(final float source) {
        return notLess(source, ZERO);
    }

    /**
     * @param source Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static boolean negative(final float source) {
        return less(source, ZERO);
    }

    /**
     * @param source Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static boolean min(final float source) {
        return equals(source, MIN);
    }

    /**
     * @param source Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static boolean notMin(final float source) {
        return notEquals(source, MIN);
    }

    /**
     * @param source Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static boolean max(final float source) {
        return equals(source, MAX);
    }

    /**
     * @param source Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static boolean notMax(final float source) {
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
    public static boolean more(final float source, final float subsequent) {
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
    public static boolean notMore(final float source, final float subsequent) {
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
    public static boolean less(final float source, final float subsequent) {
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
    public static boolean notLess(final float source, final float subsequent) {
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
    public static boolean in(final float source, final float min, final float max) {
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
    public static boolean notIn(final float source, final float min, final float max) {
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
    public static boolean out(final float source, final float min, final float max) {
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
    public static boolean notOut(final float source, final float min, final float max) {
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
    public static float min(final float source, final float subsequent) {
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
    public static float max(final float source, final float subsequent) {
        return more(source, subsequent) ? source : subsequent;
    }

}
