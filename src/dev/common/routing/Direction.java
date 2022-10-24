package dev.common.routing;

/**
 * @author Bloogefest
 * @version 1.0
 * @apiNote Not specified
 * @since 1.0.6
 */
@Deprecated
public enum Direction {

    /**
     * @apiNote Not specified
     * @since 1.0.6
     */
    FORWARD {
        @Override
        public Direction flip() {
            return Direction.BACKWARD;
        }

    },

    /**
     * @apiNote Not specified
     * @since 1.0.6
     */
    BACKWARD {
        @Override
        public Direction flip() {
            return Direction.FORWARD;
        }

    };

    /**
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.6
     */
    public abstract Direction flip();

}
