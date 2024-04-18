package unit_test_api.parameter;

import org.checkerframework.checker.nullness.qual.Nullable;
import unit_test_api.header.HeaderBase;

public class ParameterBase extends HeaderBase {
    public final String name;
    public final ParameterInType inType;

    public ParameterBase(String name, ParameterInType inType, boolean required, @Nullable ParameterStyle style, @Nullable Boolean explode, @Nullable Boolean allowReserved) {
        super(required, style, explode, allowReserved);
        this.name = name;
        this.inType = inType;
    }
}