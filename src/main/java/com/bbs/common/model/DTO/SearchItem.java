package com.bbs.common.model.DTO;

/**
 * 封装查询SQL条件 可定制查询类型，是否自动生成sql语句。 如果查询的值涉及多值查询，例如 xx in (1,
 * 2)，请尽量使用conditionMultiValue属性去存储查询条件的值，
 * 如果使用的是多值查询且未给conditionMultiValue传值，将会继续获取conditionSimpleValue的值去拼接sql语句，
 * 但仍请在多值查询时使用conditionMultiValue存储查询条件值，而不是conditionSimpleValue
 * 
 * @author qy199
 *
 */
public class SearchItem {

    /**
     * 查询列名
     */
    private String conditionName;

    /**
     * 查询条件值（单值）
     */
    private Object conditionSimpleValue;

    /**
     * 查询条件值（多值，如果查询类型为多值查询，则优先使用本属性的值，其次是用conditionSimpleValue的值）
     */
    private Object[] conditionMultiValue;

    /**
     * 查询方式
     */
    private int conditionType;

    /**
     * 是否自动生成sql语句，默认为true
     */
    private boolean isCreateSql = true;

    public String getConditionName() {
        return conditionName;
    }

    public void setConditionName(String conditionName) {
        this.conditionName = conditionName;
    }

    public Object getConditionSimpleValue() {
        return conditionSimpleValue;
    }

    public void setConditionSimpleValue(Object conditionSimpleValue) {
        this.conditionSimpleValue = conditionSimpleValue;
    }

    public Object[] getConditionMultiValue() {
        return conditionMultiValue;
    }

    public void setConditionMultiValue(Object[] conditionMultiValue) {
        this.conditionMultiValue = conditionMultiValue;
    }

    public int getConditionType() {
        return conditionType;
    }

    public void setConditionType(int conditionType) {
        this.conditionType = conditionType;
    }

    public boolean isCreateSql() {
        return isCreateSql;
    }

    public void setCreateSql(boolean isCreateSql) {
        this.isCreateSql = isCreateSql;
    }

}
