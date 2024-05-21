package unit_test_api.parameter;

import org.checkerframework.checker.nullness.qual.Nullable;
import unit_test_api.exceptions.NotImplementedException;

import java.util.AbstractMap;

public interface Parameter {
    AbstractMap.SimpleEntry<String, String> serialize(@Nullable Object inData) throws NotImplementedException;
}