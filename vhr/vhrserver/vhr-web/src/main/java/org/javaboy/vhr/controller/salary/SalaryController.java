package org.javaboy.vhr.controller.salary;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.javaboy.vhr.model.RespBean;
import org.javaboy.vhr.model.Salary;
import org.javaboy.vhr.service.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/salary/sob")
public class SalaryController {
    @Autowired
    SalaryService salaryService;

    @GetMapping("/")
    @ApiOperation(value = "查询所有薪资",notes = "查询所有薪资")
    public List<Salary> getAllSalaries() {
        return salaryService.getAllSalaries();
    }

    @PostMapping("/")
    @ApiOperation(value = "添加薪资",notes = "添加薪资")
    @ApiImplicitParam(name = "salary",value = "薪资详细实体salary",required = true,dataType = "Salary")
    public RespBean addSalary(@RequestBody Salary salary) {
        if (salaryService.addSalary(salary) == 1) {
            return RespBean.ok("添加成功!");
        }
        return RespBean.error("添加失败!");
    }

    @DeleteMapping("/{id}")
    @ApiOperation(value = "根据id删除薪资",notes = "根据id删除薪资")
    @ApiImplicitParam(name = "id",value = "薪资id",required = true,dataType = "Integer")
    public RespBean deleteSalaryById(@PathVariable Integer id) {
        if (salaryService.deleteSalaryById(id) == 1) {
            return RespBean.ok("删除成功！");
        }
        return RespBean.error("删除失败！");
    }

    @PutMapping("/")
    @ApiOperation(value = "更新薪资",notes = "更新薪资")
    @ApiImplicitParam(name = "salary",value = "薪资详细实体salary",required = true,dataType = "Salary")
    public RespBean updateSalaryById(@RequestBody Salary salary) {
        if (salaryService.updateSalaryById(salary) == 1) {
            return RespBean.ok("更新成功!");
        }
        return RespBean.error("更新失败!");
    }
}