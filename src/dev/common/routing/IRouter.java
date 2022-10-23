package dev.common.routing;

/**
 * @author Bloogefest
 * @version 1.0
 * @apiNote Not specified
 * @since 1.0.6
 */
public interface IRouter {

    /**
     * @return Not specified
     * @throws RouteException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.6
     */
    IRouter move() throws RouteException;

    /**
     * @return Not specified
     * @throws RouteException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @see Direction#flip()
     * @since 1.0.6
     */
    default IRouter flip() throws RouteException {
        return direct(direction().flip());
    }

    /**
     * @param direction Not specified
     * @return Not specified
     * @throws RouteException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @see Direction
     * @since 1.0.6
     */
    IRouter direct(final Direction direction) throws RouteException;

    /**
     * @return Not specified
     * @throws RouteException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @see Direction
     * @since 1.0.6
     */
    default boolean available() throws RouteException {
        return available(direction());
    }

    /**
     * @param direction Not specified
     * @return Not specified
     * @throws RouteException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @see Direction
     * @since 1.0.6
     */
    boolean available(final Direction direction) throws RouteException;

    /**
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @see Direction
     * @since 1.0.6
     */
    Direction direction();

}
