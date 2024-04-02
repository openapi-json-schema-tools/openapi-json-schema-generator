package org.openapijsonschematools.client.parameter;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.exceptions.NotImplementedException;
import org.openapijsonschematools.client.exceptions.OpenapiDocumentException;

import java.util.AbstractMap;

public interface Parameter {
    AbstractMap.SimpleEntry<String, String> serialize(@Nullable Object inData) throws NotImplementedException, OpenapiDocumentException;
}