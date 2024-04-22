package com.windcf.sprintbootdemo.common;

import lombok.Getter;

@Getter
public class ApiResponse<T> {
    private static final String SUCCESS_MSG = ApiCode.SUCCESS.getMessage();

    private static final String SUCCESS_CODE = ApiCode.SUCCESS.getCode();

    private final String code;
    private final String msg;
    private final T data;


    private ApiResponse(String code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static <T> ApiResponse<T> success(String code, String msg, T data) {
        return new ApiResponse<>(code, msg, data);
    }

    public static <T> ApiResponse<T> success(T data) {
        return new ApiResponse<>(SUCCESS_CODE, SUCCESS_MSG, data);
    }

    public static <T> ApiResponse<T> success() {
        return success(null);
    }

    public static <T> ApiResponse<T> success(String msg) {
        return success(SUCCESS_CODE, msg, null);
    }

    public static <T> ApiResponse<T> success(String msg, T data) {
        return success(SUCCESS_CODE, msg, data);
    }


    public static <T> ApiResponse<T> userError(ApiCode code) {
        return new ApiResponse<>(code.getCode(), code.getMessage(), null);
    }
}
