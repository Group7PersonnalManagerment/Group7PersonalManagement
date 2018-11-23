package com.group7.serviceImpl;

import com.group7.dao.EmpDao;
import com.group7.entity.Emp;
import com.group7.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * className:EmpServiceImpl
 * discriptoin:
 * author:毛宇
 * createTime:2018-11-21 20:03
 */
@Service
public class EmpServiceImpl implements EmpService {

    @Autowired
    private EmpDao empDao;

    @Override
    public List<Emp> getList(Map map) {

        return empDao.getList(map);
    }
}
