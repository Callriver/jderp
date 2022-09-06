package com.jdsoft.util;

import java.util.HashMap;

/**
 * 通用
 */
public class Result extends HashMap<String ,Object> {
    /**
     * Constructs an empty <tt>HashMap</tt> with the default initial capacity
     * (16) and the default load factor (0.75).
     */
    public Result() {
        put("code","Y");
        put("msg","success");
    }
}
