package org.example.model;

import java.util.HashMap;
import java.util.Map;

public class ModelMap {

    private Map<DictionaryKey<?>, Object> inner = new HashMap<>();

    public <T> T get(DictionaryKey<T> key) {
        Object raw = inner.get(key);
        @SuppressWarnings("unchecked")
        T typed = (T) raw;
        return typed;
    }

    public <T> void put(DictionaryKey<T> key, T value) {
        inner.put(key, value);
    }
}
