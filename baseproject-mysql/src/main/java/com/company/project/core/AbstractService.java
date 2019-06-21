package com.company.project.core;


import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.entity.Condition;

import java.util.List;

/**
 * 基于通用MyBatis Mapper插件的Service接口的实现
 */
public abstract class AbstractService<T> implements Service<T> {

    @Autowired
    protected Mapper<T> mapper;

    /**
     * 保存一个实体，null的属性不会保存，会使用数据库默认值
     *
     * @param model
     */
    public void save(T model) {
        mapper.insertSelective(model);
    }

    /**
     * 批量插入，支持批量插入的数据库可以使用，例如MySQL,H2等
     *
     * @param models
     */
    public void save(List<T> models) {
        mapper.insertList(models);
    }

    /**
     * 根据实体属性作为条件进行删除，条件是等号
     *
     * @param model
     */
    public void delete(T model) {
        mapper.delete(model);
    }

    /**
     * 根据主键进行删除,条件是等号
     *
     * @param id
     */
    public void deleteById(Integer id) {
        mapper.deleteByPrimaryKey(id);
    }

    /**
     * 根据主键批量删除，入参为id字符串“1,2,3,4...”，条件是等号
     *
     * @param ids
     */
    public void deleteByIds(String ids) {
        mapper.deleteByIds(ids);
    }

    /**
     * 根据条件删除
     *
     * @param conditon
     */
    public void deleteByCondition(Condition conditon) {
        mapper.deleteByCondition(conditon);
    }

    /**
     * 根据主键更新属性不为null的值
     *
     * @param model
     */
    public void update(T model) {
        mapper.updateByPrimaryKeySelective(model);
    }

    /**
     * 根据Condition条件更新实体model包含的不是null的属性值
     *
     * @param model
     * @param condition
     */
    public void updateByCondition(T model, Condition condition) {
        mapper.updateByConditionSelective(model, condition);
    }

    /**
     * 根据实体字段查询，条件是等号
     *
     * @param model
     * @return
     */
    public List<T> find(T model) {
        return mapper.select(model);
    }

    /**
     * 根据主键字段进行查询,条件是等号
     *
     * @param id
     * @return
     */
    public T findById(Integer id) {
        return mapper.selectByPrimaryKey(id);
    }

    /**
     * 根据主键字符串进行查询,条件是等号，主键字符串为“1,2，3,4...”
     *
     * @param ids
     * @return
     */
    public List<T> findByIds(String ids) {
        return mapper.selectByIds(ids);
    }

    /**
     * 根据条件查询
     *
     * @param condition
     * @return
     */
    public List<T> findByCondition(Condition condition) {
        return mapper.selectByCondition(condition);
    }

    /**
     * 无条件查询所有
     *
     * @return
     */
    public List<T> findAll() {
        return mapper.selectAll();
    }

    /**
     * 根据实体属性查询总数，条件是等号
     *
     * @param model
     * @return
     */
    public int findCount(T model) {
        return mapper.selectCount(model);
    }

    /**
     * 根据条件查询总数
     *
     * @param condition
     * @return
     */
    public int findCountByCondition(Condition condition) {
        return mapper.selectCountByCondition(condition);
    }

}
