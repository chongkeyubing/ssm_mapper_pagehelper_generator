package com.company.project.web;
import com.company.project.core.Result;
import com.company.project.core.ResultUtil;
import com.company.project.model.Dept;
import com.company.project.model.User;
import com.company.project.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import tk.mybatis.mapper.entity.Condition;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
* Created by CodeGenerator on 2019/06/22.
*/
@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping("/add")
    @ResponseBody
    public Result add(User user) {
        userService.save(user);
        return ResultUtil.success();
    }

    @RequestMapping("/delete")
    @ResponseBody
    public Result delete(@RequestParam Integer id) {
        userService.deleteById(id);
        return ResultUtil.success();
    }

    @RequestMapping("/update")
    @ResponseBody
    public Result update(User user) {
        userService.update(user);
        return ResultUtil.success();
    }

    @RequestMapping("/detail")
    @ResponseBody
    public Result detail(@RequestParam Integer id) {
        User user = userService.findById(id);
        return ResultUtil.success(user);
    }

    @RequestMapping("/list")
    @ResponseBody
    public Result list(@RequestParam(defaultValue = "0") Integer page,
                       @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<User> list = userService.findAll();
        return ResultUtil.success(list);
    }

    @RequestMapping("/toIndex")
    public String toIndex(@RequestParam(defaultValue = "0") Integer page,
                          @RequestParam(defaultValue = "0") Integer size,
                          User user, Dept dept ,ModelMap map) {
        //开启分页
        PageHelper.startPage(page, size);

        //设置查询条件
        Condition condition = new Condition(User.class);

        //where条件
        Example.Criteria criteria = condition.createCriteria();
        criteria.andEqualTo("id",user.getId());
        criteria.andLike("username","%" + user.getUsername() + "%");

        //排序
        //condition.orderBy("id");
        condition.setOrderByClause("id asc");

        //执行查询
        List<User> usres = userService.findByCondition(condition);

        map.put("page",page);
        map.put("size",size);
        map.put("user",user);
        map.put("users",usres);
        return "index";
    }
}
