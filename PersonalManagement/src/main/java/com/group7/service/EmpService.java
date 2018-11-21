package com.group7.service;

import java.util.List;
import java.util.Map;

/**
 * className:EmpService
 * discriptoin:
 * author:毛宇
 * createTime:2018-11-21 20:03
 */
public interface EmpService {
    /**
     * 员工列表方法
     * @param map
     * @return
     */
    List<Map> getList(Map map);
}
