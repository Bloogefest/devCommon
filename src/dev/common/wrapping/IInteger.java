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
public interface IInteger extends INumber<Integer> {

    int MIN = Integer.MIN_VALUE;

    int MAX = Integer.MAX_VALUE;

    int BITS = Integer.SIZE;

    int BYTES = Integer.BYTES;

    /**
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.2
     */
    @Override
    default boolean toBoolean() {
        return OldObjects.more(toInt(), IBoolean.INT_FALSE);
    }

    /**
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.2
     */
    @Override
    default byte toByte() {
        return (byte) toInt();
    }

    /**
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.2
     */
    @Override
    default short toShort() {
        return (short) toInt();
    }

    /**
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.2
     */
    @Override
    int toInt();

    /**
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.2
     */
    @Override
    default long toLong() {
        return toInt();
    }

    /**
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.2
     */
    @Override
    default float toFloat() {
        return toInt();
    }

    /**
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.2
     */
    @Override
    default double toDouble() {
        return toInt();
    }

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
        return this;
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
        return INumber.super.asDouble();
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
    default Integer convert() throws ConvertException, WrapperException {
        return toInt();
    }

    static IInteger of(final int value) {
        return () -> value;
    }

    static IInteger of(final Integer wrapper) throws NullException {
        Validator.notNull(wrapper, "wrapper");
        return new IInteger() {
            @Override
            public int toInt() {
                return wrapper;
            }

            @Override
            public Integer convert() throws ConvertException, WrapperException {
                return wrapper;
            }
        };
    }

}
