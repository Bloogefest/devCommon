package dev.common.base;

import dev.common.validation.NullException;
import dev.common.validation.Validator;

/**
 * @author Bloogefest
 * @version 1.1
 * @apiNote Not specified
 * @since 1.0.0
 */
public final class Objects {

    private Objects() throws CreationError {
        throw new CreationError();
    }

    public static boolean isNull(final Object object) {
        return object == null;
    }

    public static boolean notNull(final Object object) {
        return object != null;
    }

    public static boolean equals(final boolean value, final boolean _value) {
        return value == _value;
    }

    public static boolean equals(final byte value, final byte _value) {
        return value == _value;
    }

    public static boolean equals(final int value, final int _value) {
        return value == _value;
    }

    public static boolean equals(final long value, final long _value) {
        return value == _value;
    }

    public static boolean equals(final float value, final float _value) {
        return value == _value;
    }

    public static boolean equals(final double value, final double _value) {
        return value == _value;
    }

    @SuppressWarnings("EqualsReplaceableByObjectsCall")
    public static boolean equals(final Object object, final Object _object) {
        return object == _object || object != null && object.equals(_object);
    }

    public static boolean notEquals(final boolean value, final boolean _value) {
        return value != _value;
    }

    public static boolean notEquals(final byte value, final byte _value) {
        return value != _value;
    }

    public static boolean notEquals(final int value, final int _value) {
        return value != _value;
    }

    public static boolean notEquals(final long value, final long _value) {
        return value != _value;
    }

    public static boolean notEquals(final float value, final float _value) {
        return value != _value;
    }

    public static boolean notEquals(final double value, final double _value) {
        return value != _value;
    }

    public static boolean notEquals(final Object object, final Object _object) {
        return object != _object && object != null && !object.equals(_object);
    }

    public static boolean more(final byte value, final byte _value) {
        return value > _value;
    }

    public static boolean more(final short value, final short _value) {
        return value > _value;
    }

    public static boolean more(final int value, final int _value) {
        return value > _value;
    }

    public static boolean more(final long value, final long _value) {
        return value > _value;
    }

    public static boolean more(final float value, final float _value) {
        return value > _value;
    }

    public static boolean more(final double value, final double _value) {
        return value > _value;
    }

    public static boolean notMore(final byte value, final byte _value) {
        return value <= _value;
    }

    public static boolean notMore(final short value, final short _value) {
        return value <= _value;
    }

    public static boolean notMore(final int value, final int _value) {
        return value <= _value;
    }

    public static boolean notMore(final long value, final long _value) {
        return value <= _value;
    }

    public static boolean notMore(final float value, final float _value) {
        return value <= _value;
    }

    public static boolean notMore(final double value, final double _value) {
        return value <= _value;
    }

    public static boolean less(final byte value, final byte _value) {
        return value < _value;
    }

    public static boolean less(final int value, final int _value) {
        return value < _value;
    }

    public static boolean less(final long value, final long _value) {
        return value < _value;
    }

    public static boolean less(final float value, final float _value) {
        return value < _value;
    }

    public static boolean less(final double value, final double _value) {
        return value < _value;
    }

    public static boolean notLess(final byte value, final byte _value) {
        return value >= _value;
    }

    public static boolean notLess(final short value, final short _value) {
        return value >= _value;
    }

    public static boolean notLess(final int value, final int _value) {
        return value >= _value;
    }

    public static boolean notLess(final long value, final long _value) {
        return value >= _value;
    }

    public static boolean notLess(final float value, final float _value) {
        return value >= _value;
    }

    public static boolean notLess(final double value, final double _value) {
        return value >= _value;
    }

    public static boolean in(final byte value, final byte min, final byte max) {
        return value >= min && value <= max;
    }

    public static boolean in(final short value, final short min, final short max) {
        return value >= min && value <= max;
    }

    public static boolean in(final int value, final int min, final int max) {
        return value >= min && value <= max;
    }

    public static boolean in(final long value, final long min, final long max) {
        return value >= min && value <= max;
    }

    public static boolean in(final float value, final float min, final float max) {
        return value >= min && value <= max;
    }

    public static boolean in(final double value, final double min, final double max) {
        return value >= min && value <= max;
    }

    public static boolean notIn(final byte value, final byte min, final byte max) {
        return value < min && value > max;
    }

    public static boolean notIn(final short value, final short min, final short max) {
        return value < min && value > max;
    }

    public static boolean notIn(final int value, final int min, final int max) {
        return value < min && value > max;
    }

    public static boolean notIn(final long value, final long min, final long max) {
        return value < min && value > max;
    }

    public static boolean notIn(final float value, final float min, final float max) {
        return value < min && value > max;
    }

    public static boolean notIn(final double value, final double min, final double max) {
        return value < min && value > max;
    }

    public static boolean out(final byte value, final byte min, final byte max) {
        return value <= min && value >= max;
    }

    public static boolean out(final short value, final short min, final short max) {
        return value <= min && value >= max;
    }

    public static boolean out(final int value, final int min, final int max) {
        return value <= min && value >= max;
    }

    public static boolean out(final long value, final long min, final long max) {
        return value <= min && value >= max;
    }

    public static boolean out(final float value, final float min, final float max) {
        return value <= min && value >= max;
    }

    public static boolean out(final double value, final double min, final double max) {
        return value <= min && value >= max;
    }

    public static boolean notOut(final byte value, final byte min, final byte max) {
        return value > min && value < max;
    }

    public static boolean notOut(final short value, final short min, final short max) {
        return value > min && value < max;
    }

    public static boolean notOut(final int value, final int min, final int max) {
        return value > min && value < max;
    }

    public static boolean notOut(final long value, final long min, final long max) {
        return value > min && value < max;
    }

    public static boolean notOut(final float value, final float min, final float max) {
        return value > min && value < max;
    }

    public static boolean notOut(final double value, final double min, final double max) {
        return value > min && value < max;
    }

    public static boolean openable(final Object object) throws NullException {
        return Validator.notNull(object, "object") instanceof IOpenable;
    }

    public static boolean notOpenable(final Object object) throws NullException {
        return !(Validator.notNull(object, "object") instanceof IOpenable);
    }

    public static boolean closeable(final Object object) throws NullException {
        return Validator.notNull(object, "object") instanceof ICloseable;
    }

    public static boolean notCloseable(final Object object) throws NullException {
        return !(Validator.notNull(object, "object") instanceof ICloseable);
    }

    public static boolean cloneable(final Object object) throws NullException {
        return Validator.notNull(object, "object") instanceof ICloneable<?>;
    }

    public static boolean notCloneable(final Object object) throws NullException {
        return !(Validator.notNull(object, "object") instanceof ICloneable<?>);
    }

    public static boolean convertable(final Object object) throws NullException {
        return Validator.notNull(object, "object") instanceof IConvertable<?>;
    }

    public static boolean notConvertable(final Object object) throws NullException {
        return !(Validator.notNull(object, "object") instanceof IConvertable<?>);
    }

    public static boolean mutable(final Object object) throws NullException {
        return Validator.notNull(object, "object") instanceof IMutable mutable && mutable.mutable();
    }

    public static boolean notMutable(final Object object) throws NullException {
        return !(Validator.notNull(object, "object") instanceof IMutable mutable && !mutable.mutable());
    }

    public static boolean immutable(final Object object) throws NullException {
        return Validator.notNull(object, "object") instanceof IMutable mutable && !mutable.mutable();
    }

    public static boolean notImmutable(final Object object) throws NullException {
        return !(Validator.notNull(object, "object") instanceof IMutable mutable) || mutable.mutable();
    }

}
