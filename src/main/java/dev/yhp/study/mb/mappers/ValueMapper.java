package dev.yhp.study.mb.mappers;

import dev.yhp.study.mb.model.Value;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ValueMapper {
    Value selectValue();
}