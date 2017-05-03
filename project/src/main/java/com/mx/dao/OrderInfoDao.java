package com.mx.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.mx.dto.OrderInfoDetails;
import com.mx.entity.OrderInfo;

public interface OrderInfoDao {
	
	/**
	 * ����һ������
	 * @param orderInfo
	 */
	public void add(OrderInfo orderInfo);
	/**
	 * ��ѯ��������
	 * @param page ��ǰҳ��
	 * @param rows ��ѯ����
	 * @param whereName	��ѯ���� ������ʱ�䣬������Ʒ���ƣ�������䣩 
	 * @param whereValue ��ѯ������ֵ
	 * @param price1 ��ʼ���
	 * @param price2 �������
	 * @return
	 */
	List<OrderInfoDetails> getOrderInfoDetailsByWhere(@Param("page") int page,
			@Param("rows") int rows, @Param("whereName") String whereName,
			@Param("whereValue") String whereValue,
			@Param("price1") double price1, @Param("price2") double price2);
	/**
	 * ����������
	 * @param whereName ��ѯ���� ������ʱ�䣬������Ʒ���ƣ�������䣩 
	 * @param whereValue ��ѯ������ֵ
	 * @param price1  ��ʼ���
	 * @param price2  �������
	 * @return
	 */
	int getOrderInfoCountDetailsByWhere(@Param("whereName") String whereName,
			@Param("whereValue") String whereValue,
			@Param("price1") double price1, @Param("price2") double price2);
	/**
	 * ����id��ѯ��������
	 * @param id
	 * @return
	 */
	OrderInfoDetails getOrderInfoById(@Param("id") String id);
}
