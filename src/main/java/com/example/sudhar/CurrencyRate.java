package com.example.sudhar;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.time.LocalDateTime;

public class CurrencyRate {

    private String pair;

    private double rate;

    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    private LocalDateTime lastUpdatedTime;


    public String getPair() {
        return pair;
    }

    public void setPair(String pair) {
        this.pair = pair;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public LocalDateTime getLastUpdatedTime() {
        return lastUpdatedTime;
    }

    public void setLastUpdatedTime(LocalDateTime lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    @Override
    public String toString() {
        return "com.example.sudhar.CurrencyRate{" +
                "pair='" + pair + '\'' +
                ", rate=" + rate +
                ", lastUpdatedTime=" + lastUpdatedTime +
                '}';
    }
}
