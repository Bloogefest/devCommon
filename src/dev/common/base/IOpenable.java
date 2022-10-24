package dev.common.base;

/**
 * @author Bloogefest
 * @version 1.4
 * @apiNote Not specified
 * @since 1.0.0
 */
@Deprecated
public interface IOpenable {

    /**
     * @throws OpenException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.0
     */
    void open() throws OpenException;


    /**
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.0
     */
    boolean opened();

}
