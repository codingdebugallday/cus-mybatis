package com.github.codingdebugallday.cus.mybatis.config;

import java.util.List;

import com.github.codingdebugallday.cus.mybatis.utils.ParameterMapping;

/**
 * <p>
 * description
 * </p>
 *
 * @author isaac 2020/8/21 2:07
 * @since 1.0.0
 */
public class BoundSql {

    /**
     * 解析过后的sql
     */
    private String sqlText;
    /**
     * #{}占位符里面的值
     */
    private List<ParameterMapping> parameterMappingList;

    public BoundSql(String sqlText, List<ParameterMapping> parameterMappingList) {
        this.sqlText = sqlText;
        this.parameterMappingList = parameterMappingList;
    }

    public String getSqlText() {
        return sqlText;
    }

    public void setSqlText(String sqlText) {
        this.sqlText = sqlText;
    }

    public List<ParameterMapping> getParameterMappingList() {
        return parameterMappingList;
    }

    public void setParameterMappingList(List<ParameterMapping> parameterMappingList) {
        this.parameterMappingList = parameterMappingList;
    }
}
