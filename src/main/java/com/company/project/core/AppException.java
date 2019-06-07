package com.company.project.core;

/**
 * @Author: 李宝刚
 * @Date: 2019-06-06 23:40
 * @Description 业务异常统一抛出该类，由GlobalExceptionHanlder统一处理
 */
public class AppException extends RuntimeException {

    public AppException(){}

    public AppException(String msg) {
        super(msg);
    }
}