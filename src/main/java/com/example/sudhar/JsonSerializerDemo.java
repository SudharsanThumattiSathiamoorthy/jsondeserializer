package com.example.sudhar;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.time.LocalDateTime;

public class JsonSerializerDemo {
    public static void main(final String[] args) throws IOException {

        CurrencyRate cr = new CurrencyRate();
        cr.setLastUpdatedTime(LocalDateTime.now());
        cr.setPair("pair");
        cr.setRate(20.0d);

        System.out.println(cr);

        final ObjectMapper om = new ObjectMapper();
        String json = om.writeValueAsString(cr);
        System.out.println(json);

        System.out.println("json to java");
        CurrencyRate deserialize = om.readValue(json, CurrencyRate.class);
        System.out.println(deserialize);
    }
}
