package dev.common.general;

import dev.common.security.SecurityException;
import org.jetbrains.annotations.Contract;

/**
 * @author Bloogefest
 * @version 1.0
 * @apiNote Not specified
 * @since 1.1.3
 */
public final class Arrays {

    /**
     * @throws SecurityException The exception
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.3
     */
    @Contract("-> fail")
    private Arrays() throws SecurityException {
        throw new SecurityException();
    }

}
