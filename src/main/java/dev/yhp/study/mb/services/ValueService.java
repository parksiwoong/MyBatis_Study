package dev.yhp.study.mb.services;

import dev.yhp.study.mb.mappers.ValueMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ValueService {
    private final ValueMapper valueMapper;

    @Autowired
    public ValueService(ValueMapper valueMapper) {
        this.valueMapper = valueMapper;
    }

    public int getValue() {
        return this.valueMapper.selectValue().getValue();
    }
}