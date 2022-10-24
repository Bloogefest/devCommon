package dev.common.pattern.factory;

/**
 * @author Bloogefest
 * @version 1.0
 * @implSpec Not specified
 * @implNote Not specified
 * @apiNote Not specified
 * @since 1.1.3
 */
@Deprecated
public abstract class AbstractFactory<PRODUCT> {

    /**
     * @throws FactoryException Not specified
     * @author Bloogefest
     * @implSpec Not specified
     * @implNote Not specified
     * @apiNote Not specified
     * @since 1.1.3
     */
    protected AbstractFactory() throws FactoryException {}

    /**
     * @return Not specified
     * @throws FactoryException Not specified
     * @author Bloogefest
     * @implSpec Not specified
     * @implNote Not specified
     * @apiNote Not specified
     * @since 1.1.3
     */
    public abstract PRODUCT create() throws FactoryException;

}
