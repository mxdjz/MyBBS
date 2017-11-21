package com.bbs.common.Enum;

/**
 * 查询SQL条件类型
 * 
 * @author qy199
 *
 */
public enum ConditionType {
    
    CONDITION_TYPE_EQUALS(1),          // 等于 
    CONDITION_TYPE_LIKE(2),            // 相似
    CONDITION_TYPE_FRONT_LIKE(21),    // 相似
    CONDITION_TYPE_LAST_LIKE(22),     // 相似
    CONDITION_TYPE_IN(3),              // 包含
    CONDITION_TYPE_NULL(4),            // 为空
    CONDITION_TYPE_NOT_NULL(5),       // 不为空
    CONDITION_TYPE_GT(6),              // 大于
    CONDITION_TYPE_GT_EQUALS(61),     // 大于等于
    CONDITION_TYPE_LT(7),              // 小于
    CONDITION_TYPE_LT_EQUALS(71);     // 小于等于
    

    private int code;

    private ConditionType() {
    }

    private ConditionType(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
