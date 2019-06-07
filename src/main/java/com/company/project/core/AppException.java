package com.company.project.exception;

/**
 * @Author: 李宝刚
 * @Date: 2019-06-06 23:40
 * @Description 业务异常统一抛出该类，由GlobalExceptionHanlder统一处理
 */
public class AppException extends RuntimeException {

    int code;

    public AppException(){}

    public AppException(int code, String msg) {
        super(msg);
        this.code = code;
    }
}