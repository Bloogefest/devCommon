package dev.common.wrapping;

import dev.common.base.ConvertException;

/**
 * @author Bloogefest
 * @version 1.0
 * @apiNote Not specified
 * @since 1.1.2
 */
public interface IPrimitive<T> extends IWrapper<T> {

    /**
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.2
     */
    boolean toBoolean();

    /**
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.2
     */
    byte toByte();

    /**
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.2
     */
    short toShort();

    /**
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.2
     */
    int toInt();

    /**
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.2
     */
    long toLong();

    /**
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.2
     */
    float toFloat();

    /**
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.2
     */
    double toDouble();

    /**
     * @return Not specified
     * @throws WrapperException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.2
     */
    default IBoolean asBoolean() throws WrapperException {
        return IBoolean.of(toBoolean());
    }

    /**
     * @return Not specified
     * @throws WrapperException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.2
     */
    default IByte asByte() throws WrapperException {
        return IByte.of(toByte());
    }

    /**
     * @return Not specified
     * @throws WrapperException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.2
     */
    default IShort asShort() throws WrapperException {
        return IShort.of(toShort());
    }

    /**
     * @return Not specified
     * @throws WrapperException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.2
     */
    default IInteger asInt() throws WrapperException {
        return IInteger.of(toInt());
    }

    /**
     * @return Not specified
     * @throws WrapperException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.2
     */
    default ILong asLong() throws WrapperException {
        return ILong.of(toLong());
    }

    /**
     * @return Not specified
     * @throws WrapperException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.2
     */
    default IFloat asFloat() throws WrapperException {
        return IFloat.of(toFloat());
    }

    /**
     * @return Not specified
     * @throws WrapperException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.2
     */
    default IDouble asDouble() throws WrapperException {
        return IDouble.of(toDouble());
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
