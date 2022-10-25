package dev.common.general;

import dev.common.security.SecurityException;
import org.jetbrains.annotations.Contract;

/**
 * @author Bloogefest
 * @version 1.0
 * @apiNote Not specified
 * @since 1.1.3
 */
public final class Numbers {

    /**
     * @throws SecurityException Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.3
     */
    @Contract("-> fail")
    private Numbers() throws SecurityException {
        throw new SecurityException();
    }

    /**
     * @param value The source value
     * @param value_ The subsequent value
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.3
     */
    @Contract("_, _ -> _")
    public static boolean equals(final byte value, final byte value_) {
        return value == value_;
    }

    /**
     * @param value The source value
     * @param value_ The subsequent value
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.3
     */
    @Contract("_, _ -> _")
    public static boolean equals(final short value, final short value_) {
        return value == value_;
    }

    /**
     * @param value The source value
     * @param value_ The subsequent value
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.3
     */
    @Contract("_, _ -> _")
    public static boolean equals(final int value, final int value_) {
        return value == value_;
    }

    /**
     * @param value The source value
     * @param value_ The subsequent value
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.3
     */
    @Contract("_, _ -> _")
    public static boolean equals(final long value, final long value_) {
        return value == value_;
    }

    /**
     * @param value The source value
     * @param value_ The subsequent value
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.3
     */
    @Contract("_, _ -> _")
    public static boolean equals(final float value, final float value_) {
        return value == value_;
    }

    /**
     * @param value The source value
     * @param value_ The subsequent value
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.3
     */
    @Contract("_, _ -> _")
    public static boolean equals(final double value, final double value_) {
        return value == value_;
    }

    /**
     * @param value The source value
     * @param value_ The subsequent value
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.3
     */
    @Contract("_, _ -> _")
    public static boolean notEquals(final byte value, final byte value_) {
        return value != value_;
    }

    /**
     * @param value The source value
     * @param value_ The subsequent value
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.3
     */
    @Contract("_, _ -> _")
    public static boolean notEquals(final short value, final short value_) {
        return value != value_;
    }

    /**
     * @param value The source value
     * @param value_ The subsequent value
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.3
     */
    @Contract("_, _ -> _")
    public static boolean notEquals(final int value, final int value_) {
        return value != value_;
    }

    /**
     * @param value The source value
     * @param value_ The subsequent value
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.3
     */
    @Contract("_, _ -> _")
    public static boolean notEquals(final long value, final long value_) {
        return value != value_;
    }

    /**
     * @param value The source value
     * @param value_ The subsequent value
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.3
     */
    @Contract("_, _ -> _")
    public static boolean notEquals(final float value, final float value_) {
        return value != value_;
    }

    /**
     * @param value The source value
     * @param value_ The subsequent value
     * @return Not specified
     * @author Bloogefest
     * @apiNote Not specified
     * @since 1.1.3
     */
    @Contract("_, _ -> _")
    public static boolean notEquals(final double value, final double value_) {
        return value != value_;
    }

}
