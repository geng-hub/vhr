package org.javaboy.vhr.controller.salary;

import org.javaboy.vhr.model.EmpSalary;
import org.javaboy.vhr.model.Salary;
import org.javaboy.vhr.service.EmpSalaryTableService;
import org.javaboy.vhr.service.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author Administrator
 * @Date 2020/1/8
 */
@RestController
@RequestMapping("/salary/table")
public class SalaryTableController {

    @Autowired
    private EmpSalaryTableService empSalaryTableService;
    @Autowired
    private SalaryService salaryService;

    @GetMapping("/")
    public List<EmpSalary> getSalaryTable(Integer eid){
        return empSalaryTableService.getEmpSalaryTable(eid);
    }

    @GetMapping("/getgetSalaryById")
    public Salary getgetSalaryById(Integer id){
        return salaryService.getgetSalaryById(id);
    }

    @PostMapping("/addgetSalaryById")
    public Integer addgetSalaryById(@RequestBody Salary salary){
        return salaryService.addSalary(salary);
    }
}
