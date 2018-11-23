package com.group7.service;

import com.group7.entity.Emp;

import java.util.List;
import java.util.Map;

public interface EmpService {
    /**
     * 员工列表方法
     * @param map
     * @return
     */
    List<Emp> getList(Map map);
}
