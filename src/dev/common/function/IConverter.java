package dev.common.function;

/**
 * @param <T> The type of the target value
 * @param <S> The type of the source value
 * @author Bloogefest
 * @version 1.0
 * @apiNote The converter of the source value to the target value
 * @since 1.0.0
 */
@Deprecated
@FunctionalInterface
public interface IConverter<T, S> {

    /**
     * @param source Source value to convert
     * @return Target value
     * @throws ConvertException Unhandled exception when converting
     * @author Bloogefest
     * @apiNote Converts the source value to the target value
     * @since 1.0.0
     */
    T convert(final S source) throws ConvertException;

}
