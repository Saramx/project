package com.mx.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * 工具类
 * @author Mathartsys
 * 将map集合转换成json
 *
 */
public class Kit {
	//获得gson对象 定制时间格式yyyy-MM-dd
	public static final Gson GSON = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
}
