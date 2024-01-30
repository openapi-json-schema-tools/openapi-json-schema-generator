package org.openapijsonschematools.client.securityrequirementobjects;

import org.checkerframework.checker.nullness.qual.Nullable;

public interface SecurityRequirementObjectProvider<T> {
    SecuritySchemeToScopeProvider getSecurityRequirementObject(@Nullable T securityIndex);
}

