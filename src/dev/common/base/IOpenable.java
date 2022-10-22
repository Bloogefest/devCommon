package dev.common.base;

/**
 * @author Bloogefest
 * @version 1.1
 * @apiNote Not specified
 * @since 1.0.0
 */
public interface IOpenable {

    void open() throws OpenException;

    boolean opened();

}
