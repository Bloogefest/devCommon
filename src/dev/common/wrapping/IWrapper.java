package dev.common.wrapping;

import dev.common.base.ConvertException;
import dev.common.base.IConvertable;

/**
 * @param <T> Not specified
 * @author Bloogefest
 * @version 1.0
 * @apiNote Not specified
 * @since 1.1.2
 */
public interface IWrapper<T> extends IConvertable<T> {

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
