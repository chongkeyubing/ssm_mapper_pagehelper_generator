package com.company.project.core;

import org.apache.commons.lang3.StringUtils;

/**
 * @Author: libaogang
 * @Date: 2019-06-06 23:40
 * @Description ajax响应结果生成工具
 */
public class ResultUtil {

    private static final int SUCCESS_CODE = 0;
    private static final int FAIL_CODE = -1;
    private static final String DEFAULT_SUCCESS_MESSAGE = "success";

    public static Result success() {
        Result result = new Result();
        result.setCode(SUCCESS_CODE);
        result.setSuccess(true);
        result.setMessage(DEFAULT_SUCCESS_MESSAGE);
        return result;
    }

    public static <T> Result<T> success(T data) {
        Result<T> result = new Result<>();
        result.setCode(SUCCESS_CODE);
        result.setSuccess(true);
        result.setMessage(DEFAULT_SUCCESS_MESSAGE);
        result.setData(data);
        return result;
    }

    public static Result fail(String message) {
        Result result = new Result();
        result.setCode(FAIL_CODE);
        result.setSuccess(false);
        result.setMessage(null);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(StringUtils.isBlank("s"));
}
}
