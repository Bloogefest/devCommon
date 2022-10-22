package dev.common.base;

/**
 * @author Bloogefest
 * @version 1.1
 * @apiNote Not specified
 * @since 1.0.0
 */
public interface ICancelable {

    void cancel() throws CancelException;

    boolean canceled();

}
