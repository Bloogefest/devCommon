package dev.common.base;

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
        return OldObjects.notLess(size(), 0);
    }

}
