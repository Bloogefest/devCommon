package dev.common.wrapping;

import dev.common.base.ConvertException;
import dev.common.base.OldObjects;
import dev.common.valid.NullException;
import dev.common.valid.Validator;

/**
 * @author Bloogefest
 * @version 1.0
 * @apiNote Not specified
 * @since 1.1.2
 */
public interface IDouble extends INumber<Double> {

    double MIN = Double.MIN_VALUE;

    double MAX = Double.MAX_VALUE;

    double NAN = Double.NaN;

    int BITS = Double.SIZE;

    int BYTES = Double.BYTES;

    /**
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.2
     */
    @Override
    default boolean toBoolean() {
        return OldObjects.more(toDouble(), IBoolean.DOUBLE_FALSE);
    }

    /**
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.2
     */
    @Override
    default byte toByte() {
        return (byte) toDouble();
    }

    /**
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.2
     */
    @Override
    default short toShort() {
        return (short) toDouble();
    }

    /**
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.2
     */
    @Override
    default int toInt() {
        return (int) toDouble();
    }

    /**
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.2
     */
    @Override
    default long toLong() {
        return (long) toDouble();
    }

    /**
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.2
     */
    @Override
    default float toFloat() {
        return (float) toDouble();
    }

    /**
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.2
     */
    @Override
    double toDouble();

    /**
     * @return Not specified
     * @throws WrapperException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.2
     */
    @Override
    default IBoolean asBoolean() throws WrapperException {
        return INumber.super.asBoolean();
    }

    /**
     * @return Not specified
     * @throws WrapperException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.2
     */
    @Override
    default IByte asByte() throws WrapperException {
        return INumber.super.asByte();
    }

    /**
     * @return Not specified
     * @throws WrapperException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.2
     */
    @Override
    default IShort asShort() throws WrapperException {
        return INumber.super.asShort();
    }

    /**
     * @return Not specified
     * @throws WrapperException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.2
     */
    @Override
    default IInteger asInt() throws WrapperException {
        return INumber.super.asInt();
    }

    /**
     * @return Not specified
     * @throws WrapperException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.2
     */
    @Override
    default ILong asLong() throws WrapperException {
        return INumber.super.asLong();
    }

    /**
     * @return Not specified
     * @throws WrapperException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.2
     */
    @Override
    default IFloat asFloat() throws WrapperException {
        return INumber.super.asFloat();
    }

    /**
     * @return Not specified
     * @throws WrapperException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.2
     */
    @Override
    default IDouble asDouble() throws WrapperException {
        return this;
    }

    /**
     * @return Not specified
     * @throws ConvertException Not specified
     * @throws WrapperException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.2
     */
    @Override
    default Double convert() throws ConvertException, WrapperException {
        return toDouble();
    }

    static IDouble of(final double value) {
        return () -> value;
    }

    static IDouble of(final Double wrapper) throws NullException {
        Validator.notNull(wrapper, "wrapper");
        return new IDouble() {
            @Override
            public double toDouble() {
                return wrapper;
            }

            @Override
            public Double convert() throws ConvertException, WrapperException {
                return wrapper;
            }
        };
    }

}
