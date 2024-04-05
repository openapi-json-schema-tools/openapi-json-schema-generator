package org.openapijsonschematools.client.securityrequirementobjects;

public interface SecurityRequirementObjectProvider<T> {
    SecurityRequirementObject getSecurityRequirementObject(T securityIndex);
}

