package dev.common.base;

/**
 * @author Bloogefest
 * @version 1.0
 * @apiNote Not specified
 * @since 1.1.4
 */
public final class Chars {

    public static final char MIN = 0;

    public static final char MAX = 65535;

    /**
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    private Chars() {}

    /**
     * @param source Not specified
     * @param subsequent Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static boolean equals(final char source, final char subsequent) {
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
    public static boolean notEquals(final char source, final char subsequent) {
        return source != subsequent;
    }

    /**
     * @param source Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static boolean min(final char source) {
        return equals(source, MIN);
    }

    /**
     * @param source Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static boolean notMin(final char source) {
        return notEquals(source, MIN);
    }

    /**
     * @param source Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static boolean max(final char source) {
        return equals(source, MAX);
    }

    /**
     * @param source Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static boolean notMax(final char source) {
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
    public static boolean more(final char source, final char subsequent) {
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
    public static boolean notMore(final char source, final char subsequent) {
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
    public static boolean less(final char source, final char subsequent) {
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
    public static boolean notLess(final char source, final char subsequent) {
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
    public static boolean in(final char source, final char min, final char max) {
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
    public static boolean notIn(final char source, final char min, final char max) {
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
    public static boolean out(final char source, final char min, final char max) {
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
    public static boolean notOut(final char source, final char min, final char max) {
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
    public static char min(final char source, final char subsequent) {
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
    public static char max(final char source, final char subsequent) {
        return more(source, subsequent) ? source : subsequent;
    }

    /**
     * @param source Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static char down(final char source) {
        return Character.toLowerCase(source);
    }

    /**
     * @param source Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static char up(final char source) {
        return Character.toUpperCase(source);
    }

}
