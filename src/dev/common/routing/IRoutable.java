package dev.common.routing;

/**
 * @author Bloogefest
 * @version 1.0
 * @apiNote Not specified
 * @since 1.0.6
 */
public interface IRoutable {

    /**
     * @return Not specified
     * @throws RouteException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @see IRouter
     * @since 1.0.6
     */
    default IRouter route() throws RouteException {
        return route(Direction.FORWARD);
    }

    /**
     * @param direction Not specified
     * @return Not specified
     * @throws RouteException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @see IRouter
     * @since 1.0.6
     */
    IRouter route(final Direction direction) throws RouteException;

}
