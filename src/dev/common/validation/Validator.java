package dev.common.validation;

import dev.common.base.CreationError;
import dev.common.base.Objects;

/**
 * @author Bloogefest
 * @version 1.1
 * @apiNote NotCreationErrord
 * @since 1.0.0
 */
public final class Validator {

    private Validator() throws CreationError {
        throw new CreationError();
    }

    /**
     * @throws NotNullException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static <T> T isNull(final T object) throws NotNullException {
        if (Objects.notNull(object))
            throw new NotNullException("The object must be null");
        return null;
    }

    /**
     * @throws NotNullException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static <T> T isNull(final T object, final String name) throws NotNullException {
        if (Objects.notNull(object))
            throw new NotNullException("The " + name + " must be null");
        return null;
    }

    /**
     * @throws NotNullException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static <T> T isNullX(final T object, final String message) throws NotNullException {
        if (Objects.notNull(object))
            throw new NotNullException(message);
        return null;
    }

    /**
     * @throws NotNullException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static <T> T isNullX(final T object, final Throwable cause) throws NotNullException {
        if (Objects.notNull(object))
            throw new NotNullException(cause);
        return null;
    }

    /**
     * @throws NotNullException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static <T> T isNullX(final T object, final String message, final Throwable cause) throws NotNullException {
        if (Objects.notNull(object))
            throw new NotNullException(message, cause);
        return null;
    }

    /**
     * @throws NotNullException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static <T> T isNullX(final T object, final String message, final Throwable cause, final boolean suppressed, final boolean writable) throws NotNullException {
        if (Objects.notNull(object))
            throw new NotNullException(message, cause, suppressed, writable);
        return null;
    }

    /**
     * @throws NullException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static <T> T notNull(final T object) throws NullException {
        if (Objects.isNull(object))
            throw new NullException("The object must not be null");
        return object;
    }

    /**
     * @throws NullException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static <T> T notNull(final T object, final String name) throws NullException {
        if (Objects.isNull(object))
            throw new NullException("The " + name + " must not be null");
        return object;
    }

    /**
     * @throws NullException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static <T> T notNullX(final T object, final String message) throws NullException {
        if (Objects.isNull(object))
            throw new NullException(message);
        return object;
    }

    /**
     * @throws NullException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static <T> T notNullX(final T object, final Throwable cause) throws NullException {
        if (Objects.isNull(object))
            throw new NullException(cause);
        return object;
    }

    /**
     * @throws NullException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static <T> T notNullX(final T object, final String message, final Throwable cause) throws NullException {
        if (Objects.isNull(object))
            throw new NullException(message, cause);
        return object;
    }

    /**
     * @throws NullException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static <T> T notNullX(final T object, final String message, final Throwable cause, final boolean suppressed, final boolean writable) throws NullException {
        if (Objects.isNull(object))
            throw new NullException(message, cause, suppressed, writable);
        return object;
    }

    /**
     * @throws NotEqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static boolean equals(final boolean value, final boolean _value) throws NotEqualException {
        if (Objects.notEquals(value, _value))
            throw new NotEqualException("The value must be equal to the _value");
        return value;
    }

    /**
     * @throws NotEqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static byte equals(final byte value, final byte _value) throws NotEqualException {
        if (Objects.notEquals(value, _value))
            throw new NotEqualException("The value must be equal to the _value");
        return value;
    }

    /**
     * @throws NotEqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static short equals(final short value, final short _value) throws NotEqualException {
        if (Objects.notEquals(value, _value))
            throw new NotEqualException("The value must be equal to the _value");
        return value;
    }

    /**
     * @throws NotEqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static int equals(final int value, final int _value) throws NotEqualException {
        if (Objects.notEquals(value, _value))
            throw new NotEqualException("The value must be equal to the _value");
        return value;
    }

    /**
     * @throws NotEqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static long equals(final long value, final long _value, final float max) throws NotEqualException {
        if (Objects.notEquals(value, _value))
            throw new NotEqualException("The value must be equal to the _value");
        return value;
    }

    /**
     * @throws NotEqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static float equals(final float value, final float _value) throws NotEqualException {
        if (Objects.notEquals(value, _value))
            throw new NotEqualException("The value must be equal to the _value");
        return value;
    }

    /**
     * @throws NotEqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static double equals(final double value, final double _value) throws NotEqualException {
        if (Objects.notEquals(value, _value))
            throw new NotEqualException("The value must be equal to the _value");
        return value;
    }

    /**
     * @throws NotEqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static <T> T equals(final T object, final Object _object) throws NotEqualException {
        if (Objects.notEquals(object, _object))
            throw new NotEqualException("The object must be equal to the _object");
        return object;
    }

    /**
     * @throws NotEqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static boolean equals(final boolean value, final boolean _value, final String name, final String _name) throws NotEqualException {
        if (Objects.notEquals(value, _value))
            throw new NotEqualException("The " + name + " must be equal to the " + _name);
        return value;
    }

    /**
     * @throws NotEqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static byte equals(final byte value, final byte _value, final String name, final String _name) throws NotEqualException {
        if (Objects.notEquals(value, _value))
            throw new NotEqualException("The " + name + " must be equal to the " + _name);
        return value;
    }

    /**
     * @throws NotEqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static short equals(final short value, final short _value, final String name, final String _name) throws NotEqualException {
        if (Objects.notEquals(value, _value))
            throw new NotEqualException("The " + name + " must be equal to the " + _name);
        return value;
    }

    /**
     * @throws NotEqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static int equals(final int value, final int _value, final String name, final String _name) throws NotEqualException {
        if (Objects.notEquals(value, _value))
            throw new NotEqualException("The " + name + " must be equal to the " + _name);
        return value;
    }

    /**
     * @throws NotEqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static long equals(final long value, final long _value, final float max, final String name, final String _name, final String __name) throws NotEqualException {
        if (Objects.notEquals(value, _value))
            throw new NotEqualException("The " + name + " must be equal to the " + _name);
        return value;
    }

    /**
     * @throws NotEqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static float equals(final float value, final float _value, final String name, final String _name) throws NotEqualException {
        if (Objects.notEquals(value, _value))
            throw new NotEqualException("The " + name + " must be equal to the " + _name);
        return value;
    }

    /**
     * @throws NotEqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static double equals(final double value, final double _value, final String name, final String _name) throws NotEqualException {
        if (Objects.notEquals(value, _value))
            throw new NotEqualException("The " + name + " must be equal to the " + _name);
        return value;
    }

    /**
     * @throws NotEqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static <T> T equals(final T object, final Object _object, final String name, final String _name) throws NotEqualException {
        if (Objects.notEquals(object, _object))
            throw new NotEqualException("The " + name + " must be equal to the " + _name);
        return object;
    }

    /**
     * @throws NotEqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static boolean equalsX(final boolean value, final boolean _value, final String message) throws NotEqualException {
        if (Objects.notEquals(value, _value))
            throw new NotEqualException(message);
        return value;
    }

    /**
     * @throws NotEqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static byte equalsX(final byte value, final byte _value, final String message) throws NotEqualException {
        if (Objects.notEquals(value, _value))
            throw new NotEqualException(message);
        return value;
    }

    /**
     * @throws NotEqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static short equalsX(final short value, final short _value, final String message) throws NotEqualException {
        if (Objects.notEquals(value, _value))
            throw new NotEqualException(message);
        return value;
    }

    /**
     * @throws NotEqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static int equalsX(final int value, final int _value, final String message) throws NotEqualException {
        if (Objects.notEquals(value, _value))
            throw new NotEqualException(message);
        return value;
    }

    /**
     * @throws NotEqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static long equalsX(final long value, final long _value, final float max, final String message) throws NotEqualException {
        if (Objects.notEquals(value, _value))
            throw new NotEqualException(message);
        return value;
    }

    /**
     * @throws NotEqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static float equalsX(final float value, final float _value, final String message) throws NotEqualException {
        if (Objects.notEquals(value, _value))
            throw new NotEqualException(message);
        return value;
    }

    /**
     * @throws NotEqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static double equalsX(final double value, final double _value, final String message) throws NotEqualException {
        if (Objects.notEquals(value, _value))
            throw new NotEqualException(message);
        return value;
    }

    /**
     * @throws NotEqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static <T> T equalsX(final T object, final Object _object, final String message) throws NotEqualException {
        if (Objects.notEquals(object, _object))
            throw new NotEqualException(message);
        return object;
    }

    /**
     * @throws NotEqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static boolean equalsX(final boolean value, final boolean _value, Throwable cause) throws NotEqualException {
        if (Objects.notEquals(value, _value))
            throw new NotEqualException(cause);
        return value;
    }

    /**
     * @throws NotEqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static byte equalsX(final byte value, final byte _value, final Throwable cause) throws NotEqualException {
        if (Objects.notEquals(value, _value))
            throw new NotEqualException(cause);
        return value;
    }

    /**
     * @throws NotEqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static short equalsX(final short value, final short _value, Throwable cause) throws NotEqualException {
        if (Objects.notEquals(value, _value))
            throw new NotEqualException(cause);
        return value;
    }

    /**
     * @throws NotEqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static int equalsX(final int value, final int _value, final Throwable cause) throws NotEqualException {
        if (Objects.notEquals(value, _value))
            throw new NotEqualException(cause);
        return value;
    }

    /**
     * @throws NotEqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static long equalsX(final long value, final long _value, final float max, final Throwable cause) throws NotEqualException {
        if (Objects.notEquals(value, _value))
            throw new NotEqualException(cause);
        return value;
    }

    /**
     * @throws NotEqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static float equalsX(final float value, final float _value, final Throwable cause) throws NotEqualException {
        if (Objects.notEquals(value, _value))
            throw new NotEqualException(cause);
        return value;
    }

    /**
     * @throws NotEqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static double equalsX(final double value, final double _value, final Throwable cause) throws NotEqualException {
        if (Objects.notEquals(value, _value))
            throw new NotEqualException(cause);
        return value;
    }

    /**
     * @throws NotEqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static <T> T equalsX(final T object, final Object _object, final Throwable cause) throws NotEqualException {
        if (Objects.notEquals(object, _object))
            throw new NotEqualException(cause);
        return object;
    }

    /**
     * @throws NotEqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static boolean equalsX(final boolean value, final boolean _value, final String message, final Throwable cause) throws NotEqualException {
        if (Objects.notEquals(value, _value))
            throw new NotEqualException(message, cause);
        return value;
    }

    /**
     * @throws NotEqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static byte equalsX(final byte value, final byte _value, final String message, final Throwable cause) throws NotEqualException {
        if (Objects.notEquals(value, _value))
            throw new NotEqualException(message, cause);
        return value;
    }

    /**
     * @throws NotEqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static short equalsX(final short value, final short _value, final String message, final Throwable cause) throws NotEqualException {
        if (Objects.notEquals(value, _value))
            throw new NotEqualException(message, cause);
        return value;
    }

    /**
     * @throws NotEqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static int equalsX(final int value, final int _value, final String message, final Throwable cause) throws NotEqualException {
        if (Objects.notEquals(value, _value))
            throw new NotEqualException(message, cause);
        return value;
    }

    /**
     * @throws NotEqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static long equalsX(final long value, final long _value, final float max, final String message, final Throwable cause) throws NotEqualException {
        if (Objects.notEquals(value, _value))
            throw new NotEqualException(message, cause);
        return value;
    }

    /**
     * @throws NotEqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static float equalsX(final float value, final float _value, final String message, final Throwable cause) throws NotEqualException {
        if (Objects.notEquals(value, _value))
            throw new NotEqualException(message, cause);
        return value;
    }

    /**
     * @throws NotEqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static double equalsX(final double value, final double _value, final String message, final Throwable cause) throws NotEqualException {
        if (Objects.notEquals(value, _value))
            throw new NotEqualException(message, cause);
        return value;
    }

    /**
     * @throws NotEqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static <T> T equalsX(final T object, final Object _object, final String message, final Throwable cause) throws NotEqualException {
        if (Objects.notEquals(object, _object))
            throw new NotEqualException(message, cause);
        return object;
    }

    /**
     * @throws NotEqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static boolean equalsX(final boolean value, final boolean _value, final String message, final Throwable cause, final boolean suppressed, final boolean writable) throws NotEqualException {
        if (Objects.notEquals(value, _value))
            throw new NotEqualException(message, cause, suppressed, writable);
        return value;
    }

    /**
     * @throws NotEqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static byte equalsX(final byte value, final byte _value, final String message, final Throwable cause, final boolean suppressed, final boolean writable) throws NotEqualException {
        if (Objects.notEquals(value, _value))
            throw new NotEqualException(message, cause, suppressed, writable);
        return value;
    }

    /**
     * @throws NotEqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static short equalsX(final short value, final short _value, final String message, final Throwable cause, final boolean suppressed, final boolean writable) throws NotEqualException {
        if (Objects.notEquals(value, _value))
            throw new NotEqualException(message, cause, suppressed, writable);
        return value;
    }

    /**
     * @throws NotEqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static int equalsX(final int value, final int _value, final String message, final Throwable cause, final boolean suppressed, final boolean writable) throws NotEqualException {
        if (Objects.notEquals(value, _value))
            throw new NotEqualException(message, cause, suppressed, writable);
        return value;
    }

    /**
     * @throws NotEqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static long equalsX(final long value, final long _value, final float max, final String message, final Throwable cause, final boolean suppressed, final boolean writable) throws NotEqualException {
        if (Objects.notEquals(value, _value))
            throw new NotEqualException(message, cause, suppressed, writable);
        return value;
    }

    /**
     * @throws NotEqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static float equalsX(final float value, final float _value, final String message, final Throwable cause, final boolean suppressed, final boolean writable) throws NotEqualException {
        if (Objects.notEquals(value, _value))
            throw new NotEqualException(message, cause, suppressed, writable);
        return value;
    }

    /**
     * @throws NotEqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static double equalsX(final double value, final double _value, final String message, final Throwable cause, final boolean suppressed, final boolean writable) throws NotEqualException {
        if (Objects.notEquals(value, _value))
            throw new NotEqualException(message, cause, suppressed, writable);
        return value;
    }

    /**
     * @throws NotEqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static <T> T equalsX(final T object, final Object _object, final String message, final Throwable cause, final boolean suppressed, final boolean writable) throws NotEqualException {
        if (Objects.notEquals(object, _object))
            throw new NotEqualException(message, cause, suppressed, writable);
        return object;
    }

    /**
     * @throws EqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static boolean notEquals(final boolean value, final boolean _value) throws EqualException {
        if (Objects.equals(value, _value))
            throw new EqualException("The value must not be equal to the _value");
        return value;
    }

    /**
     * @throws EqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static byte notEquals(final byte value, final byte _value) throws EqualException {
        if (Objects.equals(value, _value))
            throw new EqualException("The value must not be equal to the _value");
        return value;
    }

    /**
     * @throws EqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static short notEquals(final short value, final short _value) throws EqualException {
        if (Objects.equals(value, _value))
            throw new EqualException("The value must not be equal to the _value");
        return value;
    }

    /**
     * @throws EqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static int notEquals(final int value, final int _value) throws EqualException {
        if (Objects.equals(value, _value))
            throw new EqualException("The value must not be equal to the _value");
        return value;
    }

    /**
     * @throws EqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static long notEquals(final long value, final long _value, final float max) throws EqualException {
        if (Objects.equals(value, _value))
            throw new EqualException("The value must not be equal to the _value");
        return value;
    }

    /**
     * @throws EqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static float notEquals(final float value, final float _value) throws EqualException {
        if (Objects.equals(value, _value))
            throw new EqualException("The value must not be equal to the _value");
        return value;
    }

    /**
     * @throws EqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static double notEquals(final double value, final double _value) throws EqualException {
        if (Objects.equals(value, _value))
            throw new EqualException("The value must not be equal to the _value");
        return value;
    }

    /**
     * @throws EqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static <T> T notEquals(final T object, final Object _object) throws EqualException {
        if (Objects.equals(object, _object))
            throw new EqualException("The object must not be equal to the _object");
        return object;
    }

    /**
     * @throws EqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static boolean notEquals(final boolean value, final boolean _value, final String name, final String _name) throws EqualException {
        if (Objects.equals(value, _value))
            throw new EqualException("The " + name + " must not be equal to the " + _name);
        return value;
    }

    /**
     * @throws EqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static byte notEquals(final byte value, final byte _value, final String name, final String _name) throws EqualException {
        if (Objects.equals(value, _value))
            throw new EqualException("The " + name + " must not be equal to the " + _name);
        return value;
    }

    /**
     * @throws EqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static short notEquals(final short value, final short _value, final String name, final String _name) throws EqualException {
        if (Objects.equals(value, _value))
            throw new EqualException("The " + name + " must not be equal to the " + _name);
        return value;
    }

    /**
     * @throws EqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static int notEquals(final int value, final int _value, final String name, final String _name) throws EqualException {
        if (Objects.equals(value, _value))
            throw new EqualException("The " + name + " must not be equal to the " + _name);
        return value;
    }

    /**
     * @throws EqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static long notEquals(final long value, final long _value, final float max, final String name, final String _name, final String __name) throws EqualException {
        if (Objects.equals(value, _value))
            throw new EqualException("The " + name + " must not be equal to the " + _name);
        return value;
    }

    /**
     * @throws EqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static float notEquals(final float value, final float _value, final String name, final String _name) throws EqualException {
        if (Objects.equals(value, _value))
            throw new EqualException("The " + name + " must not be equal to the " + _name);
        return value;
    }

    /**
     * @throws EqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static double notEquals(final double value, final double _value, final String name, final String _name) throws EqualException {
        if (Objects.equals(value, _value))
            throw new EqualException("The " + name + " must not be equal to the " + _name);
        return value;
    }

    /**
     * @throws EqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static <T> T notEquals(final T object, final Object _object, final String name, final String _name) throws EqualException {
        if (Objects.equals(object, _object))
            throw new EqualException("The " + name + " must not be equal to the " + _name);
        return object;
    }

    /**
     * @throws EqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static boolean notEqualsX(final boolean value, final boolean _value, final String message) throws EqualException {
        if (Objects.equals(value, _value))
            throw new EqualException(message);
        return value;
    }

    /**
     * @throws EqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static byte notEqualsX(final byte value, final byte _value, final String message) throws EqualException {
        if (Objects.equals(value, _value))
            throw new EqualException(message);
        return value;
    }

    /**
     * @throws EqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static short notEqualsX(final short value, final short _value, final String message) throws EqualException {
        if (Objects.equals(value, _value))
            throw new EqualException(message);
        return value;
    }

    /**
     * @throws EqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static int notEqualsX(final int value, final int _value, final String message) throws EqualException {
        if (Objects.equals(value, _value))
            throw new EqualException(message);
        return value;
    }

    /**
     * @throws EqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static long notEqualsX(final long value, final long _value, final float max, final String message) throws EqualException {
        if (Objects.equals(value, _value))
            throw new EqualException(message);
        return value;
    }

    /**
     * @throws EqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static float notEqualsX(final float value, final float _value, final String message) throws EqualException {
        if (Objects.equals(value, _value))
            throw new EqualException(message);
        return value;
    }

    /**
     * @throws EqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static double notEqualsX(final double value, final double _value, final String message) throws EqualException {
        if (Objects.equals(value, _value))
            throw new EqualException(message);
        return value;
    }

    /**
     * @throws EqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static <T> T notEqualsX(final T object, final Object _object, final String message) throws EqualException {
        if (Objects.equals(object, _object))
            throw new EqualException(message);
        return object;
    }

    /**
     * @throws EqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static boolean notEqualsX(final boolean value, final boolean _value, final Throwable cause) throws EqualException {
        if (Objects.equals(value, _value))
            throw new EqualException(cause);
        return value;
    }

    /**
     * @throws EqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static byte notEqualsX(final byte value, final byte _value, final Throwable cause) throws EqualException {
        if (Objects.equals(value, _value))
            throw new EqualException(cause);
        return value;
    }

    /**
     * @throws EqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static short notEqualsX(final short value, final short _value, final Throwable cause) throws EqualException {
        if (Objects.equals(value, _value))
            throw new EqualException(cause);
        return value;
    }

    /**
     * @throws EqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static int notEqualsX(final int value, final int _value, final Throwable cause) throws EqualException {
        if (Objects.equals(value, _value))
            throw new EqualException(cause);
        return value;
    }

    /**
     * @throws EqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static long notEqualsX(final long value, final long _value, final float max, final Throwable cause) throws EqualException {
        if (Objects.equals(value, _value))
            throw new EqualException(cause);
        return value;
    }

    /**
     * @throws EqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static float notEqualsX(final float value, final float _value, final Throwable cause) throws EqualException {
        if (Objects.equals(value, _value))
            throw new EqualException(cause);
        return value;
    }

    /**
     * @throws EqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static double notEqualsX(final double value, final double _value, final Throwable cause) throws EqualException {
        if (Objects.equals(value, _value))
            throw new EqualException(cause);
        return value;
    }

    /**
     * @throws EqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static <T> T notEqualsX(final T object, final Object _object, final Throwable cause) throws EqualException {
        if (Objects.equals(object, _object))
            throw new EqualException(cause);
        return object;
    }

    /**
     * @throws EqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static boolean notEqualsX(final boolean value, final boolean _value, final String message, final Throwable cause) throws EqualException {
        if (Objects.equals(value, _value))
            throw new EqualException(message, cause);
        return value;
    }

    /**
     * @throws EqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static byte notEqualsX(final byte value, final byte _value, final String message, final Throwable cause) throws EqualException {
        if (Objects.equals(value, _value))
            throw new EqualException(message, cause);
        return value;
    }

    /**
     * @throws EqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static short notEqualsX(final short value, final short _value, final String message, final Throwable cause) throws EqualException {
        if (Objects.equals(value, _value))
            throw new EqualException(message, cause);
        return value;
    }

    /**
     * @throws EqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static int notEqualsX(final int value, final int _value, final String message, final Throwable cause) throws EqualException {
        if (Objects.equals(value, _value))
            throw new EqualException(message, cause);
        return value;
    }

    /**
     * @throws EqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static long notEqualsX(final long value, final long _value, final float max, final String message, final Throwable cause) throws EqualException {
        if (Objects.equals(value, _value))
            throw new EqualException(message, cause);
        return value;
    }

    /**
     * @throws EqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static float notEqualsX(final float value, final float _value, final String message, final Throwable cause) throws EqualException {
        if (Objects.equals(value, _value))
            throw new EqualException(message, cause);
        return value;
    }

    /**
     * @throws EqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static double notEqualsX(final double value, final double _value, final String message, final Throwable cause) throws EqualException {
        if (Objects.equals(value, _value))
            throw new EqualException(message, cause);
        return value;
    }

    /**
     * @throws EqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static <T> T notEqualsX(final T object, final Object _object, final String message, final Throwable cause) throws EqualException {
        if (Objects.equals(object, _object))
            throw new EqualException(message, cause);
        return object;
    }

    /**
     * @throws EqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static boolean notEqualsX(final boolean value, final boolean _value, final String message, final Throwable cause, final boolean suppressed, final boolean writable) throws EqualException {
        if (Objects.equals(value, _value))
            throw new EqualException(message, cause, suppressed, writable);
        return value;
    }

    /**
     * @throws EqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static byte notEqualsX(final byte value, final byte _value, final String message, final Throwable cause, final boolean suppressed, final boolean writable) throws EqualException {
        if (Objects.equals(value, _value))
            throw new EqualException(message, cause, suppressed, writable);
        return value;
    }

    /**
     * @throws EqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static short notEqualsX(final short value, final short _value, final String message, final Throwable cause, final boolean suppressed, final boolean writable) throws EqualException {
        if (Objects.equals(value, _value))
            throw new EqualException(message, cause, suppressed, writable);
        return value;
    }

    /**
     * @throws EqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static int notEqualsX(final int value, final int _value, final String message, final Throwable cause, final boolean suppressed, final boolean writable) throws EqualException {
        if (Objects.equals(value, _value))
            throw new EqualException(message, cause, suppressed, writable);
        return value;
    }

    /**
     * @throws EqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static long notEqualsX(final long value, final long _value, final float max, final String message, final Throwable cause, final boolean suppressed, final boolean writable) throws EqualException {
        if (Objects.equals(value, _value))
            throw new EqualException(message, cause, suppressed, writable);
        return value;
    }

    /**
     * @throws EqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static float notEqualsX(final float value, final float _value, final String message, final Throwable cause, final boolean suppressed, final boolean writable) throws EqualException {
        if (Objects.equals(value, _value))
            throw new EqualException(message, cause, suppressed, writable);
        return value;
    }

    /**
     * @throws EqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static double notEqualsX(final double value, final double _value, final String message, final Throwable cause, final boolean suppressed, final boolean writable) throws EqualException {
        if (Objects.equals(value, _value))
            throw new EqualException(message, cause, suppressed, writable);
        return value;
    }

    /**
     * @throws EqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static <T> T notEqualsX(final T object, final Object _object, final String message, final Throwable cause, final boolean suppressed, final boolean writable) throws EqualException {
        if (Objects.equals(object, _object))
            throw new EqualException(message, cause, suppressed, writable);
        return object;
    }

    /**
     * @throws NotMoreException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static byte more(final byte value, final byte _value) throws NotMoreException {
        if (Objects.notMore(value, _value))
            throw new NotMoreException("The value must be more than the _value");
        return value;
    }

    /**
     * @throws NotMoreException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static short more(final short value, final short _value) throws NotMoreException {
        if (Objects.notMore(value, _value))
            throw new NotMoreException("The value must be more than the _value");
        return value;
    }

    /**
     * @throws NotMoreException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static int more(final int value, final int _value) throws NotMoreException {
        if (Objects.notMore(value, _value))
            throw new NotMoreException("The value must be more than the _value");
        return value;
    }

    /**
     * @throws NotMoreException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static long more(final long value, final long _value, final float max) throws NotMoreException {
        if (Objects.notMore(value, _value))
            throw new NotMoreException("The value must be more than the _value");
        return value;
    }

    /**
     * @throws NotMoreException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static float more(final float value, final float _value) throws NotMoreException {
        if (Objects.notMore(value, _value))
            throw new NotMoreException("The value must be more than the _value");
        return value;
    }

    /**
     * @throws NotMoreException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static double more(final byte value, final double _value) throws NotMoreException {
        if (Objects.notMore(value, _value))
            throw new NotMoreException("The value must be more than the _value");
        return value;
    }

    /**
     * @throws NotMoreException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static byte more(final byte value, final byte _value, final String name, final String _name) throws NotMoreException {
        if (Objects.notMore(value, _value))
            throw new NotMoreException("The " + name + " must be more than the " + _name);
        return value;
    }

    /**
     * @throws NotMoreException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static short more(final short value, final short _value, final String name, final String _name) throws NotMoreException {
        if (Objects.notMore(value, _value))
            throw new NotMoreException("The " + name + " must be more than the " + _name);
        return value;
    }

    /**
     * @throws NotMoreException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static int more(final int value, final int _value, final String name, final String _name) throws NotMoreException {
        if (Objects.notMore(value, _value))
            throw new NotMoreException("The " + name + " must be more than the " + _name);
        return value;
    }

    /**
     * @throws NotMoreException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static long more(final long value, final long _value, final float max, final String name, final String _name, final String __name) throws NotMoreException {
        if (Objects.notMore(value, _value))
            throw new NotMoreException("The " + name + " must be more than the " + _name);
        return value;
    }

    /**
     * @throws NotMoreException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static float more(final float value, final float _value, final String name, final String _name) throws NotMoreException {
        if (Objects.notMore(value, _value))
            throw new NotMoreException("The " + name + " must be more than the " + _name);
        return value;
    }

    /**
     * @throws NotMoreException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static double more(final byte value, final double _value, final String name, final String _name) throws NotMoreException {
        if (Objects.notMore(value, _value))
            throw new NotMoreException("The " + name + " must be more than the " + _name);
        return value;
    }

    /**
     * @throws NotMoreException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static byte moreX(final byte value, final byte _value, final String message) throws NotMoreException {
        if (Objects.notMore(value, _value))
            throw new NotMoreException(message);
        return value;
    }

    /**
     * @throws NotMoreException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static short moreX(final short value, final short _value, final String message) throws NotMoreException {
        if (Objects.notMore(value, _value))
            throw new NotMoreException(message);
        return value;
    }

    /**
     * @throws NotMoreException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static int moreX(final int value, final int _value, final String message) throws NotMoreException {
        if (Objects.notMore(value, _value))
            throw new NotMoreException(message);
        return value;
    }

    /**
     * @throws NotMoreException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static long moreX(final long value, final long _value, final float max, final String message) throws NotMoreException {
        if (Objects.notMore(value, _value))
            throw new NotMoreException(message);
        return value;
    }

    /**
     * @throws NotMoreException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static float moreX(final float value, final float _value, final String message) throws NotMoreException {
        if (Objects.notMore(value, _value))
            throw new NotMoreException(message);
        return value;
    }

    /**
     * @throws NotMoreException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static double moreX(final double value, final double _value, final String message) throws NotMoreException {
        if (Objects.notMore(value, _value))
            throw new NotMoreException(message);
        return value;
    }

    /**
     * @throws NotMoreException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static byte moreX(final byte value, final byte _value, final Throwable cause) throws NotMoreException {
        if (Objects.notMore(value, _value))
            throw new NotMoreException(cause);
        return value;
    }

    /**
     * @throws NotMoreException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static short moreX(final short value, final short _value, final Throwable cause) throws NotMoreException {
        if (Objects.notMore(value, _value))
            throw new NotMoreException(cause);
        return value;
    }

    /**
     * @throws NotMoreException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static int moreX(final int value, final int _value, final Throwable cause) throws NotMoreException {
        if (Objects.notMore(value, _value))
            throw new NotMoreException(cause);
        return value;
    }

    /**
     * @throws NotMoreException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static long moreX(final long value, final long _value, final float max, final Throwable cause) throws NotMoreException {
        if (Objects.notMore(value, _value))
            throw new NotMoreException(cause);
        return value;
    }

    /**
     * @throws NotMoreException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static float moreX(final float value, final float _value, final Throwable cause) throws NotMoreException {
        if (Objects.notMore(value, _value))
            throw new NotMoreException(cause);
        return value;
    }

    /**
     * @throws NotMoreException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static double moreX(final double value, final double _value, final Throwable cause) throws NotMoreException {
        if (Objects.notMore(value, _value))
            throw new NotMoreException(cause);
        return value;
    }

    /**
     * @throws NotMoreException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static byte moreX(final byte value, final byte _value, final String message, final Throwable cause) throws NotMoreException {
        if (Objects.notMore(value, _value))
            throw new NotMoreException(message, cause);
        return value;
    }

    /**
     * @throws NotMoreException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static short moreX(final short value, final short _value, final String message, final Throwable cause) throws NotMoreException {
        if (Objects.notMore(value, _value))
            throw new NotMoreException(message, cause);
        return value;
    }

    /**
     * @throws NotMoreException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static int moreX(final int value, final int _value, final String message, final Throwable cause) throws NotMoreException {
        if (Objects.notMore(value, _value))
            throw new NotMoreException(message, cause);
        return value;
    }

    /**
     * @throws NotMoreException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static long moreX(final long value, final long _value, final float max, final String message, final Throwable cause) throws NotMoreException {
        if (Objects.notMore(value, _value))
            throw new NotMoreException(message, cause);
        return value;
    }

    /**
     * @throws NotMoreException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static float moreX(final float value, final float _value, final String message, final Throwable cause) throws NotMoreException {
        if (Objects.notMore(value, _value))
            throw new NotMoreException(message, cause);
        return value;
    }

    /**
     * @throws NotMoreException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static double moreX(final double value, final double _value, final String message, final Throwable cause) throws NotMoreException {
        if (Objects.notMore(value, _value))
            throw new NotMoreException(message, cause);
        return value;
    }

    /**
     * @throws NotMoreException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static byte moreX(final byte value, final byte _value, final String message, final Throwable cause, final boolean suppressed, final boolean writable) throws NotMoreException {
        if (Objects.notMore(value, _value))
            throw new NotMoreException(message, cause, suppressed, writable);
        return value;
    }

    /**
     * @throws NotMoreException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static short moreX(final short value, final short _value, final String message, final Throwable cause, final boolean suppressed, final boolean writable) throws NotMoreException {
        if (Objects.notMore(value, _value))
            throw new NotMoreException(message, cause, suppressed, writable);
        return value;
    }

    /**
     * @throws NotMoreException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static int moreX(final int value, final int _value, final String message, final Throwable cause, final boolean suppressed, final boolean writable) throws NotMoreException {
        if (Objects.notMore(value, _value))
            throw new NotMoreException(message, cause, suppressed, writable);
        return value;
    }

    /**
     * @throws NotMoreException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static long moreX(final long value, final long _value, final float max, final String message, final Throwable cause, final boolean suppressed, final boolean writable) throws NotMoreException {
        if (Objects.notMore(value, _value))
            throw new NotMoreException(message, cause, suppressed, writable);
        return value;
    }

    /**
     * @throws NotMoreException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static float moreX(final float value, final float _value, final String message, final Throwable cause, final boolean suppressed, final boolean writable) throws NotMoreException {
        if (Objects.notMore(value, _value))
            throw new NotMoreException(message, cause, suppressed, writable);
        return value;
    }

    /**
     * @throws NotMoreException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static double moreX(final double value, final double _value, final String message, final Throwable cause, final boolean suppressed, final boolean writable) throws NotMoreException {
        if (Objects.notMore(value, _value))
            throw new NotMoreException(message, cause, suppressed, writable);
        return value;
    }

    /**
     * @throws MoreException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static byte notMore(final byte value, final byte _value) throws MoreException {
        if (Objects.more(value, _value))
            throw new MoreException("The value must not be more than the _value");
        return value;
    }

    /**
     * @throws MoreException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static short notMore(final short value, final short _value) throws MoreException {
        if (Objects.more(value, _value))
            throw new MoreException("The value must not be more than the _value");
        return value;
    }

    /**
     * @throws MoreException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static int notMore(final int value, final int _value) throws MoreException {
        if (Objects.more(value, _value))
            throw new MoreException("The value must not be more than the _value");
        return value;
    }

    /**
     * @throws MoreException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static long notMore(final long value, final long _value, final float max) throws MoreException {
        if (Objects.more(value, _value))
            throw new MoreException("The value must not be more than the _value");
        return value;
    }

    /**
     * @throws MoreException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static float notMore(final float value, final float _value) throws MoreException {
        if (Objects.more(value, _value))
            throw new MoreException("The value must not be more than the _value");
        return value;
    }

    /**
     * @throws MoreException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static double notMore(final byte value, final double _value) throws MoreException {
        if (Objects.more(value, _value))
            throw new MoreException("The value must not be more than the _value");
        return value;
    }

    /**
     * @throws MoreException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static byte notMore(final byte value, final byte _value, final String name, final String _name) throws MoreException {
        if (Objects.more(value, _value))
            throw new MoreException("The " + name + " must not be more than the " + _name);
        return value;
    }

    /**
     * @throws MoreException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static short notMore(final short value, final short _value, final String name, final String _name) throws MoreException {
        if (Objects.more(value, _value))
            throw new MoreException("The " + name + " must not be more than the " + _name);
        return value;
    }

    /**
     * @throws MoreException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static int notMore(final int value, final int _value, final String name, final String _name) throws MoreException {
        if (Objects.more(value, _value))
            throw new MoreException("The " + name + " must not be more than the " + _name);
        return value;
    }

    /**
     * @throws MoreException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static long notMore(final long value, final long _value, final float max, final String name, final String _name, final String __name) throws MoreException {
        if (Objects.more(value, _value))
            throw new MoreException("The " + name + " must not be more than the " + _name);
        return value;
    }

    /**
     * @throws MoreException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static float notMore(final float value, final float _value, final String name, final String _name) throws MoreException {
        if (Objects.more(value, _value))
            throw new MoreException("The " + name + " must not be more than the " + _name);
        return value;
    }

    /**
     * @throws MoreException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static double notMore(final byte value, final double _value, final String name, final String _name) throws MoreException {
        if (Objects.more(value, _value))
            throw new MoreException("The " + name + " must not be more than the " + _name);
        return value;
    }

    /**
     * @throws MoreException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static byte notMoreX(final byte value, final byte _value, final String message) throws MoreException {
        if (Objects.more(value, _value))
            throw new MoreException(message);
        return value;
    }

    /**
     * @throws MoreException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static short notMoreX(final short value, final short _value, final String message) throws MoreException {
        if (Objects.more(value, _value))
            throw new MoreException(message);
        return value;
    }

    /**
     * @throws MoreException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static int notMoreX(final int value, final int _value, final String message) throws MoreException {
        if (Objects.more(value, _value))
            throw new MoreException(message);
        return value;
    }

    /**
     * @throws MoreException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static long notMoreX(final long value, final long _value, final float max, final String message) throws MoreException {
        if (Objects.more(value, _value))
            throw new MoreException(message);
        return value;
    }

    /**
     * @throws MoreException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static float notMoreX(final float value, final float _value, final String message) throws MoreException {
        if (Objects.more(value, _value))
            throw new MoreException(message);
        return value;
    }

    /**
     * @throws MoreException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static double notMoreX(final double value, final double _value, final String message) throws MoreException {
        if (Objects.more(value, _value))
            throw new MoreException(message);
        return value;
    }

    /**
     * @throws MoreException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static byte notMoreX(final byte value, final byte _value, final Throwable cause) throws MoreException {
        if (Objects.more(value, _value))
            throw new MoreException(cause);
        return value;
    }

    /**
     * @throws MoreException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static short notMoreX(final short value, final short _value, final Throwable cause) throws MoreException {
        if (Objects.more(value, _value))
            throw new MoreException(cause);
        return value;
    }

    /**
     * @throws MoreException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static int notMoreX(final int value, final int _value, final Throwable cause) throws MoreException {
        if (Objects.more(value, _value))
            throw new MoreException(cause);
        return value;
    }

    /**
     * @throws MoreException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static long notMoreX(final long value, final long _value, final float max, final Throwable cause) throws MoreException {
        if (Objects.more(value, _value))
            throw new MoreException(cause);
        return value;
    }

    /**
     * @throws MoreException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static float notMoreX(final float value, final float _value, final Throwable cause) throws MoreException {
        if (Objects.more(value, _value))
            throw new MoreException(cause);
        return value;
    }

    /**
     * @throws MoreException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static double notMoreX(final double value, final double _value, final Throwable cause) throws MoreException {
        if (Objects.more(value, _value))
            throw new MoreException(cause);
        return value;
    }

    /**
     * @throws MoreException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static byte notMoreX(final byte value, final byte _value, final String message, final Throwable cause) throws MoreException {
        if (Objects.more(value, _value))
            throw new MoreException(message, cause);
        return value;
    }

    /**
     * @throws MoreException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static short notMoreX(final short value, final short _value, final String message, final Throwable cause) throws MoreException {
        if (Objects.more(value, _value))
            throw new MoreException(message, cause);
        return value;
    }

    /**
     * @throws MoreException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static int notMoreX(final int value, final int _value, final String message, final Throwable cause) throws MoreException {
        if (Objects.more(value, _value))
            throw new MoreException(message, cause);
        return value;
    }

    /**
     * @throws MoreException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static long notMoreX(final long value, final long _value, final float max, final String message, final Throwable cause) throws MoreException {
        if (Objects.more(value, _value))
            throw new MoreException(message, cause);
        return value;
    }

    /**
     * @throws MoreException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static float notMoreX(final float value, final float _value, final String message, final Throwable cause) throws MoreException {
        if (Objects.more(value, _value))
            throw new MoreException(message, cause);
        return value;
    }

    /**
     * @throws MoreException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static double notMoreX(final double value, final double _value, final String message, final Throwable cause) throws MoreException {
        if (Objects.more(value, _value))
            throw new MoreException(message, cause);
        return value;
    }

    /**
     * @throws MoreException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static byte notMoreX(final byte value, final byte _value, final String message, final Throwable cause, final boolean suppressed, final boolean writable) throws MoreException {
        if (Objects.more(value, _value))
            throw new MoreException(message, cause, suppressed, writable);
        return value;
    }

    /**
     * @throws MoreException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static short notMoreX(final short value, final short _value, final String message, final Throwable cause, final boolean suppressed, final boolean writable) throws MoreException {
        if (Objects.more(value, _value))
            throw new MoreException(message, cause, suppressed, writable);
        return value;
    }

    /**
     * @throws MoreException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static int notMoreX(final int value, final int _value, final String message, final Throwable cause, final boolean suppressed, final boolean writable) throws MoreException {
        if (Objects.more(value, _value))
            throw new MoreException(message, cause, suppressed, writable);
        return value;
    }

    /**
     * @throws MoreException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static long notMoreX(final long value, final long _value, final float max, final String message, final Throwable cause, final boolean suppressed, final boolean writable) throws MoreException {
        if (Objects.more(value, _value))
            throw new MoreException(message, cause, suppressed, writable);
        return value;
    }

    /**
     * @throws MoreException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static float notMoreX(final float value, final float _value, final String message, final Throwable cause, final boolean suppressed, final boolean writable) throws MoreException {
        if (Objects.more(value, _value))
            throw new MoreException(message, cause, suppressed, writable);
        return value;
    }

    /**
     * @throws MoreException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static double notMoreX(final double value, final double _value, final String message, final Throwable cause, final boolean suppressed, final boolean writable) throws MoreException {
        if (Objects.more(value, _value))
            throw new MoreException(message, cause, suppressed, writable);
        return value;
    }

    /**
     * @throws NotLessException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static byte less(final byte value, final byte _value) throws NotLessException {
        if (Objects.notLess(value, _value))
            throw new NotLessException("The value must be less than the _value");
        return value;
    }

    /**
     * @throws NotLessException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static short less(final short value, final short _value) throws NotLessException {
        if (Objects.notLess(value, _value))
            throw new NotLessException("The value must be less than the _value");
        return value;
    }

    /**
     * @throws NotLessException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static int less(final int value, final int _value) throws NotLessException {
        if (Objects.notLess(value, _value))
            throw new NotLessException("The value must be less than the _value");
        return value;
    }

    /**
     * @throws NotLessException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static long less(final long value, final long _value, final float max) throws NotLessException {
        if (Objects.notLess(value, _value))
            throw new NotLessException("The value must be less than the _value");
        return value;
    }

    /**
     * @throws NotLessException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static float less(final float value, final float _value) throws NotLessException {
        if (Objects.notLess(value, _value))
            throw new NotLessException("The value must be less than the _value");
        return value;
    }

    /**
     * @throws NotLessException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static double less(final byte value, final double _value) throws NotLessException {
        if (Objects.notLess(value, _value))
            throw new NotLessException("The value must be less than the _value");
        return value;
    }

    /**
     * @throws NotLessException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static byte less(final byte value, final byte _value, final String name, final String _name) throws NotLessException {
        if (Objects.notLess(value, _value))
            throw new NotLessException("The " + name + " must be less than the " + _name);
        return value;
    }

    /**
     * @throws NotLessException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static short less(final short value, final short _value, final String name, final String _name) throws NotLessException {
        if (Objects.notLess(value, _value))
            throw new NotLessException("The " + name + " must be less than the " + _name);
        return value;
    }

    /**
     * @throws NotLessException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static int less(final int value, final int _value, final String name, final String _name) throws NotLessException {
        if (Objects.notLess(value, _value))
            throw new NotLessException("The " + name + " must be less than the " + _name);
        return value;
    }

    /**
     * @throws NotLessException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static long less(final long value, final long _value, final float max, final String name, final String _name, final String __name) throws NotLessException {
        if (Objects.notLess(value, _value))
            throw new NotLessException("The " + name + " must be less than the " + _name);
        return value;
    }

    /**
     * @throws NotLessException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static float less(final float value, final float _value, final String name, final String _name) throws NotLessException {
        if (Objects.notLess(value, _value))
            throw new NotLessException("The " + name + " must be less than the " + _name);
        return value;
    }

    /**
     * @throws NotLessException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static double less(final byte value, final double _value, final String name, final String _name) throws NotLessException {
        if (Objects.notLess(value, _value))
            throw new NotLessException("The " + name + " must be less than the " + _name);
        return value;
    }

    /**
     * @throws NotLessException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static byte lessX(final byte value, final byte _value, final String message) throws NotLessException {
        if (Objects.notLess(value, _value))
            throw new NotLessException(message);
        return value;
    }

    /**
     * @throws NotLessException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static short lessX(final short value, final short _value, final String message) throws NotLessException {
        if (Objects.notLess(value, _value))
            throw new NotLessException(message);
        return value;
    }

    /**
     * @throws NotLessException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static int lessX(final int value, final int _value, final String message) throws NotLessException {
        if (Objects.notLess(value, _value))
            throw new NotLessException(message);
        return value;
    }

    /**
     * @throws NotLessException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static long lessX(final long value, final long _value, final float max, final String message) throws NotLessException {
        if (Objects.notLess(value, _value))
            throw new NotLessException(message);
        return value;
    }

    /**
     * @throws NotLessException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static float lessX(final float value, final float _value, final String message) throws NotLessException {
        if (Objects.notLess(value, _value))
            throw new NotLessException(message);
        return value;
    }

    /**
     * @throws NotLessException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static double lessX(final double value, final double _value, final String message) throws NotLessException {
        if (Objects.notLess(value, _value))
            throw new NotLessException(message);
        return value;
    }

    /**
     * @throws NotLessException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static byte lessX(final byte value, final byte _value, final Throwable cause) throws NotLessException {
        if (Objects.notLess(value, _value))
            throw new NotLessException(cause);
        return value;
    }

    /**
     * @throws NotLessException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static short lessX(final short value, final short _value, final Throwable cause) throws NotLessException {
        if (Objects.notLess(value, _value))
            throw new NotLessException(cause);
        return value;
    }

    /**
     * @throws NotLessException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static int lessX(final int value, final int _value, final Throwable cause) throws NotLessException {
        if (Objects.notLess(value, _value))
            throw new NotLessException(cause);
        return value;
    }

    /**
     * @throws NotLessException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static long lessX(final long value, final long _value, final float max, final Throwable cause) throws NotLessException {
        if (Objects.notLess(value, _value))
            throw new NotLessException(cause);
        return value;
    }

    /**
     * @throws NotLessException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static float lessX(final float value, final float _value, final Throwable cause) throws NotLessException {
        if (Objects.notLess(value, _value))
            throw new NotLessException(cause);
        return value;
    }

    /**
     * @throws NotLessException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static double lessX(final double value, final double _value, final Throwable cause) throws NotLessException {
        if (Objects.notLess(value, _value))
            throw new NotLessException(cause);
        return value;
    }

    /**
     * @throws NotLessException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static byte lessX(final byte value, final byte _value, final String message, final Throwable cause) throws NotLessException {
        if (Objects.notLess(value, _value))
            throw new NotLessException(message, cause);
        return value;
    }

    /**
     * @throws NotLessException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static short lessX(final short value, final short _value, final String message, final Throwable cause) throws NotLessException {
        if (Objects.notLess(value, _value))
            throw new NotLessException(message, cause);
        return value;
    }

    /**
     * @throws NotLessException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static int lessX(final int value, final int _value, final String message, final Throwable cause) throws NotLessException {
        if (Objects.notLess(value, _value))
            throw new NotLessException(message, cause);
        return value;
    }

    /**
     * @throws NotLessException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static long lessX(final long value, final long _value, final float max, final String message, final Throwable cause) throws NotLessException {
        if (Objects.notLess(value, _value))
            throw new NotLessException(message, cause);
        return value;
    }

    /**
     * @throws NotLessException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static float lessX(final float value, final float _value, final String message, final Throwable cause) throws NotLessException {
        if (Objects.notLess(value, _value))
            throw new NotLessException(message, cause);
        return value;
    }

    /**
     * @throws NotLessException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static double lessX(final double value, final double _value, final String message, final Throwable cause) throws NotLessException {
        if (Objects.notLess(value, _value))
            throw new NotLessException(message, cause);
        return value;
    }

    /**
     * @throws NotLessException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static byte lessX(final byte value, final byte _value, final String message, final Throwable cause, final boolean suppressed, final boolean writable) throws NotLessException {
        if (Objects.notLess(value, _value))
            throw new NotLessException(message, cause, suppressed, writable);
        return value;
    }

    /**
     * @throws NotLessException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static short lessX(final short value, final short _value, final String message, final Throwable cause, final boolean suppressed, final boolean writable) throws NotLessException {
        if (Objects.notLess(value, _value))
            throw new NotLessException(message, cause, suppressed, writable);
        return value;
    }

    /**
     * @throws NotLessException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static int lessX(final int value, final int _value, final String message, final Throwable cause, final boolean suppressed, final boolean writable) throws NotLessException {
        if (Objects.notLess(value, _value))
            throw new NotLessException(message, cause, suppressed, writable);
        return value;
    }

    /**
     * @throws NotLessException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static long lessX(final long value, final long _value, final float max, final String message, final Throwable cause, final boolean suppressed, final boolean writable) throws NotLessException {
        if (Objects.notLess(value, _value))
            throw new NotLessException(message, cause, suppressed, writable);
        return value;
    }

    /**
     * @throws NotLessException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static float lessX(final float value, final float _value, final String message, final Throwable cause, final boolean suppressed, final boolean writable) throws NotLessException {
        if (Objects.notLess(value, _value))
            throw new NotLessException(message, cause, suppressed, writable);
        return value;
    }

    /**
     * @throws NotLessException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static double lessX(final double value, final double _value, final String message, final Throwable cause, final boolean suppressed, final boolean writable) throws NotLessException {
        if (Objects.notLess(value, _value))
            throw new NotLessException(message, cause, suppressed, writable);
        return value;
    }

    /**
     * @throws LessException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static byte notLess(final byte value, final byte _value) throws LessException {
        if (Objects.less(value, _value))
            throw new LessException("The value must not be less than the _value");
        return value;
    }

    /**
     * @throws LessException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static short notLess(final short value, final short _value) throws LessException {
        if (Objects.less(value, _value))
            throw new LessException("The value must not be less than the _value");
        return value;
    }

    /**
     * @throws LessException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static int notLess(final int value, final int _value) throws LessException {
        if (Objects.less(value, _value))
            throw new LessException("The value must not be less than the _value");
        return value;
    }

    /**
     * @throws LessException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static long notLess(final long value, final long _value, final float max) throws LessException {
        if (Objects.less(value, _value))
            throw new LessException("The value must not be less than the _value");
        return value;
    }

    /**
     * @throws LessException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static float notLess(final float value, final float _value) throws LessException {
        if (Objects.less(value, _value))
            throw new LessException("The value must not be less than the _value");
        return value;
    }

    /**
     * @throws LessException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static double notLess(final byte value, final double _value) throws LessException {
        if (Objects.less(value, _value))
            throw new LessException("The value must not be less than the _value");
        return value;
    }

    /**
     * @throws LessException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static byte notLess(final byte value, final byte _value, final String name, final String _name) throws LessException {
        if (Objects.less(value, _value))
            throw new LessException("The " + name + " must not be less than the " + _name);
        return value;
    }

    /**
     * @throws LessException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static short notLess(final short value, final short _value, final String name, final String _name) throws LessException {
        if (Objects.less(value, _value))
            throw new LessException("The " + name + " must not be less than the " + _name);
        return value;
    }

    /**
     * @throws LessException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static int notLess(final int value, final int _value, final String name, final String _name) throws LessException {
        if (Objects.less(value, _value))
            throw new LessException("The " + name + " must not be less than the " + _name);
        return value;
    }

    /**
     * @throws LessException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static long notLess(final long value, final long _value, final float max, final String name, final String _name, final String __name) throws LessException {
        if (Objects.less(value, _value))
            throw new LessException("The " + name + " must not be less than the " + _name);
        return value;
    }

    /**
     * @throws LessException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static float notLess(final float value, final float _value, final String name, final String _name) throws LessException {
        if (Objects.less(value, _value))
            throw new LessException("The " + name + " must not be less than the " + _name);
        return value;
    }

    /**
     * @throws LessException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static double notLess(final byte value, final double _value, final String name, final String _name) throws LessException {
        if (Objects.less(value, _value))
            throw new LessException("The " + name + " must not be less than the " + _name);
        return value;
    }

    /**
     * @throws LessException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static byte notLessX(final byte value, final byte _value, final String message) throws LessException {
        if (Objects.less(value, _value))
            throw new LessException(message);
        return value;
    }

    /**
     * @throws LessException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static short notLessX(final short value, final short _value, final String message) throws LessException {
        if (Objects.less(value, _value))
            throw new LessException(message);
        return value;
    }

    /**
     * @throws LessException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static int notLessX(final int value, final int _value, final String message) throws LessException {
        if (Objects.less(value, _value))
            throw new LessException(message);
        return value;
    }

    /**
     * @throws LessException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static long notLessX(final long value, final long _value, final float max, final String message) throws LessException {
        if (Objects.less(value, _value))
            throw new LessException(message);
        return value;
    }

    /**
     * @throws LessException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static float notLessX(final float value, final float _value, final String message) throws LessException {
        if (Objects.less(value, _value))
            throw new LessException(message);
        return value;
    }

    /**
     * @throws LessException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static double notLessX(final double value, final double _value, final String message) throws LessException {
        if (Objects.less(value, _value))
            throw new LessException(message);
        return value;
    }

    /**
     * @throws LessException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static byte notLessX(final byte value, final byte _value, final Throwable cause) throws LessException {
        if (Objects.less(value, _value))
            throw new LessException(cause);
        return value;
    }

    /**
     * @throws LessException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static short notLessX(final short value, final short _value, final Throwable cause) throws LessException {
        if (Objects.less(value, _value))
            throw new LessException(cause);
        return value;
    }

    /**
     * @throws LessException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static int notLessX(final int value, final int _value, final Throwable cause) throws LessException {
        if (Objects.less(value, _value))
            throw new LessException(cause);
        return value;
    }

    /**
     * @throws LessException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static long notLessX(final long value, final long _value, final float max, final Throwable cause) throws LessException {
        if (Objects.less(value, _value))
            throw new LessException(cause);
        return value;
    }

    /**
     * @throws LessException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static float notLessX(final float value, final float _value, final Throwable cause) throws LessException {
        if (Objects.less(value, _value))
            throw new LessException(cause);
        return value;
    }

    /**
     * @throws LessException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static double notLessX(final double value, final double _value, final Throwable cause) throws LessException {
        if (Objects.less(value, _value))
            throw new LessException(cause);
        return value;
    }

    /**
     * @throws LessException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static byte notLessX(final byte value, final byte _value, final String message, final Throwable cause) throws LessException {
        if (Objects.less(value, _value))
            throw new LessException(message, cause);
        return value;
    }

    /**
     * @throws LessException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static short notLessX(final short value, final short _value, final String message, final Throwable cause) throws LessException {
        if (Objects.less(value, _value))
            throw new LessException(message, cause);
        return value;
    }

    /**
     * @throws LessException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static int notLessX(final int value, final int _value, final String message, final Throwable cause) throws LessException {
        if (Objects.less(value, _value))
            throw new LessException(message, cause);
        return value;
    }

    /**
     * @throws LessException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static long notLessX(final long value, final long _value, final float max, final String message, final Throwable cause) throws LessException {
        if (Objects.less(value, _value))
            throw new LessException(message, cause);
        return value;
    }

    /**
     * @throws LessException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static float notLessX(final float value, final float _value, final String message, final Throwable cause) throws LessException {
        if (Objects.less(value, _value))
            throw new LessException(message, cause);
        return value;
    }

    /**
     * @throws LessException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static double notLessX(final double value, final double _value, final String message, final Throwable cause) throws LessException {
        if (Objects.less(value, _value))
            throw new LessException(message, cause);
        return value;
    }

    /**
     * @throws LessException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static byte notLessX(final byte value, final byte _value, final String message, final Throwable cause, final boolean suppressed, final boolean writable) throws LessException {
        if (Objects.less(value, _value))
            throw new LessException(message, cause, suppressed, writable);
        return value;
    }

    /**
     * @throws LessException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static short notLessX(final short value, final short _value, final String message, final Throwable cause, final boolean suppressed, final boolean writable) throws LessException {
        if (Objects.less(value, _value))
            throw new LessException(message, cause, suppressed, writable);
        return value;
    }

    /**
     * @throws LessException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static int notLessX(final int value, final int _value, final String message, final Throwable cause, final boolean suppressed, final boolean writable) throws LessException {
        if (Objects.less(value, _value))
            throw new LessException(message, cause, suppressed, writable);
        return value;
    }

    /**
     * @throws LessException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static long notLessX(final long value, final long _value, final float max, final String message, final Throwable cause, final boolean suppressed, final boolean writable) throws LessException {
        if (Objects.less(value, _value))
            throw new LessException(message, cause, suppressed, writable);
        return value;
    }

    /**
     * @throws LessException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static float notLessX(final float value, final float _value, final String message, final Throwable cause, final boolean suppressed, final boolean writable) throws LessException {
        if (Objects.less(value, _value))
            throw new LessException(message, cause, suppressed, writable);
        return value;
    }

    /**
     * @throws LessException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static double notLessX(final double value, final double _value, final String message, final Throwable cause, final boolean suppressed, final boolean writable) throws LessException {
        if (Objects.less(value, _value))
            throw new LessException(message, cause, suppressed, writable);
        return value;
    }

    /**
     * @throws NotInException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static byte in(final byte value, final byte min, final byte max) throws NotInException {
        if (Objects.notIn(value, min, max))
            throw new NotInException("The value must be more than or equal to the min and less than or equal to the max");
        return value;
    }

    /**
     * @throws NotInException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static short in(final short value, final short min, final short max) throws NotInException {
        if (Objects.notIn(value, min, max))
            throw new NotInException("The value must be more than or equal to the min and less than or equal to the max");
        return value;
    }

    /**
     * @throws NotInException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static int in(final int value, final int min, final int max) throws NotInException {
        if (Objects.notIn(value, min, max))
            throw new NotInException("The value must be more than or equal to the min and less than or equal to the max");
        return value;
    }

    /**
     * @throws NotInException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static long in(final long value, final long min, final float max) throws NotInException {
        if (Objects.notIn(value, min, max))
            throw new NotInException("The value must be more than or equal to the min and less than or equal to the max");
        return value;
    }

    /**
     * @throws NotInException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static float in(final float value, final float min, final float max) throws NotInException {
        if (Objects.notIn(value, min, max))
            throw new NotInException("The value must be more than or equal to the min and less than or equal to the max");
        return value;
    }

    /**
     * @throws NotInException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static double in(final byte value, final double min, final double max) throws NotInException {
        if (Objects.notIn(value, min, max))
            throw new NotInException("The value must be more than or equal to the min and less than or equal to the max");
        return value;
    }

    /**
     * @throws NotInException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static byte in(final byte value, final byte min, final byte max, final String name, final String _name, final String __name) throws NotInException {
        if (Objects.notIn(value, min, max))
            throw new NotInException("The " + name + " must be more than or equal to the " + _name + " and less than or equal to the " + __name);
        return value;
    }

    /**
     * @throws NotInException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static short in(final short value, final short min, final short max, final String name, final String _name, final String __name) throws NotInException {
        if (Objects.notIn(value, min, max))
            throw new NotInException("The " + name + " must be more than or equal to the " + _name + " and less than or equal to the " + __name);
        return value;
    }

    /**
     * @throws NotInException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static int in(final int value, final int min, final int max, final String name, final String _name, final String __name) throws NotInException {
        if (Objects.notIn(value, min, max))
            throw new NotInException("The " + name + " must be more than or equal to the " + _name + " and less than or equal to the " + __name);
        return value;
    }

    /**
     * @throws NotInException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static long in(final long value, final long min, final float max, final String name, final String _name, final String __name) throws NotInException {
        if (Objects.notIn(value, min, max))
            throw new NotInException("The " + name + " must be more than or equal to the " + _name + " and less than or equal to the " + __name);
        return value;
    }

    /**
     * @throws NotInException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static float in(final float value, final float min, final float max, final String name, final String _name, final String __name) throws NotInException {
        if (Objects.notIn(value, min, max))
            throw new NotInException("The " + name + " must be more than or equal to the " + _name + " and less than or equal to the " + __name);
        return value;
    }

    /**
     * @throws NotInException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static double in(final byte value, final double min, final double max, final String name, final String _name, final String __name) throws NotInException {
        if (Objects.notIn(value, min, max))
            throw new NotInException("The " + name + " must be more than or equal to the " + _name + " and less than or equal to the " + __name);
        return value;
    }

    /**
     * @throws NotInException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static byte inX(final byte value, final byte min, final byte max, final String message) throws NotInException {
        if (Objects.notIn(value, min, max))
            throw new NotInException(message);
        return value;
    }

    /**
     * @throws NotInException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static short inX(final short value, final short min, final short max, final String message) throws NotInException {
        if (Objects.notIn(value, min, max))
            throw new NotInException(message);
        return value;
    }

    /**
     * @throws NotInException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static int inX(final int value, final int min, final int max, final String message) throws NotInException {
        if (Objects.notIn(value, min, max))
            throw new NotInException(message);
        return value;
    }

    /**
     * @throws NotInException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static long inX(final long value, final long min, final float max, final String message) throws NotInException {
        if (Objects.notIn(value, min, max))
            throw new NotInException(message);
        return value;
    }

    /**
     * @throws NotInException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static float inX(final float value, final float min, final float max, final String message) throws NotInException {
        if (Objects.notIn(value, min, max))
            throw new NotInException(message);
        return value;
    }

    /**
     * @throws NotInException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static double inX(final double value, final double min, final double max, final String message) throws NotInException {
        if (Objects.notIn(value, min, max))
            throw new NotInException(message);
        return value;
    }

    /**
     * @throws NotInException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static byte inX(final byte value, final byte min, final byte max, final Throwable cause) throws NotInException {
        if (Objects.notIn(value, min, max))
            throw new NotInException(cause);
        return value;
    }

    /**
     * @throws NotInException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static short inX(final short value, final short min, final short max, final Throwable cause) throws NotInException {
        if (Objects.notIn(value, min, max))
            throw new NotInException(cause);
        return value;
    }

    /**
     * @throws NotInException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static int inX(final int value, final int min, final int max, final Throwable cause) throws NotInException {
        if (Objects.notIn(value, min, max))
            throw new NotInException(cause);
        return value;
    }

    /**
     * @throws NotInException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static long inX(final long value, final long min, final float max, final Throwable cause) throws NotInException {
        if (Objects.notIn(value, min, max))
            throw new NotInException(cause);
        return value;
    }

    /**
     * @throws NotInException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static float inX(final float value, final float min, final float max, final Throwable cause) throws NotInException {
        if (Objects.notIn(value, min, max))
            throw new NotInException(cause);
        return value;
    }

    /**
     * @throws NotInException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static double inX(final double value, final double min, final double max, final Throwable cause) throws NotInException {
        if (Objects.notIn(value, min, max))
            throw new NotInException(cause);
        return value;
    }

    /**
     * @throws NotInException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static byte inX(final byte value, final byte min, final byte max, final String message, final Throwable cause) throws NotInException {
        if (Objects.notIn(value, min, max))
            throw new NotInException(message, cause);
        return value;
    }

    /**
     * @throws NotInException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static short inX(final short value, final short min, final short max, final String message, final Throwable cause) throws NotInException {
        if (Objects.notIn(value, min, max))
            throw new NotInException(message, cause);
        return value;
    }

    /**
     * @throws NotInException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static int inX(final int value, final int min, final int max, final String message, final Throwable cause) throws NotInException {
        if (Objects.notIn(value, min, max))
            throw new NotInException(message, cause);
        return value;
    }

    /**
     * @throws NotInException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static long inX(final long value, final long min, final float max, final String message, final Throwable cause) throws NotInException {
        if (Objects.notIn(value, min, max))
            throw new NotInException(message, cause);
        return value;
    }

    /**
     * @throws NotInException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static float inX(final float value, final float min, final float max, final String message, final Throwable cause) throws NotInException {
        if (Objects.notIn(value, min, max))
            throw new NotInException(message, cause);
        return value;
    }

    /**
     * @throws NotInException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static double inX(final double value, final double min, final double max, final String message, final Throwable cause) throws NotInException {
        if (Objects.notIn(value, min, max))
            throw new NotInException(message, cause);
        return value;
    }

    /**
     * @throws NotInException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static byte inX(final byte value, final byte min, final byte max, final String message, final Throwable cause, final boolean suppressed, final boolean writable) throws NotInException {
        if (Objects.notIn(value, min, max))
            throw new NotInException(message, cause, suppressed, writable);
        return value;
    }

    /**
     * @throws NotInException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static short inX(final short value, final short min, final short max, final String message, final Throwable cause, final boolean suppressed, final boolean writable) throws NotInException {
        if (Objects.notIn(value, min, max))
            throw new NotInException(message, cause, suppressed, writable);
        return value;
    }

    /**
     * @throws NotInException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static int inX(final int value, final int min, final int max, final String message, final Throwable cause, final boolean suppressed, final boolean writable) throws NotInException {
        if (Objects.notIn(value, min, max))
            throw new NotInException(message, cause, suppressed, writable);
        return value;
    }

    /**
     * @throws NotInException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static long inX(final long value, final long min, final float max, final String message, final Throwable cause, final boolean suppressed, final boolean writable) throws NotInException {
        if (Objects.notIn(value, min, max))
            throw new NotInException(message, cause, suppressed, writable);
        return value;
    }

    /**
     * @throws NotInException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static float inX(final float value, final float min, final float max, final String message, final Throwable cause, final boolean suppressed, final boolean writable) throws NotInException {
        if (Objects.notIn(value, min, max))
            throw new NotInException(message, cause, suppressed, writable);
        return value;
    }

    /**
     * @throws NotInException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static double inX(final double value, final double min, final double max, final String message, final Throwable cause, final boolean suppressed, final boolean writable) throws NotInException {
        if (Objects.notIn(value, min, max))
            throw new NotInException(message, cause, suppressed, writable);
        return value;
    }

    /**
     * @throws InException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static byte notIn(final byte value, final byte min, final byte max) throws InException {
        if (Objects.in(value, min, max))
            throw new InException("The value must not be more than or equal to the min and not be less than or equal to the max");
        return value;
    }

    /**
     * @throws InException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static short notIn(final short value, final short min, final short max) throws InException {
        if (Objects.in(value, min, max))
            throw new InException("The value must not be more than or equal to the min and not be less than or equal to the max");
        return value;
    }

    /**
     * @throws InException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static int notIn(final int value, final int min, final int max) throws InException {
        if (Objects.in(value, min, max))
            throw new InException("The value must not be more than or equal to the min and not be less than or equal to the max");
        return value;
    }

    /**
     * @throws InException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static long notIn(final long value, final long min, final float max) throws InException {
        if (Objects.in(value, min, max))
            throw new InException("The value must not be more than or equal to the min and not be less than or equal to the max");
        return value;
    }

    /**
     * @throws InException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static float notIn(final float value, final float min, final float max) throws InException {
        if (Objects.in(value, min, max))
            throw new InException("The value must not be more than or equal to the min and not be less than or equal to the max");
        return value;
    }

    /**
     * @throws InException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static double notIn(final byte value, final double min, final double max) throws InException {
        if (Objects.in(value, min, max))
            throw new InException("The value must not be more than or equal to the min and not be less than or equal to the max");
        return value;
    }

    /**
     * @throws InException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static byte notIn(final byte value, final byte min, final byte max, final String name, final String _name, final String __name) throws InException {
        if (Objects.notIn(value, min, max))
            throw new NotInException("The " + name + " must not be more than or equal to the " + _name + " and not be less than or equal to the " + __name);
        return value;
    }

    /**
     * @throws InException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static short notIn(final short value, final short min, final short max, final String name, final String _name, final String __name) throws InException {
        if (Objects.notIn(value, min, max))
            throw new NotInException("The " + name + " must not be more than or equal to the " + _name + " and not be less than or equal to the " + __name);
        return value;
    }

    /**
     * @throws InException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static int notIn(final int value, final int min, final int max, final String name, final String _name, final String __name) throws InException {
        if (Objects.notIn(value, min, max))
            throw new NotInException("The " + name + " must not be more than or equal to the " + _name + " and not be less than or equal to the " + __name);
        return value;
    }

    /**
     * @throws InException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static long notIn(final long value, final long min, final float max, final String name, final String _name, final String __name) throws InException {
        if (Objects.notIn(value, min, max))
            throw new NotInException("The " + name + " must not be more than or equal to the " + _name + " and not be less than or equal to the " + __name);
        return value;
    }

    /**
     * @throws InException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static float notIn(final float value, final float min, final float max, final String name, final String _name, final String __name) throws InException {
        if (Objects.notIn(value, min, max))
            throw new NotInException("The " + name + " must not be more than or equal to the " + _name + " and not be less than or equal to the " + __name);
        return value;
    }

    /**
     * @throws InException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static double notIn(final byte value, final double min, final double max, final String name, final String _name, final String __name) throws InException {
        if (Objects.notIn(value, min, max))
            throw new NotInException("The " + name + " must not be more than or equal to the " + _name + " and not be less than or equal to the " + __name);
        return value;
    }

    /**
     * @throws InException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static byte notInX(final byte value, final byte min, final byte max, final String message) throws InException {
        if (Objects.in(value, min, max))
            throw new InException(message);
        return value;
    }

    /**
     * @throws InException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static short notInX(final short value, final short min, final short max, final String message) throws InException {
        if (Objects.in(value, min, max))
            throw new InException(message);
        return value;
    }

    /**
     * @throws InException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static int notInX(final int value, final int min, final int max, final String message) throws InException {
        if (Objects.in(value, min, max))
            throw new InException(message);
        return value;
    }

    /**
     * @throws InException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static long notInX(final long value, final long min, final float max, final String message) throws InException {
        if (Objects.in(value, min, max))
            throw new InException(message);
        return value;
    }

    /**
     * @throws InException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static float notInX(final float value, final float min, final float max, final String message) throws InException {
        if (Objects.in(value, min, max))
            throw new InException(message);
        return value;
    }

    /**
     * @throws InException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static double notInX(final double value, final double min, final double max, final String message) throws InException {
        if (Objects.in(value, min, max))
            throw new InException(message);
        return value;
    }

    /**
     * @throws InException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static byte notInX(final byte value, final byte min, final byte max, final Throwable cause) throws InException {
        if (Objects.in(value, min, max))
            throw new InException(cause);
        return value;
    }

    /**
     * @throws InException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static short notInX(final short value, final short min, final short max, final Throwable cause) throws InException {
        if (Objects.in(value, min, max))
            throw new InException(cause);
        return value;
    }

    /**
     * @throws InException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static int notInX(final int value, final int min, final int max, final Throwable cause) throws InException {
        if (Objects.in(value, min, max))
            throw new InException(cause);
        return value;
    }

    /**
     * @throws InException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static long notInX(final long value, final long min, final float max, final Throwable cause) throws InException {
        if (Objects.in(value, min, max))
            throw new InException(cause);
        return value;
    }

    /**
     * @throws InException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static float notInX(final float value, final float min, final float max, final Throwable cause) throws InException {
        if (Objects.in(value, min, max))
            throw new InException(cause);
        return value;
    }

    /**
     * @throws InException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static double notInX(final double value, final double min, final double max, final Throwable cause) throws InException {
        if (Objects.in(value, min, max))
            throw new InException(cause);
        return value;
    }

    /**
     * @throws InException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static byte notInX(final byte value, final byte min, final byte max, final String message, final Throwable cause) throws InException {
        if (Objects.in(value, min, max))
            throw new InException(message, cause);
        return value;
    }

    /**
     * @throws InException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static short notInX(final short value, final short min, final short max, final String message, final Throwable cause) throws InException {
        if (Objects.in(value, min, max))
            throw new InException(message, cause);
        return value;
    }

    /**
     * @throws InException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static int notInX(final int value, final int min, final int max, final String message, final Throwable cause) throws InException {
        if (Objects.in(value, min, max))
            throw new InException(message, cause);
        return value;
    }

    /**
     * @throws InException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static long notInX(final long value, final long min, final float max, final String message, final Throwable cause) throws InException {
        if (Objects.in(value, min, max))
            throw new InException(message, cause);
        return value;
    }

    /**
     * @throws InException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static float notInX(final float value, final float min, final float max, final String message, final Throwable cause) throws InException {
        if (Objects.in(value, min, max))
            throw new InException(message, cause);
        return value;
    }

    /**
     * @throws InException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static double notInX(final double value, final double min, final double max, final String message, final Throwable cause) throws InException {
        if (Objects.in(value, min, max))
            throw new InException(message, cause);
        return value;
    }

    /**
     * @throws InException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static byte notInX(final byte value, final byte min, final byte max, final String message, final Throwable cause, final boolean suppressed, final boolean writable) throws InException {
        if (Objects.in(value, min, max))
            throw new InException(message, cause, suppressed, writable);
        return value;
    }

    /**
     * @throws InException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static short notInX(final short value, final short min, final short max, final String message, final Throwable cause, final boolean suppressed, final boolean writable) throws InException {
        if (Objects.in(value, min, max))
            throw new InException(message, cause, suppressed, writable);
        return value;
    }

    /**
     * @throws InException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static int notInX(final int value, final int min, final int max, final String message, final Throwable cause, final boolean suppressed, final boolean writable) throws InException {
        if (Objects.in(value, min, max))
            throw new InException(message, cause, suppressed, writable);
        return value;
    }

    /**
     * @throws InException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static long notInX(final long value, final long min, final float max, final String message, final Throwable cause, final boolean suppressed, final boolean writable) throws InException {
        if (Objects.in(value, min, max))
            throw new InException(message, cause, suppressed, writable);
        return value;
    }

    /**
     * @throws InException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static float notInX(final float value, final float min, final float max, final String message, final Throwable cause, final boolean suppressed, final boolean writable) throws InException {
        if (Objects.in(value, min, max))
            throw new InException(message, cause, suppressed, writable);
        return value;
    }

    /**
     * @throws InException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static double notInX(final double value, final double min, final double max, final String message, final Throwable cause, final boolean suppressed, final boolean writable) throws InException {
        if (Objects.in(value, min, max))
            throw new InException(message, cause, suppressed, writable);
        return value;
    }

    /**
     * @throws NotOutException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static byte out(final byte value, final byte min, final byte max) throws NotOutException {
        if (Objects.notOut(value, min, max))
            throw new NotOutException("The value must be less than the min or more than the max");
        return value;
    }

    /**
     * @throws NotOutException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static short out(final short value, final short min, final short max) throws NotOutException {
        if (Objects.notOut(value, min, max))
            throw new NotOutException("The value must be less than the min or more than the max");
        return value;
    }

    /**
     * @throws NotOutException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static int out(final int value, final int min, final int max) throws NotOutException {
        if (Objects.notOut(value, min, max))
            throw new NotOutException("The value must be less than the min or more than the max");
        return value;
    }

    /**
     * @throws NotOutException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static long out(final long value, final long min, final long max) throws NotOutException {
        if (Objects.notOut(value, min, max))
            throw new NotOutException("The value must be less than the min or more than the max");
        return value;
    }

    /**
     * @throws NotOutException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static float out(final float value, final float min, final float max) throws NotOutException {
        if (Objects.notOut(value, min, max))
            throw new NotOutException("The value must be less than the min or more than the max");
        return value;
    }

    /**
     * @throws NotOutException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static double out(final byte value, final double min, final double max) throws NotOutException {
        if (Objects.notOut(value, min, max))
            throw new NotOutException("The value must be less than the min or more than the max");
        return value;
    }

    /**
     * @throws NotOutException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static byte out(final byte value, final byte min, final byte max, final String name, final String _name, final String __name) throws NotOutException {
        if (Objects.notOut(value, min, max))
            throw new NotOutException("The " + name + " must be less than the " + _name + " or more than the " + __name);
        return value;
    }

    /**
     * @throws NotOutException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static short out(final short value, final short min, final short max, final String name, final String _name, final String __name) throws NotOutException {
        if (Objects.notOut(value, min, max))
            throw new NotOutException("The " + name + " must be less than the " + _name + " or more than the " + __name);
        return value;
    }

    /**
     * @throws NotOutException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static int out(final int value, final int min, final int max, final String name, final String _name, final String __name) throws NotOutException {
        if (Objects.notOut(value, min, max))
            throw new NotOutException("The " + name + " must be less than the " + _name + " or more than the " + __name);
        return value;
    }

    /**
     * @throws NotOutException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static long out(final long value, final long min, final long max, final String name, final String _name, final String __name) throws NotOutException {
        if (Objects.notOut(value, min, max))
            throw new NotOutException("The " + name + " must be less than the " + _name + " or more than the " + __name);
        return value;
    }

    /**
     * @throws NotOutException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static float out(final float value, final float min, final float max, final String name, final String _name, final String __name) throws NotOutException {
        if (Objects.notOut(value, min, max))
            throw new NotOutException("The " + name + " must be less than the " + _name + " or more than the " + __name);
        return value;
    }

    /**
     * @throws NotOutException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static double out(final byte value, final double min, final double max, final String name, final String _name, final String __name) throws NotOutException {
        if (Objects.notOut(value, min, max))
            throw new NotOutException("The " + name + " must be less than the " + _name + " or more than the " + __name);
        return value;
    }

    /**
     * @throws NotOutException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static byte outX(final byte value, final byte min, final byte max, final String message) throws NotOutException {
        if (Objects.notOut(value, min, max))
            throw new NotOutException(message);
        return value;
    }

    /**
     * @throws NotOutException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static short outX(final short value, final short min, final short max, final String message) throws NotOutException {
        if (Objects.notOut(value, min, max))
            throw new NotOutException(message);
        return value;
    }

    /**
     * @throws NotOutException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static int outX(final int value, final int min, final int max, final String message) throws NotOutException {
        if (Objects.notOut(value, min, max))
            throw new NotOutException(message);
        return value;
    }

    /**
     * @throws NotOutException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static long outX(final long value, final long min, final float max, final String message) throws NotOutException {
        if (Objects.notOut(value, min, max))
            throw new NotOutException(message);
        return value;
    }

    /**
     * @throws NotOutException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static float outX(final float value, final float min, final float max, final String message) throws NotOutException {
        if (Objects.notOut(value, min, max))
            throw new NotOutException(message);
        return value;
    }

    /**
     * @throws NotOutException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static double outX(final double value, final double min, final double max, final String message) throws NotOutException {
        if (Objects.notOut(value, min, max))
            throw new NotOutException(message);
        return value;
    }

    /**
     * @throws NotOutException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static byte outX(final byte value, final byte min, final byte max, final Throwable cause) throws NotOutException {
        if (Objects.notOut(value, min, max))
            throw new NotOutException(cause);
        return value;
    }

    /**
     * @throws NotOutException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static short outX(final short value, final short min, final short max, final Throwable cause) throws NotOutException {
        if (Objects.notOut(value, min, max))
            throw new NotOutException(cause);
        return value;
    }

    /**
     * @throws NotOutException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static int outX(final int value, final int min, final int max, final Throwable cause) throws NotOutException {
        if (Objects.notOut(value, min, max))
            throw new NotOutException(cause);
        return value;
    }

    /**
     * @throws NotOutException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static long outX(final long value, final long min, final float max, final Throwable cause) throws NotOutException {
        if (Objects.notOut(value, min, max))
            throw new NotOutException(cause);
        return value;
    }

    /**
     * @throws NotOutException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static float outX(final float value, final float min, final float max, final Throwable cause) throws NotOutException {
        if (Objects.notOut(value, min, max))
            throw new NotOutException(cause);
        return value;
    }

    /**
     * @throws NotOutException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static double outX(final double value, final double min, final double max, final Throwable cause) throws NotOutException {
        if (Objects.notOut(value, min, max))
            throw new NotOutException(cause);
        return value;
    }

    /**
     * @throws NotOutException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static byte outX(final byte value, final byte min, final byte max, final String message, final Throwable cause) throws NotOutException {
        if (Objects.notOut(value, min, max))
            throw new NotOutException(message, cause);
        return value;
    }

    /**
     * @throws NotOutException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static short outX(final short value, final short min, final short max, final String message, final Throwable cause) throws NotOutException {
        if (Objects.notOut(value, min, max))
            throw new NotOutException(message, cause);
        return value;
    }

    /**
     * @throws NotOutException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static int outX(final int value, final int min, final int max, final String message, final Throwable cause) throws NotOutException {
        if (Objects.notOut(value, min, max))
            throw new NotOutException(message, cause);
        return value;
    }

    /**
     * @throws NotOutException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static long outX(final long value, final long min, final float max, final String message, final Throwable cause) throws NotOutException {
        if (Objects.notOut(value, min, max))
            throw new NotOutException(message, cause);
        return value;
    }

    /**
     * @throws NotOutException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static float outX(final float value, final float min, final float max, final String message, final Throwable cause) throws NotOutException {
        if (Objects.notOut(value, min, max))
            throw new NotOutException(message, cause);
        return value;
    }

    /**
     * @throws NotOutException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static double outX(final double value, final double min, final double max, final String message, final Throwable cause) throws NotOutException {
        if (Objects.notOut(value, min, max))
            throw new NotOutException(message, cause);
        return value;
    }

    /**
     * @throws NotOutException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static byte outX(final byte value, final byte min, final byte max, final String message, final Throwable cause, final boolean suppressed, final boolean writable) throws NotOutException {
        if (Objects.notOut(value, min, max))
            throw new NotOutException(message, cause, suppressed, writable);
        return value;
    }

    /**
     * @throws NotOutException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static short outX(final short value, final short min, final short max, final String message, final Throwable cause, final boolean suppressed, final boolean writable) throws NotOutException {
        if (Objects.notOut(value, min, max))
            throw new NotOutException(message, cause, suppressed, writable);
        return value;
    }

    /**
     * @throws NotOutException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static int outX(final int value, final int min, final int max, final String message, final Throwable cause, final boolean suppressed, final boolean writable) throws NotOutException {
        if (Objects.notOut(value, min, max))
            throw new NotOutException(message, cause, suppressed, writable);
        return value;
    }

    /**
     * @throws NotOutException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static long outX(final long value, final long min, final float max, final String message, final Throwable cause, final boolean suppressed, final boolean writable) throws NotOutException {
        if (Objects.notOut(value, min, max))
            throw new NotOutException(message, cause, suppressed, writable);
        return value;
    }

    /**
     * @throws NotOutException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static float outX(final float value, final float min, final float max, final String message, final Throwable cause, final boolean suppressed, final boolean writable) throws NotOutException {
        if (Objects.notOut(value, min, max))
            throw new NotOutException(message, cause, suppressed, writable);
        return value;
    }

    /**
     * @throws NotOutException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static double outX(final double value, final double min, final double max, final String message, final Throwable cause, final boolean suppressed, final boolean writable) throws NotOutException {
        if (Objects.notOut(value, min, max))
            throw new NotOutException(message, cause, suppressed, writable);
        return value;
    }

    /**
     * @throws OutException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static byte notOut(final byte value, final byte min, final byte max) throws OutException {
        if (Objects.out(value, min, max))
            throw new OutException("The value must not be less than the min and not be more than the max");
        return value;
    }

    /**
     * @throws OutException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static short notOut(final short value, final short min, final short max) throws OutException {
        if (Objects.out(value, min, max))
            throw new OutException("The value must not be less than the min and not be more than the max");
        return value;
    }

    /**
     * @throws OutException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static int notOut(final int value, final int min, final int max) throws OutException {
        if (Objects.out(value, min, max))
            throw new OutException("The value must not be less than the min and not be more than the max");
        return value;
    }

    /**
     * @throws OutException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static long notOut(final long value, final long min, final long max) throws OutException {
        if (Objects.out(value, min, max))
            throw new OutException("The value must not be less than the min and not be more than the max");
        return value;
    }

    /**
     * @throws OutException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static float notOut(final float value, final float min, final float max) throws OutException {
        if (Objects.out(value, min, max))
            throw new OutException("The value must not be less than the min and not be more than the max");
        return value;
    }

    /**
     * @throws OutException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static double notOut(final byte value, final double min, final double max) throws OutException {
        if (Objects.out(value, min, max))
            throw new OutException("The value must not be less than the min and not be more than the max");
        return value;
    }

    /**
     * @throws OutException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static byte notOut(final byte value, final byte min, final byte max, final String name, final String _name, final String __name) throws OutException {
        if (Objects.out(value, min, max))
            throw new OutException("The " + name + " must not be less than the " + _name + " and not be more than the " + __name);
        return value;
    }

    /**
     * @throws OutException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static short notOut(final short value, final short min, final short max, final String name, final String _name, final String __name) throws OutException {
        if (Objects.out(value, min, max))
            throw new OutException("The " + name + " must not be less than the " + _name + " and not be more than the " + __name);
        return value;
    }

    /**
     * @throws OutException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static int notOut(final int value, final int min, final int max, final String name, final String _name, final String __name) throws OutException {
        if (Objects.out(value, min, max))
            throw new OutException("The " + name + " must not be less than the " + _name + " and not be more than the " + __name);
        return value;
    }

    /**
     * @throws OutException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static long notOut(final long value, final long min, final long max, final String name, final String _name, final String __name) throws OutException {
        if (Objects.out(value, min, max))
            throw new OutException("The " + name + " must not be less than the " + _name + " and not be more than the " + __name);
        return value;
    }

    /**
     * @throws OutException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static float notOut(final float value, final float min, final float max, final String name, final String _name, final String __name) throws OutException {
        if (Objects.out(value, min, max))
            throw new OutException("The " + name + " must not be less than the " + _name + " and not be more than the " + __name);
        return value;
    }

    /**
     * @throws OutException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static double notOut(final byte value, final double min, final double max, final String name, final String _name, final String __name) throws OutException {
        if (Objects.out(value, min, max))
            throw new OutException("The " + name + " must not be less than the " + _name + " and not be more than the " + __name);
        return value;
    }

    /**
     * @throws OutException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static byte notOutX(final byte value, final byte min, final byte max, final String message) throws OutException {
        if (Objects.out(value, min, max))
            throw new OutException(message);
        return value;
    }

    /**
     * @throws OutException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static short notOutX(final short value, final short min, final short max, final String message) throws OutException {
        if (Objects.out(value, min, max))
            throw new OutException(message);
        return value;
    }

    /**
     * @throws OutException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static int notOutX(final int value, final int min, final int max, final String message) throws OutException {
        if (Objects.out(value, min, max))
            throw new OutException(message);
        return value;
    }

    /**
     * @throws OutException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static long notOutX(final long value, final long min, final long max, final String message) throws OutException {
        if (Objects.out(value, min, max))
            throw new OutException(message);
        return value;
    }

    /**
     * @throws OutException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static float notOutX(final float value, final float min, final float max, final String message) throws OutException {
        if (Objects.out(value, min, max))
            throw new OutException(message);
        return value;
    }

    /**
     * @throws OutException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static double notOutX(final double value, final double min, final double max, final String message) throws OutException {
        if (Objects.out(value, min, max))
            throw new OutException(message);
        return value;
    }

    /**
     * @throws OutException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static byte notOutX(final byte value, final byte min, final byte max, final Throwable cause) throws OutException {
        if (Objects.out(value, min, max))
            throw new OutException(cause);
        return value;
    }

    /**
     * @throws OutException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static short notOutX(final short value, final short min, final short max, final Throwable cause) throws OutException {
        if (Objects.out(value, min, max))
            throw new OutException(cause);
        return value;
    }

    /**
     * @throws OutException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static int notOutX(final int value, final int min, final int max, final Throwable cause) throws OutException {
        if (Objects.out(value, min, max))
            throw new OutException(cause);
        return value;
    }

    /**
     * @throws OutException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static long notOutX(final long value, final long min, final long max, final Throwable cause) throws OutException {
        if (Objects.out(value, min, max))
            throw new OutException(cause);
        return value;
    }

    /**
     * @throws OutException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static float notOutX(final float value, final float min, final float max, final Throwable cause) throws OutException {
        if (Objects.out(value, min, max))
            throw new OutException(cause);
        return value;
    }

    /**
     * @throws OutException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static double notOutX(final double value, final double min, final double max, final Throwable cause) throws OutException {
        if (Objects.out(value, min, max))
            throw new OutException(cause);
        return value;
    }

    /**
     * @throws OutException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static byte notOutX(final byte value, final byte min, final byte max, final String message, final Throwable cause) throws OutException {
        if (Objects.out(value, min, max))
            throw new OutException(message, cause);
        return value;
    }

    /**
     * @throws OutException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static short notOutX(final short value, final short min, final short max, final String message, final Throwable cause) throws OutException {
        if (Objects.out(value, min, max))
            throw new OutException(message, cause);
        return value;
    }

    /**
     * @throws OutException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static int notOutX(final int value, final int min, final int max, final String message, final Throwable cause) throws OutException {
        if (Objects.out(value, min, max))
            throw new OutException(message, cause);
        return value;
    }

    /**
     * @throws OutException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static long notOutX(final long value, final long min, final long max, final String message, final Throwable cause) throws OutException {
        if (Objects.out(value, min, max))
            throw new OutException(message, cause);
        return value;
    }

    /**
     * @throws OutException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static float notOutX(final float value, final float min, final float max, final String message, final Throwable cause) throws OutException {
        if (Objects.out(value, min, max))
            throw new OutException(message, cause);
        return value;
    }

    /**
     * @throws OutException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static double notOutX(final double value, final double min, final double max, final String message, final Throwable cause) throws OutException {
        if (Objects.out(value, min, max))
            throw new OutException(message, cause);
        return value;
    }

    /**
     * @throws OutException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static byte notOutX(final byte value, final byte min, final byte max, final String message, final Throwable cause, final boolean suppressed, final boolean writable) throws OutException {
        if (Objects.out(value, min, max))
            throw new OutException(message, cause, suppressed, writable);
        return value;
    }

    /**
     * @throws OutException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static short notOutX(final short value, final short min, final short max, final String message, final Throwable cause, final boolean suppressed, final boolean writable) throws OutException {
        if (Objects.out(value, min, max))
            throw new OutException(message, cause, suppressed, writable);
        return value;
    }

    /**
     * @throws OutException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static int notOutX(final int value, final int min, final int max, final String message, final Throwable cause, final boolean suppressed, final boolean writable) throws OutException {
        if (Objects.out(value, min, max))
            throw new OutException(message, cause, suppressed, writable);
        return value;
    }

    /**
     * @throws OutException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static long notOutX(final long value, final long min, final long max, final String message, final Throwable cause, final boolean suppressed, final boolean writable) throws OutException {
        if (Objects.out(value, min, max))
            throw new OutException(message, cause, suppressed, writable);
        return value;
    }

    /**
     * @throws OutException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static float notOutX(final float value, final float min, final float max, final String message, final Throwable cause, final boolean suppressed, final boolean writable) throws OutException {
        if (Objects.out(value, min, max))
            throw new OutException(message, cause, suppressed, writable);
        return value;
    }

    /**
     * @throws OutException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static double notOutX(final double value, final double min, final double max, final String message, final Throwable cause, final boolean suppressed, final boolean writable) throws OutException {
        if (Objects.out(value, min, max))
            throw new OutException(message, cause, suppressed, writable);
        return value;
    }

}
