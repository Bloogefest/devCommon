package dev.common.pattern.adapter;

/**
 * @author Bloogefest
 * @version 1.0
 * @implSpec Not specified
 * @implNote Not specified
 * @apiNote Not specified
 * @since 1.1.3
 */
@Deprecated
public abstract class AbstractAdapter<ADAPTABLE> {

    /**
     * @throws AdapterException Not specified
     * @author Bloogefest
     * @implSpec Not specified
     * @implNote Not specified
     * @apiNote Not specified
     * @since 1.1.3
     */
    protected AbstractAdapter() throws AdapterException {}

    /**
     * @return Not specified
     * @throws AdapterException Not specified
     * @author Bloogefest
     * @implSpec Not specified
     * @implNote Not specified
     * @apiNote Not specified
     * @since 1.1.3
     */
    public abstract ADAPTABLE adaptable() throws AdapterException;

}
