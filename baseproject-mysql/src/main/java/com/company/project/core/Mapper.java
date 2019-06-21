package com.company.project.core;

import tk.mybatis.mapper.common.BaseMapper;
import tk.mybatis.mapper.common.ConditionMapper;
import tk.mybatis.mapper.common.IdsMapper;
import tk.mybatis.mapper.common.special.InsertListMapper;

/**
 * 定制版MyBatis Mapper插件接口
 *
 * **************************BaseMapper*******************************
 * select
 * 接口：SelectMapper<T>
 * 方法：List<T> select(T record);
 * 说明：根据实体中的属性值进行查询，查询条件使用等号
 *
 *
 * 接口：SelectByPrimaryKeyMapper<T>
 * 方法：T selectByPrimaryKey(Object key);
 * 说明：根据主键字段进行查询，方法参数必须包含完整的主键属性，查询条件使用等号
 *
 *
 * 接口：SelectAllMapper<T>
 * 方法：List<T> selectAll();
 * 说明：查询全部结果，select(null)方法能达到同样的效果
 *
 *
 * 接口：SelectOneMapper<T>
 * 方法：T selectOne(T record);
 * 说明：根据实体中的属性进行查询，只能有一个返回值，有多个结果是抛出异常，查询条件使用等号
 *
 *
 * 接口：SelectCountMapper<T>
 * 方法：int selectCount(T record);
 * 说明：根据实体中的属性查询总数，查询条件使用等号
 *
 *
 * Insert
 * 接口：InsertMapper<T>
 * 方法：int insert(T record);
 * 说明：保存一个实体，null的属性也会保存，不会使用数据库默认值
 *
 *
 * 接口：InsertSelectiveMapper<T>
 * 方法：int insertSelective(T record);
 * 说明：保存一个实体，null的属性不会保存，会使用数据库默认值
 *
 *
 * Update
 * 接口：UpdateByPrimaryKeyMapper<T>
 * 方法：int updateByPrimaryKey(T record);
 * 说明：根据主键更新实体全部字段，null值会被更新
 *
 *
 * 接口：UpdateByPrimaryKeySelectiveMapper<T>
 * 方法：int updateByPrimaryKeySelective(T record);
 * 说明：根据主键更新属性不为null的值
 *
 *
 * Delete
 * 接口：DeleteMapper<T>
 * 方法：int delete(T record);
 * 说明：根据实体属性作为条件进行删除，查询条件使用等号
 *
 *
 * 接口：DeleteByPrimaryKeyMapper<T>
 * 方法：int deleteByPrimaryKey(Object key);
 * 说明：根据主键字段进行删除，方法参数必须包含完整的主键属性
 *
 **************************ConditionMapper*********************************
 * 接口：SelectByConditionMapper<T>
 * 方法：List<T> selectByCondition(Object condition);
 * 说明：根据Condition条件进行查询
 *
 *
 * 接口：SelectCountByConditionMapper<T>
 * 方法：int selectCountByCondition(Object condition);
 * 说明：根据Condition条件进行查询总数
 *
 *
 * 接口：UpdateByConditionMapper<T>
 * 方法：int updateByCondition(@Param("record") T record, @Param("example") Object condition);
 * 说明：根据Condition条件更新实体record包含的全部属性，null值会被更新
 *
 *
 * 接口：UpdateByConditionSelectiveMapper<T>
 * 方法：int updateByConditionSelective(@Param("record") T record, @Param("example") Object condition);
 * 说明：根据Condition条件更新实体record包含的不是null的属性值
 *
 *
 * 接口：DeleteByConditionMapper<T>
 * 方法：int deleteByCondition(Object condition);
 * 说明：根据Condition条件删除数据
 *
 * ***********************IdsMapper******************************
 * 接口：SelectByIdsMapper
 * 方法：List<T> selectByIds(String ids)
 * 说明：根据主键字符串进行查询，类中只有存在一个带有@Id注解的字段
 *
 *
 * 接口：DeleteByIdsMapper
 * 方法：int deleteByIds(String ids)
 * 说明：根据主键字符串进行删除，类中只有存在一个带有@Id注解的字段
 *
 * *********************InsertListMapper***************************
 *
 * 接口：InsertListMapper<T>
 * 方法：int insertList(List<T> recordList);
 * 说明：批量插入，支持批量插入的数据库可以使用，例如MySQL,H2等，另外该接口限制实体包含id属性并且必须为自增列
 */
public interface Mapper<T>
        extends
        BaseMapper<T>,
        ConditionMapper<T>,
        IdsMapper<T>,
        InsertListMapper<T> {
}
