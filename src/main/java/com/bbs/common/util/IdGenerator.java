package com.bbs.common.util;

import java.util.UUID;

import org.apache.commons.lang3.StringUtils;

/**
 * <p>
 * <h1>数据库ID生成工具</h1><br/>
 * <h3>生成规则：UUID + suffix(4位)</h3>
 * </p>
 * 
 * @author qy199
 *
 */
public class IdGenerator {

    private IdGenerator() {
    }

    public static String generateId(String suffix) throws Exception {
        if(StringUtils.isBlank(suffix)) {
            throw new NullPointerException();
        }
        if(!(suffix.length() == 4)) {
            throw new Exception("后缀长度必须为4位！");
        }
        StringBuffer id = new StringBuffer();
        id.append(UUID.randomUUID().toString()).append(suffix);
        return id.toString().replaceAll("-", "");
    }
}
