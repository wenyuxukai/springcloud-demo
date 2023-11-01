package com.tech.springcloud;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Mapper
@Component
public interface AuthMapper {

    @Select("select 1")
    public List<Map<String,Object>> queryInfo();

}
