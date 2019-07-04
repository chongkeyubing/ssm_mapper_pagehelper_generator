package com.company.project.web;
import com.company.project.core.Result;
import com.company.project.core.ResultUtil;
import com.company.project.model.Dept;
import com.company.project.service.DeptService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2019/06/22.
*/
@Controller
@RequestMapping("/dept")
public class DeptController {
    @Resource
    private DeptService deptService;

    @RequestMapping("/add")
    @ResponseBody
    public Result add(Dept dept) {
        deptService.save(dept);
        return ResultUtil.success();
    }

    @RequestMapping("/delete")
    @ResponseBody
    public Result delete(@RequestParam Integer id) {
        deptService.deleteById(id);
        return ResultUtil.success();
    }

    @RequestMapping("/update")
    @ResponseBody
    public Result update(Dept dept) {
        deptService.update(dept);
        return ResultUtil.success();
    }

    @RequestMapping("/detail")
    @ResponseBody
    public Result detail(@RequestParam Integer id) {
        Dept dept = deptService.findById(id);
        return ResultUtil.success(dept);
    }

    @RequestMapping("/list")
    @ResponseBody
    public Result list(@RequestParam(defaultValue = "0") Integer page,
                       @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<Dept> list = deptService.findAll();
        PageInfo<Dept> pageInfo = new PageInfo<>(list);
        return ResultUtil.success(pageInfo);
    }
}
