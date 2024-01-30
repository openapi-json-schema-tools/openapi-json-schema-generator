package org.openapijsonschematools.client.securityrequirementobjects;

import org.checkerframework.checker.nullness.qual.Nullable;

public interface SecurityRequirementObjectProvider<T> {
    SecurityRequirementObject getSecurityRequirementObject(@Nullable T securityIndex);
}

