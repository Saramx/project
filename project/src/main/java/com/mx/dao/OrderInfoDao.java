package com.mx.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.mx.dto.OrderInfoDetails;
import com.mx.entity.OrderInfo;

public interface OrderInfoDao {
	
	/**
	 * 增加一条订单
	 * @param orderInfo
	 */
	public void add(OrderInfo orderInfo);
	/**
	 * 查询订单详情
	 * @param page 单前页数
	 * @param rows 查询条数
	 * @param whereName	查询条件 （订单时间，销售物品名称，金额区间） 
	 * @param whereValue 查询条件的值
	 * @param price1 开始金额
	 * @param price2 结束金额
	 * @return
	 */
	List<OrderInfoDetails> getOrderInfoDetailsByWhere(@Param("page") int page,
			@Param("rows") int rows, @Param("whereName") String whereName,
			@Param("whereValue") String whereValue,
			@Param("price1") double price1, @Param("price2") double price2);
	/**
	 * 返回总条数
	 * @param whereName 查询条件 （订单时间，销售物品名称，金额区间） 
	 * @param whereValue 查询条件的值
	 * @param price1  开始金额
	 * @param price2  结束金额
	 * @return
	 */
	int getOrderInfoCountDetailsByWhere(@Param("whereName") String whereName,
			@Param("whereValue") String whereValue,
			@Param("price1") double price1, @Param("price2") double price2);
	/**
	 * 根据id查询订单详情
	 * @param id
	 * @return
	 */
	OrderInfoDetails getOrderInfoById(@Param("id") String id);
}
