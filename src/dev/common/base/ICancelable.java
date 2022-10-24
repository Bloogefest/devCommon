package dev.common.base;

/**
 * @author Bloogefest
 * @version 1.3
 * @apiNote Not specified
 * @since 1.0.0
 */
@Deprecated
public interface ICancelable {

    /**
     * @throws CancelException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.0
     */
    void cancel() throws CancelException;

    /**
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.0
     */
    boolean canceled();

}
