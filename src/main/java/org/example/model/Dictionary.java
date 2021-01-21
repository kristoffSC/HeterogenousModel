package org.example.model;

import java.util.Date;

public class Dictionary {

    public static final DictionaryKey<String> FIELD_A = new DictionaryKey<>("TradeRef");
    public static final DictionaryKey<Date> FIELD_B = new DictionaryKey<>("ContractId");
}
