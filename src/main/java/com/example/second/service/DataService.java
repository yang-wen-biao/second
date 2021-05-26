package com.example.second.service;

import com.example.second.entity.Data;

public interface DataService {
    Data FindById(Integer id);
    void Update_data(Data data);
}
