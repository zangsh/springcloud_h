package com.zsh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * User: zangsh
 * Date: 2020/12/23
 * Description:
 */
public class Test {
    public static void main(String[] args) {
        getCode();
    }

    public static List getCode(){
        String timestamp = "2020-12-23 14:08:47 +0800 CST";
        String rand = "Yr9gqbdR";
        String token = "5bc29f9430b2728a";
        List list = new ArrayList();
        list.add(timestamp);
        list.add(rand);
        list.add(token);
//        Collections.sort(list);
        list.stream().sorted();
        StringBuffer sb = new StringBuffer();
        for (int i =0;i<list.size();i++){
            sb.append(list.get(i));
        }
        System.out.println(sb);
        return list;
    }
}
