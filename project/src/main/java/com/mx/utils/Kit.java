package com.mx.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * ������
 * @author Mathartsys
 * ��map����ת����json
 *
 */
public class Kit {
	//���gson���� ����ʱ���ʽyyyy-MM-dd
	public static final Gson GSON = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
}
