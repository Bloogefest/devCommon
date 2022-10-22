package dev.common.base;

import dev.docs.*;

/**
 * @author Bloogefest
 * @version 1.3
 * @apiNote Not specified
 * @since 1.0.0
 */
@Author("Bloogefest")
@Version("1.3")
@ApiNote
@Since("1.0.0")
public interface IMutable {

    /**
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.0
     */
    @Return(boolean.class)
    @Author("Bloogefest")
    @ApiNote
    @Since("1.0.0")
    boolean mutable();

}
