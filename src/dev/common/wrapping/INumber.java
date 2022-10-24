package dev.common.wrapping;

import dev.common.base.ConvertException;

/**
 * @author Bloogefest
 * @version 1.0
 * @apiNote Not specified
 * @since 1.1.2
 */
public interface INumber<T extends Number> extends IPrimitive<T> {

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
    byte toByte();

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
    int toInt();

    /**
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.2
     */
    @Override
    long toLong();

    /**
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.2
     */
    @Override
    float toFloat();

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
        return IPrimitive.super.asBoolean();
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
     * @throws ConvertException Not specified
     * @throws WrapperException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.2
     */
    @Override
    T convert() throws ConvertException, WrapperException;

}
