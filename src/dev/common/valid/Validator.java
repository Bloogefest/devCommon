package dev.common.valid;

import dev.common.base.CreationError;
import dev.common.base.OldObjects;

/**
 * @author Bloogefest
 * @version 1.2
 * @apiNote Not specified
 * @since 1.0.0
 */
@Deprecated
public final class Validator {

    /**
     * @throws CreationError Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.0
     */
    private Validator() throws CreationError {
        throw new CreationError();
    }

    /**
     * @param <T>    Not specified
     * @param object Not specified
     * @return Not specified
     * @throws NotNullException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static <T> T isNull(final T object) throws NotNullException {
        if (OldObjects.notNull(object))
            throw new NotNullException("The object must be null");
        return null;
    }

    /**
     * @param <T>    Not specified
     * @param object Not specified
     * @param name   Not specified
     * @return Not specified
     * @throws NotNullException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static <T> T isNull(final T object, final String name) throws NotNullException {
        if (OldObjects.notNull(object))
            throw new NotNullException("The " + name + " must be null");
        return null;
    }

    /**
     * @param <T>     Not specified
     * @param object  Not specified
     * @param message Not specified
     * @return Not specified
     * @throws NotNullException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static <T> T isNullX(final T object, final String message) throws NotNullException {
        if (OldObjects.notNull(object))
            throw new NotNullException(message);
        return null;
    }

    /**
     * @param <T>    Not specified
     * @param object Not specified
     * @param cause  Not specified
     * @return Not specified
     * @throws NotNullException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static <T> T isNullX(final T object, final Throwable cause) throws NotNullException {
        if (OldObjects.notNull(object))
            throw new NotNullException(cause);
        return null;
    }

    /**
     * @param <T>     Not specified
     * @param object  Not specified
     * @param message Not specified
     * @param cause   Not specified
     * @return Not specified
     * @throws NotNullException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static <T> T isNullX(final T object, final String message, final Throwable cause) throws NotNullException {
        if (OldObjects.notNull(object))
            throw new NotNullException(message, cause);
        return null;
    }

    /**
     * @param <T>        Not specified
     * @param object     Not specified
     * @param message    Not specified
     * @param cause      Not specified
     * @param suppressed Not specified
     * @param writable   Not specified
     * @return Not specified
     * @throws NotNullException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static <T> T isNullX(final T object, final String message, final Throwable cause, final boolean suppressed, final boolean writable) throws NotNullException {
        if (OldObjects.notNull(object))
            throw new NotNullException(message, cause, suppressed, writable);
        return null;
    }

    /**
     * @param <T>    Not specified
     * @param object Not specified
     * @return Not specified
     * @throws NullException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static <T> T notNull(final T object) throws NullException {
        if (OldObjects.isNull(object))
            throw new NullException("The object must not be null");
        return object;
    }

    /**
     * @param <T>    Not specified
     * @param object Not specified
     * @param name   Not specified
     * @return Not specified
     * @throws NullException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static <T> T notNull(final T object, final String name) throws NullException {
        if (OldObjects.isNull(object))
            throw new NullException("The " + name + " must not be null");
        return object;
    }

    /**
     * @param <T>     Not specified
     * @param object  Not specified
     * @param message Not specified
     * @return Not specified
     * @throws NullException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static <T> T notNullX(final T object, final String message) throws NullException {
        if (OldObjects.isNull(object))
            throw new NullException(message);
        return object;
    }

    /**
     * @param <T>    Not specified
     * @param object Not specified
     * @param cause  Not specified
     * @return Not specified
     * @throws NullException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static <T> T notNullX(final T object, final Throwable cause) throws NullException {
        if (OldObjects.isNull(object))
            throw new NullException(cause);
        return object;
    }

    /**
     * @param <T>     Not specified
     * @param object  Not specified
     * @param message Not specified
     * @param cause   Not specified
     * @return Not specified
     * @throws NullException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static <T> T notNullX(final T object, final String message, final Throwable cause) throws NullException {
        if (OldObjects.isNull(object))
            throw new NullException(message, cause);
        return object;
    }

    /**
     * @param <T>        Not specified
     * @param object     Not specified
     * @param message    Not specified
     * @param cause      Not specified
     * @param suppressed Not specified
     * @param writable   Not specified
     * @return Not specified
     * @throws NullException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static <T> T notNullX(final T object, final String message, final Throwable cause, final boolean suppressed, final boolean writable) throws NullException {
        if (OldObjects.isNull(object))
            throw new NullException(message, cause, suppressed, writable);
        return object;
    }

    /**
     * @param value  Not specified
     * @param _value Not specified
     * @return Not specified
     * @throws NotEqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static boolean equals(final boolean value, final boolean _value) throws NotEqualException {
        if (OldObjects.notEquals(value, _value))
            throw new NotEqualException("The value must be equal to the _value");
        return value;
    }

    /**
     * @param value  Not specified
     * @param _value Not specified
     * @return Not specified
     * @throws NotEqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static byte equals(final byte value, final byte _value) throws NotEqualException {
        if (OldObjects.notEquals(value, _value))
            throw new NotEqualException("The value must be equal to the _value");
        return value;
    }

    /**
     * @param value  Not specified
     * @param _value Not specified
     * @return Not specified
     * @throws NotEqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static short equals(final short value, final short _value) throws NotEqualException {
        if (OldObjects.notEquals(value, _value))
            throw new NotEqualException("The value must be equal to the _value");
        return value;
    }

    /**
     * @param value  Not specified
     * @param _value Not specified
     * @return Not specified
     * @throws NotEqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static int equals(final int value, final int _value) throws NotEqualException {
        if (OldObjects.notEquals(value, _value))
            throw new NotEqualException("The value must be equal to the _value");
        return value;
    }

    /**
     * @param value  Not specified
     * @param _value Not specified
     * @return Not specified
     * @throws NotEqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static long equals(final long value, final long _value) throws NotEqualException {
        if (OldObjects.notEquals(value, _value))
            throw new NotEqualException("The value must be equal to the _value");
        return value;
    }

    /**
     * @param value  Not specified
     * @param _value Not specified
     * @return Not specified
     * @throws NotEqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static float equals(final float value, final float _value) throws NotEqualException {
        if (OldObjects.notEquals(value, _value))
            throw new NotEqualException("The value must be equal to the _value");
        return value;
    }

    /**
     * @param value  Not specified
     * @param _value Not specified
     * @return Not specified
     * @throws NotEqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static double equals(final double value, final double _value) throws NotEqualException {
        if (OldObjects.notEquals(value, _value))
            throw new NotEqualException("The value must be equal to the _value");
        return value;
    }

    /**
     * @param <T>     Not specified
     * @param object  Not specified
     * @param _object Not specified
     * @return Not specified
     * @throws NotEqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static <T> T equals(final T object, final Object _object) throws NotEqualException {
        if (OldObjects.notEquals(object, _object))
            throw new NotEqualException("The object must be equal to the _object");
        return object;
    }

    /**
     * @param value  Not specified
     * @param _value Not specified
     * @param name   Not specified
     * @param _name  Not specified
     * @return Not specified
     * @throws NotEqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static boolean equals(final boolean value, final boolean _value, final String name, final String _name) throws NotEqualException {
        if (OldObjects.notEquals(value, _value))
            throw new NotEqualException("The " + name + " must be equal to the " + _name);
        return value;
    }

    /**
     * @param value  Not specified
     * @param _value Not specified
     * @param name   Not specified
     * @param _name  Not specified
     * @return Not specified
     * @throws NotEqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static byte equals(final byte value, final byte _value, final String name, final String _name) throws NotEqualException {
        if (OldObjects.notEquals(value, _value))
            throw new NotEqualException("The " + name + " must be equal to the " + _name);
        return value;
    }

    /**
     * @param value  Not specified
     * @param _value Not specified
     * @param name   Not specified
     * @param _name  Not specified
     * @return Not specified
     * @throws NotEqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static short equals(final short value, final short _value, final String name, final String _name) throws NotEqualException {
        if (OldObjects.notEquals(value, _value))
            throw new NotEqualException("The " + name + " must be equal to the " + _name);
        return value;
    }

    /**
     * @param value  Not specified
     * @param _value Not specified
     * @param name   Not specified
     * @param _name  Not specified
     * @return Not specified
     * @throws NotEqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static int equals(final int value, final int _value, final String name, final String _name) throws NotEqualException {
        if (OldObjects.notEquals(value, _value))
            throw new NotEqualException("The " + name + " must be equal to the " + _name);
        return value;
    }

    /**
     * @param value  Not specified
     * @param _value Not specified
     * @param name   Not specified
     * @param _name  Not specified
     * @return Not specified
     * @throws NotEqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static long equals(final long value, final long _value, final String name, final String _name, final String __name) throws NotEqualException {
        if (OldObjects.notEquals(value, _value))
            throw new NotEqualException("The " + name + " must be equal to the " + _name);
        return value;
    }

    /**
     * @param value  Not specified
     * @param _value Not specified
     * @param name   Not specified
     * @param _name  Not specified
     * @return Not specified
     * @throws NotEqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static float equals(final float value, final float _value, final String name, final String _name) throws NotEqualException {
        if (OldObjects.notEquals(value, _value))
            throw new NotEqualException("The " + name + " must be equal to the " + _name);
        return value;
    }

    /**
     * @param value  Not specified
     * @param _value Not specified
     * @param name   Not specified
     * @param _name  Not specified
     * @return Not specified
     * @throws NotEqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static double equals(final double value, final double _value, final String name, final String _name) throws NotEqualException {
        if (OldObjects.notEquals(value, _value))
            throw new NotEqualException("The " + name + " must be equal to the " + _name);
        return value;
    }

    /**
     * @param <T>     Not specified
     * @param object  Not specified
     * @param _object Not specified
     * @param name    Not specified
     * @param _name   Not specified
     * @return Not specified
     * @throws NotEqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static <T> T equals(final T object, final Object _object, final String name, final String _name) throws NotEqualException {
        if (OldObjects.notEquals(object, _object))
            throw new NotEqualException("The " + name + " must be equal to the " + _name);
        return object;
    }

    /**
     * @param value   Not specified
     * @param _value  Not specified
     * @param message Not specified
     * @return Not specified
     * @throws NotEqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static boolean equalsX(final boolean value, final boolean _value, final String message) throws NotEqualException {
        if (OldObjects.notEquals(value, _value))
            throw new NotEqualException(message);
        return value;
    }

    /**
     * @param value   Not specified
     * @param _value  Not specified
     * @param message Not specified
     * @return Not specified
     * @throws NotEqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static byte equalsX(final byte value, final byte _value, final String message) throws NotEqualException {
        if (OldObjects.notEquals(value, _value))
            throw new NotEqualException(message);
        return value;
    }

    /**
     * @param value   Not specified
     * @param _value  Not specified
     * @param message Not specified
     * @return Not specified
     * @throws NotEqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static short equalsX(final short value, final short _value, final String message) throws NotEqualException {
        if (OldObjects.notEquals(value, _value))
            throw new NotEqualException(message);
        return value;
    }

    /**
     * @param value   Not specified
     * @param _value  Not specified
     * @param message Not specified
     * @return Not specified
     * @throws NotEqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static int equalsX(final int value, final int _value, final String message) throws NotEqualException {
        if (OldObjects.notEquals(value, _value))
            throw new NotEqualException(message);
        return value;
    }

    /**
     * @param value   Not specified
     * @param _value  Not specified
     * @param message Not specified
     * @return Not specified
     * @throws NotEqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static long equalsX(final long value, final long _value, final String message) throws NotEqualException {
        if (OldObjects.notEquals(value, _value))
            throw new NotEqualException(message);
        return value;
    }

    /**
     * @param value   Not specified
     * @param _value  Not specified
     * @param message Not specified
     * @return Not specified
     * @throws NotEqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static float equalsX(final float value, final float _value, final String message) throws NotEqualException {
        if (OldObjects.notEquals(value, _value))
            throw new NotEqualException(message);
        return value;
    }

    /**
     * @param value   Not specified
     * @param _value  Not specified
     * @param message Not specified
     * @return Not specified
     * @throws NotEqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static double equalsX(final double value, final double _value, final String message) throws NotEqualException {
        if (OldObjects.notEquals(value, _value))
            throw new NotEqualException(message);
        return value;
    }

    /**
     * @param <T>     Not specified
     * @param object  Not specified
     * @param _object Not specified
     * @param message Not specified
     * @return Not specified
     * @throws NotEqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static <T> T equalsX(final T object, final Object _object, final String message) throws NotEqualException {
        if (OldObjects.notEquals(object, _object))
            throw new NotEqualException(message);
        return object;
    }

    /**
     * @param value  Not specified
     * @param _value Not specified
     * @param cause  Not specified
     * @return Not specified
     * @throws NotEqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static boolean equalsX(final boolean value, final boolean _value, Throwable cause) throws NotEqualException {
        if (OldObjects.notEquals(value, _value))
            throw new NotEqualException(cause);
        return value;
    }

    /**
     * @param value  Not specified
     * @param _value Not specified
     * @param cause  Not specified
     * @return Not specified
     * @throws NotEqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static byte equalsX(final byte value, final byte _value, final Throwable cause) throws NotEqualException {
        if (OldObjects.notEquals(value, _value))
            throw new NotEqualException(cause);
        return value;
    }

    /**
     * @param value  Not specified
     * @param _value Not specified
     * @param cause  Not specified
     * @return Not specified
     * @throws NotEqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static short equalsX(final short value, final short _value, Throwable cause) throws NotEqualException {
        if (OldObjects.notEquals(value, _value))
            throw new NotEqualException(cause);
        return value;
    }

    /**
     * @param value  Not specified
     * @param _value Not specified
     * @param cause  Not specified
     * @return Not specified
     * @throws NotEqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static int equalsX(final int value, final int _value, final Throwable cause) throws NotEqualException {
        if (OldObjects.notEquals(value, _value))
            throw new NotEqualException(cause);
        return value;
    }

    /**
     * @param value  Not specified
     * @param _value Not specified
     * @param cause  Not specified
     * @return Not specified
     * @throws NotEqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static long equalsX(final long value, final long _value, final Throwable cause) throws NotEqualException {
        if (OldObjects.notEquals(value, _value))
            throw new NotEqualException(cause);
        return value;
    }

    /**
     * @param value  Not specified
     * @param _value Not specified
     * @param cause  Not specified
     * @return Not specified
     * @throws NotEqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static float equalsX(final float value, final float _value, final Throwable cause) throws NotEqualException {
        if (OldObjects.notEquals(value, _value))
            throw new NotEqualException(cause);
        return value;
    }

    /**
     * @param value  Not specified
     * @param _value Not specified
     * @param cause  Not specified
     * @return Not specified
     * @throws NotEqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static double equalsX(final double value, final double _value, final Throwable cause) throws NotEqualException {
        if (OldObjects.notEquals(value, _value))
            throw new NotEqualException(cause);
        return value;
    }

    /**
     * @param <T>     Not specified
     * @param object  Not specified
     * @param _object Not specified
     * @param cause   Not specified
     * @return Not specified
     * @throws NotEqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static <T> T equalsX(final T object, final Object _object, final Throwable cause) throws NotEqualException {
        if (OldObjects.notEquals(object, _object))
            throw new NotEqualException(cause);
        return object;
    }

    /**
     * @param value   Not specified
     * @param _value  Not specified
     * @param message Not specified
     * @param cause   Not specified
     * @return Not specified
     * @throws NotEqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static boolean equalsX(final boolean value, final boolean _value, final String message, final Throwable cause) throws NotEqualException {
        if (OldObjects.notEquals(value, _value))
            throw new NotEqualException(message, cause);
        return value;
    }

    /**
     * @param value   Not specified
     * @param _value  Not specified
     * @param message Not specified
     * @param cause   Not specified
     * @return Not specified
     * @throws NotEqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static byte equalsX(final byte value, final byte _value, final String message, final Throwable cause) throws NotEqualException {
        if (OldObjects.notEquals(value, _value))
            throw new NotEqualException(message, cause);
        return value;
    }

    /**
     * @param value   Not specified
     * @param _value  Not specified
     * @param message Not specified
     * @param cause   Not specified
     * @return Not specified
     * @throws NotEqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static short equalsX(final short value, final short _value, final String message, final Throwable cause) throws NotEqualException {
        if (OldObjects.notEquals(value, _value))
            throw new NotEqualException(message, cause);
        return value;
    }

    /**
     * @param value   Not specified
     * @param _value  Not specified
     * @param message Not specified
     * @param cause   Not specified
     * @return Not specified
     * @throws NotEqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static int equalsX(final int value, final int _value, final String message, final Throwable cause) throws NotEqualException {
        if (OldObjects.notEquals(value, _value))
            throw new NotEqualException(message, cause);
        return value;
    }

    /**
     * @param value   Not specified
     * @param _value  Not specified
     * @param message Not specified
     * @param cause   Not specified
     * @return Not specified
     * @throws NotEqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static long equalsX(final long value, final long _value, final String message, final Throwable cause) throws NotEqualException {
        if (OldObjects.notEquals(value, _value))
            throw new NotEqualException(message, cause);
        return value;
    }

    /**
     * @param value   Not specified
     * @param _value  Not specified
     * @param message Not specified
     * @param cause   Not specified
     * @return Not specified
     * @throws NotEqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static float equalsX(final float value, final float _value, final String message, final Throwable cause) throws NotEqualException {
        if (OldObjects.notEquals(value, _value))
            throw new NotEqualException(message, cause);
        return value;
    }

    /**
     * @param value   Not specified
     * @param _value  Not specified
     * @param message Not specified
     * @param cause   Not specified
     * @return Not specified
     * @throws NotEqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static double equalsX(final double value, final double _value, final String message, final Throwable cause) throws NotEqualException {
        if (OldObjects.notEquals(value, _value))
            throw new NotEqualException(message, cause);
        return value;
    }

    /**
     * @param <T>     Not specified
     * @param object  Not specified
     * @param _object Not specified
     * @param message Not specified
     * @param cause   Not specified
     * @return Not specified
     * @throws NotEqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static <T> T equalsX(final T object, final Object _object, final String message, final Throwable cause) throws NotEqualException {
        if (OldObjects.notEquals(object, _object))
            throw new NotEqualException(message, cause);
        return object;
    }

    /**
     * @param value      Not specified
     * @param _value     Not specified
     * @param message    Not specified
     * @param cause      Not specified
     * @param suppressed Not specified
     * @param writable   Not specified
     * @return Not specified
     * @throws NotEqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static boolean equalsX(final boolean value, final boolean _value, final String message, final Throwable cause, final boolean suppressed, final boolean writable) throws NotEqualException {
        if (OldObjects.notEquals(value, _value))
            throw new NotEqualException(message, cause, suppressed, writable);
        return value;
    }

    /**
     * @param value      Not specified
     * @param _value     Not specified
     * @param message    Not specified
     * @param cause      Not specified
     * @param suppressed Not specified
     * @param writable   Not specified
     * @return Not specified
     * @throws NotEqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static byte equalsX(final byte value, final byte _value, final String message, final Throwable cause, final boolean suppressed, final boolean writable) throws NotEqualException {
        if (OldObjects.notEquals(value, _value))
            throw new NotEqualException(message, cause, suppressed, writable);
        return value;
    }

    /**
     * @param value      Not specified
     * @param _value     Not specified
     * @param message    Not specified
     * @param cause      Not specified
     * @param suppressed Not specified
     * @param writable   Not specified
     * @return Not specified
     * @throws NotEqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static short equalsX(final short value, final short _value, final String message, final Throwable cause, final boolean suppressed, final boolean writable) throws NotEqualException {
        if (OldObjects.notEquals(value, _value))
            throw new NotEqualException(message, cause, suppressed, writable);
        return value;
    }

    /**
     * @param value      Not specified
     * @param _value     Not specified
     * @param message    Not specified
     * @param cause      Not specified
     * @param suppressed Not specified
     * @param writable   Not specified
     * @return Not specified
     * @throws NotEqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static int equalsX(final int value, final int _value, final String message, final Throwable cause, final boolean suppressed, final boolean writable) throws NotEqualException {
        if (OldObjects.notEquals(value, _value))
            throw new NotEqualException(message, cause, suppressed, writable);
        return value;
    }

    /**
     * @param value      Not specified
     * @param _value     Not specified
     * @param message    Not specified
     * @param cause      Not specified
     * @param suppressed Not specified
     * @param writable   Not specified
     * @return Not specified
     * @throws NotEqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static long equalsX(final long value, final long _value, final String message, final Throwable cause, final boolean suppressed, final boolean writable) throws NotEqualException {
        if (OldObjects.notEquals(value, _value))
            throw new NotEqualException(message, cause, suppressed, writable);
        return value;
    }

    /**
     * @param value      Not specified
     * @param _value     Not specified
     * @param message    Not specified
     * @param cause      Not specified
     * @param suppressed Not specified
     * @param writable   Not specified
     * @return Not specified
     * @throws NotEqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static float equalsX(final float value, final float _value, final String message, final Throwable cause, final boolean suppressed, final boolean writable) throws NotEqualException {
        if (OldObjects.notEquals(value, _value))
            throw new NotEqualException(message, cause, suppressed, writable);
        return value;
    }

    /**
     * @param value      Not specified
     * @param _value     Not specified
     * @param message    Not specified
     * @param cause      Not specified
     * @param suppressed Not specified
     * @param writable   Not specified
     * @return Not specified
     * @throws NotEqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static double equalsX(final double value, final double _value, final String message, final Throwable cause, final boolean suppressed, final boolean writable) throws NotEqualException {
        if (OldObjects.notEquals(value, _value))
            throw new NotEqualException(message, cause, suppressed, writable);
        return value;
    }

    /**
     * @param <T>        Not specified
     * @param object     Not specified
     * @param _object    Not specified
     * @param message    Not specified
     * @param cause      Not specified
     * @param suppressed Not specified
     * @param writable   Not specified
     * @return Not specified
     * @throws NotEqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static <T> T equalsX(final T object, final Object _object, final String message, final Throwable cause, final boolean suppressed, final boolean writable) throws NotEqualException {
        if (OldObjects.notEquals(object, _object))
            throw new NotEqualException(message, cause, suppressed, writable);
        return object;
    }

    /**
     * @param value  Not specified
     * @param _value Not specified
     * @return Not specified
     * @throws EqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static boolean notEquals(final boolean value, final boolean _value) throws EqualException {
        if (OldObjects.equals(value, _value))
            throw new EqualException("The value must not be equal to the _value");
        return value;
    }

    /**
     * @param value  Not specified
     * @param _value Not specified
     * @return Not specified
     * @throws EqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static byte notEquals(final byte value, final byte _value) throws EqualException {
        if (OldObjects.equals(value, _value))
            throw new EqualException("The value must not be equal to the _value");
        return value;
    }

    /**
     * @param value  Not specified
     * @param _value Not specified
     * @return Not specified
     * @throws EqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static short notEquals(final short value, final short _value) throws EqualException {
        if (OldObjects.equals(value, _value))
            throw new EqualException("The value must not be equal to the _value");
        return value;
    }

    /**
     * @param value  Not specified
     * @param _value Not specified
     * @return Not specified
     * @throws EqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static int notEquals(final int value, final int _value) throws EqualException {
        if (OldObjects.equals(value, _value))
            throw new EqualException("The value must not be equal to the _value");
        return value;
    }

    /**
     * @param value  Not specified
     * @param _value Not specified
     * @return Not specified
     * @throws EqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static long notEquals(final long value, final long _value) throws EqualException {
        if (OldObjects.equals(value, _value))
            throw new EqualException("The value must not be equal to the _value");
        return value;
    }

    /**
     * @param value  Not specified
     * @param _value Not specified
     * @return Not specified
     * @throws EqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static float notEquals(final float value, final float _value) throws EqualException {
        if (OldObjects.equals(value, _value))
            throw new EqualException("The value must not be equal to the _value");
        return value;
    }

    /**
     * @param value  Not specified
     * @param _value Not specified
     * @return Not specified
     * @throws EqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static double notEquals(final double value, final double _value) throws EqualException {
        if (OldObjects.equals(value, _value))
            throw new EqualException("The value must not be equal to the _value");
        return value;
    }

    /**
     * @param <T>     Not specified
     * @param object  Not specified
     * @param _object Not specified
     * @return Not specified
     * @throws EqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static <T> T notEquals(final T object, final Object _object) throws EqualException {
        if (OldObjects.equals(object, _object))
            throw new EqualException("The object must not be equal to the _object");
        return object;
    }

    /**
     * @param value  Not specified
     * @param _value Not specified
     * @return Not specified
     * @throws EqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static boolean notEquals(final boolean value, final boolean _value, final String name, final String _name) throws EqualException {
        if (OldObjects.equals(value, _value))
            throw new EqualException("The " + name + " must not be equal to the " + _name);
        return value;
    }

    /**
     * @param value  Not specified
     * @param _value Not specified
     * @return Not specified
     * @throws EqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static byte notEquals(final byte value, final byte _value, final String name, final String _name) throws EqualException {
        if (OldObjects.equals(value, _value))
            throw new EqualException("The " + name + " must not be equal to the " + _name);
        return value;
    }

    /**
     * @param value  Not specified
     * @param _value Not specified
     * @return Not specified
     * @throws EqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static short notEquals(final short value, final short _value, final String name, final String _name) throws EqualException {
        if (OldObjects.equals(value, _value))
            throw new EqualException("The " + name + " must not be equal to the " + _name);
        return value;
    }

    /**
     * @param value  Not specified
     * @param _value Not specified
     * @return Not specified
     * @throws EqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static int notEquals(final int value, final int _value, final String name, final String _name) throws EqualException {
        if (OldObjects.equals(value, _value))
            throw new EqualException("The " + name + " must not be equal to the " + _name);
        return value;
    }

    /**
     * @param value  Not specified
     * @param _value Not specified
     * @return Not specified
     * @throws EqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static long notEquals(final long value, final long _value, final String name, final String _name, final String __name) throws EqualException {
        if (OldObjects.equals(value, _value))
            throw new EqualException("The " + name + " must not be equal to the " + _name);
        return value;
    }

    /**
     * @param value  Not specified
     * @param _value Not specified
     * @return Not specified
     * @throws EqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static float notEquals(final float value, final float _value, final String name, final String _name) throws EqualException {
        if (OldObjects.equals(value, _value))
            throw new EqualException("The " + name + " must not be equal to the " + _name);
        return value;
    }

    /**
     * @param value  Not specified
     * @param _value Not specified
     * @return Not specified
     * @throws EqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static double notEquals(final double value, final double _value, final String name, final String _name) throws EqualException {
        if (OldObjects.equals(value, _value))
            throw new EqualException("The " + name + " must not be equal to the " + _name);
        return value;
    }

    /**
     * @param <T>     Not specified
     * @param object  Not specified
     * @param _object Not specified
     * @return Not specified
     * @throws EqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static <T> T notEquals(final T object, final Object _object, final String name, final String _name) throws EqualException {
        if (OldObjects.equals(object, _object))
            throw new EqualException("The " + name + " must not be equal to the " + _name);
        return object;
    }

    /**
     * @param value   Not specified
     * @param _value  Not specified
     * @param message Not specified
     * @return Not specified
     * @throws EqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static boolean notEqualsX(final boolean value, final boolean _value, final String message) throws EqualException {
        if (OldObjects.equals(value, _value))
            throw new EqualException(message);
        return value;
    }

    /**
     * @param value   Not specified
     * @param _value  Not specified
     * @param message Not specified
     * @return Not specified
     * @throws EqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static byte notEqualsX(final byte value, final byte _value, final String message) throws EqualException {
        if (OldObjects.equals(value, _value))
            throw new EqualException(message);
        return value;
    }

    /**
     * @param value   Not specified
     * @param _value  Not specified
     * @param message Not specified
     * @return Not specified
     * @throws EqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static short notEqualsX(final short value, final short _value, final String message) throws EqualException {
        if (OldObjects.equals(value, _value))
            throw new EqualException(message);
        return value;
    }

    /**
     * @param value   Not specified
     * @param _value  Not specified
     * @param message Not specified
     * @return Not specified
     * @throws EqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static int notEqualsX(final int value, final int _value, final String message) throws EqualException {
        if (OldObjects.equals(value, _value))
            throw new EqualException(message);
        return value;
    }

    /**
     * @param value   Not specified
     * @param _value  Not specified
     * @param message Not specified
     * @return Not specified
     * @throws EqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static long notEqualsX(final long value, final long _value, final String message) throws EqualException {
        if (OldObjects.equals(value, _value))
            throw new EqualException(message);
        return value;
    }

    /**
     * @param value   Not specified
     * @param _value  Not specified
     * @param message Not specified
     * @return Not specified
     * @throws EqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static float notEqualsX(final float value, final float _value, final String message) throws EqualException {
        if (OldObjects.equals(value, _value))
            throw new EqualException(message);
        return value;
    }

    /**
     * @param value   Not specified
     * @param _value  Not specified
     * @param message Not specified
     * @return Not specified
     * @throws EqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static double notEqualsX(final double value, final double _value, final String message) throws EqualException {
        if (OldObjects.equals(value, _value))
            throw new EqualException(message);
        return value;
    }

    /**
     * @param <T>     Not specified
     * @param object  Not specified
     * @param _object Not specified
     * @param message Not specified
     * @return Not specified
     * @throws EqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static <T> T notEqualsX(final T object, final Object _object, final String message) throws EqualException {
        if (OldObjects.equals(object, _object))
            throw new EqualException(message);
        return object;
    }

    /**
     * @param value  Not specified
     * @param _value Not specified
     * @param cause  Not specified
     * @return Not specified
     * @throws EqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static boolean notEqualsX(final boolean value, final boolean _value, final Throwable cause) throws EqualException {
        if (OldObjects.equals(value, _value))
            throw new EqualException(cause);
        return value;
    }

    /**
     * @param value  Not specified
     * @param _value Not specified
     * @param cause  Not specified
     * @return Not specified
     * @throws EqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static byte notEqualsX(final byte value, final byte _value, final Throwable cause) throws EqualException {
        if (OldObjects.equals(value, _value))
            throw new EqualException(cause);
        return value;
    }

    /**
     * @param value  Not specified
     * @param _value Not specified
     * @param cause  Not specified
     * @return Not specified
     * @throws EqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static short notEqualsX(final short value, final short _value, final Throwable cause) throws EqualException {
        if (OldObjects.equals(value, _value))
            throw new EqualException(cause);
        return value;
    }

    /**
     * @param value  Not specified
     * @param _value Not specified
     * @param cause  Not specified
     * @return Not specified
     * @throws EqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static int notEqualsX(final int value, final int _value, final Throwable cause) throws EqualException {
        if (OldObjects.equals(value, _value))
            throw new EqualException(cause);
        return value;
    }

    /**
     * @param value  Not specified
     * @param _value Not specified
     * @param cause  Not specified
     * @return Not specified
     * @throws EqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static long notEqualsX(final long value, final long _value, final Throwable cause) throws EqualException {
        if (OldObjects.equals(value, _value))
            throw new EqualException(cause);
        return value;
    }

    /**
     * @param value  Not specified
     * @param _value Not specified
     * @param cause  Not specified
     * @return Not specified
     * @throws EqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static float notEqualsX(final float value, final float _value, final Throwable cause) throws EqualException {
        if (OldObjects.equals(value, _value))
            throw new EqualException(cause);
        return value;
    }

    /**
     * @param value  Not specified
     * @param _value Not specified
     * @param cause  Not specified
     * @return Not specified
     * @throws EqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static double notEqualsX(final double value, final double _value, final Throwable cause) throws EqualException {
        if (OldObjects.equals(value, _value))
            throw new EqualException(cause);
        return value;
    }

    /**
     * @param <T>     Not specified
     * @param object  Not specified
     * @param _object Not specified
     * @param cause   Not specified
     * @return Not specified
     * @throws EqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static <T> T notEqualsX(final T object, final Object _object, final Throwable cause) throws EqualException {
        if (OldObjects.equals(object, _object))
            throw new EqualException(cause);
        return object;
    }

    /**
     * @param value   Not specified
     * @param _value  Not specified
     * @param message Not specified
     * @param cause   Not specified
     * @return Not specified
     * @throws EqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static boolean notEqualsX(final boolean value, final boolean _value, final String message, final Throwable cause) throws EqualException {
        if (OldObjects.equals(value, _value))
            throw new EqualException(message, cause);
        return value;
    }

    /**
     * @param value   Not specified
     * @param _value  Not specified
     * @param message Not specified
     * @param cause   Not specified
     * @return Not specified
     * @throws EqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static byte notEqualsX(final byte value, final byte _value, final String message, final Throwable cause) throws EqualException {
        if (OldObjects.equals(value, _value))
            throw new EqualException(message, cause);
        return value;
    }

    /**
     * @param value   Not specified
     * @param _value  Not specified
     * @param message Not specified
     * @param cause   Not specified
     * @return Not specified
     * @throws EqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static short notEqualsX(final short value, final short _value, final String message, final Throwable cause) throws EqualException {
        if (OldObjects.equals(value, _value))
            throw new EqualException(message, cause);
        return value;
    }

    /**
     * @param value   Not specified
     * @param _value  Not specified
     * @param message Not specified
     * @param cause   Not specified
     * @return Not specified
     * @throws EqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static int notEqualsX(final int value, final int _value, final String message, final Throwable cause) throws EqualException {
        if (OldObjects.equals(value, _value))
            throw new EqualException(message, cause);
        return value;
    }

    /**
     * @param value   Not specified
     * @param _value  Not specified
     * @param message Not specified
     * @param cause   Not specified
     * @return Not specified
     * @throws EqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static long notEqualsX(final long value, final long _value, final String message, final Throwable cause) throws EqualException {
        if (OldObjects.equals(value, _value))
            throw new EqualException(message, cause);
        return value;
    }

    /**
     * @param value   Not specified
     * @param _value  Not specified
     * @param message Not specified
     * @param cause   Not specified
     * @return Not specified
     * @throws EqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static float notEqualsX(final float value, final float _value, final String message, final Throwable cause) throws EqualException {
        if (OldObjects.equals(value, _value))
            throw new EqualException(message, cause);
        return value;
    }

    /**
     * @param value   Not specified
     * @param _value  Not specified
     * @param message Not specified
     * @param cause   Not specified
     * @return Not specified
     * @throws EqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static double notEqualsX(final double value, final double _value, final String message, final Throwable cause) throws EqualException {
        if (OldObjects.equals(value, _value))
            throw new EqualException(message, cause);
        return value;
    }

    /**
     * @param <T>     Not specified
     * @param object  Not specified
     * @param _object Not specified
     * @param message Not specified
     * @param cause   Not specified
     * @return Not specified
     * @throws EqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static <T> T notEqualsX(final T object, final Object _object, final String message, final Throwable cause) throws EqualException {
        if (OldObjects.equals(object, _object))
            throw new EqualException(message, cause);
        return object;
    }

    /**
     * @param value      Not specified
     * @param _value     Not specified
     * @param message    Not specified
     * @param cause      Not specified
     * @param suppressed Not specified
     * @param writable   Not specified
     * @return Not specified
     * @throws EqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static boolean notEqualsX(final boolean value, final boolean _value, final String message, final Throwable cause, final boolean suppressed, final boolean writable) throws EqualException {
        if (OldObjects.equals(value, _value))
            throw new EqualException(message, cause, suppressed, writable);
        return value;
    }

    /**
     * @param value      Not specified
     * @param _value     Not specified
     * @param message    Not specified
     * @param cause      Not specified
     * @param suppressed Not specified
     * @param writable   Not specified
     * @return Not specified
     * @throws EqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static byte notEqualsX(final byte value, final byte _value, final String message, final Throwable cause, final boolean suppressed, final boolean writable) throws EqualException {
        if (OldObjects.equals(value, _value))
            throw new EqualException(message, cause, suppressed, writable);
        return value;
    }

    /**
     * @param value      Not specified
     * @param _value     Not specified
     * @param message    Not specified
     * @param cause      Not specified
     * @param suppressed Not specified
     * @param writable   Not specified
     * @return Not specified
     * @throws EqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static short notEqualsX(final short value, final short _value, final String message, final Throwable cause, final boolean suppressed, final boolean writable) throws EqualException {
        if (OldObjects.equals(value, _value))
            throw new EqualException(message, cause, suppressed, writable);
        return value;
    }

    /**
     * @param value      Not specified
     * @param _value     Not specified
     * @param message    Not specified
     * @param cause      Not specified
     * @param suppressed Not specified
     * @param writable   Not specified
     * @return Not specified
     * @throws EqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static int notEqualsX(final int value, final int _value, final String message, final Throwable cause, final boolean suppressed, final boolean writable) throws EqualException {
        if (OldObjects.equals(value, _value))
            throw new EqualException(message, cause, suppressed, writable);
        return value;
    }

    /**
     * @param value      Not specified
     * @param _value     Not specified
     * @param message    Not specified
     * @param cause      Not specified
     * @param suppressed Not specified
     * @param writable   Not specified
     * @return Not specified
     * @throws EqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static long notEqualsX(final long value, final long _value, final String message, final Throwable cause, final boolean suppressed, final boolean writable) throws EqualException {
        if (OldObjects.equals(value, _value))
            throw new EqualException(message, cause, suppressed, writable);
        return value;
    }

    /**
     * @param value      Not specified
     * @param _value     Not specified
     * @param message    Not specified
     * @param cause      Not specified
     * @param suppressed Not specified
     * @param writable   Not specified
     * @return Not specified
     * @throws EqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static float notEqualsX(final float value, final float _value, final String message, final Throwable cause, final boolean suppressed, final boolean writable) throws EqualException {
        if (OldObjects.equals(value, _value))
            throw new EqualException(message, cause, suppressed, writable);
        return value;
    }

    /**
     * @param value      Not specified
     * @param _value     Not specified
     * @param message    Not specified
     * @param cause      Not specified
     * @param suppressed Not specified
     * @param writable   Not specified
     * @return Not specified
     * @throws EqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static double notEqualsX(final double value, final double _value, final String message, final Throwable cause, final boolean suppressed, final boolean writable) throws EqualException {
        if (OldObjects.equals(value, _value))
            throw new EqualException(message, cause, suppressed, writable);
        return value;
    }

    /**
     * @param <T>        Not specified
     * @param object     Not specified
     * @param _object    Not specified
     * @param message    Not specified
     * @param cause      Not specified
     * @param suppressed Not specified
     * @param writable   Not specified
     * @return Not specified
     * @throws EqualException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static <T> T notEqualsX(final T object, final Object _object, final String message, final Throwable cause, final boolean suppressed, final boolean writable) throws EqualException {
        if (OldObjects.equals(object, _object))
            throw new EqualException(message, cause, suppressed, writable);
        return object;
    }

    /**
     * @param value  Not specified
     * @param _value Not specified
     * @return Not specified
     * @throws NotMoreException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static byte more(final byte value, final byte _value) throws NotMoreException {
        if (OldObjects.notMore(value, _value))
            throw new NotMoreException("The value must be more than the _value");
        return value;
    }

    /**
     * @param value  Not specified
     * @param _value Not specified
     * @return Not specified
     * @throws NotMoreException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static short more(final short value, final short _value) throws NotMoreException {
        if (OldObjects.notMore(value, _value))
            throw new NotMoreException("The value must be more than the _value");
        return value;
    }

    /**
     * @param value  Not specified
     * @param _value Not specified
     * @return Not specified
     * @throws NotMoreException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static int more(final int value, final int _value) throws NotMoreException {
        if (OldObjects.notMore(value, _value))
            throw new NotMoreException("The value must be more than the _value");
        return value;
    }

    /**
     * @param value  Not specified
     * @param _value Not specified
     * @return Not specified
     * @throws NotMoreException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static long more(final long value, final long _value) throws NotMoreException {
        if (OldObjects.notMore(value, _value))
            throw new NotMoreException("The value must be more than the _value");
        return value;
    }

    /**
     * @param value  Not specified
     * @param _value Not specified
     * @return Not specified
     * @throws NotMoreException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static float more(final float value, final float _value) throws NotMoreException {
        if (OldObjects.notMore(value, _value))
            throw new NotMoreException("The value must be more than the _value");
        return value;
    }

    /**
     * @param value  Not specified
     * @param _value Not specified
     * @return Not specified
     * @throws NotMoreException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static double more(final byte value, final double _value) throws NotMoreException {
        if (OldObjects.notMore(value, _value))
            throw new NotMoreException("The value must be more than the _value");
        return value;
    }

    /**
     * @param value  Not specified
     * @param _value Not specified
     * @return Not specified
     * @throws NotMoreException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static byte more(final byte value, final byte _value, final String name, final String _name) throws NotMoreException {
        if (OldObjects.notMore(value, _value))
            throw new NotMoreException("The " + name + " must be more than the " + _name);
        return value;
    }

    /**
     * @param value  Not specified
     * @param _value Not specified
     * @return Not specified
     * @throws NotMoreException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static short more(final short value, final short _value, final String name, final String _name) throws NotMoreException {
        if (OldObjects.notMore(value, _value))
            throw new NotMoreException("The " + name + " must be more than the " + _name);
        return value;
    }

    /**
     * @param value  Not specified
     * @param _value Not specified
     * @return Not specified
     * @throws NotMoreException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static int more(final int value, final int _value, final String name, final String _name) throws NotMoreException {
        if (OldObjects.notMore(value, _value))
            throw new NotMoreException("The " + name + " must be more than the " + _name);
        return value;
    }

    /**
     * @param value  Not specified
     * @param _value Not specified
     * @return Not specified
     * @throws NotMoreException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static long more(final long value, final long _value, final String name, final String _name, final String __name) throws NotMoreException {
        if (OldObjects.notMore(value, _value))
            throw new NotMoreException("The " + name + " must be more than the " + _name);
        return value;
    }

    /**
     * @param value  Not specified
     * @param _value Not specified
     * @return Not specified
     * @throws NotMoreException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static float more(final float value, final float _value, final String name, final String _name) throws NotMoreException {
        if (OldObjects.notMore(value, _value))
            throw new NotMoreException("The " + name + " must be more than the " + _name);
        return value;
    }

    /**
     * @param value  Not specified
     * @param _value Not specified
     * @return Not specified
     * @throws NotMoreException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static double more(final byte value, final double _value, final String name, final String _name) throws NotMoreException {
        if (OldObjects.notMore(value, _value))
            throw new NotMoreException("The " + name + " must be more than the " + _name);
        return value;
    }

    /**
     * @param value   Not specified
     * @param _value  Not specified
     * @param message Not specified
     * @return Not specified
     * @throws NotMoreException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static byte moreX(final byte value, final byte _value, final String message) throws NotMoreException {
        if (OldObjects.notMore(value, _value))
            throw new NotMoreException(message);
        return value;
    }

    /**
     * @param value   Not specified
     * @param _value  Not specified
     * @param message Not specified
     * @return Not specified
     * @throws NotMoreException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static short moreX(final short value, final short _value, final String message) throws NotMoreException {
        if (OldObjects.notMore(value, _value))
            throw new NotMoreException(message);
        return value;
    }

    /**
     * @param value   Not specified
     * @param _value  Not specified
     * @param message Not specified
     * @return Not specified
     * @throws NotMoreException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static int moreX(final int value, final int _value, final String message) throws NotMoreException {
        if (OldObjects.notMore(value, _value))
            throw new NotMoreException(message);
        return value;
    }

    /**
     * @param value   Not specified
     * @param _value  Not specified
     * @param message Not specified
     * @return Not specified
     * @throws NotMoreException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static long moreX(final long value, final long _value, final String message) throws NotMoreException {
        if (OldObjects.notMore(value, _value))
            throw new NotMoreException(message);
        return value;
    }

    /**
     * @param value   Not specified
     * @param _value  Not specified
     * @param message Not specified
     * @return Not specified
     * @throws NotMoreException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static float moreX(final float value, final float _value, final String message) throws NotMoreException {
        if (OldObjects.notMore(value, _value))
            throw new NotMoreException(message);
        return value;
    }

    /**
     * @param value   Not specified
     * @param _value  Not specified
     * @param message Not specified
     * @return Not specified
     * @throws NotMoreException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static double moreX(final double value, final double _value, final String message) throws NotMoreException {
        if (OldObjects.notMore(value, _value))
            throw new NotMoreException(message);
        return value;
    }

    /**
     * @param value  Not specified
     * @param _value Not specified
     * @param cause  Not specified
     * @return Not specified
     * @throws NotMoreException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static byte moreX(final byte value, final byte _value, final Throwable cause) throws NotMoreException {
        if (OldObjects.notMore(value, _value))
            throw new NotMoreException(cause);
        return value;
    }

    /**
     * @param value  Not specified
     * @param _value Not specified
     * @param cause  Not specified
     * @return Not specified
     * @throws NotMoreException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static short moreX(final short value, final short _value, final Throwable cause) throws NotMoreException {
        if (OldObjects.notMore(value, _value))
            throw new NotMoreException(cause);
        return value;
    }

    /**
     * @param value  Not specified
     * @param _value Not specified
     * @param cause  Not specified
     * @return Not specified
     * @throws NotMoreException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static int moreX(final int value, final int _value, final Throwable cause) throws NotMoreException {
        if (OldObjects.notMore(value, _value))
            throw new NotMoreException(cause);
        return value;
    }

    /**
     * @param value  Not specified
     * @param _value Not specified
     * @param cause  Not specified
     * @return Not specified
     * @throws NotMoreException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static long moreX(final long value, final long _value, final Throwable cause) throws NotMoreException {
        if (OldObjects.notMore(value, _value))
            throw new NotMoreException(cause);
        return value;
    }

    /**
     * @param value  Not specified
     * @param _value Not specified
     * @param cause  Not specified
     * @return Not specified
     * @throws NotMoreException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static float moreX(final float value, final float _value, final Throwable cause) throws NotMoreException {
        if (OldObjects.notMore(value, _value))
            throw new NotMoreException(cause);
        return value;
    }

    /**
     * @param value  Not specified
     * @param _value Not specified
     * @param cause  Not specified
     * @return Not specified
     * @throws NotMoreException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static double moreX(final double value, final double _value, final Throwable cause) throws NotMoreException {
        if (OldObjects.notMore(value, _value))
            throw new NotMoreException(cause);
        return value;
    }

    /**
     * @param value   Not specified
     * @param _value  Not specified
     * @param message Not specified
     * @param cause   Not specified
     * @return Not specified
     * @throws NotMoreException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static byte moreX(final byte value, final byte _value, final String message, final Throwable cause) throws NotMoreException {
        if (OldObjects.notMore(value, _value))
            throw new NotMoreException(message, cause);
        return value;
    }

    /**
     * @param value   Not specified
     * @param _value  Not specified
     * @param message Not specified
     * @param cause   Not specified
     * @return Not specified
     * @throws NotMoreException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static short moreX(final short value, final short _value, final String message, final Throwable cause) throws NotMoreException {
        if (OldObjects.notMore(value, _value))
            throw new NotMoreException(message, cause);
        return value;
    }

    /**
     * @param value   Not specified
     * @param _value  Not specified
     * @param message Not specified
     * @param cause   Not specified
     * @return Not specified
     * @throws NotMoreException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static int moreX(final int value, final int _value, final String message, final Throwable cause) throws NotMoreException {
        if (OldObjects.notMore(value, _value))
            throw new NotMoreException(message, cause);
        return value;
    }

    /**
     * @param value   Not specified
     * @param _value  Not specified
     * @param message Not specified
     * @param cause   Not specified
     * @return Not specified
     * @throws NotMoreException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static long moreX(final long value, final long _value, final String message, final Throwable cause) throws NotMoreException {
        if (OldObjects.notMore(value, _value))
            throw new NotMoreException(message, cause);
        return value;
    }

    /**
     * @param value   Not specified
     * @param _value  Not specified
     * @param message Not specified
     * @param cause   Not specified
     * @return Not specified
     * @throws NotMoreException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static float moreX(final float value, final float _value, final String message, final Throwable cause) throws NotMoreException {
        if (OldObjects.notMore(value, _value))
            throw new NotMoreException(message, cause);
        return value;
    }

    /**
     * @param value   Not specified
     * @param _value  Not specified
     * @param message Not specified
     * @param cause   Not specified
     * @return Not specified
     * @throws NotMoreException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static double moreX(final double value, final double _value, final String message, final Throwable cause) throws NotMoreException {
        if (OldObjects.notMore(value, _value))
            throw new NotMoreException(message, cause);
        return value;
    }

    /**
     * @param value      Not specified
     * @param _value     Not specified
     * @param message    Not specified
     * @param cause      Not specified
     * @param suppressed Not specified
     * @param writable   Not specified
     * @return Not specified
     * @throws NotMoreException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static byte moreX(final byte value, final byte _value, final String message, final Throwable cause, final boolean suppressed, final boolean writable) throws NotMoreException {
        if (OldObjects.notMore(value, _value))
            throw new NotMoreException(message, cause, suppressed, writable);
        return value;
    }

    /**
     * @param value      Not specified
     * @param _value     Not specified
     * @param message    Not specified
     * @param cause      Not specified
     * @param suppressed Not specified
     * @param writable   Not specified
     * @return Not specified
     * @throws NotMoreException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static short moreX(final short value, final short _value, final String message, final Throwable cause, final boolean suppressed, final boolean writable) throws NotMoreException {
        if (OldObjects.notMore(value, _value))
            throw new NotMoreException(message, cause, suppressed, writable);
        return value;
    }

    /**
     * @param value      Not specified
     * @param _value     Not specified
     * @param message    Not specified
     * @param cause      Not specified
     * @param suppressed Not specified
     * @param writable   Not specified
     * @return Not specified
     * @throws NotMoreException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static int moreX(final int value, final int _value, final String message, final Throwable cause, final boolean suppressed, final boolean writable) throws NotMoreException {
        if (OldObjects.notMore(value, _value))
            throw new NotMoreException(message, cause, suppressed, writable);
        return value;
    }

    /**
     * @param value      Not specified
     * @param _value     Not specified
     * @param message    Not specified
     * @param cause      Not specified
     * @param suppressed Not specified
     * @param writable   Not specified
     * @return Not specified
     * @throws NotMoreException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static long moreX(final long value, final long _value, final String message, final Throwable cause, final boolean suppressed, final boolean writable) throws NotMoreException {
        if (OldObjects.notMore(value, _value))
            throw new NotMoreException(message, cause, suppressed, writable);
        return value;
    }

    /**
     * @param value      Not specified
     * @param _value     Not specified
     * @param message    Not specified
     * @param cause      Not specified
     * @param suppressed Not specified
     * @param writable   Not specified
     * @return Not specified
     * @throws NotMoreException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static float moreX(final float value, final float _value, final String message, final Throwable cause, final boolean suppressed, final boolean writable) throws NotMoreException {
        if (OldObjects.notMore(value, _value))
            throw new NotMoreException(message, cause, suppressed, writable);
        return value;
    }

    /**
     * @param value      Not specified
     * @param _value     Not specified
     * @param message    Not specified
     * @param cause      Not specified
     * @param suppressed Not specified
     * @param writable   Not specified
     * @return Not specified
     * @throws NotMoreException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static double moreX(final double value, final double _value, final String message, final Throwable cause, final boolean suppressed, final boolean writable) throws NotMoreException {
        if (OldObjects.notMore(value, _value))
            throw new NotMoreException(message, cause, suppressed, writable);
        return value;
    }

    /**
     * @param value  Not specified
     * @param _value Not specified
     * @return Not specified
     * @throws MoreException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static byte notMore(final byte value, final byte _value) throws MoreException {
        if (OldObjects.more(value, _value))
            throw new MoreException("The value must not be more than the _value");
        return value;
    }

    /**
     * @param value  Not specified
     * @param _value Not specified
     * @return Not specified
     * @throws MoreException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static short notMore(final short value, final short _value) throws MoreException {
        if (OldObjects.more(value, _value))
            throw new MoreException("The value must not be more than the _value");
        return value;
    }

    /**
     * @param value  Not specified
     * @param _value Not specified
     * @return Not specified
     * @throws MoreException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static int notMore(final int value, final int _value) throws MoreException {
        if (OldObjects.more(value, _value))
            throw new MoreException("The value must not be more than the _value");
        return value;
    }

    /**
     * @param value  Not specified
     * @param _value Not specified
     * @return Not specified
     * @throws MoreException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static long notMore(final long value, final long _value) throws MoreException {
        if (OldObjects.more(value, _value))
            throw new MoreException("The value must not be more than the _value");
        return value;
    }

    /**
     * @param value  Not specified
     * @param _value Not specified
     * @return Not specified
     * @throws MoreException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static float notMore(final float value, final float _value) throws MoreException {
        if (OldObjects.more(value, _value))
            throw new MoreException("The value must not be more than the _value");
        return value;
    }

    /**
     * @param value  Not specified
     * @param _value Not specified
     * @return Not specified
     * @throws MoreException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static double notMore(final byte value, final double _value) throws MoreException {
        if (OldObjects.more(value, _value))
            throw new MoreException("The value must not be more than the _value");
        return value;
    }

    /**
     * @param value  Not specified
     * @param _value Not specified
     * @return Not specified
     * @throws MoreException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static byte notMore(final byte value, final byte _value, final String name, final String _name) throws MoreException {
        if (OldObjects.more(value, _value))
            throw new MoreException("The " + name + " must not be more than the " + _name);
        return value;
    }

    /**
     * @param value  Not specified
     * @param _value Not specified
     * @return Not specified
     * @throws MoreException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static short notMore(final short value, final short _value, final String name, final String _name) throws MoreException {
        if (OldObjects.more(value, _value))
            throw new MoreException("The " + name + " must not be more than the " + _name);
        return value;
    }

    /**
     * @param value  Not specified
     * @param _value Not specified
     * @return Not specified
     * @throws MoreException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static int notMore(final int value, final int _value, final String name, final String _name) throws MoreException {
        if (OldObjects.more(value, _value))
            throw new MoreException("The " + name + " must not be more than the " + _name);
        return value;
    }

    /**
     * @param value  Not specified
     * @param _value Not specified
     * @return Not specified
     * @throws MoreException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static long notMore(final long value, final long _value, final String name, final String _name, final String __name) throws MoreException {
        if (OldObjects.more(value, _value))
            throw new MoreException("The " + name + " must not be more than the " + _name);
        return value;
    }

    /**
     * @param value  Not specified
     * @param _value Not specified
     * @return Not specified
     * @throws MoreException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static float notMore(final float value, final float _value, final String name, final String _name) throws MoreException {
        if (OldObjects.more(value, _value))
            throw new MoreException("The " + name + " must not be more than the " + _name);
        return value;
    }

    /**
     * @param value  Not specified
     * @param _value Not specified
     * @return Not specified
     * @throws MoreException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static double notMore(final byte value, final double _value, final String name, final String _name) throws MoreException {
        if (OldObjects.more(value, _value))
            throw new MoreException("The " + name + " must not be more than the " + _name);
        return value;
    }

    /**
     * @param value   Not specified
     * @param _value  Not specified
     * @param message Not specified
     * @return Not specified
     * @throws MoreException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static byte notMoreX(final byte value, final byte _value, final String message) throws MoreException {
        if (OldObjects.more(value, _value))
            throw new MoreException(message);
        return value;
    }

    /**
     * @param value   Not specified
     * @param _value  Not specified
     * @param message Not specified
     * @return Not specified
     * @throws MoreException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static short notMoreX(final short value, final short _value, final String message) throws MoreException {
        if (OldObjects.more(value, _value))
            throw new MoreException(message);
        return value;
    }

    /**
     * @param value   Not specified
     * @param _value  Not specified
     * @param message Not specified
     * @return Not specified
     * @throws MoreException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static int notMoreX(final int value, final int _value, final String message) throws MoreException {
        if (OldObjects.more(value, _value))
            throw new MoreException(message);
        return value;
    }

    /**
     * @param value   Not specified
     * @param _value  Not specified
     * @param message Not specified
     * @return Not specified
     * @throws MoreException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static long notMoreX(final long value, final long _value, final String message) throws MoreException {
        if (OldObjects.more(value, _value))
            throw new MoreException(message);
        return value;
    }

    /**
     * @param value   Not specified
     * @param _value  Not specified
     * @param message Not specified
     * @return Not specified
     * @throws MoreException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static float notMoreX(final float value, final float _value, final String message) throws MoreException {
        if (OldObjects.more(value, _value))
            throw new MoreException(message);
        return value;
    }

    /**
     * @param value   Not specified
     * @param _value  Not specified
     * @param message Not specified
     * @return Not specified
     * @throws MoreException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static double notMoreX(final double value, final double _value, final String message) throws MoreException {
        if (OldObjects.more(value, _value))
            throw new MoreException(message);
        return value;
    }

    /**
     * @param value  Not specified
     * @param _value Not specified
     * @param cause  Not specified
     * @return Not specified
     * @throws MoreException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static byte notMoreX(final byte value, final byte _value, final Throwable cause) throws MoreException {
        if (OldObjects.more(value, _value))
            throw new MoreException(cause);
        return value;
    }

    /**
     * @param value  Not specified
     * @param _value Not specified
     * @param cause  Not specified
     * @return Not specified
     * @throws MoreException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static short notMoreX(final short value, final short _value, final Throwable cause) throws MoreException {
        if (OldObjects.more(value, _value))
            throw new MoreException(cause);
        return value;
    }

    /**
     * @param value  Not specified
     * @param _value Not specified
     * @param cause  Not specified
     * @return Not specified
     * @throws MoreException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static int notMoreX(final int value, final int _value, final Throwable cause) throws MoreException {
        if (OldObjects.more(value, _value))
            throw new MoreException(cause);
        return value;
    }

    /**
     * @param value  Not specified
     * @param _value Not specified
     * @param cause  Not specified
     * @return Not specified
     * @throws MoreException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static long notMoreX(final long value, final long _value, final Throwable cause) throws MoreException {
        if (OldObjects.more(value, _value))
            throw new MoreException(cause);
        return value;
    }

    /**
     * @param value  Not specified
     * @param _value Not specified
     * @param cause  Not specified
     * @return Not specified
     * @throws MoreException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static float notMoreX(final float value, final float _value, final Throwable cause) throws MoreException {
        if (OldObjects.more(value, _value))
            throw new MoreException(cause);
        return value;
    }

    /**
     * @param value  Not specified
     * @param _value Not specified
     * @param cause  Not specified
     * @return Not specified
     * @throws MoreException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static double notMoreX(final double value, final double _value, final Throwable cause) throws MoreException {
        if (OldObjects.more(value, _value))
            throw new MoreException(cause);
        return value;
    }

    /**
     * @param value   Not specified
     * @param _value  Not specified
     * @param message Not specified
     * @param cause   Not specified
     * @return Not specified
     * @throws MoreException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static byte notMoreX(final byte value, final byte _value, final String message, final Throwable cause) throws MoreException {
        if (OldObjects.more(value, _value))
            throw new MoreException(message, cause);
        return value;
    }

    /**
     * @param value   Not specified
     * @param _value  Not specified
     * @param message Not specified
     * @param cause   Not specified
     * @return Not specified
     * @throws MoreException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static short notMoreX(final short value, final short _value, final String message, final Throwable cause) throws MoreException {
        if (OldObjects.more(value, _value))
            throw new MoreException(message, cause);
        return value;
    }

    /**
     * @param value   Not specified
     * @param _value  Not specified
     * @param message Not specified
     * @param cause   Not specified
     * @return Not specified
     * @throws MoreException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static int notMoreX(final int value, final int _value, final String message, final Throwable cause) throws MoreException {
        if (OldObjects.more(value, _value))
            throw new MoreException(message, cause);
        return value;
    }

    /**
     * @param value   Not specified
     * @param _value  Not specified
     * @param message Not specified
     * @param cause   Not specified
     * @return Not specified
     * @throws MoreException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static long notMoreX(final long value, final long _value, final String message, final Throwable cause) throws MoreException {
        if (OldObjects.more(value, _value))
            throw new MoreException(message, cause);
        return value;
    }

    /**
     * @param value   Not specified
     * @param _value  Not specified
     * @param message Not specified
     * @param cause   Not specified
     * @return Not specified
     * @throws MoreException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static float notMoreX(final float value, final float _value, final String message, final Throwable cause) throws MoreException {
        if (OldObjects.more(value, _value))
            throw new MoreException(message, cause);
        return value;
    }

    /**
     * @param value   Not specified
     * @param _value  Not specified
     * @param message Not specified
     * @param cause   Not specified
     * @return Not specified
     * @throws MoreException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static double notMoreX(final double value, final double _value, final String message, final Throwable cause) throws MoreException {
        if (OldObjects.more(value, _value))
            throw new MoreException(message, cause);
        return value;
    }

    /**
     * @param value      Not specified
     * @param _value     Not specified
     * @param message    Not specified
     * @param cause      Not specified
     * @param suppressed Not specified
     * @param writable   Not specified
     * @return Not specified
     * @throws MoreException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static byte notMoreX(final byte value, final byte _value, final String message, final Throwable cause, final boolean suppressed, final boolean writable) throws MoreException {
        if (OldObjects.more(value, _value))
            throw new MoreException(message, cause, suppressed, writable);
        return value;
    }

    /**
     * @param value      Not specified
     * @param _value     Not specified
     * @param message    Not specified
     * @param cause      Not specified
     * @param suppressed Not specified
     * @param writable   Not specified
     * @return Not specified
     * @throws MoreException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static short notMoreX(final short value, final short _value, final String message, final Throwable cause, final boolean suppressed, final boolean writable) throws MoreException {
        if (OldObjects.more(value, _value))
            throw new MoreException(message, cause, suppressed, writable);
        return value;
    }

    /**
     * @param value      Not specified
     * @param _value     Not specified
     * @param message    Not specified
     * @param cause      Not specified
     * @param suppressed Not specified
     * @param writable   Not specified
     * @return Not specified
     * @throws MoreException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static int notMoreX(final int value, final int _value, final String message, final Throwable cause, final boolean suppressed, final boolean writable) throws MoreException {
        if (OldObjects.more(value, _value))
            throw new MoreException(message, cause, suppressed, writable);
        return value;
    }

    /**
     * @param value      Not specified
     * @param _value     Not specified
     * @param message    Not specified
     * @param cause      Not specified
     * @param suppressed Not specified
     * @param writable   Not specified
     * @return Not specified
     * @throws MoreException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static long notMoreX(final long value, final long _value, final String message, final Throwable cause, final boolean suppressed, final boolean writable) throws MoreException {
        if (OldObjects.more(value, _value))
            throw new MoreException(message, cause, suppressed, writable);
        return value;
    }

    /**
     * @param value      Not specified
     * @param _value     Not specified
     * @param message    Not specified
     * @param cause      Not specified
     * @param suppressed Not specified
     * @param writable   Not specified
     * @return Not specified
     * @throws MoreException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static float notMoreX(final float value, final float _value, final String message, final Throwable cause, final boolean suppressed, final boolean writable) throws MoreException {
        if (OldObjects.more(value, _value))
            throw new MoreException(message, cause, suppressed, writable);
        return value;
    }

    /**
     * @param value      Not specified
     * @param _value     Not specified
     * @param message    Not specified
     * @param cause      Not specified
     * @param suppressed Not specified
     * @param writable   Not specified
     * @return Not specified
     * @throws MoreException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static double notMoreX(final double value, final double _value, final String message, final Throwable cause, final boolean suppressed, final boolean writable) throws MoreException {
        if (OldObjects.more(value, _value))
            throw new MoreException(message, cause, suppressed, writable);
        return value;
    }

    /**
     * @param value  Not specified
     * @param _value Not specified
     * @return Not specified
     * @throws NotLessException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static byte less(final byte value, final byte _value) throws NotLessException {
        if (OldObjects.notLess(value, _value))
            throw new NotLessException("The value must be less than the _value");
        return value;
    }

    /**
     * @param value  Not specified
     * @param _value Not specified
     * @return Not specified
     * @throws NotLessException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static short less(final short value, final short _value) throws NotLessException {
        if (OldObjects.notLess(value, _value))
            throw new NotLessException("The value must be less than the _value");
        return value;
    }

    /**
     * @param value  Not specified
     * @param _value Not specified
     * @return Not specified
     * @throws NotLessException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static int less(final int value, final int _value) throws NotLessException {
        if (OldObjects.notLess(value, _value))
            throw new NotLessException("The value must be less than the _value");
        return value;
    }

    /**
     * @param value  Not specified
     * @param _value Not specified
     * @return Not specified
     * @throws NotLessException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static long less(final long value, final long _value) throws NotLessException {
        if (OldObjects.notLess(value, _value))
            throw new NotLessException("The value must be less than the _value");
        return value;
    }

    /**
     * @param value  Not specified
     * @param _value Not specified
     * @return Not specified
     * @throws NotLessException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static float less(final float value, final float _value) throws NotLessException {
        if (OldObjects.notLess(value, _value))
            throw new NotLessException("The value must be less than the _value");
        return value;
    }

    /**
     * @param value  Not specified
     * @param _value Not specified
     * @return Not specified
     * @throws NotLessException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static double less(final byte value, final double _value) throws NotLessException {
        if (OldObjects.notLess(value, _value))
            throw new NotLessException("The value must be less than the _value");
        return value;
    }

    /**
     * @param value  Not specified
     * @param _value Not specified
     * @return Not specified
     * @throws NotLessException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static byte less(final byte value, final byte _value, final String name, final String _name) throws NotLessException {
        if (OldObjects.notLess(value, _value))
            throw new NotLessException("The " + name + " must be less than the " + _name);
        return value;
    }

    /**
     * @param value  Not specified
     * @param _value Not specified
     * @return Not specified
     * @throws NotLessException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static short less(final short value, final short _value, final String name, final String _name) throws NotLessException {
        if (OldObjects.notLess(value, _value))
            throw new NotLessException("The " + name + " must be less than the " + _name);
        return value;
    }

    /**
     * @param value  Not specified
     * @param _value Not specified
     * @return Not specified
     * @throws NotLessException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static int less(final int value, final int _value, final String name, final String _name) throws NotLessException {
        if (OldObjects.notLess(value, _value))
            throw new NotLessException("The " + name + " must be less than the " + _name);
        return value;
    }

    /**
     * @param value  Not specified
     * @param _value Not specified
     * @return Not specified
     * @throws NotLessException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static long less(final long value, final long _value, final String name, final String _name, final String __name) throws NotLessException {
        if (OldObjects.notLess(value, _value))
            throw new NotLessException("The " + name + " must be less than the " + _name);
        return value;
    }

    /**
     * @param value  Not specified
     * @param _value Not specified
     * @return Not specified
     * @throws NotLessException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static float less(final float value, final float _value, final String name, final String _name) throws NotLessException {
        if (OldObjects.notLess(value, _value))
            throw new NotLessException("The " + name + " must be less than the " + _name);
        return value;
    }

    /**
     * @param value  Not specified
     * @param _value Not specified
     * @return Not specified
     * @throws NotLessException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static double less(final byte value, final double _value, final String name, final String _name) throws NotLessException {
        if (OldObjects.notLess(value, _value))
            throw new NotLessException("The " + name + " must be less than the " + _name);
        return value;
    }

    /**
     * @param value   Not specified
     * @param _value  Not specified
     * @param message Not specified
     * @return Not specified
     * @throws NotLessException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static byte lessX(final byte value, final byte _value, final String message) throws NotLessException {
        if (OldObjects.notLess(value, _value))
            throw new NotLessException(message);
        return value;
    }

    /**
     * @param value   Not specified
     * @param _value  Not specified
     * @param message Not specified
     * @return Not specified
     * @throws NotLessException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static short lessX(final short value, final short _value, final String message) throws NotLessException {
        if (OldObjects.notLess(value, _value))
            throw new NotLessException(message);
        return value;
    }

    /**
     * @param value   Not specified
     * @param _value  Not specified
     * @param message Not specified
     * @return Not specified
     * @throws NotLessException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static int lessX(final int value, final int _value, final String message) throws NotLessException {
        if (OldObjects.notLess(value, _value))
            throw new NotLessException(message);
        return value;
    }

    /**
     * @param value   Not specified
     * @param _value  Not specified
     * @param message Not specified
     * @return Not specified
     * @throws NotLessException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static long lessX(final long value, final long _value, final String message) throws NotLessException {
        if (OldObjects.notLess(value, _value))
            throw new NotLessException(message);
        return value;
    }

    /**
     * @param value   Not specified
     * @param _value  Not specified
     * @param message Not specified
     * @return Not specified
     * @throws NotLessException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static float lessX(final float value, final float _value, final String message) throws NotLessException {
        if (OldObjects.notLess(value, _value))
            throw new NotLessException(message);
        return value;
    }

    /**
     * @param value   Not specified
     * @param _value  Not specified
     * @param message Not specified
     * @return Not specified
     * @throws NotLessException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static double lessX(final double value, final double _value, final String message) throws NotLessException {
        if (OldObjects.notLess(value, _value))
            throw new NotLessException(message);
        return value;
    }

    /**
     * @param value  Not specified
     * @param _value Not specified
     * @param cause  Not specified
     * @return Not specified
     * @throws NotLessException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static byte lessX(final byte value, final byte _value, final Throwable cause) throws NotLessException {
        if (OldObjects.notLess(value, _value))
            throw new NotLessException(cause);
        return value;
    }

    /**
     * @param value  Not specified
     * @param _value Not specified
     * @param cause  Not specified
     * @return Not specified
     * @throws NotLessException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static short lessX(final short value, final short _value, final Throwable cause) throws NotLessException {
        if (OldObjects.notLess(value, _value))
            throw new NotLessException(cause);
        return value;
    }

    /**
     * @param value  Not specified
     * @param _value Not specified
     * @param cause  Not specified
     * @return Not specified
     * @throws NotLessException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static int lessX(final int value, final int _value, final Throwable cause) throws NotLessException {
        if (OldObjects.notLess(value, _value))
            throw new NotLessException(cause);
        return value;
    }

    /**
     * @param value  Not specified
     * @param _value Not specified
     * @param cause  Not specified
     * @return Not specified
     * @throws NotLessException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static long lessX(final long value, final long _value, final Throwable cause) throws NotLessException {
        if (OldObjects.notLess(value, _value))
            throw new NotLessException(cause);
        return value;
    }

    /**
     * @param value  Not specified
     * @param _value Not specified
     * @param cause  Not specified
     * @return Not specified
     * @throws NotLessException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static float lessX(final float value, final float _value, final Throwable cause) throws NotLessException {
        if (OldObjects.notLess(value, _value))
            throw new NotLessException(cause);
        return value;
    }

    /**
     * @param value  Not specified
     * @param _value Not specified
     * @param cause  Not specified
     * @return Not specified
     * @throws NotLessException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static double lessX(final double value, final double _value, final Throwable cause) throws NotLessException {
        if (OldObjects.notLess(value, _value))
            throw new NotLessException(cause);
        return value;
    }

    /**
     * @param value   Not specified
     * @param _value  Not specified
     * @param message Not specified
     * @param cause   Not specified
     * @return Not specified
     * @throws NotLessException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static byte lessX(final byte value, final byte _value, final String message, final Throwable cause) throws NotLessException {
        if (OldObjects.notLess(value, _value))
            throw new NotLessException(message, cause);
        return value;
    }

    /**
     * @param value   Not specified
     * @param _value  Not specified
     * @param message Not specified
     * @param cause   Not specified
     * @return Not specified
     * @throws NotLessException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static short lessX(final short value, final short _value, final String message, final Throwable cause) throws NotLessException {
        if (OldObjects.notLess(value, _value))
            throw new NotLessException(message, cause);
        return value;
    }

    /**
     * @param value   Not specified
     * @param _value  Not specified
     * @param message Not specified
     * @param cause   Not specified
     * @return Not specified
     * @throws NotLessException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static int lessX(final int value, final int _value, final String message, final Throwable cause) throws NotLessException {
        if (OldObjects.notLess(value, _value))
            throw new NotLessException(message, cause);
        return value;
    }

    /**
     * @param value   Not specified
     * @param _value  Not specified
     * @param message Not specified
     * @param cause   Not specified
     * @return Not specified
     * @throws NotLessException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static long lessX(final long value, final long _value, final String message, final Throwable cause) throws NotLessException {
        if (OldObjects.notLess(value, _value))
            throw new NotLessException(message, cause);
        return value;
    }

    /**
     * @param value   Not specified
     * @param _value  Not specified
     * @param message Not specified
     * @param cause   Not specified
     * @return Not specified
     * @throws NotLessException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static float lessX(final float value, final float _value, final String message, final Throwable cause) throws NotLessException {
        if (OldObjects.notLess(value, _value))
            throw new NotLessException(message, cause);
        return value;
    }

    /**
     * @param value   Not specified
     * @param _value  Not specified
     * @param message Not specified
     * @param cause   Not specified
     * @return Not specified
     * @throws NotLessException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static double lessX(final double value, final double _value, final String message, final Throwable cause) throws NotLessException {
        if (OldObjects.notLess(value, _value))
            throw new NotLessException(message, cause);
        return value;
    }

    /**
     * @param value      Not specified
     * @param _value     Not specified
     * @param message    Not specified
     * @param cause      Not specified
     * @param suppressed Not specified
     * @param writable   Not specified
     * @return Not specified
     * @throws NotLessException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static byte lessX(final byte value, final byte _value, final String message, final Throwable cause, final boolean suppressed, final boolean writable) throws NotLessException {
        if (OldObjects.notLess(value, _value))
            throw new NotLessException(message, cause, suppressed, writable);
        return value;
    }

    /**
     * @param value      Not specified
     * @param _value     Not specified
     * @param message    Not specified
     * @param cause      Not specified
     * @param suppressed Not specified
     * @param writable   Not specified
     * @return Not specified
     * @throws NotLessException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static short lessX(final short value, final short _value, final String message, final Throwable cause, final boolean suppressed, final boolean writable) throws NotLessException {
        if (OldObjects.notLess(value, _value))
            throw new NotLessException(message, cause, suppressed, writable);
        return value;
    }

    /**
     * @param value      Not specified
     * @param _value     Not specified
     * @param message    Not specified
     * @param cause      Not specified
     * @param suppressed Not specified
     * @param writable   Not specified
     * @return Not specified
     * @throws NotLessException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static int lessX(final int value, final int _value, final String message, final Throwable cause, final boolean suppressed, final boolean writable) throws NotLessException {
        if (OldObjects.notLess(value, _value))
            throw new NotLessException(message, cause, suppressed, writable);
        return value;
    }

    /**
     * @param value      Not specified
     * @param _value     Not specified
     * @param message    Not specified
     * @param cause      Not specified
     * @param suppressed Not specified
     * @param writable   Not specified
     * @return Not specified
     * @throws NotLessException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static long lessX(final long value, final long _value, final String message, final Throwable cause, final boolean suppressed, final boolean writable) throws NotLessException {
        if (OldObjects.notLess(value, _value))
            throw new NotLessException(message, cause, suppressed, writable);
        return value;
    }

    /**
     * @param value      Not specified
     * @param _value     Not specified
     * @param message    Not specified
     * @param cause      Not specified
     * @param suppressed Not specified
     * @param writable   Not specified
     * @return Not specified
     * @throws NotLessException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static float lessX(final float value, final float _value, final String message, final Throwable cause, final boolean suppressed, final boolean writable) throws NotLessException {
        if (OldObjects.notLess(value, _value))
            throw new NotLessException(message, cause, suppressed, writable);
        return value;
    }

    /**
     * @param value      Not specified
     * @param _value     Not specified
     * @param message    Not specified
     * @param cause      Not specified
     * @param suppressed Not specified
     * @param writable   Not specified
     * @return Not specified
     * @throws NotLessException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static double lessX(final double value, final double _value, final String message, final Throwable cause, final boolean suppressed, final boolean writable) throws NotLessException {
        if (OldObjects.notLess(value, _value))
            throw new NotLessException(message, cause, suppressed, writable);
        return value;
    }

    /**
     * @param value  Not specified
     * @param _value Not specified
     * @return Not specified
     * @throws LessException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static byte notLess(final byte value, final byte _value) throws LessException {
        if (OldObjects.less(value, _value))
            throw new LessException("The value must not be less than the _value");
        return value;
    }

    /**
     * @param value  Not specified
     * @param _value Not specified
     * @return Not specified
     * @throws LessException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static short notLess(final short value, final short _value) throws LessException {
        if (OldObjects.less(value, _value))
            throw new LessException("The value must not be less than the _value");
        return value;
    }

    /**
     * @param value  Not specified
     * @param _value Not specified
     * @return Not specified
     * @throws LessException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static int notLess(final int value, final int _value) throws LessException {
        if (OldObjects.less(value, _value))
            throw new LessException("The value must not be less than the _value");
        return value;
    }

    /**
     * @param value  Not specified
     * @param _value Not specified
     * @return Not specified
     * @throws LessException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static long notLess(final long value, final long _value) throws LessException {
        if (OldObjects.less(value, _value))
            throw new LessException("The value must not be less than the _value");
        return value;
    }

    /**
     * @param value  Not specified
     * @param _value Not specified
     * @return Not specified
     * @throws LessException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static float notLess(final float value, final float _value) throws LessException {
        if (OldObjects.less(value, _value))
            throw new LessException("The value must not be less than the _value");
        return value;
    }

    /**
     * @param value  Not specified
     * @param _value Not specified
     * @return Not specified
     * @throws LessException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static double notLess(final byte value, final double _value) throws LessException {
        if (OldObjects.less(value, _value))
            throw new LessException("The value must not be less than the _value");
        return value;
    }

    /**
     * @param value  Not specified
     * @param _value Not specified
     * @return Not specified
     * @throws LessException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static byte notLess(final byte value, final byte _value, final String name, final String _name) throws LessException {
        if (OldObjects.less(value, _value))
            throw new LessException("The " + name + " must not be less than the " + _name);
        return value;
    }

    /**
     * @param value  Not specified
     * @param _value Not specified
     * @return Not specified
     * @throws LessException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static short notLess(final short value, final short _value, final String name, final String _name) throws LessException {
        if (OldObjects.less(value, _value))
            throw new LessException("The " + name + " must not be less than the " + _name);
        return value;
    }

    /**
     * @param value  Not specified
     * @param _value Not specified
     * @return Not specified
     * @throws LessException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static int notLess(final int value, final int _value, final String name, final String _name) throws LessException {
        if (OldObjects.less(value, _value))
            throw new LessException("The " + name + " must not be less than the " + _name);
        return value;
    }

    /**
     * @param value  Not specified
     * @param _value Not specified
     * @return Not specified
     * @throws LessException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static long notLess(final long value, final long _value, final String name, final String _name, final String __name) throws LessException {
        if (OldObjects.less(value, _value))
            throw new LessException("The " + name + " must not be less than the " + _name);
        return value;
    }

    /**
     * @param value  Not specified
     * @param _value Not specified
     * @return Not specified
     * @throws LessException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static float notLess(final float value, final float _value, final String name, final String _name) throws LessException {
        if (OldObjects.less(value, _value))
            throw new LessException("The " + name + " must not be less than the " + _name);
        return value;
    }

    /**
     * @param value  Not specified
     * @param _value Not specified
     * @return Not specified
     * @throws LessException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static double notLess(final byte value, final double _value, final String name, final String _name) throws LessException {
        if (OldObjects.less(value, _value))
            throw new LessException("The " + name + " must not be less than the " + _name);
        return value;
    }

    /**
     * @param value   Not specified
     * @param _value  Not specified
     * @param message Not specified
     * @return Not specified
     * @throws LessException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static byte notLessX(final byte value, final byte _value, final String message) throws LessException {
        if (OldObjects.less(value, _value))
            throw new LessException(message);
        return value;
    }

    /**
     * @param value   Not specified
     * @param _value  Not specified
     * @param message Not specified
     * @return Not specified
     * @throws LessException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static short notLessX(final short value, final short _value, final String message) throws LessException {
        if (OldObjects.less(value, _value))
            throw new LessException(message);
        return value;
    }

    /**
     * @param value   Not specified
     * @param _value  Not specified
     * @param message Not specified
     * @return Not specified
     * @throws LessException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static int notLessX(final int value, final int _value, final String message) throws LessException {
        if (OldObjects.less(value, _value))
            throw new LessException(message);
        return value;
    }

    /**
     * @param value   Not specified
     * @param _value  Not specified
     * @param message Not specified
     * @return Not specified
     * @throws LessException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static long notLessX(final long value, final long _value, final String message) throws LessException {
        if (OldObjects.less(value, _value))
            throw new LessException(message);
        return value;
    }

    /**
     * @param value   Not specified
     * @param _value  Not specified
     * @param message Not specified
     * @return Not specified
     * @throws LessException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static float notLessX(final float value, final float _value, final String message) throws LessException {
        if (OldObjects.less(value, _value))
            throw new LessException(message);
        return value;
    }

    /**
     * @param value   Not specified
     * @param _value  Not specified
     * @param message Not specified
     * @return Not specified
     * @throws LessException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static double notLessX(final double value, final double _value, final String message) throws LessException {
        if (OldObjects.less(value, _value))
            throw new LessException(message);
        return value;
    }

    /**
     * @param value  Not specified
     * @param _value Not specified
     * @param cause  Not specified
     * @return Not specified
     * @throws LessException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static byte notLessX(final byte value, final byte _value, final Throwable cause) throws LessException {
        if (OldObjects.less(value, _value))
            throw new LessException(cause);
        return value;
    }

    /**
     * @param value  Not specified
     * @param _value Not specified
     * @param cause  Not specified
     * @return Not specified
     * @throws LessException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static short notLessX(final short value, final short _value, final Throwable cause) throws LessException {
        if (OldObjects.less(value, _value))
            throw new LessException(cause);
        return value;
    }

    /**
     * @param value  Not specified
     * @param _value Not specified
     * @param cause  Not specified
     * @return Not specified
     * @throws LessException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static int notLessX(final int value, final int _value, final Throwable cause) throws LessException {
        if (OldObjects.less(value, _value))
            throw new LessException(cause);
        return value;
    }

    /**
     * @param value  Not specified
     * @param _value Not specified
     * @param cause  Not specified
     * @return Not specified
     * @throws LessException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static long notLessX(final long value, final long _value, final Throwable cause) throws LessException {
        if (OldObjects.less(value, _value))
            throw new LessException(cause);
        return value;
    }

    /**
     * @param value  Not specified
     * @param _value Not specified
     * @param cause  Not specified
     * @return Not specified
     * @throws LessException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static float notLessX(final float value, final float _value, final Throwable cause) throws LessException {
        if (OldObjects.less(value, _value))
            throw new LessException(cause);
        return value;
    }

    /**
     * @param value  Not specified
     * @param _value Not specified
     * @param cause  Not specified
     * @return Not specified
     * @throws LessException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static double notLessX(final double value, final double _value, final Throwable cause) throws LessException {
        if (OldObjects.less(value, _value))
            throw new LessException(cause);
        return value;
    }

    /**
     * @param value   Not specified
     * @param _value  Not specified
     * @param message Not specified
     * @param cause   Not specified
     * @return Not specified
     * @throws LessException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static byte notLessX(final byte value, final byte _value, final String message, final Throwable cause) throws LessException {
        if (OldObjects.less(value, _value))
            throw new LessException(message, cause);
        return value;
    }

    /**
     * @param value   Not specified
     * @param _value  Not specified
     * @param message Not specified
     * @param cause   Not specified
     * @return Not specified
     * @throws LessException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static short notLessX(final short value, final short _value, final String message, final Throwable cause) throws LessException {
        if (OldObjects.less(value, _value))
            throw new LessException(message, cause);
        return value;
    }

    /**
     * @param value   Not specified
     * @param _value  Not specified
     * @param message Not specified
     * @param cause   Not specified
     * @return Not specified
     * @throws LessException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static int notLessX(final int value, final int _value, final String message, final Throwable cause) throws LessException {
        if (OldObjects.less(value, _value))
            throw new LessException(message, cause);
        return value;
    }

    /**
     * @param value   Not specified
     * @param _value  Not specified
     * @param message Not specified
     * @param cause   Not specified
     * @return Not specified
     * @throws LessException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static long notLessX(final long value, final long _value, final String message, final Throwable cause) throws LessException {
        if (OldObjects.less(value, _value))
            throw new LessException(message, cause);
        return value;
    }

    /**
     * @param value   Not specified
     * @param _value  Not specified
     * @param message Not specified
     * @param cause   Not specified
     * @return Not specified
     * @throws LessException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static float notLessX(final float value, final float _value, final String message, final Throwable cause) throws LessException {
        if (OldObjects.less(value, _value))
            throw new LessException(message, cause);
        return value;
    }

    /**
     * @param value   Not specified
     * @param _value  Not specified
     * @param message Not specified
     * @param cause   Not specified
     * @return Not specified
     * @throws LessException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static double notLessX(final double value, final double _value, final String message, final Throwable cause) throws LessException {
        if (OldObjects.less(value, _value))
            throw new LessException(message, cause);
        return value;
    }

    /**
     * @param value      Not specified
     * @param _value     Not specified
     * @param message    Not specified
     * @param cause      Not specified
     * @param suppressed Not specified
     * @param writable   Not specified
     * @return Not specified
     * @throws LessException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static byte notLessX(final byte value, final byte _value, final String message, final Throwable cause, final boolean suppressed, final boolean writable) throws LessException {
        if (OldObjects.less(value, _value))
            throw new LessException(message, cause, suppressed, writable);
        return value;
    }

    /**
     * @param value      Not specified
     * @param _value     Not specified
     * @param message    Not specified
     * @param cause      Not specified
     * @param suppressed Not specified
     * @param writable   Not specified
     * @return Not specified
     * @throws LessException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static short notLessX(final short value, final short _value, final String message, final Throwable cause, final boolean suppressed, final boolean writable) throws LessException {
        if (OldObjects.less(value, _value))
            throw new LessException(message, cause, suppressed, writable);
        return value;
    }

    /**
     * @param value      Not specified
     * @param _value     Not specified
     * @param message    Not specified
     * @param cause      Not specified
     * @param suppressed Not specified
     * @param writable   Not specified
     * @return Not specified
     * @throws LessException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static int notLessX(final int value, final int _value, final String message, final Throwable cause, final boolean suppressed, final boolean writable) throws LessException {
        if (OldObjects.less(value, _value))
            throw new LessException(message, cause, suppressed, writable);
        return value;
    }

    /**
     * @param value      Not specified
     * @param _value     Not specified
     * @param message    Not specified
     * @param cause      Not specified
     * @param suppressed Not specified
     * @param writable   Not specified
     * @return Not specified
     * @throws LessException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static long notLessX(final long value, final long _value, final String message, final Throwable cause, final boolean suppressed, final boolean writable) throws LessException {
        if (OldObjects.less(value, _value))
            throw new LessException(message, cause, suppressed, writable);
        return value;
    }

    /**
     * @param value      Not specified
     * @param _value     Not specified
     * @param message    Not specified
     * @param cause      Not specified
     * @param suppressed Not specified
     * @param writable   Not specified
     * @return Not specified
     * @throws LessException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static float notLessX(final float value, final float _value, final String message, final Throwable cause, final boolean suppressed, final boolean writable) throws LessException {
        if (OldObjects.less(value, _value))
            throw new LessException(message, cause, suppressed, writable);
        return value;
    }

    /**
     * @param value      Not specified
     * @param _value     Not specified
     * @param message    Not specified
     * @param cause      Not specified
     * @param suppressed Not specified
     * @param writable   Not specified
     * @return Not specified
     * @throws LessException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static double notLessX(final double value, final double _value, final String message, final Throwable cause, final boolean suppressed, final boolean writable) throws LessException {
        if (OldObjects.less(value, _value))
            throw new LessException(message, cause, suppressed, writable);
        return value;
    }

    /**
     * @param value Not specified
     * @param min   Not specified
     * @param max   Not specified
     * @return Not specified
     * @throws NotInException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static byte in(final byte value, final byte min, final byte max) throws NotInException {
        if (OldObjects.notIn(value, min, max))
            throw new NotInException("The value must be more than or equal to the min and less than or equal to the max");
        return value;
    }

    /**
     * @param value Not specified
     * @param min   Not specified
     * @param max   Not specified
     * @return Not specified
     * @throws NotInException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static short in(final short value, final short min, final short max) throws NotInException {
        if (OldObjects.notIn(value, min, max))
            throw new NotInException("The value must be more than or equal to the min and less than or equal to the max");
        return value;
    }

    /**
     * @param value Not specified
     * @param min   Not specified
     * @param max   Not specified
     * @return Not specified
     * @throws NotInException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static int in(final int value, final int min, final int max) throws NotInException {
        if (OldObjects.notIn(value, min, max))
            throw new NotInException("The value must be more than or equal to the min and less than or equal to the max");
        return value;
    }

    /**
     * @param value Not specified
     * @param min   Not specified
     * @param max   Not specified
     * @return Not specified
     * @throws NotInException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static long in(final long value, final long min, final float max) throws NotInException {
        if (OldObjects.notIn(value, min, max))
            throw new NotInException("The value must be more than or equal to the min and less than or equal to the max");
        return value;
    }

    /**
     * @param value Not specified
     * @param min   Not specified
     * @param max   Not specified
     * @return Not specified
     * @throws NotInException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static float in(final float value, final float min, final float max) throws NotInException {
        if (OldObjects.notIn(value, min, max))
            throw new NotInException("The value must be more than or equal to the min and less than or equal to the max");
        return value;
    }

    /**
     * @param value Not specified
     * @param min   Not specified
     * @param max   Not specified
     * @return Not specified
     * @throws NotInException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static double in(final byte value, final double min, final double max) throws NotInException {
        if (OldObjects.notIn(value, min, max))
            throw new NotInException("The value must be more than or equal to the min and less than or equal to the max");
        return value;
    }

    /**
     * @param value Not specified
     * @param min   Not specified
     * @param max   Not specified
     * @return Not specified
     * @throws NotInException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static byte in(final byte value, final byte min, final byte max, final String name, final String _name, final String __name) throws NotInException {
        if (OldObjects.notIn(value, min, max))
            throw new NotInException("The " + name + " must be more than or equal to the " + _name + " and less than or equal to the " + __name);
        return value;
    }

    /**
     * @param value Not specified
     * @param min   Not specified
     * @param max   Not specified
     * @return Not specified
     * @throws NotInException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static short in(final short value, final short min, final short max, final String name, final String _name, final String __name) throws NotInException {
        if (OldObjects.notIn(value, min, max))
            throw new NotInException("The " + name + " must be more than or equal to the " + _name + " and less than or equal to the " + __name);
        return value;
    }

    /**
     * @param value Not specified
     * @param min   Not specified
     * @param max   Not specified
     * @return Not specified
     * @throws NotInException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static int in(final int value, final int min, final int max, final String name, final String _name, final String __name) throws NotInException {
        if (OldObjects.notIn(value, min, max))
            throw new NotInException("The " + name + " must be more than or equal to the " + _name + " and less than or equal to the " + __name);
        return value;
    }

    /**
     * @param value Not specified
     * @param min   Not specified
     * @param max   Not specified
     * @return Not specified
     * @throws NotInException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static long in(final long value, final long min, final float max, final String name, final String _name, final String __name) throws NotInException {
        if (OldObjects.notIn(value, min, max))
            throw new NotInException("The " + name + " must be more than or equal to the " + _name + " and less than or equal to the " + __name);
        return value;
    }

    /**
     * @param value Not specified
     * @param min   Not specified
     * @param max   Not specified
     * @return Not specified
     * @throws NotInException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static float in(final float value, final float min, final float max, final String name, final String _name, final String __name) throws NotInException {
        if (OldObjects.notIn(value, min, max))
            throw new NotInException("The " + name + " must be more than or equal to the " + _name + " and less than or equal to the " + __name);
        return value;
    }

    /**
     * @param value Not specified
     * @param min   Not specified
     * @param max   Not specified
     * @return Not specified
     * @throws NotInException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static double in(final byte value, final double min, final double max, final String name, final String _name, final String __name) throws NotInException {
        if (OldObjects.notIn(value, min, max))
            throw new NotInException("The " + name + " must be more than or equal to the " + _name + " and less than or equal to the " + __name);
        return value;
    }

    /**
     * @param value Not specified
     * @param min   Not specified
     * @param max   Not specified
     * @return Not specified
     * @throws NotInException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static byte inX(final byte value, final byte min, final byte max, final String message) throws NotInException {
        if (OldObjects.notIn(value, min, max))
            throw new NotInException(message);
        return value;
    }

    /**
     * @param value Not specified
     * @param min   Not specified
     * @param max   Not specified
     * @return Not specified
     * @throws NotInException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static short inX(final short value, final short min, final short max, final String message) throws NotInException {
        if (OldObjects.notIn(value, min, max))
            throw new NotInException(message);
        return value;
    }

    /**
     * @param value Not specified
     * @param min   Not specified
     * @param max   Not specified
     * @return Not specified
     * @throws NotInException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static int inX(final int value, final int min, final int max, final String message) throws NotInException {
        if (OldObjects.notIn(value, min, max))
            throw new NotInException(message);
        return value;
    }

    /**
     * @param value Not specified
     * @param min   Not specified
     * @param max   Not specified
     * @return Not specified
     * @throws NotInException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static long inX(final long value, final long min, final float max, final String message) throws NotInException {
        if (OldObjects.notIn(value, min, max))
            throw new NotInException(message);
        return value;
    }

    /**
     * @param value Not specified
     * @param min   Not specified
     * @param max   Not specified
     * @return Not specified
     * @throws NotInException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static float inX(final float value, final float min, final float max, final String message) throws NotInException {
        if (OldObjects.notIn(value, min, max))
            throw new NotInException(message);
        return value;
    }

    /**
     * @param value Not specified
     * @param min   Not specified
     * @param max   Not specified
     * @return Not specified
     * @throws NotInException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static double inX(final double value, final double min, final double max, final String message) throws NotInException {
        if (OldObjects.notIn(value, min, max))
            throw new NotInException(message);
        return value;
    }

    /**
     * @param value Not specified
     * @param min   Not specified
     * @param max   Not specified
     * @return Not specified
     * @throws NotInException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static byte inX(final byte value, final byte min, final byte max, final Throwable cause) throws NotInException {
        if (OldObjects.notIn(value, min, max))
            throw new NotInException(cause);
        return value;
    }

    /**
     * @param value Not specified
     * @param min   Not specified
     * @param max   Not specified
     * @return Not specified
     * @throws NotInException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static short inX(final short value, final short min, final short max, final Throwable cause) throws NotInException {
        if (OldObjects.notIn(value, min, max))
            throw new NotInException(cause);
        return value;
    }

    /**
     * @param value Not specified
     * @param min   Not specified
     * @param max   Not specified
     * @return Not specified
     * @throws NotInException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static int inX(final int value, final int min, final int max, final Throwable cause) throws NotInException {
        if (OldObjects.notIn(value, min, max))
            throw new NotInException(cause);
        return value;
    }

    /**
     * @param value Not specified
     * @param min   Not specified
     * @param max   Not specified
     * @return Not specified
     * @throws NotInException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static long inX(final long value, final long min, final float max, final Throwable cause) throws NotInException {
        if (OldObjects.notIn(value, min, max))
            throw new NotInException(cause);
        return value;
    }

    /**
     * @param value Not specified
     * @param min   Not specified
     * @param max   Not specified
     * @return Not specified
     * @throws NotInException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static float inX(final float value, final float min, final float max, final Throwable cause) throws NotInException {
        if (OldObjects.notIn(value, min, max))
            throw new NotInException(cause);
        return value;
    }

    /**
     * @param value Not specified
     * @param min   Not specified
     * @param max   Not specified
     * @return Not specified
     * @throws NotInException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static double inX(final double value, final double min, final double max, final Throwable cause) throws NotInException {
        if (OldObjects.notIn(value, min, max))
            throw new NotInException(cause);
        return value;
    }

    /**
     * @param value   Not specified
     * @param min     Not specified
     * @param max     Not specified
     * @param message Not specified
     * @param cause   Not specified
     * @return Not specified
     * @throws NotInException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static byte inX(final byte value, final byte min, final byte max, final String message, final Throwable cause) throws NotInException {
        if (OldObjects.notIn(value, min, max))
            throw new NotInException(message, cause);
        return value;
    }

    /**
     * @param value   Not specified
     * @param min     Not specified
     * @param max     Not specified
     * @param message Not specified
     * @param cause   Not specified
     * @return Not specified
     * @throws NotInException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static short inX(final short value, final short min, final short max, final String message, final Throwable cause) throws NotInException {
        if (OldObjects.notIn(value, min, max))
            throw new NotInException(message, cause);
        return value;
    }

    /**
     * @param value   Not specified
     * @param min     Not specified
     * @param max     Not specified
     * @param message Not specified
     * @param cause   Not specified
     * @return Not specified
     * @throws NotInException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static int inX(final int value, final int min, final int max, final String message, final Throwable cause) throws NotInException {
        if (OldObjects.notIn(value, min, max))
            throw new NotInException(message, cause);
        return value;
    }

    /**
     * @param value   Not specified
     * @param min     Not specified
     * @param max     Not specified
     * @param message Not specified
     * @param cause   Not specified
     * @return Not specified
     * @throws NotInException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static long inX(final long value, final long min, final float max, final String message, final Throwable cause) throws NotInException {
        if (OldObjects.notIn(value, min, max))
            throw new NotInException(message, cause);
        return value;
    }

    /**
     * @param value   Not specified
     * @param min     Not specified
     * @param max     Not specified
     * @param message Not specified
     * @param cause   Not specified
     * @return Not specified
     * @throws NotInException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static float inX(final float value, final float min, final float max, final String message, final Throwable cause) throws NotInException {
        if (OldObjects.notIn(value, min, max))
            throw new NotInException(message, cause);
        return value;
    }

    /**
     * @param value   Not specified
     * @param min     Not specified
     * @param max     Not specified
     * @param message Not specified
     * @param cause   Not specified
     * @return Not specified
     * @throws NotInException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static double inX(final double value, final double min, final double max, final String message, final Throwable cause) throws NotInException {
        if (OldObjects.notIn(value, min, max))
            throw new NotInException(message, cause);
        return value;
    }

    /**
     * @param value      Not specified
     * @param min        Not specified
     * @param max        Not specified
     * @param message    Not specified
     * @param cause      Not specified
     * @param suppressed Not specified
     * @param writable   Not specified
     * @return Not specified
     * @throws NotInException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static byte inX(final byte value, final byte min, final byte max, final String message, final Throwable cause, final boolean suppressed, final boolean writable) throws NotInException {
        if (OldObjects.notIn(value, min, max))
            throw new NotInException(message, cause, suppressed, writable);
        return value;
    }

    /**
     * @param value      Not specified
     * @param min        Not specified
     * @param max        Not specified
     * @param message    Not specified
     * @param cause      Not specified
     * @param suppressed Not specified
     * @param writable   Not specified
     * @return Not specified
     * @throws NotInException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static short inX(final short value, final short min, final short max, final String message, final Throwable cause, final boolean suppressed, final boolean writable) throws NotInException {
        if (OldObjects.notIn(value, min, max))
            throw new NotInException(message, cause, suppressed, writable);
        return value;
    }

    /**
     * @param value      Not specified
     * @param min        Not specified
     * @param max        Not specified
     * @param message    Not specified
     * @param cause      Not specified
     * @param suppressed Not specified
     * @param writable   Not specified
     * @return Not specified
     * @throws NotInException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static int inX(final int value, final int min, final int max, final String message, final Throwable cause, final boolean suppressed, final boolean writable) throws NotInException {
        if (OldObjects.notIn(value, min, max))
            throw new NotInException(message, cause, suppressed, writable);
        return value;
    }

    /**
     * @param value      Not specified
     * @param min        Not specified
     * @param max        Not specified
     * @param message    Not specified
     * @param cause      Not specified
     * @param suppressed Not specified
     * @param writable   Not specified
     * @return Not specified
     * @throws NotInException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static long inX(final long value, final long min, final float max, final String message, final Throwable cause, final boolean suppressed, final boolean writable) throws NotInException {
        if (OldObjects.notIn(value, min, max))
            throw new NotInException(message, cause, suppressed, writable);
        return value;
    }

    /**
     * @param value      Not specified
     * @param min        Not specified
     * @param max        Not specified
     * @param message    Not specified
     * @param cause      Not specified
     * @param suppressed Not specified
     * @param writable   Not specified
     * @return Not specified
     * @throws NotInException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static float inX(final float value, final float min, final float max, final String message, final Throwable cause, final boolean suppressed, final boolean writable) throws NotInException {
        if (OldObjects.notIn(value, min, max))
            throw new NotInException(message, cause, suppressed, writable);
        return value;
    }

    /**
     * @param value      Not specified
     * @param min        Not specified
     * @param max        Not specified
     * @param message    Not specified
     * @param cause      Not specified
     * @param suppressed Not specified
     * @param writable   Not specified
     * @return Not specified
     * @throws NotInException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static double inX(final double value, final double min, final double max, final String message, final Throwable cause, final boolean suppressed, final boolean writable) throws NotInException {
        if (OldObjects.notIn(value, min, max))
            throw new NotInException(message, cause, suppressed, writable);
        return value;
    }

    /**
     * @param value Not specified
     * @param min   Not specified
     * @param max   Not specified
     * @return Not specified
     * @throws InException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static byte notIn(final byte value, final byte min, final byte max) throws InException {
        if (OldObjects.in(value, min, max))
            throw new InException("The value must not be more than or equal to the min and not be less than or equal to the max");
        return value;
    }

    /**
     * @param value Not specified
     * @param min   Not specified
     * @param max   Not specified
     * @return Not specified
     * @throws InException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static short notIn(final short value, final short min, final short max) throws InException {
        if (OldObjects.in(value, min, max))
            throw new InException("The value must not be more than or equal to the min and not be less than or equal to the max");
        return value;
    }

    /**
     * @param value Not specified
     * @param min   Not specified
     * @param max   Not specified
     * @return Not specified
     * @throws InException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static int notIn(final int value, final int min, final int max) throws InException {
        if (OldObjects.in(value, min, max))
            throw new InException("The value must not be more than or equal to the min and not be less than or equal to the max");
        return value;
    }

    /**
     * @param value Not specified
     * @param min   Not specified
     * @param max   Not specified
     * @return Not specified
     * @throws InException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static long notIn(final long value, final long min, final float max) throws InException {
        if (OldObjects.in(value, min, max))
            throw new InException("The value must not be more than or equal to the min and not be less than or equal to the max");
        return value;
    }

    /**
     * @param value Not specified
     * @param min   Not specified
     * @param max   Not specified
     * @return Not specified
     * @throws InException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static float notIn(final float value, final float min, final float max) throws InException {
        if (OldObjects.in(value, min, max))
            throw new InException("The value must not be more than or equal to the min and not be less than or equal to the max");
        return value;
    }

    /**
     * @param value Not specified
     * @param min   Not specified
     * @param max   Not specified
     * @return Not specified
     * @throws InException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static double notIn(final byte value, final double min, final double max) throws InException {
        if (OldObjects.in(value, min, max))
            throw new InException("The value must not be more than or equal to the min and not be less than or equal to the max");
        return value;
    }

    /**
     * @param value Not specified
     * @param min   Not specified
     * @param max   Not specified
     * @return Not specified
     * @throws InException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static byte notIn(final byte value, final byte min, final byte max, final String name, final String _name, final String __name) throws InException {
        if (OldObjects.notIn(value, min, max))
            throw new NotInException("The " + name + " must not be more than or equal to the " + _name + " and not be less than or equal to the " + __name);
        return value;
    }

    /**
     * @param value Not specified
     * @param min   Not specified
     * @param max   Not specified
     * @return Not specified
     * @throws InException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static short notIn(final short value, final short min, final short max, final String name, final String _name, final String __name) throws InException {
        if (OldObjects.notIn(value, min, max))
            throw new NotInException("The " + name + " must not be more than or equal to the " + _name + " and not be less than or equal to the " + __name);
        return value;
    }

    /**
     * @param value Not specified
     * @param min   Not specified
     * @param max   Not specified
     * @return Not specified
     * @throws InException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static int notIn(final int value, final int min, final int max, final String name, final String _name, final String __name) throws InException {
        if (OldObjects.notIn(value, min, max))
            throw new NotInException("The " + name + " must not be more than or equal to the " + _name + " and not be less than or equal to the " + __name);
        return value;
    }

    /**
     * @param value Not specified
     * @param min   Not specified
     * @param max   Not specified
     * @return Not specified
     * @throws InException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static long notIn(final long value, final long min, final float max, final String name, final String _name, final String __name) throws InException {
        if (OldObjects.notIn(value, min, max))
            throw new NotInException("The " + name + " must not be more than or equal to the " + _name + " and not be less than or equal to the " + __name);
        return value;
    }

    /**
     * @param value Not specified
     * @param min   Not specified
     * @param max   Not specified
     * @return Not specified
     * @throws InException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static float notIn(final float value, final float min, final float max, final String name, final String _name, final String __name) throws InException {
        if (OldObjects.notIn(value, min, max))
            throw new NotInException("The " + name + " must not be more than or equal to the " + _name + " and not be less than or equal to the " + __name);
        return value;
    }

    /**
     * @param value Not specified
     * @param min   Not specified
     * @param max   Not specified
     * @return Not specified
     * @throws InException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static double notIn(final byte value, final double min, final double max, final String name, final String _name, final String __name) throws InException {
        if (OldObjects.notIn(value, min, max))
            throw new NotInException("The " + name + " must not be more than or equal to the " + _name + " and not be less than or equal to the " + __name);
        return value;
    }

    /**
     * @param value Not specified
     * @param min   Not specified
     * @param max   Not specified
     * @return Not specified
     * @throws InException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static byte notInX(final byte value, final byte min, final byte max, final String message) throws InException {
        if (OldObjects.in(value, min, max))
            throw new InException(message);
        return value;
    }

    /**
     * @param value Not specified
     * @param min   Not specified
     * @param max   Not specified
     * @return Not specified
     * @throws InException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static short notInX(final short value, final short min, final short max, final String message) throws InException {
        if (OldObjects.in(value, min, max))
            throw new InException(message);
        return value;
    }

    /**
     * @param value Not specified
     * @param min   Not specified
     * @param max   Not specified
     * @return Not specified
     * @throws InException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static int notInX(final int value, final int min, final int max, final String message) throws InException {
        if (OldObjects.in(value, min, max))
            throw new InException(message);
        return value;
    }

    /**
     * @param value Not specified
     * @param min   Not specified
     * @param max   Not specified
     * @return Not specified
     * @throws InException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static long notInX(final long value, final long min, final float max, final String message) throws InException {
        if (OldObjects.in(value, min, max))
            throw new InException(message);
        return value;
    }

    /**
     * @param value Not specified
     * @param min   Not specified
     * @param max   Not specified
     * @return Not specified
     * @throws InException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static float notInX(final float value, final float min, final float max, final String message) throws InException {
        if (OldObjects.in(value, min, max))
            throw new InException(message);
        return value;
    }

    /**
     * @param value Not specified
     * @param min   Not specified
     * @param max   Not specified
     * @return Not specified
     * @throws InException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static double notInX(final double value, final double min, final double max, final String message) throws InException {
        if (OldObjects.in(value, min, max))
            throw new InException(message);
        return value;
    }

    /**
     * @param value Not specified
     * @param min   Not specified
     * @param max   Not specified
     * @return Not specified
     * @throws InException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static byte notInX(final byte value, final byte min, final byte max, final Throwable cause) throws InException {
        if (OldObjects.in(value, min, max))
            throw new InException(cause);
        return value;
    }

    /**
     * @param value Not specified
     * @param min   Not specified
     * @param max   Not specified
     * @return Not specified
     * @throws InException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static short notInX(final short value, final short min, final short max, final Throwable cause) throws InException {
        if (OldObjects.in(value, min, max))
            throw new InException(cause);
        return value;
    }

    /**
     * @param value Not specified
     * @param min   Not specified
     * @param max   Not specified
     * @return Not specified
     * @throws InException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static int notInX(final int value, final int min, final int max, final Throwable cause) throws InException {
        if (OldObjects.in(value, min, max))
            throw new InException(cause);
        return value;
    }

    /**
     * @param value Not specified
     * @param min   Not specified
     * @param max   Not specified
     * @return Not specified
     * @throws InException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static long notInX(final long value, final long min, final float max, final Throwable cause) throws InException {
        if (OldObjects.in(value, min, max))
            throw new InException(cause);
        return value;
    }

    /**
     * @param value Not specified
     * @param min   Not specified
     * @param max   Not specified
     * @return Not specified
     * @throws InException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static float notInX(final float value, final float min, final float max, final Throwable cause) throws InException {
        if (OldObjects.in(value, min, max))
            throw new InException(cause);
        return value;
    }

    /**
     * @param value Not specified
     * @param min   Not specified
     * @param max   Not specified
     * @return Not specified
     * @throws InException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static double notInX(final double value, final double min, final double max, final Throwable cause) throws InException {
        if (OldObjects.in(value, min, max))
            throw new InException(cause);
        return value;
    }

    /**
     * @param value   Not specified
     * @param min     Not specified
     * @param max     Not specified
     * @param message Not specified
     * @param cause   Not specified
     * @return Not specified
     * @throws InException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static byte notInX(final byte value, final byte min, final byte max, final String message, final Throwable cause) throws InException {
        if (OldObjects.in(value, min, max))
            throw new InException(message, cause);
        return value;
    }

    /**
     * @param value   Not specified
     * @param min     Not specified
     * @param max     Not specified
     * @param message Not specified
     * @param cause   Not specified
     * @return Not specified
     * @throws InException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static short notInX(final short value, final short min, final short max, final String message, final Throwable cause) throws InException {
        if (OldObjects.in(value, min, max))
            throw new InException(message, cause);
        return value;
    }

    /**
     * @param value   Not specified
     * @param min     Not specified
     * @param max     Not specified
     * @param message Not specified
     * @param cause   Not specified
     * @return Not specified
     * @throws InException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static int notInX(final int value, final int min, final int max, final String message, final Throwable cause) throws InException {
        if (OldObjects.in(value, min, max))
            throw new InException(message, cause);
        return value;
    }

    /**
     * @param value   Not specified
     * @param min     Not specified
     * @param max     Not specified
     * @param message Not specified
     * @param cause   Not specified
     * @return Not specified
     * @throws InException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static long notInX(final long value, final long min, final float max, final String message, final Throwable cause) throws InException {
        if (OldObjects.in(value, min, max))
            throw new InException(message, cause);
        return value;
    }

    /**
     * @param value   Not specified
     * @param min     Not specified
     * @param max     Not specified
     * @param message Not specified
     * @param cause   Not specified
     * @return Not specified
     * @throws InException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static float notInX(final float value, final float min, final float max, final String message, final Throwable cause) throws InException {
        if (OldObjects.in(value, min, max))
            throw new InException(message, cause);
        return value;
    }

    /**
     * @param value   Not specified
     * @param min     Not specified
     * @param max     Not specified
     * @param message Not specified
     * @param cause   Not specified
     * @return Not specified
     * @throws InException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static double notInX(final double value, final double min, final double max, final String message, final Throwable cause) throws InException {
        if (OldObjects.in(value, min, max))
            throw new InException(message, cause);
        return value;
    }

    /**
     * @param value      Not specified
     * @param min        Not specified
     * @param max        Not specified
     * @param message    Not specified
     * @param cause      Not specified
     * @param suppressed Not specified
     * @param writable   Not specified
     * @return Not specified
     * @throws InException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static byte notInX(final byte value, final byte min, final byte max, final String message, final Throwable cause, final boolean suppressed, final boolean writable) throws InException {
        if (OldObjects.in(value, min, max))
            throw new InException(message, cause, suppressed, writable);
        return value;
    }

    /**
     * @param value      Not specified
     * @param min        Not specified
     * @param max        Not specified
     * @param message    Not specified
     * @param cause      Not specified
     * @param suppressed Not specified
     * @param writable   Not specified
     * @return Not specified
     * @throws InException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static short notInX(final short value, final short min, final short max, final String message, final Throwable cause, final boolean suppressed, final boolean writable) throws InException {
        if (OldObjects.in(value, min, max))
            throw new InException(message, cause, suppressed, writable);
        return value;
    }

    /**
     * @param value      Not specified
     * @param min        Not specified
     * @param max        Not specified
     * @param message    Not specified
     * @param cause      Not specified
     * @param suppressed Not specified
     * @param writable   Not specified
     * @return Not specified
     * @throws InException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static int notInX(final int value, final int min, final int max, final String message, final Throwable cause, final boolean suppressed, final boolean writable) throws InException {
        if (OldObjects.in(value, min, max))
            throw new InException(message, cause, suppressed, writable);
        return value;
    }

    /**
     * @param value      Not specified
     * @param min        Not specified
     * @param max        Not specified
     * @param message    Not specified
     * @param cause      Not specified
     * @param suppressed Not specified
     * @param writable   Not specified
     * @return Not specified
     * @throws InException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static long notInX(final long value, final long min, final float max, final String message, final Throwable cause, final boolean suppressed, final boolean writable) throws InException {
        if (OldObjects.in(value, min, max))
            throw new InException(message, cause, suppressed, writable);
        return value;
    }

    /**
     * @param value      Not specified
     * @param min        Not specified
     * @param max        Not specified
     * @param message    Not specified
     * @param cause      Not specified
     * @param suppressed Not specified
     * @param writable   Not specified
     * @return Not specified
     * @throws InException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static float notInX(final float value, final float min, final float max, final String message, final Throwable cause, final boolean suppressed, final boolean writable) throws InException {
        if (OldObjects.in(value, min, max))
            throw new InException(message, cause, suppressed, writable);
        return value;
    }

    /**
     * @param value      Not specified
     * @param min        Not specified
     * @param max        Not specified
     * @param message    Not specified
     * @param cause      Not specified
     * @param suppressed Not specified
     * @param writable   Not specified
     * @return Not specified
     * @throws InException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static double notInX(final double value, final double min, final double max, final String message, final Throwable cause, final boolean suppressed, final boolean writable) throws InException {
        if (OldObjects.in(value, min, max))
            throw new InException(message, cause, suppressed, writable);
        return value;
    }

    /**
     * @param value Not specified
     * @param min   Not specified
     * @param max   Not specified
     * @return Not specified
     * @throws NotOutException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static byte out(final byte value, final byte min, final byte max) throws NotOutException {
        if (OldObjects.notOut(value, min, max))
            throw new NotOutException("The value must be less than the min or more than the max");
        return value;
    }

    /**
     * @param value Not specified
     * @param min   Not specified
     * @param max   Not specified
     * @return Not specified
     * @throws NotOutException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static short out(final short value, final short min, final short max) throws NotOutException {
        if (OldObjects.notOut(value, min, max))
            throw new NotOutException("The value must be less than the min or more than the max");
        return value;
    }

    /**
     * @param value Not specified
     * @param min   Not specified
     * @param max   Not specified
     * @return Not specified
     * @throws NotOutException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static int out(final int value, final int min, final int max) throws NotOutException {
        if (OldObjects.notOut(value, min, max))
            throw new NotOutException("The value must be less than the min or more than the max");
        return value;
    }

    /**
     * @param value Not specified
     * @param min   Not specified
     * @param max   Not specified
     * @return Not specified
     * @throws NotOutException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static long out(final long value, final long min, final long max) throws NotOutException {
        if (OldObjects.notOut(value, min, max))
            throw new NotOutException("The value must be less than the min or more than the max");
        return value;
    }

    /**
     * @param value Not specified
     * @param min   Not specified
     * @param max   Not specified
     * @return Not specified
     * @throws NotOutException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static float out(final float value, final float min, final float max) throws NotOutException {
        if (OldObjects.notOut(value, min, max))
            throw new NotOutException("The value must be less than the min or more than the max");
        return value;
    }

    /**
     * @param value Not specified
     * @param min   Not specified
     * @param max   Not specified
     * @return Not specified
     * @throws NotOutException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static double out(final byte value, final double min, final double max) throws NotOutException {
        if (OldObjects.notOut(value, min, max))
            throw new NotOutException("The value must be less than the min or more than the max");
        return value;
    }

    /**
     * @param value Not specified
     * @param min   Not specified
     * @param max   Not specified
     * @return Not specified
     * @throws NotOutException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static byte out(final byte value, final byte min, final byte max, final String name, final String _name, final String __name) throws NotOutException {
        if (OldObjects.notOut(value, min, max))
            throw new NotOutException("The " + name + " must be less than the " + _name + " or more than the " + __name);
        return value;
    }

    /**
     * @param value Not specified
     * @param min   Not specified
     * @param max   Not specified
     * @return Not specified
     * @throws NotOutException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static short out(final short value, final short min, final short max, final String name, final String _name, final String __name) throws NotOutException {
        if (OldObjects.notOut(value, min, max))
            throw new NotOutException("The " + name + " must be less than the " + _name + " or more than the " + __name);
        return value;
    }

    /**
     * @param value Not specified
     * @param min   Not specified
     * @param max   Not specified
     * @return Not specified
     * @throws NotOutException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static int out(final int value, final int min, final int max, final String name, final String _name, final String __name) throws NotOutException {
        if (OldObjects.notOut(value, min, max))
            throw new NotOutException("The " + name + " must be less than the " + _name + " or more than the " + __name);
        return value;
    }

    /**
     * @param value Not specified
     * @param min   Not specified
     * @param max   Not specified
     * @return Not specified
     * @throws NotOutException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static long out(final long value, final long min, final long max, final String name, final String _name, final String __name) throws NotOutException {
        if (OldObjects.notOut(value, min, max))
            throw new NotOutException("The " + name + " must be less than the " + _name + " or more than the " + __name);
        return value;
    }

    /**
     * @param value Not specified
     * @param min   Not specified
     * @param max   Not specified
     * @return Not specified
     * @throws NotOutException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static float out(final float value, final float min, final float max, final String name, final String _name, final String __name) throws NotOutException {
        if (OldObjects.notOut(value, min, max))
            throw new NotOutException("The " + name + " must be less than the " + _name + " or more than the " + __name);
        return value;
    }

    /**
     * @param value Not specified
     * @param min   Not specified
     * @param max   Not specified
     * @return Not specified
     * @throws NotOutException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static double out(final byte value, final double min, final double max, final String name, final String _name, final String __name) throws NotOutException {
        if (OldObjects.notOut(value, min, max))
            throw new NotOutException("The " + name + " must be less than the " + _name + " or more than the " + __name);
        return value;
    }

    /**
     * @param value Not specified
     * @param min   Not specified
     * @param max   Not specified
     * @return Not specified
     * @throws NotOutException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static byte outX(final byte value, final byte min, final byte max, final String message) throws NotOutException {
        if (OldObjects.notOut(value, min, max))
            throw new NotOutException(message);
        return value;
    }

    /**
     * @param value Not specified
     * @param min   Not specified
     * @param max   Not specified
     * @return Not specified
     * @throws NotOutException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static short outX(final short value, final short min, final short max, final String message) throws NotOutException {
        if (OldObjects.notOut(value, min, max))
            throw new NotOutException(message);
        return value;
    }

    /**
     * @param value Not specified
     * @param min   Not specified
     * @param max   Not specified
     * @return Not specified
     * @throws NotOutException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static int outX(final int value, final int min, final int max, final String message) throws NotOutException {
        if (OldObjects.notOut(value, min, max))
            throw new NotOutException(message);
        return value;
    }

    /**
     * @param value Not specified
     * @param min   Not specified
     * @param max   Not specified
     * @return Not specified
     * @throws NotOutException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static long outX(final long value, final long min, final float max, final String message) throws NotOutException {
        if (OldObjects.notOut(value, min, max))
            throw new NotOutException(message);
        return value;
    }

    /**
     * @param value Not specified
     * @param min   Not specified
     * @param max   Not specified
     * @return Not specified
     * @throws NotOutException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static float outX(final float value, final float min, final float max, final String message) throws NotOutException {
        if (OldObjects.notOut(value, min, max))
            throw new NotOutException(message);
        return value;
    }

    /**
     * @param value Not specified
     * @param min   Not specified
     * @param max   Not specified
     * @return Not specified
     * @throws NotOutException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static double outX(final double value, final double min, final double max, final String message) throws NotOutException {
        if (OldObjects.notOut(value, min, max))
            throw new NotOutException(message);
        return value;
    }

    /**
     * @param value Not specified
     * @param min   Not specified
     * @param max   Not specified
     * @return Not specified
     * @throws NotOutException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static byte outX(final byte value, final byte min, final byte max, final Throwable cause) throws NotOutException {
        if (OldObjects.notOut(value, min, max))
            throw new NotOutException(cause);
        return value;
    }

    /**
     * @param value Not specified
     * @param min   Not specified
     * @param max   Not specified
     * @return Not specified
     * @throws NotOutException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static short outX(final short value, final short min, final short max, final Throwable cause) throws NotOutException {
        if (OldObjects.notOut(value, min, max))
            throw new NotOutException(cause);
        return value;
    }

    /**
     * @param value Not specified
     * @param min   Not specified
     * @param max   Not specified
     * @return Not specified
     * @throws NotOutException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static int outX(final int value, final int min, final int max, final Throwable cause) throws NotOutException {
        if (OldObjects.notOut(value, min, max))
            throw new NotOutException(cause);
        return value;
    }

    /**
     * @param value Not specified
     * @param min   Not specified
     * @param max   Not specified
     * @return Not specified
     * @throws NotOutException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static long outX(final long value, final long min, final float max, final Throwable cause) throws NotOutException {
        if (OldObjects.notOut(value, min, max))
            throw new NotOutException(cause);
        return value;
    }

    /**
     * @param value Not specified
     * @param min   Not specified
     * @param max   Not specified
     * @return Not specified
     * @throws NotOutException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static float outX(final float value, final float min, final float max, final Throwable cause) throws NotOutException {
        if (OldObjects.notOut(value, min, max))
            throw new NotOutException(cause);
        return value;
    }

    /**
     * @param value Not specified
     * @param min   Not specified
     * @param max   Not specified
     * @return Not specified
     * @throws NotOutException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static double outX(final double value, final double min, final double max, final Throwable cause) throws NotOutException {
        if (OldObjects.notOut(value, min, max))
            throw new NotOutException(cause);
        return value;
    }

    /**
     * @param value   Not specified
     * @param min     Not specified
     * @param max     Not specified
     * @param message Not specified
     * @param cause   Not specified
     * @return Not specified
     * @throws NotOutException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static byte outX(final byte value, final byte min, final byte max, final String message, final Throwable cause) throws NotOutException {
        if (OldObjects.notOut(value, min, max))
            throw new NotOutException(message, cause);
        return value;
    }

    /**
     * @param value   Not specified
     * @param min     Not specified
     * @param max     Not specified
     * @param message Not specified
     * @param cause   Not specified
     * @return Not specified
     * @throws NotOutException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static short outX(final short value, final short min, final short max, final String message, final Throwable cause) throws NotOutException {
        if (OldObjects.notOut(value, min, max))
            throw new NotOutException(message, cause);
        return value;
    }

    /**
     * @param value   Not specified
     * @param min     Not specified
     * @param max     Not specified
     * @param message Not specified
     * @param cause   Not specified
     * @return Not specified
     * @throws NotOutException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static int outX(final int value, final int min, final int max, final String message, final Throwable cause) throws NotOutException {
        if (OldObjects.notOut(value, min, max))
            throw new NotOutException(message, cause);
        return value;
    }

    /**
     * @param value   Not specified
     * @param min     Not specified
     * @param max     Not specified
     * @param message Not specified
     * @param cause   Not specified
     * @return Not specified
     * @throws NotOutException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static long outX(final long value, final long min, final float max, final String message, final Throwable cause) throws NotOutException {
        if (OldObjects.notOut(value, min, max))
            throw new NotOutException(message, cause);
        return value;
    }

    /**
     * @param value   Not specified
     * @param min     Not specified
     * @param max     Not specified
     * @param message Not specified
     * @param cause   Not specified
     * @return Not specified
     * @throws NotOutException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static float outX(final float value, final float min, final float max, final String message, final Throwable cause) throws NotOutException {
        if (OldObjects.notOut(value, min, max))
            throw new NotOutException(message, cause);
        return value;
    }

    /**
     * @param value   Not specified
     * @param min     Not specified
     * @param max     Not specified
     * @param message Not specified
     * @param cause   Not specified
     * @return Not specified
     * @throws NotOutException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static double outX(final double value, final double min, final double max, final String message, final Throwable cause) throws NotOutException {
        if (OldObjects.notOut(value, min, max))
            throw new NotOutException(message, cause);
        return value;
    }

    /**
     * @param value      Not specified
     * @param min        Not specified
     * @param max        Not specified
     * @param message    Not specified
     * @param cause      Not specified
     * @param suppressed Not specified
     * @param writable   Not specified
     * @return Not specified
     * @throws NotOutException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static byte outX(final byte value, final byte min, final byte max, final String message, final Throwable cause, final boolean suppressed, final boolean writable) throws NotOutException {
        if (OldObjects.notOut(value, min, max))
            throw new NotOutException(message, cause, suppressed, writable);
        return value;
    }

    /**
     * @param value      Not specified
     * @param min        Not specified
     * @param max        Not specified
     * @param message    Not specified
     * @param cause      Not specified
     * @param suppressed Not specified
     * @param writable   Not specified
     * @return Not specified
     * @throws NotOutException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static short outX(final short value, final short min, final short max, final String message, final Throwable cause, final boolean suppressed, final boolean writable) throws NotOutException {
        if (OldObjects.notOut(value, min, max))
            throw new NotOutException(message, cause, suppressed, writable);
        return value;
    }

    /**
     * @param value      Not specified
     * @param min        Not specified
     * @param max        Not specified
     * @param message    Not specified
     * @param cause      Not specified
     * @param suppressed Not specified
     * @param writable   Not specified
     * @return Not specified
     * @throws NotOutException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static int outX(final int value, final int min, final int max, final String message, final Throwable cause, final boolean suppressed, final boolean writable) throws NotOutException {
        if (OldObjects.notOut(value, min, max))
            throw new NotOutException(message, cause, suppressed, writable);
        return value;
    }

    /**
     * @param value      Not specified
     * @param min        Not specified
     * @param max        Not specified
     * @param message    Not specified
     * @param cause      Not specified
     * @param suppressed Not specified
     * @param writable   Not specified
     * @return Not specified
     * @throws NotOutException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static long outX(final long value, final long min, final float max, final String message, final Throwable cause, final boolean suppressed, final boolean writable) throws NotOutException {
        if (OldObjects.notOut(value, min, max))
            throw new NotOutException(message, cause, suppressed, writable);
        return value;
    }

    /**
     * @param value      Not specified
     * @param min        Not specified
     * @param max        Not specified
     * @param message    Not specified
     * @param cause      Not specified
     * @param suppressed Not specified
     * @param writable   Not specified
     * @return Not specified
     * @throws NotOutException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static float outX(final float value, final float min, final float max, final String message, final Throwable cause, final boolean suppressed, final boolean writable) throws NotOutException {
        if (OldObjects.notOut(value, min, max))
            throw new NotOutException(message, cause, suppressed, writable);
        return value;
    }

    /**
     * @param value      Not specified
     * @param min        Not specified
     * @param max        Not specified
     * @param message    Not specified
     * @param cause      Not specified
     * @param suppressed Not specified
     * @param writable   Not specified
     * @return Not specified
     * @throws NotOutException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static double outX(final double value, final double min, final double max, final String message, final Throwable cause, final boolean suppressed, final boolean writable) throws NotOutException {
        if (OldObjects.notOut(value, min, max))
            throw new NotOutException(message, cause, suppressed, writable);
        return value;
    }

    /**
     * @param value Not specified
     * @param min   Not specified
     * @param max   Not specified
     * @return Not specified
     * @throws OutException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static byte notOut(final byte value, final byte min, final byte max) throws OutException {
        if (OldObjects.out(value, min, max))
            throw new OutException("The value must not be less than the min and not be more than the max");
        return value;
    }

    /**
     * @param value Not specified
     * @param min   Not specified
     * @param max   Not specified
     * @return Not specified
     * @throws OutException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static short notOut(final short value, final short min, final short max) throws OutException {
        if (OldObjects.out(value, min, max))
            throw new OutException("The value must not be less than the min and not be more than the max");
        return value;
    }

    /**
     * @param value Not specified
     * @param min   Not specified
     * @param max   Not specified
     * @return Not specified
     * @throws OutException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static int notOut(final int value, final int min, final int max) throws OutException {
        if (OldObjects.out(value, min, max))
            throw new OutException("The value must not be less than the min and not be more than the max");
        return value;
    }

    /**
     * @param value Not specified
     * @param min   Not specified
     * @param max   Not specified
     * @return Not specified
     * @throws OutException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static long notOut(final long value, final long min, final long max) throws OutException {
        if (OldObjects.out(value, min, max))
            throw new OutException("The value must not be less than the min and not be more than the max");
        return value;
    }

    /**
     * @param value Not specified
     * @param min   Not specified
     * @param max   Not specified
     * @return Not specified
     * @throws OutException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static float notOut(final float value, final float min, final float max) throws OutException {
        if (OldObjects.out(value, min, max))
            throw new OutException("The value must not be less than the min and not be more than the max");
        return value;
    }

    /**
     * @param value Not specified
     * @param min   Not specified
     * @param max   Not specified
     * @return Not specified
     * @throws OutException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static double notOut(final byte value, final double min, final double max) throws OutException {
        if (OldObjects.out(value, min, max))
            throw new OutException("The value must not be less than the min and not be more than the max");
        return value;
    }

    /**
     * @param value Not specified
     * @param min   Not specified
     * @param max   Not specified
     * @return Not specified
     * @throws OutException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static byte notOut(final byte value, final byte min, final byte max, final String name, final String _name, final String __name) throws OutException {
        if (OldObjects.out(value, min, max))
            throw new OutException("The " + name + " must not be less than the " + _name + " and not be more than the " + __name);
        return value;
    }

    /**
     * @param value Not specified
     * @param min   Not specified
     * @param max   Not specified
     * @return Not specified
     * @throws OutException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static short notOut(final short value, final short min, final short max, final String name, final String _name, final String __name) throws OutException {
        if (OldObjects.out(value, min, max))
            throw new OutException("The " + name + " must not be less than the " + _name + " and not be more than the " + __name);
        return value;
    }

    /**
     * @param value Not specified
     * @param min   Not specified
     * @param max   Not specified
     * @return Not specified
     * @throws OutException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static int notOut(final int value, final int min, final int max, final String name, final String _name, final String __name) throws OutException {
        if (OldObjects.out(value, min, max))
            throw new OutException("The " + name + " must not be less than the " + _name + " and not be more than the " + __name);
        return value;
    }

    /**
     * @param value Not specified
     * @param min   Not specified
     * @param max   Not specified
     * @return Not specified
     * @throws OutException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static long notOut(final long value, final long min, final long max, final String name, final String _name, final String __name) throws OutException {
        if (OldObjects.out(value, min, max))
            throw new OutException("The " + name + " must not be less than the " + _name + " and not be more than the " + __name);
        return value;
    }

    /**
     * @param value Not specified
     * @param min   Not specified
     * @param max   Not specified
     * @return Not specified
     * @throws OutException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static float notOut(final float value, final float min, final float max, final String name, final String _name, final String __name) throws OutException {
        if (OldObjects.out(value, min, max))
            throw new OutException("The " + name + " must not be less than the " + _name + " and not be more than the " + __name);
        return value;
    }

    /**
     * @param value Not specified
     * @param min   Not specified
     * @param max   Not specified
     * @return Not specified
     * @throws OutException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static double notOut(final byte value, final double min, final double max, final String name, final String _name, final String __name) throws OutException {
        if (OldObjects.out(value, min, max))
            throw new OutException("The " + name + " must not be less than the " + _name + " and not be more than the " + __name);
        return value;
    }

    /**
     * @param value Not specified
     * @param min   Not specified
     * @param max   Not specified
     * @return Not specified
     * @throws OutException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static byte notOutX(final byte value, final byte min, final byte max, final String message) throws OutException {
        if (OldObjects.out(value, min, max))
            throw new OutException(message);
        return value;
    }

    /**
     * @param value Not specified
     * @param min   Not specified
     * @param max   Not specified
     * @return Not specified
     * @throws OutException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static short notOutX(final short value, final short min, final short max, final String message) throws OutException {
        if (OldObjects.out(value, min, max))
            throw new OutException(message);
        return value;
    }

    /**
     * @param value Not specified
     * @param min   Not specified
     * @param max   Not specified
     * @return Not specified
     * @throws OutException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static int notOutX(final int value, final int min, final int max, final String message) throws OutException {
        if (OldObjects.out(value, min, max))
            throw new OutException(message);
        return value;
    }

    /**
     * @param value Not specified
     * @param min   Not specified
     * @param max   Not specified
     * @return Not specified
     * @throws OutException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static long notOutX(final long value, final long min, final long max, final String message) throws OutException {
        if (OldObjects.out(value, min, max))
            throw new OutException(message);
        return value;
    }

    /**
     * @param value Not specified
     * @param min   Not specified
     * @param max   Not specified
     * @return Not specified
     * @throws OutException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static float notOutX(final float value, final float min, final float max, final String message) throws OutException {
        if (OldObjects.out(value, min, max))
            throw new OutException(message);
        return value;
    }

    /**
     * @param value Not specified
     * @param min   Not specified
     * @param max   Not specified
     * @return Not specified
     * @throws OutException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static double notOutX(final double value, final double min, final double max, final String message) throws OutException {
        if (OldObjects.out(value, min, max))
            throw new OutException(message);
        return value;
    }

    /**
     * @param value Not specified
     * @param min   Not specified
     * @param max   Not specified
     * @return Not specified
     * @throws OutException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static byte notOutX(final byte value, final byte min, final byte max, final Throwable cause) throws OutException {
        if (OldObjects.out(value, min, max))
            throw new OutException(cause);
        return value;
    }

    /**
     * @param value Not specified
     * @param min   Not specified
     * @param max   Not specified
     * @return Not specified
     * @throws OutException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static short notOutX(final short value, final short min, final short max, final Throwable cause) throws OutException {
        if (OldObjects.out(value, min, max))
            throw new OutException(cause);
        return value;
    }

    /**
     * @param value Not specified
     * @param min   Not specified
     * @param max   Not specified
     * @return Not specified
     * @throws OutException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static int notOutX(final int value, final int min, final int max, final Throwable cause) throws OutException {
        if (OldObjects.out(value, min, max))
            throw new OutException(cause);
        return value;
    }

    /**
     * @param value Not specified
     * @param min   Not specified
     * @param max   Not specified
     * @return Not specified
     * @throws OutException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static long notOutX(final long value, final long min, final long max, final Throwable cause) throws OutException {
        if (OldObjects.out(value, min, max))
            throw new OutException(cause);
        return value;
    }

    /**
     * @param value Not specified
     * @param min   Not specified
     * @param max   Not specified
     * @return Not specified
     * @throws OutException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static float notOutX(final float value, final float min, final float max, final Throwable cause) throws OutException {
        if (OldObjects.out(value, min, max))
            throw new OutException(cause);
        return value;
    }

    /**
     * @param value Not specified
     * @param min   Not specified
     * @param max   Not specified
     * @return Not specified
     * @throws OutException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static double notOutX(final double value, final double min, final double max, final Throwable cause) throws OutException {
        if (OldObjects.out(value, min, max))
            throw new OutException(cause);
        return value;
    }

    /**
     * @param value   Not specified
     * @param min     Not specified
     * @param max     Not specified
     * @param message Not specified
     * @param cause   Not specified
     * @return Not specified
     * @throws OutException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static byte notOutX(final byte value, final byte min, final byte max, final String message, final Throwable cause) throws OutException {
        if (OldObjects.out(value, min, max))
            throw new OutException(message, cause);
        return value;
    }

    /**
     * @param value   Not specified
     * @param min     Not specified
     * @param max     Not specified
     * @param message Not specified
     * @param cause   Not specified
     * @return Not specified
     * @throws OutException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static short notOutX(final short value, final short min, final short max, final String message, final Throwable cause) throws OutException {
        if (OldObjects.out(value, min, max))
            throw new OutException(message, cause);
        return value;
    }

    /**
     * @param value   Not specified
     * @param min     Not specified
     * @param max     Not specified
     * @param message Not specified
     * @param cause   Not specified
     * @return Not specified
     * @throws OutException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static int notOutX(final int value, final int min, final int max, final String message, final Throwable cause) throws OutException {
        if (OldObjects.out(value, min, max))
            throw new OutException(message, cause);
        return value;
    }

    /**
     * @param value   Not specified
     * @param min     Not specified
     * @param max     Not specified
     * @param message Not specified
     * @param cause   Not specified
     * @return Not specified
     * @throws OutException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static long notOutX(final long value, final long min, final long max, final String message, final Throwable cause) throws OutException {
        if (OldObjects.out(value, min, max))
            throw new OutException(message, cause);
        return value;
    }

    /**
     * @param value   Not specified
     * @param min     Not specified
     * @param max     Not specified
     * @param message Not specified
     * @param cause   Not specified
     * @return Not specified
     * @throws OutException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static float notOutX(final float value, final float min, final float max, final String message, final Throwable cause) throws OutException {
        if (OldObjects.out(value, min, max))
            throw new OutException(message, cause);
        return value;
    }

    /**
     * @param value   Not specified
     * @param min     Not specified
     * @param max     Not specified
     * @param message Not specified
     * @param cause   Not specified
     * @return Not specified
     * @throws OutException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static double notOutX(final double value, final double min, final double max, final String message, final Throwable cause) throws OutException {
        if (OldObjects.out(value, min, max))
            throw new OutException(message, cause);
        return value;
    }

    /**
     * @param value      Not specified
     * @param min        Not specified
     * @param max        Not specified
     * @param message    Not specified
     * @param cause      Not specified
     * @param suppressed Not specified
     * @param writable   Not specified
     * @return Not specified
     * @throws OutException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static byte notOutX(final byte value, final byte min, final byte max, final String message, final Throwable cause, final boolean suppressed, final boolean writable) throws OutException {
        if (OldObjects.out(value, min, max))
            throw new OutException(message, cause, suppressed, writable);
        return value;
    }

    /**
     * @param value      Not specified
     * @param min        Not specified
     * @param max        Not specified
     * @param message    Not specified
     * @param cause      Not specified
     * @param suppressed Not specified
     * @param writable   Not specified
     * @return Not specified
     * @throws OutException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static short notOutX(final short value, final short min, final short max, final String message, final Throwable cause, final boolean suppressed, final boolean writable) throws OutException {
        if (OldObjects.out(value, min, max))
            throw new OutException(message, cause, suppressed, writable);
        return value;
    }

    /**
     * @param value      Not specified
     * @param min        Not specified
     * @param max        Not specified
     * @param message    Not specified
     * @param cause      Not specified
     * @param suppressed Not specified
     * @param writable   Not specified
     * @return Not specified
     * @throws OutException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static int notOutX(final int value, final int min, final int max, final String message, final Throwable cause, final boolean suppressed, final boolean writable) throws OutException {
        if (OldObjects.out(value, min, max))
            throw new OutException(message, cause, suppressed, writable);
        return value;
    }

    /**
     * @param value      Not specified
     * @param min        Not specified
     * @param max        Not specified
     * @param message    Not specified
     * @param cause      Not specified
     * @param suppressed Not specified
     * @param writable   Not specified
     * @return Not specified
     * @throws OutException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static long notOutX(final long value, final long min, final long max, final String message, final Throwable cause, final boolean suppressed, final boolean writable) throws OutException {
        if (OldObjects.out(value, min, max))
            throw new OutException(message, cause, suppressed, writable);
        return value;
    }

    /**
     * @param value      Not specified
     * @param min        Not specified
     * @param max        Not specified
     * @param message    Not specified
     * @param cause      Not specified
     * @param suppressed Not specified
     * @param writable   Not specified
     * @return Not specified
     * @throws OutException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static float notOutX(final float value, final float min, final float max, final String message, final Throwable cause, final boolean suppressed, final boolean writable) throws OutException {
        if (OldObjects.out(value, min, max))
            throw new OutException(message, cause, suppressed, writable);
        return value;
    }

    /**
     * @param value      Not specified
     * @param min        Not specified
     * @param max        Not specified
     * @param message    Not specified
     * @param cause      Not specified
     * @param suppressed Not specified
     * @param writable   Not specified
     * @return Not specified
     * @throws OutException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.1
     */
    public static double notOutX(final double value, final double min, final double max, final String message, final Throwable cause, final boolean suppressed, final boolean writable) throws OutException {
        if (OldObjects.out(value, min, max))
            throw new OutException(message, cause, suppressed, writable);
        return value;
    }

    /**
     * @param <T>    Not specified
     * @param object Not specified
     * @param type   Not specified
     * @return Not specified
     * @throws NotAssignableException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.2
     */
    public static <T> T assignable(final T object, final Class<?> type) throws NotAssignableException {
        return object;
    }

    /**
     * @param <T>    Not specified
     * @param object Not specified
     * @param type   Not specified
     * @param name   Not specified
     * @param _name  Not specified
     * @return Not specified
     * @throws NotAssignableException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.2
     */
    public static <T> T assignable(final T object, final Class<?> type, final String name, final String _name) throws NotAssignableException {
        return object;
    }

    /**
     * @param <T>     Not specified
     * @param object  Not specified
     * @param type    Not specified
     * @param message Not specified
     * @return Not specified
     * @throws NotAssignableException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.2
     */
    public static <T> T assignableX(final T object, final Class<?> type, final String message) throws NotAssignableException {
        return object;
    }

    /**
     * @param <T>    Not specified
     * @param object Not specified
     * @param type   Not specified
     * @param cause  Not specified
     * @return Not specified
     * @throws NotAssignableException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.2
     */
    public static <T> T assignableX(final T object, final Class<?> type, final Throwable cause) throws NotAssignableException {
        return object;
    }

    /**
     * @param <T>     Not specified
     * @param object  Not specified
     * @param type    Not specified
     * @param message Not specified
     * @param cause   Not specified
     * @return Not specified
     * @throws NotAssignableException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.2
     */
    public static <T> T assignableX(final T object, final Class<?> type, final String message, final Throwable cause) throws NotAssignableException {
        return object;
    }

    /**
     * @param <T>        Not specified
     * @param object     Not specified
     * @param type       Not specified
     * @param message    Not specified
     * @param cause      Not specified
     * @param suppressed Not specified
     * @param writable   Not specified
     * @return Not specified
     * @throws NotAssignableException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.2
     */
    public static <T> T assignableX(final T object, final Class<?> type, final String message, final Throwable cause, final boolean suppressed, final boolean writable) throws NotAssignableException {
        return object;
    }

    /**
     * @param type  Not specified
     * @param _type Not specified
     * @return Not specified
     * @throws NotAssignableException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.2
     */
    public static <T> Class<T> assignable(final Class<T> type, final Class<?> _type) throws NotAssignableException {
        if (OldObjects.notAssignable(type, _type))
            throw new NotAssignableException("The " + _type.getName() + " must not be assignable from the " + type.getName());
        return type;
    }

    /**
     * @param type  Not specified
     * @param _type Not specified
     * @param name  Not specified
     * @param _name Not specified
     * @return Not specified
     * @throws NotAssignableException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.2
     */
    public static <T> Class<T> assignable(final Class<T> type, final Class<?> _type, final String name, final String _name) throws NotAssignableException {
        if (OldObjects.notAssignable(type, _type))
            throw new NotAssignableException("The " + _name + " must not be assignable from the " + name);
        return type;
    }

    /**
     * @param type    Not specified
     * @param _type   Not specified
     * @param message Not specified
     * @return Not specified
     * @throws NotAssignableException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.2
     */
    public static <T> Class<T> assignableX(final Class<T> type, final Class<?> _type, final String message) throws NotAssignableException {
        if (OldObjects.notAssignable(type, _type))
            throw new NotAssignableException(message);
        return type;
    }

    /**
     * @param type  Not specified
     * @param _type Not specified
     * @param cause Not specified
     * @return Not specified
     * @throws NotAssignableException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.2
     */
    public static <T> Class<T> assignableX(final Class<T> type, final Class<?> _type, final Throwable cause) throws NotAssignableException {
        if (OldObjects.notAssignable(type, _type))
            throw new NotAssignableException(cause);
        return type;
    }

    /**
     * @param type    Not specified
     * @param _type   Not specified
     * @param message Not specified
     * @param cause   Not specified
     * @return Not specified
     * @throws NotAssignableException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.2
     */
    public static <T> Class<T> assignableX(final Class<T> type, final Class<?> _type, final String message, final Throwable cause) throws NotAssignableException {
        if (OldObjects.notAssignable(type, _type))
            throw new NotAssignableException(message, cause);
        return type;
    }

    /**
     * @param type       Not specified
     * @param _type      Not specified
     * @param message    Not specified
     * @param cause      Not specified
     * @param suppressed Not specified
     * @param writable   Not specified
     * @return Not specified
     * @throws NotAssignableException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.2
     */
    public static <T> Class<T> assignableX(final Class<T> type, final Class<?> _type, final String message, final Throwable cause, final boolean suppressed, final boolean writable) throws NotAssignableException {
        if (OldObjects.notAssignable(type, _type))
            throw new NotAssignableException(message, cause, suppressed, writable);
        return type;
    }

    /**
     * @param <T>    Not specified
     * @param object Not specified
     * @param type   Not specified
     * @return Not specified
     * @throws AssignableException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.2
     */
    public static <T> T notAssignable(final T object, final Class<?> type) throws AssignableException {
        if (OldObjects.assignable(object, type))
            throw new AssignableException("The " + type.getName() + " must not be assignable from the " + object.getClass().getName());
        return object;
    }

    /**
     * @param <T>    Not specified
     * @param object Not specified
     * @param type   Not specified
     * @param name   Not specified
     * @param _name  Not specified
     * @return Not specified
     * @throws AssignableException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.2
     */
    public static <T> T notAssignable(final T object, final Class<?> type, final String name, final String _name) throws AssignableException {
        if (OldObjects.assignable(object, type))
            throw new AssignableException("The " + _name + " must not be assignable from the " + name);
        return object;
    }

    /**
     * @param <T>     Not specified
     * @param object  Not specified
     * @param type    Not specified
     * @param message Not specified
     * @return Not specified
     * @throws AssignableException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.2
     */
    public static <T> T notAssignableX(final T object, final Class<?> type, final String message) throws AssignableException {
        if (OldObjects.assignable(object, type))
            throw new AssignableException(message);
        return object;
    }

    /**
     * @param <T>    Not specified
     * @param object Not specified
     * @param type   Not specified
     * @param cause  Not specified
     * @return Not specified
     * @throws AssignableException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.2
     */
    public static <T> T notAssignableX(final T object, final Class<?> type, final Throwable cause) throws AssignableException {
        if (OldObjects.assignable(object, type))
            throw new AssignableException(cause);
        return object;
    }

    /**
     * @param <T>     Not specified
     * @param object  Not specified
     * @param type    Not specified
     * @param message Not specified
     * @param cause   Not specified
     * @return Not specified
     * @throws AssignableException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.2
     */
    public static <T> T notAssignableX(final T object, final Class<?> type, final String message, final Throwable cause) throws AssignableException {
        if (OldObjects.assignable(object, type))
            throw new AssignableException(message, cause);
        return object;
    }

    /**
     * @param <T>        Not specified
     * @param object     Not specified
     * @param type       Not specified
     * @param message    Not specified
     * @param cause      Not specified
     * @param suppressed Not specified
     * @param writable   Not specified
     * @return Not specified
     * @throws AssignableException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.2
     */
    public static <T> T notAssignableX(final T object, final Class<?> type, final String message, final Throwable cause, final boolean suppressed, final boolean writable) throws AssignableException {
        if (OldObjects.assignable(object, type))
            throw new AssignableException(message, cause, suppressed, writable);
        return object;
    }

    /**
     * @param type  Not specified
     * @param _type Not specified
     * @return Not specified
     * @throws AssignableException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.2
     */
    public static <T> Class<T> notAssignable(final Class<T> type, final Class<?> _type) throws AssignableException {
        if (OldObjects.assignable(type, _type))
            throw new AssignableException("The " + _type.getName() + " must not be assignable from the " + type.getName());
        return type;
    }

    /**
     * @param type  Not specified
     * @param _type Not specified
     * @param name  Not specified
     * @param _name Not specified
     * @return Not specified
     * @throws AssignableException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.2
     */
    public static <T> Class<T> notAssignable(final Class<T> type, final Class<?> _type, final String name, final String _name) throws AssignableException {
        if (OldObjects.assignable(type, _type))
            throw new AssignableException("The " + _name + " must not be assignable from the " + name);
        return type;
    }

    /**
     * @param type    Not specified
     * @param _type   Not specified
     * @param message Not specified
     * @return Not specified
     * @throws AssignableException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.2
     */
    public static <T> Class<T> notAssignableX(final Class<T> type, final Class<?> _type, final String message) throws AssignableException {
        if (OldObjects.assignable(type, _type))
            throw new AssignableException(message);
        return type;
    }

    /**
     * @param type  Not specified
     * @param _type Not specified
     * @param cause Not specified
     * @return Not specified
     * @throws AssignableException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.2
     */
    public static <T> Class<T> notAssignableX(final Class<T> type, final Class<?> _type, final Throwable cause) throws AssignableException {
        if (OldObjects.assignable(type, _type))
            throw new AssignableException(cause);
        return type;
    }

    /**
     * @param type    Not specified
     * @param _type   Not specified
     * @param message Not specified
     * @param cause   Not specified
     * @return Not specified
     * @throws AssignableException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.2
     */
    public static <T> Class<T> notAssignableX(final Class<T> type, final Class<?> _type, final String message, final Throwable cause) throws AssignableException {
        if (OldObjects.assignable(type, _type))
            throw new AssignableException(message, cause);
        return type;
    }

    /**
     * @param type       Not specified
     * @param _type      Not specified
     * @param message    Not specified
     * @param cause      Not specified
     * @param suppressed Not specified
     * @param writable   Not specified
     * @return Not specified
     * @throws AssignableException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.2
     */
    public static <T> Class<T> notAssignableX(final Class<T> type, final Class<?> _type, final String message, final Throwable cause, final boolean suppressed, final boolean writable) throws AssignableException {
        if (OldObjects.assignable(type, _type))
            throw new AssignableException(message, cause, suppressed, writable);
        return type;
    }

    /**
     * @param <T>    Not specified
     * @param object Not specified
     * @param type   Not specified
     * @return Not specified
     * @throws NotInstanceException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.2
     */
    public static <T> T instance(final T object, final Class<?> type) throws NotInstanceException {
        if (OldObjects.notInstance(object, type))
            throw new InstanceException("The object must be instance of the " + type.getName());
        return object;
    }

    /**
     * @param <T>    Not specified
     * @param object Not specified
     * @param type   Not specified
     * @param name   Not specified
     * @param _name  Not specified
     * @return Not specified
     * @throws NotInstanceException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.2
     */
    public static <T> T instance(final T object, final Class<?> type, final String name, final String _name) throws NotInstanceException {
        if (OldObjects.notInstance(object, type))
            throw new InstanceException("The " + name + " must be instance of the " + _name);
        return object;
    }

    /**
     * @param <T>     Not specified
     * @param object  Not specified
     * @param type    Not specified
     * @param message Not specified
     * @return Not specified
     * @throws NotInstanceException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.2
     */
    public static <T> T instanceX(final T object, final Class<?> type, final String message) throws NotInstanceException {
        if (OldObjects.notInstance(object, type))
            throw new NotInstanceException(message);
        return object;
    }

    /**
     * @param <T>    Not specified
     * @param object Not specified
     * @param type   Not specified
     * @param cause  Not specified
     * @return Not specified
     * @throws NotInstanceException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.2
     */
    public static <T> T instanceX(final T object, final Class<?> type, final Throwable cause) throws NotInstanceException {
        if (OldObjects.notInstance(object, type))
            throw new NotInstanceException(cause);
        return object;
    }

    /**
     * @param <T>     Not specified
     * @param object  Not specified
     * @param type    Not specified
     * @param message Not specified
     * @param cause   Not specified
     * @return Not specified
     * @throws NotInstanceException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.2
     */
    public static <T> T instanceX(final T object, final Class<?> type, final String message, final Throwable cause) throws NotInstanceException {
        if (OldObjects.notInstance(object, type))
            throw new NotInstanceException(message, cause);
        return object;
    }

    /**
     * @param <T>        Not specified
     * @param object     Not specified
     * @param type       Not specified
     * @param message    Not specified
     * @param cause      Not specified
     * @param suppressed Not specified
     * @param writable   Not specified
     * @return Not specified
     * @throws NotInstanceException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.2
     */
    public static <T> T instanceX(final T object, final Class<?> type, final String message, final Throwable cause, final boolean suppressed, final boolean writable) throws NotInstanceException {
        if (OldObjects.notInstance(object, type))
            throw new NotInstanceException(message, cause, suppressed, writable);
        return object;
    }

    /**
     * @param <T>    Not specified
     * @param object Not specified
     * @param type   Not specified
     * @return Not specified
     * @throws InstanceException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.2
     */
    public static <T> T notInstance(final T object, final Class<?> type) throws InstanceException {
        if (OldObjects.instance(object, type))
            throw new InstanceException("The object must not be instance of the " + type.getName());
        return object;
    }

    /**
     * @param <T>    Not specified
     * @param object Not specified
     * @param type   Not specified
     * @param name   Not specified
     * @param _name  Not specified
     * @return Not specified
     * @throws InstanceException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.2
     */
    public static <T> T notInstance(final T object, final Class<?> type, final String name, final String _name) throws InstanceException {
        if (OldObjects.instance(object, type))
            throw new InstanceException("The " + name + " must not be instance of the " + _name);
        return object;
    }

    /**
     * @param <T>     Not specified
     * @param object  Not specified
     * @param type    Not specified
     * @param message Not specified
     * @return Not specified
     * @throws InstanceException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.2
     */
    public static <T> T notInstanceX(final T object, final Class<?> type, final String message) throws InstanceException {
        if (OldObjects.instance(object, type))
            throw new InstanceException(message);
        return object;
    }

    /**
     * @param <T>    Not specified
     * @param object Not specified
     * @param type   Not specified
     * @param cause  Not specified
     * @return Not specified
     * @throws InstanceException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.2
     */
    public static <T> T notInstanceX(final T object, final Class<?> type, final Throwable cause) throws InstanceException {
        if (OldObjects.instance(object, type))
            throw new InstanceException(cause);
        return object;
    }

    /**
     * @param <T>     Not specified
     * @param object  Not specified
     * @param type    Not specified
     * @param message Not specified
     * @param cause   Not specified
     * @return Not specified
     * @throws InstanceException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.2
     */
    public static <T> T notInstanceX(final T object, final Class<?> type, final String message, final Throwable cause) throws InstanceException {
        if (OldObjects.instance(object, type))
            throw new InstanceException(message, cause);
        return object;
    }

    /**
     * @param <T>        Not specified
     * @param object     Not specified
     * @param type       Not specified
     * @param message    Not specified
     * @param cause      Not specified
     * @param suppressed Not specified
     * @param writable   Not specified
     * @return Not specified
     * @throws InstanceException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.0.2
     */
    public static <T> T notInstanceX(final T object, final Class<?> type, final String message, final Throwable cause, final boolean suppressed, final boolean writable) throws InstanceException {
        if (OldObjects.instance(object, type))
            throw new InstanceException(message, cause, suppressed, writable);
        return object;
    }

}
