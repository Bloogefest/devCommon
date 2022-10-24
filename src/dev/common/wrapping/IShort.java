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
public interface IShort extends INumber<Short> {

    short MIN = Short.MIN_VALUE;

    short MAX = Short.MAX_VALUE;

    int BITS = Short.SIZE;

    int BYTES = Short.BYTES;

    /**
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.2
     */
    @Override
    default boolean toBoolean() {
        return OldObjects.more(toShort(), IBoolean.SHORT_FALSE);
    }

    /**
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.2
     */
    @Override
    default byte toByte() {
        return (byte) toShort();
    }

    /**
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.2
     */
    @Override
    short toShort();

    /**
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.2
     */
    @Override
    default int toInt() {
        return toShort();
    }

    /**
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.2
     */
    @Override
    default long toLong() {
        return toShort();
    }

    /**
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.2
     */
    @Override
    default float toFloat() {
        return toShort();
    }

    /**
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.2
     */
    @Override
    default double toDouble() {
        return toShort();
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
    default Short convert() throws ConvertException, WrapperException {
        return toShort();
    }

    static IShort of(final short value) {
        return () -> value;
    }

    static IShort of(final Short wrapper) throws NullException {
        Validator.notNull(wrapper, "wrapper");
        return new IShort() {
            @Override
            public short toShort() {
                return wrapper;
            }

            @Override
            public Short convert() throws ConvertException, WrapperException {
                return wrapper;
            }
        };
    }

}
