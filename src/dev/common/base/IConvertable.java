package dev.common.base;

/**
 * @param <T> Not specified
 * @author Bloogefest
 * @version 1.3
 * @apiNote Not specified
 * @since 1.0.0
 */
@Deprecated
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
