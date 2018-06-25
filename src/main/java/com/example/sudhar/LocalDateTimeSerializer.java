package com.example.sudhar;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class LocalDateTimeSerializer extends JsonSerializer<LocalDateTime> {
    static final DateTimeFormatter DATE_FORMAT = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);

    @Override
    public void serialize(LocalDateTime localDateTime, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {

        final String formattedDate = localDateTime.format(DATE_FORMAT);
        jsonGenerator.writeString(formattedDate);

    }
}
