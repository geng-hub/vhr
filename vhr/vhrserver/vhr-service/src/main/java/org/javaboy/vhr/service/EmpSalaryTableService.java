package org.javaboy.vhr.service;

import org.javaboy.vhr.mapper.EmpSalaryMapper;
import org.javaboy.vhr.model.EmpSalary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author Administrator
 * @Date 2020/1/8
 */
@Service
public class EmpSalaryTableService {
    @Autowired
    private EmpSalaryMapper empSalaryMapper;

    public List<EmpSalary> getEmpSalaryTable(Integer eid){
        return empSalaryMapper.getEmpSalaryTable(eid);
    }
}
