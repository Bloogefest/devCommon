package dev.common.base;

/**
 * @author Bloogefest
 * @version 1.3
 * @apiNote Not specified
 * @since 1.0.0
 */
@Deprecated
public interface ICloneable<T> {

    /**
     * @return Not specified
     * @throws CloneException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.0
     */
    T clone() throws CloneException;

}
