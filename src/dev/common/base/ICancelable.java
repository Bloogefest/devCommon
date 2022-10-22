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
public interface ICancelable {

    /**
     * @throws CancelException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.0
     */
    @Throws(@ThrowsElement(CancelException.class))
    @Author("Bloogefest")
    @ApiNote
    @Since("1.0.0")
    void cancel() throws CancelException;

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
    boolean canceled();

}
