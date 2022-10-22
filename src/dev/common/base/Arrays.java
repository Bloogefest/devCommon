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
public final class Arrays {

    /**
     * @throws CreationError Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.0
     */
    @Throws(@ThrowsElement(CreationError.class))
    @Author("Bloogefest")
    @ApiNote
    @Since("1.0.0")
    private Arrays() throws CreationError {
        throw new CreationError();
    }

}
