package org.example.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class DictionaryKey<T> {
    private final String keyName;
    private T type;
}
