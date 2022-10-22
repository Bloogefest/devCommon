package dev.common.base;

/**
 * @author Bloogefest
 * @version 1.0
 * @apiNote Not specified
 * @since 1.0.0
 */
public interface ICloneable<T> {

    T clone() throws CloneException;

}
