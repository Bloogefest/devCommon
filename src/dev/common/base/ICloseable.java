package dev.common.base;

/**
 * @author Bloogefest
 * @version 1.4
 * @apiNote Not specified
 * @since 1.0.0
 */
public interface ICloseable {

    /**
     * @throws CloseException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.0
     */
    void close() throws CloseException;

    /**
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.0
     */
    boolean closed();

}
