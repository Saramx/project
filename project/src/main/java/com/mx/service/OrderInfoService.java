package com.mx.service;

import java.util.List;

import com.mx.dto.OrderInfoDetails;
import com.mx.entity.OrderInfo;

public interface OrderInfoService {
	
	/**
	 * 增加一条订单
	 * @param orderInfo
	 */
	public void add(OrderInfo orderInfo);

	/**
	 * 查询订单详情
	 * 
	 */
	List<OrderInfoDetails> getOrderInfoDetailsByWhere(int page, int rows,
			String whereName, String whereValue);

	
	/**
	 * 返回总条数
	 *
	 */
	int getOrderInfoCountDetailsByWhere(String whereName, String whereValue);

	OrderInfoDetails getOrderInfoById(String id);
}
