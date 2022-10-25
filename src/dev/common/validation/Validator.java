package dev.common.validation;

import dev.common.base.*;
import dev.common.function.IGetter;
import dev.common.throwable.SoftException;
import dev.common.security.SecurityException;

/**
 * @author Bloogefest
 * @version 1.1
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
     * @param <T> Not specified
     * @param object The source object
     * @return The source object
     * @throws NullException Not specified
     * @author Bloogefest
     * @apiNote Confirms that the object is not null
     * @since 1.1.3
     */
    public static <T> T isNull(final T object) throws NullException {
        if (Objects.isNull(object)) return object;
        throw new NullException();
    }

    /**
     * @param <T> Not specified
     * @param object The source object
     * @param name The name of the source object
     * @return The source object
     * @throws NullException Not specified
     * @author Bloogefest
     * @apiNote Confirms that the object is not null
     * @since 1.1.3
     */
    public static <T> T isNull(final T object, final String name) throws NullException {
        if (Objects.isNull(object)) return object;
        throw new NullException(NullException.LAYOUT_MESSAGE.formatted(notNull(name, "name of the source object")));
    }

    /**
     * @param <T> Not specified
     * @param object The source object
     * @param supplier Not specified
     * @return The source object
     * @throws E Not specified
     * @author Bloogefest
     * @apiNote Confirms that the object is not null
     * @since 1.1.3
     */
    public static <T, E extends SoftException> T isNull(final T object, final IGetter<E> supplier) throws E {
        if (Objects.isNull(object)) return object;
        throw notNull(notNull(supplier, "supplier").get(), "throwable");
    }

    /**
     * @param <T> Not specified
     * @param object The source object
     * @return The source object
     * @throws NullException Not specified
     * @author Bloogefest
     * @apiNote Confirms that the object is not null
     * @since 1.1.3
     */
    public static <T> T notNull(final T object) throws NullException {
        if (Objects.notNull(object)) return object;
        throw new NullException();
    }

    /**
     * @param <T> Not specified
     * @param object The source object
     * @param name The name of the source object
     * @return The source object
     * @throws NullException Not specified
     * @author Bloogefest
     * @apiNote Confirms that the object is not null
     * @since 1.1.3
     */
    public static <T> T notNull(final T object, final String name) throws NullException {
        if (Objects.notNull(object)) return object;
        throw new NullException(NullException.LAYOUT_MESSAGE.formatted(notNull(name, "name of the source object")));
    }

    /**
     * @param <T> Not specified
     * @param object The source object
     * @param supplier Not specified
     * @return The source object
     * @throws E Not specified
     * @author Bloogefest
     * @apiNote Confirms that the object is not null
     * @since 1.1.3
     */
    public static <T, E extends SoftException> T notNull(final T object, final IGetter<E> supplier) throws E {
        if (Objects.notNull(object)) return object;
        throw notNull(notNull(supplier, "supplier").get(), "throwable");
    }

    /**
     * @param value The source value
     * @param value_ The subsequent value
     * @return The source value
     * @throws NotEqualsException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.3
     */
    public static boolean equals(final boolean value, final boolean value_) throws NotEqualsException {
        if (Objects.equals(value, value_)) return value;
        throw new NotEqualsException();
    }

    /**
     * @param value The source value
     * @param value_ The subsequent value
     * @return The source value
     * @throws NotEqualsException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.3
     */
    public static byte equals(final byte value, final byte value_) throws NotEqualsException {
        if (Bytes.equals(value, value_)) return value;
        throw new NotEqualsException();
    }

    /**
     * @param value The source value
     * @param value_ The subsequent value
     * @return The source value
     * @throws NotEqualsException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.3
     */
    public static short equals(final short value, final short value_) throws NotEqualsException {
        if (Shorts.equals(value, value_)) return value;
        throw new NotEqualsException();
    }

    /**
     * @param value The source value
     * @param value_ The subsequent value
     * @return The source value
     * @throws NotEqualsException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.3
     */
    public static int equals(final int value, final int value_) throws NotEqualsException {
        if (Integers.equals(value, value_)) return value;
        throw new NotEqualsException();
    }

    /**
     * @param value The source value
     * @param value_ The subsequent value
     * @return The source value
     * @throws NotEqualsException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.3
     */
    public static long equals(final long value, final long value_) throws NotEqualsException {
        if (Longs.equals(value, value_)) return value;
        throw new NotEqualsException();
    }

    /**
     * @param value The source value
     * @param value_ The subsequent value
     * @return The source value
     * @throws NotEqualsException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.3
     */
    public static float equals(final float value, final float value_) throws NotEqualsException {
        if (Floats.equals(value, value_)) return value;
        throw new NotEqualsException();
    }

    /**
     * @param value The source value
     * @param value_ The subsequent value
     * @return The source value
     * @throws NotEqualsException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.3
     */
    public static double equals(final double value, final double value_) throws NotEqualsException {
        if (Doubles.equals(value, value_)) return value;
        throw new NotEqualsException();
    }

    /**
     * @param <T> Not specified
     * @param object The source object
     * @param object_ The subsequent object
     * @return The source object
     * @throws NullException Not specified
     * @throws NotEqualsException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.3
     */
    public static <T> T equals(final T object, final T object_) throws NullException, NotEqualsException {
        if (Objects.equals(object, object_)) return object;
        throw new NotEqualsException();
    }

    /**
     * @param <T> Not specified
     * @param object The source object
     * @param object_ The subsequent object
     * @param name The name of the source object
     * @param name_ The name of the subsequent object
     * @return The source object
     * @throws NullException Not specified
     * @throws NotEqualsException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.3
     */
    public static <T> T equals(final T object, final T object_, final String name, final String name_) throws NullException, NotEqualsException {
        if (Objects.equals(object, object_)) return object;
        throw new NotEqualsException(NotEqualsException.LAYOUT_MESSAGE.formatted(notNull(name, "name of the source object"), notNull(name_, "name of the subsequent object")));
    }

    /**
     * @param <T> Not specified
     * @param object The source object
     * @param object_ The subsequent object
     * @param supplier Not specified
     * @return The source object
     * @throws NullException Not specified
     * @throws E Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.3
     */
    public static <T, E extends SoftException> T equals(final T object, final T object_, final IGetter<E> supplier) throws NullException, E {
        if (Objects.equals(object, object_)) return object;
        throw notNull(notNull(supplier, "supplier").get(), "throwable");
    }

    /**
     * @param value The source value
     * @param value_ The subsequent value
     * @return The source value
     * @throws EqualsException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.3
     */
    public static boolean notEquals(final boolean value, final boolean value_) throws EqualsException {
        if (Objects.notEquals(value, value_)) return value;
        throw new EqualsException();
    }

    /**
     * @param value The source value
     * @param value_ The subsequent value
     * @return The source value
     * @throws EqualsException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.3
     */
    public static byte notEquals(final byte value, final byte value_) throws EqualsException {
        if (Bytes.notEquals(value, value_)) return value;
        throw new EqualsException();
    }

    /**
     * @param value The source value
     * @param value_ The subsequent value
     * @return The source value
     * @throws EqualsException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.3
     */
    public static short notEquals(final short value, final short value_) throws EqualsException {
        if (Shorts.notEquals(value, value_)) return value;
        throw new EqualsException();
    }

    /**
     * @param value The source value
     * @param value_ The subsequent value
     * @return The source value
     * @throws EqualsException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.3
     */
    public static int notEquals(final int value, final int value_) throws EqualsException {
        if (Integers.notEquals(value, value_)) return value;
        throw new EqualsException();
    }

    /**
     * @param value The source value
     * @param value_ The subsequent value
     * @return The source value
     * @throws EqualsException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.3
     */
    public static long notEquals(final long value, final long value_) throws EqualsException {
        if (Longs.notEquals(value, value_)) return value;
        throw new EqualsException();
    }

    /**
     * @param value The source value
     * @param value_ The subsequent value
     * @return The source value
     * @throws EqualsException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.3
     */
    public static float notEquals(final float value, final float value_) throws EqualsException {
        if (Floats.notEquals(value, value_)) return value;
        throw new EqualsException();
    }

    /**
     * @param value The source value
     * @param value_ The subsequent value
     * @return The source value
     * @throws EqualsException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.3
     */
    public static double notEquals(final double value, final double value_) throws EqualsException {
        if (Doubles.notEquals(value, value_)) return value;
        throw new EqualsException();
    }

    /**
     * @param <T> Not specified
     * @param object The source object
     * @param object_ The subsequent object
     * @throws NullException Not specified
     * @throws EqualsException Not specified
     * @return The source object
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.3
     */
    public static <T> T notEquals(final T object, final T object_) throws NullException, EqualsException {
        if (Objects.notEquals(object, object_)) return object;
        throw new EqualsException();
    }

    /**
     * @param <T> Not specified
     * @param object The source object
     * @param object_ The subsequent object
     * @param name The name of the source object
     * @param name_ The name of the subsequent object
     * @throws NullException Not specified
     * @throws EqualsException Not specified
     * @return The source object
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.3
     */
    public static <T> T notEquals(final T object, final T object_, final String name, final String name_) throws NullException, EqualsException {
        if (Objects.notEquals(object, object_)) return object;
        throw new EqualsException(EqualsException.LAYOUT_MESSAGE.formatted(notNull(name, "name of the source object"), notNull(name_, "name of the subsequent object")));
    }

    /**
     * @param <T> Not specified
     * @param object The source object
     * @param object_ The subsequent object
     * @param supplier Not specified
     * @return The source object
     * @throws NullException Not specified
     * @throws E Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.3
     */
    public static <T, E extends SoftException> T notEquals(final T object, final T object_, final IGetter<E> supplier) throws NullException, E {
        if (Objects.notEquals(object, object_)) return object;
        throw notNull(notNull(supplier, "supplier").get(), "throwable");
    }

//    /**
//     * @param <T> Not specified
//     * @param object The source object
//     * @param type The type
//     * @throws NullException Not specified
//     * @throws NotInstanceException Not specified
//     * @return The source object
//     * @author Bloogefest
//     * @apiNote Not specified
//     * @since 1.1.3
//     */
//    public static <T> T instance(final T object, final Class<?> type) throws NullException, NotInstanceException {
//        if (Objects.instance(object, type)) return object;
//        throw new NotInstanceException();
//    }
//
//    /**
//     * @param <T> Not specified
//     * @param object The source object
//     * @param type The type
//     * @param name The name of the source object
//     * @param name_ The name of the type
//     * @throws NullException Not specified
//     * @throws NotInstanceException Not specified
//     * @return The source object
//     * @author Bloogefest
//     * @apiNote Not specified
//     * @since 1.1.3
//     */
//    public static <T> T instance(final T object, final Class<?> type, final String name, final String name_) throws NullException, NotInstanceException {
//        if (Objects.instance(object, type)) return object;
//        throw new NotInstanceException(NotInstanceException.LAYOUT_MESSAGE.formatted(notNull(name, "name of the source object"), notNull(name_, "name of the type")));
//    }
//
//    /**
//     * @param <T> Not specified
//     * @param object The source object
//     * @param type The type
//     * @param supplier Not specified
//     * @return The source object
//     * @throws NullException Not specified
//     * @throws E Not specified
//     * @author Bloogefest
//     * @apiNote Not specified
//     * @since 1.1.3
//     */
//    public static <T, E extends SoftException> T instance(final T object, final Class<?> type, final IGetter<E> supplier) throws NullException, E {
//        if (Objects.instance(object, type)) return object;
//        throw notNull(notNull(supplier, "supplier").get(), "throwable");
//    }
//
//    /**
//     * @param <T> Not specified
//     * @param object The source object
//     * @param type The type
//     * @throws NullException Not specified
//     * @throws InstanceException Not specified
//     * @return The source object
//     * @author Bloogefest
//     * @apiNote Not specified
//     * @since 1.1.3
//     */
//    public static <T> T notInstance(final T object, final Class<?> type) throws NullException, InstanceException {
//        if (Objects.notInstance(object, type)) return object;
//        throw new InstanceException();
//    }
//
//    /**
//     * @param <T> Not specified
//     * @param object The source object
//     * @param type The type
//     * @param name The name of the source object
//     * @param name_ The name of the type
//     * @throws NullException Not specified
//     * @throws InstanceException Not specified
//     * @return The source object
//     * @author Bloogefest
//     * @apiNote Not specified
//     * @since 1.1.3
//     */
//    public static <T> T notInstance(final T object, final Class<?> type, final String name, final String name_) throws NullException, InstanceException {
//        if (Objects.notInstance(object, type)) return object;
//        throw new InstanceException(InstanceException.LAYOUT_MESSAGE.formatted(notNull(name, "name of the source object"), notNull(name_, "name of the type")));
//    }
//
//    /**
//     * @param <T> Not specified
//     * @param object The source object
//     * @param type The type
//     * @param supplier Not specified
//     * @return The source object
//     * @throws NullException Not specified
//     * @throws E Not specified
//     * @author Bloogefest
//     * @apiNote Not specified
//     * @since 1.1.3
//     */
//    public static <T, E extends SoftException> T notInstance(final T object, final Class<?> type, final IGetter<E> supplier) throws NullException, E {
//        if (Objects.notInstance(object, type)) return object;
//        throw notNull(notNull(supplier, "supplier").get(), "throwable");
//    }
//
//    /**
//     * @param <T> Not specified
//     * @param type The source type
//     * @param type_ The subsequent type
//     * @throws NullException Not specified
//     * @throws NotAssignableException Not specified
//     * @return The source type
//     * @author Bloogefest
//     * @apiNote Not specified
//     * @since 1.1.3
//     */
//    public static <T> Class<T> assignable(final Class<T> type, final Class<?> type_) throws NullException, NotAssignableException {
//        if (Objects.assignable(type, type_)) return type;
//        throw new NotAssignableException();
//    }
//
//    /**
//     * @param <T> Not specified
//     * @param type The source type
//     * @param type_ The subsequent type
//     * @param name The name of the source type
//     * @param name_ The name of the subsequent type
//     * @throws NullException Not specified
//     * @throws NotAssignableException Not specified
//     * @return The source type
//     * @author Bloogefest
//     * @apiNote Not specified
//     * @since 1.1.3
//     */
//    public static <T> Class<T> assignable(final Class<T> type, final Class<?> type_, final String name, final String name_) throws NullException, NotAssignableException {
//        if (Objects.assignable(type, type_)) return type;
//        throw new NotAssignableException(NotAssignableException.LAYOUT_MESSAGE.formatted(notNull(name, "name of the source type"), notNull(name_, "name of the subsequent type")));
//    }
//
//    /**
//     * @param <T> Not specified
//     * @param type The source type
//     * @param type_ The subsequent type
//     * @param supplier Not specified
//     * @return The source type
//     * @throws NullException Not specified
//     * @throws E Not specified
//     * @author Bloogefest
//     * @apiNote Not specified
//     * @since 1.1.3
//     */
//    public static <T, E extends SoftException> Class<T> assignable(final Class<T> type, final Class<?> type_, final IGetter<E> supplier) throws NullException, E {
//        if (Objects.assignable(type, type_)) return type;
//        throw notNull(notNull(supplier, "supplier").get(), "throwable");
//    }
//
//    /**
//     * @param <T> Not specified
//     * @param type The source type
//     * @param type_ The subsequent type
//     * @throws NullException Not specified
//     * @throws AssignableException Not specified
//     * @return The source type
//     * @author Bloogefest
//     * @apiNote Not specified
//     * @since 1.1.3
//     */
//    public static <T> Class<T> notAssignable(final Class<T> type, final Class<?> type_) throws NullException, AssignableException {
//        if (Objects.notAssignable(type, type_)) return type;
//        throw new AssignableException();
//    }
//
//    /**
//     * @param <T> Not specified
//     * @param type The source type
//     * @param type_ The subsequent type
//     * @param name The name of the source type
//     * @param name_ The name of the subsequent type
//     * @throws NullException Not specified
//     * @throws AssignableException Not specified
//     * @return The source type
//     * @author Bloogefest
//     * @apiNote Not specified
//     * @since 1.1.3
//     */
//    public static <T> Class<T> notAssignable(final Class<T> type, final Class<?> type_, final String name, final String name_) throws NullException, AssignableException {
//        if (Objects.notAssignable(type, type_)) return type;
//        throw new AssignableException(AssignableException.LAYOUT_MESSAGE.formatted(notNull(name, "name of the source type"), notNull(name_, "name of the subsequent type")));
//    }
//
//    /**
//     * @param <T> Not specified
//     * @param type The source type
//     * @param type_ The subsequent type
//     * @param supplier Not specified
//     * @return The source type
//     * @throws NullException Not specified
//     * @throws E Not specified
//     * @author Bloogefest
//     * @apiNote Not specified
//     * @since 1.1.3
//     */
//    public static <T, E extends SoftException> Class<T> notAssignable(final Class<T> type, final Class<?> type_, final IGetter<E> supplier) throws NullException, E {
//        if (Objects.notAssignable(type, type_)) return type;
//        throw notNull(notNull(supplier, "supplier").get(), "throwable");
//    }

}
