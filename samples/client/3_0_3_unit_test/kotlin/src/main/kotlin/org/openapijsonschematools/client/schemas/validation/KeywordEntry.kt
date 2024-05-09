package org.openapijsonschematools.client.schemas.validation

import java.util.AbstractMap

class KeywordEntry(key: String, value: KeywordValidator) :
    AbstractMap.SimpleEntry<String, KeywordValidator>(key, value)
