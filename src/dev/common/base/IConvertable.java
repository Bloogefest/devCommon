package dev.common.base;

/**
 * @author Bloogefest
 * @version 1.0
 * @apiNote Not specified
 * @since 1.0.0
 */
public interface IConvertable<T> {

    T convert() throws ConvertException;

}
