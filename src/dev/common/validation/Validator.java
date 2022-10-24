package dev.common.validation;

import dev.common.throwable.SoftException;
import dev.common.function.ISupplier;
import dev.common.general.Objects;
import dev.common.security.SecurityException;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * @author Bloogefest
 * @version 1.0
 * @apiNote The convenient validator that simplifies writing code
 * @since 1.1.3
 */
public final class Validator {

    /**
     * @throws SecurityException The exception
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
     * @throws NullException The exception
     * @author Bloogefest
     * @apiNote Confirms that the object is not null
     * @since 1.1.3
     */
    @Contract("!null -> param1; null -> fail")
    public static <OBJECT> @NotNull OBJECT notNull(final OBJECT object) throws NullException {
        if (object != null) return object;
        throw new NullException();
    }

    /**
     * @param <OBJECT> Not specified
     * @param object The source object
     * @param name The name of the source object
     * @return The source object
     * @throws NullException The exception
     * @author Bloogefest
     * @apiNote Confirms that the object is not null
     * @since 1.1.3
     */
    @Contract("!null, _ -> param1; null, _ -> fail")
    public static <OBJECT> @NotNull OBJECT notNull(final OBJECT object, final String name) throws NullException {
        if (object != null) return object;
        throw new NullException(NullException.LAYOUT_MESSAGE.formatted(notNull(name, "name of the source object")));
    }

    /**
     * @param <OBJECT> Not specified
     * @param object The source object
     * @param supplier The custom exception provider
     * @return The source object
     * @throws THROWABLE The custom exception
     * @author Bloogefest
     * @apiNote Confirms that the object is not null
     * @since 1.1.3
     */
    @Contract("!null, _ -> param1; null, _ -> fail")
    public static <OBJECT, THROWABLE extends SoftException> @NotNull OBJECT notNull(final OBJECT object, final ISupplier<THROWABLE> supplier) throws THROWABLE {
        if (object != null) return object;
        throw notNull(notNull(supplier, "supplier").supply(), "throwable");
    }

    /**
     * @param <OBJECT> Not specified
     * @param object The source object
     * @param object_ The subsequent object
     * @return The source object
     * @throws NotEqualsException The exception
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.3
     */
    @Contract("_, _ -> param1")
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
     * @throws NotEqualsException The exception
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.3
     */
    @Contract("_, _, _, _ -> param1")
    public static <OBJECT> OBJECT equals(final OBJECT object, final OBJECT object_, final String name, final String name_) throws NotEqualsException {
        if (Objects.equals(object, object_)) return object;
        throw new NotEqualsException(NotEqualsException.LAYOUT_MESSAGE.formatted(notNull(name, "name of the source object"), notNull(name_, "name of the subsequent object")));
    }

    /**
     * @param <OBJECT> Not specified
     * @param object The source object
     * @param object_ The subsequent object
     * @param supplier The custom exception provider
     * @return The source object
     * @throws THROWABLE The custom exception
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.3
     */
    @Contract("_, _, _ -> param1")
    public static <OBJECT, THROWABLE extends SoftException> OBJECT equals(final OBJECT object, final OBJECT object_, final ISupplier<THROWABLE> supplier) throws THROWABLE {
        if (Objects.equals(object, object_)) return object;
        throw notNull(notNull(supplier, "supplier").supply(), "throwable");
    }

    /**
     * @param <OBJECT> Not specified
     * @param object The source object
     * @param object_ The subsequent object
     * @throws EqualsException The exception
     * @return The source object
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.3
     */
    @Contract("_, _ -> param1")
    public static <OBJECT> OBJECT notEquals(final OBJECT object, final OBJECT object_) throws EqualsException {
        if (Objects.notEquals(object, object_)) return object;
        throw new EqualsException();
    }

    /**
     * @param <OBJECT> Not specified
     * @param object The source object
     * @param object_ The subsequent object
     * @param name The name of the source object
     * @param name_ The name of the subsequent object
     * @throws EqualsException The exception
     * @return The source object
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.3
     */
    @Contract("_, _, _, _ -> param1")
    public static <OBJECT> OBJECT notEquals(final OBJECT object, final OBJECT object_, final String name, final String name_) throws EqualsException {
        if (Objects.notEquals(object, object_)) return object;
        throw new EqualsException(EqualsException.LAYOUT_MESSAGE.formatted(notNull(name, "name of the source object"), notNull(name_, "name of the subsequent object")));
    }

    /**
     * @param <OBJECT> Not specified
     * @param object The source object
     * @param object_ The subsequent object
     * @param supplier The custom exception provider
     * @return The source object
     * @throws THROWABLE The custom exception
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.3
     */
    @Contract("_, _, _ -> param1")
    public static <OBJECT, THROWABLE extends SoftException> OBJECT notEquals(final OBJECT object, final OBJECT object_, final ISupplier<THROWABLE> supplier) throws THROWABLE {
        if (Objects.notEquals(object, object_)) return object;
        throw notNull(notNull(supplier, "supplier").supply(), "throwable");
    }

    /**
     * @param <OBJECT> Not specified
     * @param object The source object
     * @param type The type
     * @throws NullException Not specified
     * @throws NotInstanceException The exception
     * @return The source object
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.3
     */
    @Contract("_, !null -> param1; _, null -> fail")
    public static <OBJECT> OBJECT instance(final OBJECT object, final Class<?> type) throws NullException, NotInstanceException {
        if (Objects.instance(object, type)) return object;
        throw new NotInstanceException();
    }

    /**
     * @param <OBJECT> Not specified
     * @param object The source object
     * @param type The type
     * @param name The name of the source object
     * @param name_ The name of the type
     * @throws NullException Not specified
     * @throws NotInstanceException The exception
     * @return The source object
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.3
     */
    @Contract("_, !null, !null, !null -> param1; _, null, null, null -> fail")
    public static <OBJECT> OBJECT instance(final OBJECT object, final Class<?> type, final String name, final String name_) throws NullException, NotInstanceException {
        if (Objects.instance(object, type)) return object;
        throw new NotInstanceException(NotInstanceException.LAYOUT_MESSAGE.formatted(notNull(name, "name of the source object"), notNull(name_, "name of the type")));
    }

    /**
     * @param <OBJECT> Not specified
     * @param object The source object
     * @param type The type
     * @param supplier The custom exception provider
     * @return The source object
     * @throws NullException Not specified
     * @throws THROWABLE The custom exception
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.3
     */
    @Contract("_, !null, !null -> param1; _, null, null -> fail")
    public static <OBJECT, THROWABLE extends SoftException> OBJECT instance(final OBJECT object, final Class<?> type, final ISupplier<THROWABLE> supplier) throws NullException, THROWABLE {
        if (Objects.instance(object, type)) return object;
        throw notNull(notNull(supplier, "supplier").supply(), "throwable");
    }

    /**
     * @param <OBJECT> Not specified
     * @param object The source object
     * @param type The type
     * @throws NullException Not specified
     * @throws InstanceException The exception
     * @return The source object
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.3
     */
    @Contract("_, !null -> param1; _, null -> fail")
    public static <OBJECT> OBJECT notInstance(final OBJECT object, final Class<?> type) throws NullException, InstanceException {
        if (Objects.notInstance(object, type)) return object;
        throw new InstanceException();
    }

    /**
     * @param <OBJECT> Not specified
     * @param object The source object
     * @param type The type
     * @param name The name of the source object
     * @param name_ The name of the type
     * @throws NullException Not specified
     * @throws InstanceException The exception
     * @return The source object
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.3
     */
    @Contract("_, !null, !null, !null -> param1; _, null, null, null -> fail")
    public static <OBJECT> OBJECT notInstance(final OBJECT object, final Class<?> type, final String name, final String name_) throws NullException, InstanceException {
        if (Objects.notInstance(object, type)) return object;
        throw new InstanceException(InstanceException.LAYOUT_MESSAGE.formatted(notNull(name, "name of the source object"), notNull(name_, "name of the type")));
    }

    /**
     * @param <OBJECT> Not specified
     * @param object The source object
     * @param type The type
     * @param supplier The custom exception provider
     * @return The source object
     * @throws NullException Not specified
     * @throws THROWABLE The custom exception
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.3
     */
    @Contract("_, !null, !null -> param1; _, null, null -> fail")
    public static <OBJECT, THROWABLE extends SoftException> OBJECT notInstance(final OBJECT object, final Class<?> type, final ISupplier<THROWABLE> supplier) throws NullException, THROWABLE {
        if (Objects.notInstance(object, type)) return object;
        throw notNull(notNull(supplier, "supplier").supply(), "throwable");
    }

    /**
     * @param <TYPE> Not specified
     * @param type The source type
     * @param type_ The subsequent type
     * @throws NullException Not specified
     * @throws NotAssignableException The exception
     * @return The source type
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.3
     */
    @Contract("_, !null -> param1; _, null -> fail")
    public static <TYPE> Class<TYPE> assignable(final Class<TYPE> type, final Class<?> type_) throws NullException, NotAssignableException {
        if (Objects.assignable(type, type_)) return type;
        throw new NotAssignableException();
    }

    /**
     * @param <TYPE> Not specified
     * @param type The source type
     * @param type_ The subsequent type
     * @param name The name of the source type
     * @param name_ The name of the subsequent type
     * @throws NullException Not specified
     * @throws NotAssignableException The exception
     * @return The source type
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.3
     */
    @Contract("_, !null, !null, !null -> param1; _, null, null, null -> fail")
    public static <TYPE> Class<TYPE> assignable(final Class<TYPE> type, final Class<?> type_, final String name, final String name_) throws NullException, NotAssignableException {
        if (Objects.assignable(type, type_)) return type;
        throw new NotAssignableException(NotAssignableException.LAYOUT_MESSAGE.formatted(notNull(name, "name of the source type"), notNull(name_, "name of the subsequent type")));
    }

    /**
     * @param <TYPE> Not specified
     * @param type The source type
     * @param type_ The subsequent type
     * @param supplier The custom exception provider
     * @return The source type
     * @throws NullException Not specified
     * @throws THROWABLE The custom exception
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.3
     */
    @Contract("_, !null, !null -> param1; _, null, null -> fail")
    public static <TYPE, THROWABLE extends SoftException> Class<TYPE> assignable(final Class<TYPE> type, final Class<?> type_, final ISupplier<THROWABLE> supplier) throws NullException, THROWABLE {
        if (Objects.assignable(type, type_)) return type;
        throw notNull(notNull(supplier, "supplier").supply(), "throwable");
    }

    /**
     * @param <TYPE> Not specified
     * @param type The source type
     * @param type_ The subsequent type
     * @throws NullException Not specified
     * @throws AssignableException The exception
     * @return The source type
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.3
     */
    @Contract("_, !null -> param1; _, null -> fail")
    public static <TYPE> Class<TYPE> notAssignable(final Class<TYPE> type, final Class<?> type_) throws NullException, AssignableException {
        if (Objects.notAssignable(type, type_)) return type;
        throw new AssignableException();
    }

    /**
     * @param <TYPE> Not specified
     * @param type The source type
     * @param type_ The subsequent type
     * @param name The name of the source type
     * @param name_ The name of the subsequent type
     * @throws NullException Not specified
     * @throws AssignableException The exception
     * @return The source type
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.3
     */
    @Contract("_, !null, !null, !null -> param1; _, null, null, null -> fail")
    public static <TYPE> Class<TYPE> notAssignable(final Class<TYPE> type, final Class<?> type_, final String name, final String name_) throws NullException, AssignableException {
        if (Objects.notAssignable(type, type_)) return type;
        throw new AssignableException(AssignableException.LAYOUT_MESSAGE.formatted(notNull(name, "name of the source type"), notNull(name_, "name of the subsequent type")));
    }

    /**
     * @param <TYPE> Not specified
     * @param type The source type
     * @param type_ The subsequent type
     * @param supplier The custom exception provider
     * @return The source type
     * @throws NullException Not specified
     * @throws THROWABLE The custom exception
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.3
     */
    @Contract("_, !null, !null -> param1; _, null, null -> fail")
    public static <TYPE, THROWABLE extends SoftException> Class<TYPE> notAssignable(final Class<TYPE> type, final Class<?> type_, final ISupplier<THROWABLE> supplier) throws NullException, THROWABLE {
        if (Objects.notAssignable(type, type_)) return type;
        throw notNull(notNull(supplier, "supplier").supply(), "throwable");
    }

}
