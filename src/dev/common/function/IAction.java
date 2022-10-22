package dev.common.function;

/**
 * @author Bloogefest
 * @version 1.0
 * @apiNote Does something
 * @since 1.0.0
 */
@FunctionalInterface
public interface IAction {

    /**
     * @throws InvokeException Unhandled exception when invoking
     * @author Bloogefest
     * @apiNote Does something
     * @since 1.0.0
     */
    void invoke() throws InvokeException;

}
