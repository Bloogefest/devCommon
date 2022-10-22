package dev.common.base;

import dev.docs.*;

/**
 * @author Bloogefest
 * @version 1.2
 * @apiNote Not specified
 * @since 1.0.0
 */
@Author("Bloogefest")
@Version("1.2")
@ApiNote
@Since("1.0.0")
public interface ICloneable<T> {

    /**
     * @return Not specified
     * @throws CloneException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.0
     */
    @Return(Object.class)
    @Throws(@ThrowsElement(CloneException.class))
    @Author("Bloogefest")
    @ApiNote
    @Since("1.0.0")
    T clone() throws CloneException;

}
