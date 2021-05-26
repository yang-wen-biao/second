package com.example.second.dao;

import com.example.second.entity.Data;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Mapper
@Component(value = "DataDao")
public interface DataDao {
    Data FindById(Integer id);
    void Update_data(Data data);
}
