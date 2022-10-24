package dev.common.general;

import dev.common.security.SecurityException;
import dev.common.valid.NullException;
import dev.common.validation.Validator;
import org.jetbrains.annotations.Contract;

/**
 * @author Bloogefest
 * @version 1.0
 * @apiNote Not specified
 * @since 1.1.3
 */
public final class Objects {

    /**
     * @throws SecurityException The exception
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.3
     */
    @Contract("-> fail")
    private Objects() throws SecurityException {
        throw new SecurityException();
    }

    /**
     * @param object The source object
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.3
     */
    @Contract("!null -> false; null -> true")
    public static boolean isNull(final Object object) {
        return object == null;
    }

    /**
     * @param object The source object
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.3
     */
    @Contract("!null -> true; null -> false")
    public static boolean notNull(final Object object) {
        return object != null;
    }

    /**
     * @param object The source object
     * @param object_ The subsequent object
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.3
     */
    @Contract("!null, !null -> true; null, null -> true; _, _ -> _")
    public static boolean equals(final Object object, final Object object_) {
        return object == object_ || notNull(object) && object.equals(object_);
    }

    /**
     * @param object The source object
     * @param object_ The subsequent object
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.3
     */
    @Contract("!null, null -> true; null, !null -> true; _, _ -> _")
    public static boolean notEquals(final Object object, final Object object_) {
        return object != object_ && !(notNull(object) && object.equals(object_));
    }

    /**
     * @param object The source object
     * @param type The type
     * @return Not specified
     * @throws NullException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.3
     */
    @Contract("_, !null -> _; _, null -> fail")
    public static boolean instance(final Object object, final Class<?> type) throws NullException {
        return Validator.notNull(type, "source type").isInstance(object);
    }

    /**
     * @param object The source object
     * @param type The type
     * @return Not specified
     * @throws NullException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.3
     */
    @Contract("_, !null -> _; _, null -> fail")
    public static boolean notInstance(final Object object, final Class<?> type) throws NullException {
        return !Validator.notNull(type, "source type").isInstance(object);
    }

    /**
     * @param type The source type
     * @param type_ The subsequent type
     * @return Not specified
     * @throws NullException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.3
     */
    @Contract("!null, !null -> _; null, null -> fail")
    public static boolean assignable(final Class<?> type, final Class<?> type_) throws NullException {
        return Validator.notNull(type, "source type").isAssignableFrom(Validator.notNull(type_, "subsequent type"));
    }

    /**
     * @param type The source type
     * @param type_ The subsequent type
     * @return Not specified
     * @throws NullException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.3
     */
    @Contract("!null, !null -> _; null, null -> fail")
    public static boolean notAssignable(final Class<?> type, final Class<?> type_) throws NullException {
        return !Validator.notNull(type, "source type").isAssignableFrom(Validator.notNull(type_, "subsequent type"));
    }

}
