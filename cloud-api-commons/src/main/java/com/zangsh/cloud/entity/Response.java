package com.zangsh.cloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * User: zangsh
 * Date: 2020/11/27
 * Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Response<T> implements Serializable {

    private Integer code;

    private String message;

    private T data;

    public static Response ok(Object data){
        Response response = new Response();
        response.setCode(200);
        response.setMessage("success");
        response.setData(data);
        return response;
    }

    public static Response fail(){
        Response response = new Response();
        response.setCode(500);
        response.setMessage("fail");
        return response;
    }
}
