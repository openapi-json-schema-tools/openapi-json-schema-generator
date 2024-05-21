package unit_test_api.schemas;

/**
 * Builders must implement this class
 * @param <T> the type that the builder returns
 */
public interface GenericBuilder<T> {
    T build();
}
