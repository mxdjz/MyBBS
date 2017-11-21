package com.bbs.common.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 日期处理工具
 * @author qy199
 *
 */
public class DateUtil {

    /**
     * 日期格式，yyyy-MM-dd
     */
    public static final String PATTERN_YYYY_MM_DD = "yyyy-MM-dd";

    /**
     * 日期格式，yyyy-MM-dd HH:mm:ss
     */
    public static final String PATTERN_YYYY_MM_DD_HH_MM_SS = "yyyy-MM-dd HH:mm:ss";
    
    /**
     * 日期格式转换器
     */
    private static SimpleDateFormat format = new SimpleDateFormat();

    private DateUtil() {}
    
    /**
     * 获取一个{@link java.util.Date}类型的字符串（格式默认为：yyyy-MM-dd）
     * @param date
     * @return
     */
    public static String convertDateToString(Date date) {
        return convertDateToString(date, PATTERN_YYYY_MM_DD);
    }
    
    /**
     * 获取一个{@link java.util.Date}类型的自定义格式字符串
     * @param date
     * @return
     */
    public static String convertDateToString(Date date, String pattern) {
        format.applyPattern(pattern);
        return format.format(date);
    }
    
    /**
     * 获取一个日期字符串的{@link java.util.Date}类型（格式默认为：yyyy-MM-dd）
     * @param date
     * @return
     */
    public static Date convertStringToDate(String date) {
        return convertStringToDate(date, PATTERN_YYYY_MM_DD);
    }
    
    /**
     * 获取一个自定义格式的日期字符串的{@link java.util.Date}类型
     * @param date
     * @return
     */
    public static Date convertStringToDate(String date, String pattern) {
        format.applyPattern(pattern);
        try {
            return format.parse(date);
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }
}
