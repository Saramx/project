package com.mx.service;

import java.util.List;

import com.mx.dto.OrderInfoDetails;
import com.mx.entity.OrderInfo;

public interface OrderInfoService {
	
	/**
	 * ����һ������
	 * @param orderInfo
	 */
	public void add(OrderInfo orderInfo);

	/**
	 * ��ѯ��������
	 * 
	 */
	List<OrderInfoDetails> getOrderInfoDetailsByWhere(int page, int rows,
			String whereName, String whereValue);

	
	/**
	 * ����������
	 *
	 */
	int getOrderInfoCountDetailsByWhere(String whereName, String whereValue);

	OrderInfoDetails getOrderInfoById(String id);
}
