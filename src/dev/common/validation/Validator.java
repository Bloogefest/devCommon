package dev.common.validation;

import dev.common.throwable.SoftException;
import dev.common.function.ISupplier;
import dev.common.general.Objects;
import dev.common.security.SecurityException;

/**
 * @author Bloogefest
 * @version 1.0
 * @apiNote The convenient validator that simplifies writing code
 * @since 1.1.3
 */
public final class Validator {

    /**
     * @throws SecurityException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.3
     */
    private Validator() throws SecurityException {
        throw new SecurityException();
    }

    /**
     * @param <OBJECT> Not specified
     * @param object The source object
     * @return The source object
     * @author Bloogefest
     * @apiNote Confirms that the object is not null
     * @since 1.1.3
     */
    public static <OBJECT> OBJECT notNull(final OBJECT object) throws NullException {
        if (Objects.notNull(object)) return object;
        throw new NullException();
    }

    /**
     * @param <OBJECT> Not specified
     * @param object The source object
     * @param name The name of the source object
     * @return The source object
     * @author Bloogefest
     * @apiNote Confirms that the object is not null
     * @since 1.1.3
     */
    public static <OBJECT> OBJECT notNull(final OBJECT object, final String name) throws NullException {
        if (Objects.notNull(object)) return object;
        throw new NullException(NullException.LAYOUT_MESSAGE.formatted(notNull(name, "name of the source")));
    }

    /**
     * @param <OBJECT> Not specified
     * @param object The source object
     * @param supplier The custom exception provider
     * @return The source object
     * @throws NullException Not specified
     * @author Bloogefest
     * @apiNote Confirms that the object is not null
     * @since 1.1.3
     */
    public static <OBJECT, THROWABLE extends SoftException> OBJECT notNull(final OBJECT object, final ISupplier<THROWABLE> supplier) throws THROWABLE {
        if (Objects.notNull(object)) return object;
        throw notNull(notNull(supplier, "supplier").supply(), "throwable");
    }

    /**
     * @param <OBJECT> Not specified
     * @param object The source object
     * @param object_ The subsequent object
     * @return The source object
     * @throws NotEqualsException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.3
     */
    public static <OBJECT> OBJECT equals(final OBJECT object, final OBJECT object_) throws NotEqualsException {
        if (Objects.equals(object, object_)) return object;
        throw new NotEqualsException();
    }

    /**
     * @param <OBJECT> Not specified
     * @param object The source object
     * @param object_ The subsequent object
     * @param name The name of the source object
     * @param name_ The name of the subsequent object
     * @return The source object
     * @throws NotEqualsException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.3
     */
    public static <OBJECT> OBJECT equals(final OBJECT object, final OBJECT object_, final String name, final String name_) throws NotEqualsException {
        if (Objects.equals(object, object_)) return object;
        throw new NotEqualsException(NotEqualsException.LAYOUT_MESSAGE.formatted(notNull(name, "name of the source"), notNull(name_, "name of the subsequent")));
    }

    /**
     * @param <OBJECT> Not specified
     * @param object The source object
     * @param object_ The subsequent object
     * @param supplier The custom exception provider
     * @return The source object
     * @throws THROWABLE Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.3
     */
    public static <OBJECT, THROWABLE extends SoftException> OBJECT equals(final OBJECT object, final OBJECT object_, final ISupplier<THROWABLE> supplier) throws THROWABLE {
        if (Objects.equals(object, object_)) return object;
        throw notNull(notNull(supplier, "supplier").supply(), "throwable");
    }

    /**
     * @param <OBJECT> Not specified
     * @param object The source object
     * @param object_ The subsequent object
     * @return The source object
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.3
     */
    public static <OBJECT> OBJECT notEquals(final OBJECT object, final OBJECT object_) throws EqualsException {
        if (Objects.equals(object, object_)) return object;
        throw new EqualsException();
    }

    /**
     * @param <OBJECT> Not specified
     * @param object The source object
     * @param object_ The subsequent object
     * @param name The name of the source object
     * @param name_ The name of the subsequent object
     * @return The source object
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.3
     */
    public static <OBJECT> OBJECT notEquals(final OBJECT object, final OBJECT object_, final String name, final String name_) throws EqualsException {
        if (Objects.equals(object, object_)) return object;
        throw new EqualsException(EqualsException.LAYOUT_MESSAGE.formatted(notNull(name, "name of the source"), notNull(name_, "name of the subsequent")));
    }

    /**
     * @param <OBJECT> Not specified
     * @param object The source object
     * @param object_ The subsequent object
     * @param supplier The custom exception provider
     * @return The source object
     * @throws THROWABLE Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.3
     */
    public static <OBJECT, THROWABLE extends SoftException> OBJECT notEquals(final OBJECT object, final OBJECT object_, final ISupplier<THROWABLE> supplier) throws THROWABLE {
        if (Objects.equals(object, object_)) return object;
        throw notNull(notNull(supplier, "supplier").supply(), "throwable");
    }

}
