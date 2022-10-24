package dev.common.general;

import dev.common.security.SecurityException;

/**
 * @author Bloogefest
 * @version 1.0
 * @apiNote Not specified
 * @since 1.1.3
 */
public final class Objects {

    /**
     * @throws SecurityException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.3
     */
    private Objects() throws SecurityException {
        throw new SecurityException();
    }

    /**
     * @param object Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.3
     */
    public static boolean notNull(final Object object) {
        return object != null;
    }

    /**
     * @param object Not specified
     * @param object_ Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.3
     */
    public static boolean equals(final Object object, final Object object_) {
        return object == object_ || notNull(object) && object.equals(object_);
    }

    /**
     * @param object Not specified
     * @param object_ Not specified
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.3
     */
    public static boolean notEquals(final Object object, final Object object_) {
        return object != object_ && !(notNull(object) && object.equals(object_));
    }

}
