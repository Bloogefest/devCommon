package dev.common.base;

import dev.common.validation.LessException;
import dev.common.validation.Validator;

/**
 * @author Bloogefest
 * @version 1.1
 * @apiNote Not specified
 * @since 1.0.7
 */
public interface ISizable {

    /**
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.7
     */
    int size();

    /**
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.7
     */
    default boolean empty() {
        return Objects.notLess(size(), 0);
    }

}
