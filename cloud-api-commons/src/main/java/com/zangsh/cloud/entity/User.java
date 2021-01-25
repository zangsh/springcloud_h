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
public class User implements Serializable {

    private Long id;

    private String name;
}
