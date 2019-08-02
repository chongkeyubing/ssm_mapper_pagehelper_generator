package com.company.project.core;

import tk.mybatis.mapper.entity.Condition;

import java.util.List;

/**
 * Service 层 基础接口，其他Service 接口 请继承该接口
 */
public interface Service<T> {
    List<T> find(T model);//根据实体字段查询，条件是等号

    T findById(Integer id);//根据主键字段进行查询，条件是等号

    T findOne(T model);//根据条件查询单挑数据

    List<T> findByIds(String ids);//根据主键字符串进行查询，条件是等号，主键字符串为“1,2，3,4...”

    List<T> findByCondition(Condition condition);//根据条件查询

    List<T> findAll();//无条件查询所有

    int findCount(T model); //根据据实体属性查询总数，条件是等号

    int findCountByCondition(Condition condition);//根据条件查询总数

    void save(T model);//单个插入

    void save(List<T> models);//批量插入，支持批量插入的数据库可以使用，例如MySQL，H2等

    void deleteById(Integer id);//根据主键进行删除，条件是等号

    void deleteByIds(String ids);//根据主键批量删除，入参为id字符串“1,2,3,4...”，条件是等号

    void deleteByCondition(Condition conditon);//根据条件删除

    void update(T model);//根据主键更新属性不为null和""的值

    void updateByCondition(T model, Condition condition);//根据Condition条件更新实体model包含的不是null和""的属性值

}
