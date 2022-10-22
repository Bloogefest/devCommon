package dev.common.base;

/**
 * @author Bloogefest
 * @version 1.0
 * @apiNote Not specified
 * @since 1.0.0
 */
public interface IImmutable extends IMutable {

    @Override
    default boolean mutable() {
        return false;
    }

}
