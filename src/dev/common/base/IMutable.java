package dev.common.base;

/**
 * @author Bloogefest
 * @version 1.0
 * @apiNote Not specified
 * @since 1.0.0
 */
public interface IMutable {

    default boolean mutable() {
        return true;
    }

}