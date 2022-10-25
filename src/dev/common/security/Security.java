package dev.common.security;

import org.jetbrains.annotations.Contract;

/**
 * @author Bloogefest
 * @version 1.0
 * @apiNote Not specified
 * @since 1.1.3
 */
public class Security {

    /**
     * @throws SecurityException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.3
     */
    @Contract("-> fail")
    private Security() throws SecurityException {
        throw new SecurityException();
    }

}
