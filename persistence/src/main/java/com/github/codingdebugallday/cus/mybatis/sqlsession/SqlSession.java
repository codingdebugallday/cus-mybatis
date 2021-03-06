package com.github.codingdebugallday.cus.mybatis.sqlsession;

import java.util.List;

/**
 * <p>
 * description
 * </p>
 *
 * @author isaac 2020/8/21 1:16
 * @since 1.0.0
 */
public interface SqlSession {

    /**
     * 查询所有
     *
     * @param statementId statementId
     * @param params      可变参数
     * @param <E>         E
     * @return List<E>
     * @throws Exception Exception
     */
    <E> List<E> selectList(String statementId, Object... params) throws Exception;

    /**
     * 查询某一个
     *
     * @param statementId statementId
     * @param params      可变参数
     * @param <T>         T
     * @return T
     * @throws Exception Exception
     */
    <T> T selectOne(String statementId, Object... params) throws Exception;

    /**
     * Execute an insert statement.
     *
     * @param statementId Unique identifier matching the statement to execute.
     * @param params      params
     * @return int The number of rows affected by the insert.
     */
    int update(String statementId, Object... params) throws Exception;


    /**
     * 使用jdk动态代理为dao接口生成代理对象并返回
     *
     * @param mapperClass Class<?>
     * @param <T>         T
     * @return T
     */
    <T> T getMapper(Class<?> mapperClass);
}
