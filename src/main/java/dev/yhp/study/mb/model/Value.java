package dev.yhp.study.mb.model;

import org.apache.ibatis.type.Alias;

@Alias("Value")
public class Value {
    private final int value;

    public Value(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}