package dev.common.function;

/**
 * @param <T> The type of the target value
 * @param <S> The type of the settings
 * @author Bloogefest
 * @version 1.0
 * @apiNote The provider of the target value
 * @since 1.0.0
 */
@FunctionalInterface
public interface IProvider<T, S> {

    /**
     * @param settings Settings to provide the value
     * @return Target value
     * @throws ProvideException Unhandled exception when providing
     * @author Bloogefest
     * @apiNote Provides the target value
     * @since 1.0.0
     */
    T provide(final S settings) throws ProvideException;

}
