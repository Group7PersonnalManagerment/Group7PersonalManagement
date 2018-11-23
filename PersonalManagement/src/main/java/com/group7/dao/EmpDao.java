package com.group7.dao;

import com.group7.entity.Emp;

import java.util.List;
import java.util.Map;

/**
 * className:EmpDao
 * discriptoin:
 * author:毛宇
 * createTime:2018-11-21 20:01
 */
public interface EmpDao {
        /**
         * 员工列表方法
         * @param map
         * @return
         */
        List<Emp> getList(Map map);
}

