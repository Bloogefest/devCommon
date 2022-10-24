package dev.common.wrapping;

import dev.common.base.ConvertException;
import dev.common.validation.NullException;
import dev.common.validation.Validator;

/**
 * @author Bloogefest
 * @version 1.0
 * @apiNote Not specified
 * @since 1.1.2
 */
public interface IBoolean extends IPrimitive<Boolean> {

    boolean TRUE = true;

    boolean FALSE = false;

    byte BYTE_TRUE = 1;

    byte BYTE_FALSE = 0;

    short SHORT_TRUE = 1;

    short SHORT_FALSE = 0;

    int INT_TRUE = 1;

    int INT_FALSE = 0;

    long LONG_TRUE = 1L;

    long LONG_FALSE = 0L;

    float FLOAT_TRUE = 1F;

    float FLOAT_FALSE = 0F;

    double DOUBLE_TRUE = 1D;

    double DOUBLE_FALSE = 0D;

    /**
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.2
     */
    @Override
    boolean toBoolean();

    /**
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.2
     */
    @Override
    default byte toByte() {
        return toBoolean() ? BYTE_TRUE : BYTE_FALSE;
    }

    /**
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.2
     */
    @Override
    default short toShort() {
        return toBoolean() ? SHORT_TRUE : SHORT_FALSE;
    }

    /**
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.2
     */
    @Override
    default int toInt() {
        return toBoolean() ? INT_TRUE : INT_FALSE;
    }

    /**
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.2
     */
    @Override
    default long toLong() {
        return toBoolean() ? LONG_TRUE : LONG_FALSE;
    }

    /**
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.2
     */
    @Override
    default float toFloat() {
        return toBoolean() ? FLOAT_TRUE : FLOAT_FALSE;
    }

    /**
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.2
     */
    @Override
    default double toDouble() {
        return toBoolean() ? DOUBLE_TRUE : DOUBLE_FALSE;
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
    default IByte asByte() throws WrapperException {
        return IPrimitive.super.asByte();
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
        return IPrimitive.super.asShort();
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
        return IPrimitive.super.asInt();
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
        return IPrimitive.super.asLong();
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
        return IPrimitive.super.asFloat();
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
        return IPrimitive.super.asDouble();
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
    default Boolean convert() throws ConvertException, WrapperException {
        return toBoolean();
    }

    static IBoolean of(final boolean value) {
        return () -> value;
    }

    static IBoolean of(final Boolean wrapper) throws NullException {
        Validator.notNull(wrapper, "wrapper");
        return new IBoolean() {
            @Override
            public boolean toBoolean() {
                return wrapper;
            }

            @Override
            public Boolean convert() throws ConvertException, WrapperException {
                return wrapper;
            }
        };
    }

}
