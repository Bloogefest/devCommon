package dev.common.base;

/**
 * @param <T> Not specified
 * @author Bloogefest
 * @version 1.1
 * @apiNote Not specified
 * @since 1.0.0
 */
public interface IConvertable<T> {

    /**
     * @return Not specified
     * @throws ConvertException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.0
     */
    T convert() throws ConvertException;

}
