package dev.common.pattern.builder;

/**
 * @author Bloogefest
 * @version 1.0
 * @implSpec Not specified
 * @implNote Not specified
 * @apiNote Not specified
 * @since 1.1.3
 */
public abstract class AbstractBuilder<PRODUCT> {

    /**
     * @throws BuilderException Not specified
     * @author Bloogefest
     * @implSpec Not specified
     * @implNote Not specified
     * @apiNote Not specified
     * @since 1.1.3
     */
    protected AbstractBuilder() throws BuilderException {}

    /**
     * @return Not specified
     * @throws BuilderException Not specified
     * @author Bloogefest
     * @implSpec Not specified
     * @implNote Not specified
     * @apiNote Not specified
     * @since 1.1.3
     */
    public abstract PRODUCT build() throws BuilderException;

}
