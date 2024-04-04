package org.openapijsonschematools.client.securityrequirementobjects;

import org.openapijsonschematools.client.exceptions.UnsetPropertyException;
import org.checkerframework.checker.nullness.qual.Nullable;

public interface SecurityRequirementObjectProvider<T> {
    SecurityRequirementObject getSecurityRequirementObject(@Nullable T securityIndex) throws UnsetPropertyException;
}

