package dev.common.base;

import dev.common.validation.NullException;
import dev.common.validation.Validator;

/**
 * @author Bloogefest
 * @version 1.Integers.ZERO
 * @apiNote Not specified
 * @since 1.1.4
 */
public final class Arrays {

    /**
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    private Arrays() {}

    /**
     * @param source Not specified
     * @param subsequent Not specified
     * @throws NullException Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static boolean equals(final boolean[] source, final boolean[] subsequent) throws NullException {
        if (source == subsequent) return true;
        if (Integers.notEquals(Validator.notNull(source, "source").length, Validator.notNull(subsequent, "subsequent").length)) return false;
        for (var i = Integers.ZERO; i < source.length; i++) if (Booleans.notEquals(source[i], subsequent[i])) return false;
        return true;
    }

    /**
     * @param source Not specified
     * @param subsequent Not specified
     * @throws NullException Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static boolean equals(final char[] source, final char[] subsequent) throws NullException {
        if (source == subsequent) return true;
        if (Integers.notEquals(Validator.notNull(source, "source").length, Validator.notNull(subsequent, "subsequent").length)) return false;
        for (var i = Integers.ZERO; i < source.length; i++) if (Chars.notEquals(source[i], subsequent[i])) return false;
        return true;
    }

    /**
     * @param source Not specified
     * @param subsequent Not specified
     * @throws NullException Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static boolean equals(final byte[] source, final byte[] subsequent) throws NullException {
        if (source == subsequent) return true;
        if (Integers.notEquals(Validator.notNull(source, "source").length, Validator.notNull(subsequent, "subsequent").length)) return false;
        for (var i = Integers.ZERO; i < source.length; i++) if (Bytes.notEquals(source[i], subsequent[i])) return false;
        return true;
    }

    /**
     * @param source Not specified
     * @param subsequent Not specified
     * @throws NullException Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static boolean equals(final short[] source, final short[] subsequent) throws NullException {
        if (source == subsequent) return true;
        if (Integers.notEquals(Validator.notNull(source, "source").length, Validator.notNull(subsequent, "subsequent").length)) return false;
        for (var i = Integers.ZERO; i < source.length; i++) if (Shorts.notEquals(source[i], subsequent[i])) return false;
        return true;
    }

    /**
     * @param source Not specified
     * @param subsequent Not specified
     * @throws NullException Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static boolean equals(final int[] source, final int[] subsequent) throws NullException {
        if (source == subsequent) return true;
        if (Integers.notEquals(Validator.notNull(source, "source").length, Validator.notNull(subsequent, "subsequent").length)) return false;
        for (var i = Integers.ZERO; i < source.length; i++) if (Integers.notEquals(source[i], subsequent[i])) return false;
        return true;
    }

    /**
     * @param source Not specified
     * @param subsequent Not specified
     * @throws NullException Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static boolean equals(final long[] source, final long[] subsequent) throws NullException {
        if (source == subsequent) return true;
        if (Integers.notEquals(Validator.notNull(source, "source").length, Validator.notNull(subsequent, "subsequent").length)) return false;
        for (var i = Integers.ZERO; i < source.length; i++) if (Longs.notEquals(source[i], subsequent[i])) return false;
        return true;
    }

    /**
     * @param source Not specified
     * @param subsequent Not specified
     * @throws NullException Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static boolean equals(final float[] source, final float[] subsequent) throws NullException {
        if (source == subsequent) return true;
        if (Integers.notEquals(Validator.notNull(source, "source").length, Validator.notNull(subsequent, "subsequent").length)) return false;
        for (var i = Integers.ZERO; i < source.length; i++) if (Floats.notEquals(source[i], subsequent[i])) return false;
        return true;
    }

    /**
     * @param source Not specified
     * @param subsequent Not specified
     * @throws NullException Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static boolean equals(final double[] source, final double[] subsequent) throws NullException {
        if (source == subsequent) return true;
        if (Integers.notEquals(Validator.notNull(source, "source").length, Validator.notNull(subsequent, "subsequent").length)) return false;
        for (var i = Integers.ZERO; i < source.length; i++) if (Doubles.notEquals(source[i], subsequent[i])) return false;
        return true;
    }

    /**
     * @param source Not specified
     * @param subsequent Not specified
     * @throws NullException Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static boolean notEquals(final boolean[] source, final boolean[] subsequent) throws NullException {
        if (source != subsequent || Integers.notEquals(Validator.notNull(source, "source").length, Validator.notNull(subsequent, "subsequent").length)) return true;
        for (var i = Integers.ZERO; i < source.length; i++) if (Booleans.equals(source[i], subsequent[i])) return false;
        return true;
    }

    /**
     * @param source Not specified
     * @param subsequent Not specified
     * @throws NullException Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static boolean notEquals(final char[] source, final char[] subsequent) throws NullException {
        if (source != subsequent || Integers.notEquals(Validator.notNull(source, "source").length, Validator.notNull(subsequent, "subsequent").length)) return true;
        for (var i = Integers.ZERO; i < source.length; i++) if (Chars.equals(source[i], subsequent[i])) return false;
        return true;
    }

    /**
     * @param source Not specified
     * @param subsequent Not specified
     * @throws NullException Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static boolean notEquals(final byte[] source, final byte[] subsequent) throws NullException {
        if (source != subsequent || Integers.notEquals(Validator.notNull(source, "source").length, Validator.notNull(subsequent, "subsequent").length)) return true;
        for (var i = Integers.ZERO; i < source.length; i++) if (Bytes.equals(source[i], subsequent[i])) return false;
        return true;
    }

    /**
     * @param source Not specified
     * @param subsequent Not specified
     * @throws NullException Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static boolean notEquals(final short[] source, final short[] subsequent) throws NullException {
        if (source != subsequent || Integers.notEquals(Validator.notNull(source, "source").length, Validator.notNull(subsequent, "subsequent").length)) return true;
        for (var i = Integers.ZERO; i < source.length; i++) if (Shorts.equals(source[i], subsequent[i])) return false;
        return true;
    }

    /**
     * @param source Not specified
     * @param subsequent Not specified
     * @throws NullException Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static boolean notEquals(final int[] source, final int[] subsequent) throws NullException {
        if (source != subsequent || Integers.notEquals(Validator.notNull(source, "source").length, Validator.notNull(subsequent, "subsequent").length)) return true;
        for (var i = Integers.ZERO; i < source.length; i++) if (Integers.equals(source[i], subsequent[i])) return false;
        return true;
    }

    /**
     * @param source Not specified
     * @param subsequent Not specified
     * @throws NullException Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static boolean notEquals(final long[] source, final long[] subsequent) throws NullException {
        if (source != subsequent || Integers.notEquals(Validator.notNull(source, "source").length, Validator.notNull(subsequent, "subsequent").length)) return true;
        for (var i = Integers.ZERO; i < source.length; i++) if (Longs.equals(source[i], subsequent[i])) return false;
        return true;
    }

    /**
     * @param source Not specified
     * @param subsequent Not specified
     * @throws NullException Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static boolean notEquals(final float[] source, final float[] subsequent) throws NullException {
        if (source != subsequent || Integers.notEquals(Validator.notNull(source, "source").length, Validator.notNull(subsequent, "subsequent").length)) return true;
        for (var i = Integers.ZERO; i < source.length; i++) if (Floats.equals(source[i], subsequent[i])) return false;
        return true;
    }

    /**
     * @param source Not specified
     * @param subsequent Not specified
     * @throws NullException Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static boolean notEquals(final double[] source, final double[] subsequent) throws NullException {
        if (source != subsequent || Integers.notEquals(Validator.notNull(source, "source").length, Validator.notNull(subsequent, "subsequent").length)) return true;
        for (var i = Integers.ZERO; i < source.length; i++) if (Doubles.equals(source[i], subsequent[i])) return false;
        return true;
    }

    /**
     * @param source Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static boolean isNull(final boolean[] source) {
        return source == null;
    }

    /**
     * @param source Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static boolean isNull(final char[] source) {
        return source == null;
    }

    /**
     * @param source Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static boolean isNull(final byte[] source) {
        return source == null;
    }

    /**
     * @param source Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static boolean isNull(final short[] source) {
        return source == null;
    }

    /**
     * @param source Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static boolean isNull(final int[] source) {
        return source == null;
    }

    /**
     * @param source Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static boolean isNull(final long[] source) {
        return source == null;
    }

    /**
     * @param source Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static boolean isNull(final float[] source) {
        return source == null;
    }

    /**
     * @param source Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static boolean isNull(final double[] source) {
        return source == null;
    }

    /**
     * @param <T> Not specified
     * @param source Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static <T> boolean isNull(final T[] source) {
        return source == null;
    }

    /**
     * @param source Not specified
     * @param index Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static boolean isNull(final boolean[] source, final int index) {
        return Booleans.or(isNull(source), Booleans.not(at(source, index)));
    }

    /**
     * @param source Not specified
     * @param index Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static boolean isNull(final char[] source, final int index) {
        return Booleans.or(isNull(source), Chars.min(at(source, index)));
    }

    /**
     * @param source Not specified
     * @param index Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static boolean isNull(final byte[] source, final int index) {
        return Booleans.or(isNull(source), Bytes.equals(at(source, index), Bytes.ZERO));
    }

    /**
     * @param source Not specified
     * @param index Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static boolean isNull(final short[] source, final int index) {
        return Booleans.or(isNull(source), Shorts.equals(at(source, index), Shorts.ZERO));
    }

    /**
     * @param source Not specified
     * @param index Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static boolean isNull(final int[] source, final int index) {
        return Booleans.or(isNull(source), Integers.equals(at(source, index), Integers.ZERO));
    }

    /**
     * @param source Not specified
     * @param index Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static boolean isNull(final long[] source, final int index) {
        return Booleans.or(isNull(source), Longs.equals(at(source, index), Longs.ZERO));
    }

    /**
     * @param source Not specified
     * @param index Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static boolean isNull(final float[] source, final int index) {
        return Booleans.or(isNull(source), Floats.equals(at(source, index), Floats.ZERO));
    }

    /**
     * @param source Not specified
     * @param index Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static boolean isNull(final double[] source, final int index) {
        return Booleans.or(isNull(source), Doubles.equals(at(source, index), Doubles.ZERO));
    }

    /**
     * @param <T> Not specified
     * @param source Not specified
     * @param index Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static <T> boolean isNull(final T[] source, final int index) {
        return Booleans.or(isNull(source), Objects.isNull(at(source, index)));
    }

    /**
     * @param source Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static boolean notNull(final boolean[] source) {
        return source != null;
    }

    /**
     * @param source Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static boolean notNull(final char[] source) {
        return source != null;
    }

    /**
     * @param source Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static boolean notNull(final byte[] source) {
        return source != null;
    }

    /**
     * @param source Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static boolean notNull(final short[] source) {
        return source != null;
    }

    /**
     * @param source Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static boolean notNull(final int[] source) {
        return source != null;
    }

    /**
     * @param source Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static boolean notNull(final long[] source) {
        return source != null;
    }

    /**
     * @param source Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static boolean notNull(final float[] source) {
        return source != null;
    }

    /**
     * @param source Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static boolean notNull(final double[] source) {
        return source != null;
    }

    /**
     * @param <T> Not specified
     * @param source Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static <T> boolean notNull(final T[] source) {
        return source != null;
    }

    /**
     * @param source Not specified
     * @param index Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static boolean notNull(final boolean[] source, final int index) {
        return Booleans.and(notNull(source), at(source, index));
    }

    /**
     * @param source Not specified
     * @param index Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static boolean notNull(final char[] source, final int index) {
        return Booleans.and(notNull(source), Chars.notMin(at(source, index)));
    }

    /**
     * @param source Not specified
     * @param index Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static boolean notNull(final byte[] source, final int index) {
        return Booleans.and(notNull(source), Bytes.notEquals(at(source, index), Bytes.ZERO));
    }

    /**
     * @param source Not specified
     * @param index Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static boolean notNull(final short[] source, final int index) {
        return Booleans.and(notNull(source), Shorts.notEquals(at(source, index), Shorts.ZERO));
    }

    /**
     * @param source Not specified
     * @param index Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static boolean notNull(final int[] source, final int index) {
        return Booleans.and(notNull(source), Integers.notEquals(at(source, index), Integers.ZERO));
    }

    /**
     * @param source Not specified
     * @param index Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static boolean notNull(final long[] source, final int index) {
        return Booleans.and(notNull(source), Longs.notEquals(at(source, index), Longs.ZERO));
    }

    /**
     * @param source Not specified
     * @param index Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static boolean notNull(final float[] source, final int index) {
        return Booleans.and(notNull(source), Floats.notEquals(at(source, index), Floats.ZERO));
    }

    /**
     * @param source Not specified
     * @param index Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static boolean notNull(final double[] source, final int index) {
        return Booleans.and(notNull(source), Doubles.notEquals(at(source, index), Doubles.ZERO));
    }

    /**
     * @param <T> Not specified
     * @param source Not specified
     * @param index Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static <T> boolean notNull(final T[] source, final int index) {
        return Booleans.and(notNull(source), Objects.notNull(at(source, index)));
    }

    /**
     * @param source Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static boolean nullable(final boolean[] source) {
        if (notNull(source)) for (final var t : source) if (t) return false;
        return true;
    }

    /**
     * @param source Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static boolean nullable(final char[] source) {
        if (notNull(source)) for (final var t : source) if (Chars.min(t)) return false;
        return true;
    }

    /**
     * @param source Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static boolean nullable(final byte[] source) {
        if (notNull(source)) for (final var t : source) if (Bytes.min(t)) return false;
        return true;
    }

    /**
     * @param source Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static boolean nullable(final short[] source) {
        if (notNull(source)) for (final var t : source) if (Shorts.min(t)) return false;
        return true;
    }

    /**
     * @param source Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static boolean nullable(final int[] source) {
        if (notNull(source)) for (final var t : source) if (Integers.min(t)) return false;
        return true;
    }

    /**
     * @param source Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static boolean nullable(final long[] source) {
        if (notNull(source)) for (final var t : source) if (Longs.min(t)) return false;
        return true;
    }

    /**
     * @param source Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static boolean nullable(final float[] source) {
        if (notNull(source)) for (final var t : source) if (Floats.min(t)) return false;
        return true;
    }

    /**
     * @param source Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static boolean nullable(final double[] source) {
        if (notNull(source)) for (final var t : source) if (Doubles.min(t)) return false;
        return true;
    }

    /**
     * @param <T> Not specified
     * @param source Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static <T> boolean nullable(final T[] source) {
        if (notNull(source)) for (final var t : source) if (Objects.notNull(source)) return false;
        return true;
    }

    /**
     * @param source Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static boolean notNullable(final boolean[] source) {
        if (isNull(source)) return false;
        for (final var t : source) if (Booleans.not(t)) return false;
        return true;
    }

    /**
     * @param source Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static boolean notNullable(final char[] source) {
        if (isNull(source)) return false;
        for (final var t : source) if (Chars.notMin(t)) return false;
        return true;
    }

    /**
     * @param source Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static boolean notNullable(final byte[] source) {
        if (isNull(source)) return false;
        for (final var t : source) if (Bytes.notMin(t)) return false;
        return true;
    }

    /**
     * @param source Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static boolean notNullable(final short[] source) {
        if (isNull(source)) return false;
        for (final var t : source) if (Shorts.notMin(t)) return false;
        return true;
    }

    /**
     * @param source Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static boolean notNullable(final int[] source) {
        if (isNull(source)) return false;
        for (final var t : source) if (Integers.notMin(t)) return false;
        return true;
    }

    /**
     * @param source Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static boolean notNullable(final long[] source) {
        if (isNull(source)) return false;
        for (final var t : source) if (Longs.notMin(t)) return false;
        return true;
    }

    /**
     * @param source Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static boolean notNullable(final float[] source) {
        if (isNull(source)) return false;
        for (final var t : source) if (Floats.notMin(t)) return false;
        return true;
    }

    /**
     * @param source Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static boolean notNullable(final double[] source) {
        if (isNull(source)) return false;
        for (final var t : source) if (Doubles.notMin(t)) return false;
        return true;
    }

    /**
     * @param <T> Not specified
     * @param source Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static <T> boolean notNullable(final T[] source) {
        if (notNull(source)) for (final var t : source) if (Objects.isNull(source)) return false;
        return true;
    }

    /**
     * @param source Not specified
     * @param index Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static boolean available(final boolean[] source, final int index) {
        return Booleans.and(Booleans.and(notNull(source), Integers.notLess(index, Integers.ZERO)), Integers.less(index, source.length));
    }

    /**
     * @param source Not specified
     * @param index Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static boolean available(final char[] source, final int index) {
        return Booleans.and(Booleans.and(notNull(source), Integers.notLess(index, Integers.ZERO)), Integers.less(index, source.length));
    }

    /**
     * @param source Not specified
     * @param index Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static boolean available(final byte[] source, final int index) {
        return Booleans.and(Booleans.and(notNull(source), Integers.notLess(index, Integers.ZERO)), Integers.less(index, source.length));
    }

    /**
     * @param source Not specified
     * @param index Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static boolean available(final short[] source, final int index) {
        return Booleans.and(Booleans.and(notNull(source), Integers.notLess(index, Integers.ZERO)), Integers.less(index, source.length));
    }

    /**
     * @param source Not specified
     * @param index Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static boolean available(final int[] source, final int index) {
        return Booleans.and(Booleans.and(notNull(source), Integers.notLess(index, Integers.ZERO)), Integers.less(index, source.length));
    }

    /**
     * @param source Not specified
     * @param index Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static boolean available(final long[] source, final int index) {
        return Booleans.and(Booleans.and(notNull(source), Integers.notLess(index, Integers.ZERO)), Integers.less(index, source.length));
    }

    /**
     * @param source Not specified
     * @param index Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static boolean available(final float[] source, final int index) {
        return Booleans.and(Booleans.and(notNull(source), Integers.notLess(index, Integers.ZERO)), Integers.less(index, source.length));
    }

    /**
     * @param source Not specified
     * @param index Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static boolean available(final double[] source, final int index) {
        return Booleans.and(Booleans.and(notNull(source), Integers.notLess(index, Integers.ZERO)), Integers.less(index, source.length));
    }

    /**
     * @param <T> Not specified
     * @param source Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static <T> boolean available(final T[] source, final int index) {
        return Booleans.and(Booleans.and(notNull(source), Integers.notLess(index, Integers.ZERO)), Integers.less(index, source.length));
    }

    /**
     * @param source Not specified
     * @param index Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static boolean at(final boolean[] source, final int index) {
        return available(source, index) && source[index];
    }

    /**
     * @param source Not specified
     * @param index Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static char at(final char[] source, final int index) {
        return available(source, index) ? source[index] : Integers.ZERO;
    }

    /**
     * @param source Not specified
     * @param index Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static byte at(final byte[] source, final int index) {
        return available(source, index) ? source[index] : Integers.ZERO;
    }

    /**
     * @param source Not specified
     * @param index Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static short at(final short[] source, final int index) {
        return available(source, index) ? source[index] : Integers.ZERO;
    }

    /**
     * @param source Not specified
     * @param index Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static int at(final int[] source, final int index) {
        return available(source, index) ? source[index] : Integers.ZERO;
    }

    /**
     * @param source Not specified
     * @param index Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static long at(final long[] source, final int index) {
        return available(source, index) ? source[index] : Integers.ZERO;
    }

    /**
     * @param source Not specified
     * @param index Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static float at(final float[] source, final int index) {
        return available(source, index) ? source[index] : Integers.ZERO;
    }

    /**
     * @param source Not specified
     * @param index Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static double at(final double[] source, final int index) {
        return available(source, index) ? source[index] : Integers.ZERO;
    }

    /**
     * @param <T> Not specified
     * @param source Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static <T> T at(final T[] source, final int index) {
        return available(source, index) ? source[index] : null;
    }

    /**
     * @param source Not specified
     * @throws NullException Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static char min(final char[] source) throws NullException {
        Validator.notNull(source, "source");
        var c = Chars.MAX;
        for (final var t : source) if (Chars.less(t, c)) c = t;
        return c;
    }

    /**
     * @param source Not specified
     * @throws NullException Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static byte min(final byte[] source) throws NullException {
        Validator.notNull(source, "source");
        var c = Bytes.MAX;
        for (final var t : source) if (Bytes.less(t, c)) c = t;
        return c;
    }

    /**
     * @param source Not specified
     * @throws NullException Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static short min(final short[] source) throws NullException {
        Validator.notNull(source, "source");
        var c = Shorts.MAX;
        for (final var t : source) if (Shorts.less(t, c)) c = t;
        return c;
    }

    /**
     * @param source Not specified
     * @throws NullException Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static int min(final int[] source) throws NullException {
        Validator.notNull(source, "source");
        var c = Integers.MAX;
        for (final var t : source) if (Integers.less(t, c)) c = t;
        return c;
    }

    /**
     * @param source Not specified
     * @throws NullException Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static long min(final long[] source) throws NullException {
        Validator.notNull(source, "source");
        var c = Longs.MAX;
        for (final var t : source) if (Longs.less(t, c)) c = t;
        return c;
    }

    /**
     * @param source Not specified
     * @throws NullException Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static float min(final float[] source) throws NullException {
        Validator.notNull(source, "source");
        var c = Floats.MAX;
        for (final var t : source) if (Floats.less(t, c)) c = t;
        return c;
    }

    /**
     * @param source Not specified
     * @throws NullException Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static double min(final double[] source) throws NullException {
        Validator.notNull(source, "source");
        var c = Doubles.MAX;
        for (final var t : source) if (Doubles.less(t, c)) c = t;
        return c;
    }

    /**
     * @param <T> Not specified
     * @param source Not specified
     * @throws NullException Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static <T extends Comparable<T>> T min(final T[] source) throws NullException {
        Validator.notNull(source, "source");
        if (Integers.equals(source.length, Integers.ZERO)) return null;
        var c = source[Integers.ZERO];
        for (var i = 1; i < source.length; i++) {
            final var t = source[i];
            if (Integers.more(Objects.compare(c, t), Integers.ZERO)) c = t;
        }
        return c;
    }

    /**
     * @param source Not specified
     * @throws NullException Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static char max(final char[] source) throws NullException {
        Validator.notNull(source, "source");
        var c = Chars.MIN;
        for (final var t : source) if (Chars.more(t, c)) c = t;
        return c;
    }

    /**
     * @param source Not specified
     * @throws NullException Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static byte max(final byte[] source) throws NullException {
        Validator.notNull(source, "source");
        var c = Bytes.MIN;
        for (final var t : source) if (Bytes.more(t, c)) c = t;
        return c;
    }

    /**
     * @param source Not specified
     * @throws NullException Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static short max(final short[] source) throws NullException {
        Validator.notNull(source, "source");
        var c = Shorts.MIN;
        for (final var t : source) if (Shorts.more(t, c)) c = t;
        return c;
    }

    /**
     * @param source Not specified
     * @throws NullException Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static int max(final int[] source) throws NullException {
        Validator.notNull(source, "source");
        var c = Integers.MIN;
        for (final var t : source) if (Integers.more(t, c)) c = t;
        return c;
    }

    /**
     * @param source Not specified
     * @throws NullException Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static long max(final long[] source) throws NullException {
        Validator.notNull(source, "source");
        var c = Longs.MIN;
        for (final var t : source) if (Longs.more(t, c)) c = t;
        return c;
    }

    /**
     * @param source Not specified
     * @throws NullException Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static float max(final float[] source) throws NullException {
        Validator.notNull(source, "source");
        var c = Floats.MIN;
        for (final var t : source) if (Floats.more(t, c)) c = t;
        return c;
    }

    /**
     * @param source Not specified
     * @throws NullException Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static double max(final double[] source) throws NullException {
        Validator.notNull(source, "source");
        var c = Doubles.MIN;
        for (final var t : source) if (Doubles.more(t, c)) c = t;
        return c;
    }

    /**
     * @param <T> Not specified
     * @param source Not specified
     * @throws NullException Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static <T extends Comparable<T>> T max(final T[] source) throws NullException {
        Validator.notNull(source, "source");
        if (Integers.equals(source.length, Integers.ZERO)) return null;
        var c = source[Integers.ZERO];
        for (var i = 1; i < source.length; i++) {
            final var t = source[i];
            if (Integers.less(Objects.compare(c, t), Integers.ZERO)) c = t;
        }
        return c;
    }

    /**
     * @param source Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static int hashCode(final boolean[] source) {
        if (isNull(source)) return Integers.ZERO;
        var c = 1;
        for (final var t : source) c = 31 * c + (t ? 1231 : 1237);
        return c;
    }

    /**
     * @param source Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static int hashCode(final char[] source) {
        if (isNull(source)) return Integers.ZERO;
        var c = 1;
        for (final var t : source) c = 31 * c + t;
        return c;
    }

    /**
     * @param source Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static int hashCode(final byte[] source) {
        if (isNull(source)) return Integers.ZERO;
        var c = 1;
        for (final var t : source) c = 31 * c + t;
        return c;
    }

    /**
     * @param source Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static int hashCode(final short[] source) {
        if (isNull(source)) return Integers.ZERO;
        var c = 1;
        for (final var t : source) c = 31 * c + t;
        return c;
    }

    /**
     * @param source Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static int hashCode(final int[] source) {
        if (isNull(source)) return Integers.ZERO;
        var c = 1;
        for (final var t : source) c = 31 * c + t;
        return c;
    }

    /**
     * @param source Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static int hashCode(final long[] source) {
        if (isNull(source)) return Integers.ZERO;
        var c = 1;
        for (final var t : source) c = 31 * c + (int)(t ^ (t >>> 32));
        return c;
    }

    /**
     * @param source Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static int hashCode(final float[] source) {
        if (isNull(source)) return Integers.ZERO;
        var c = 1;
        for (final var t : source) c = 31 * c + Float.floatToIntBits(t);
        return c;
    }

    /**
     * @param source Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static int hashCode(final double[] source) {
        if (isNull(source)) return Integers.ZERO;
        var c = 1;
        for (final var t : source) {
            final var b = Double.doubleToLongBits(t);
            c = 31 * c + (int)(b ^ (b >>> 32));
        }
        return c;
    }

    /**
     * @param <T> Not specified
     * @param source Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.4
     */
    public static <T> int hashCode(final T[] source) {
        if (isNull(source)) return Integers.ZERO;
        var c = 1;
        for (final var t : source) c = 31 * c + Objects.hashCode(source);
        return c;
    }

}
