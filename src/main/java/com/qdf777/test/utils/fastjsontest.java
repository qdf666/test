package com.qdf777.test.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

public class fastjsontest {


    public static void main(String[] args) {
        //从字符串解析JSON对象
        JSONObject obj = JSON.parseObject("{\"runoob\":\"菜鸟教程\"}");
        System.out.println(obj);
        //从字符串解析JSON数组
        JSONArray arr = JSON.parseArray("[\"菜鸟教程\",\"RUNOOB\"]\n");
        System.out.println(arr);
        //将JSON对象转化为字符串
        String objStr = JSON.toJSONString(obj);
        System.out.println(objStr);
        //将JSON数组转化为字符串
        String arrStr = JSON.toJSONString(arr);
        System.out.println(arrStr);
    }
}
