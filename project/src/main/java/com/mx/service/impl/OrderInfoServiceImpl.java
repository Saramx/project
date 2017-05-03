package com.mx.service.impl;

import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.dao.CommodityDao;
import com.mx.dao.OrderInfoDao;
import com.mx.dto.OrderInfoDetails;
import com.mx.entity.Commodity;
import com.mx.entity.OrderInfo;
import com.mx.service.OrderInfoService;

@Service
public class OrderInfoServiceImpl implements OrderInfoService {

	@Autowired
	private OrderInfoDao orderInfoDao;

	@Autowired
	private CommodityDao commoditydao;
	/**
	 * 添加一条订单
	 */
	public void add(OrderInfo orderInfo) {
		//随机查询到一个商品
		Commodity commodity = commoditydao.getCommodityByRandom();
		//将商品的销售号赋值给订单对象
		orderInfo.setC_id(commodity.getId());
		//将商品的金额赋值给订单
		orderInfo.setO_price(commodity.getC_price());
		//获得Calendar
		Calendar c = Calendar.getInstance();
		//将当前时间减去112天
		c.add(Calendar.DATE, -112);
		//将时间赋值给订单对象
		orderInfo.setO_date(c.getTime());
		//将订单添加到数据库中
		orderInfoDao.add(orderInfo);
	}
	/**
	 * 查询订单详情
	 * @param page 单前页数
	 * @param rows 查询条数
	 * @param whereName	查询条件 （订单时间，销售物品名称，金额区间） 
	 * @param whereValue 查询条件的值
	 * @return
	 */
	public List<OrderInfoDetails> getOrderInfoDetailsByWhere(int page,
			int rows, String whereName, String whereValue) {
		// 分页计算公式
		page = (page - 1) * rows;
		if (page == 0) {
			page = 1;
		}
		//将查询的数据索引移至page+rows
		rows = page + rows;
		//起始金额
		double price1 = 0;
		//结束金额
		double price2 = 0;
		if ("o_price".equals(whereName)) {
			//将想x,x格式分割成起始金额和结束金额
			String[] wherevalues = whereValue.split(",");
			price1 = Double.parseDouble(wherevalues[0]);
			price2 = Double.parseDouble(wherevalues[1]);
		}
		//商品名称的模糊查询
		if ("c_name".equals(whereName)) {
			whereValue = "%" + whereValue + "%";
		}
		return orderInfoDao.getOrderInfoDetailsByWhere(page, rows, whereName,
				whereValue, price1, price2);
	}
	//同上（查询总条数） 
	public int getOrderInfoCountDetailsByWhere(String whereName,
			String whereValue) {
		double price1 = 0;
		double price2 = 0;
		if ("o_price".equals(whereName)) {
			String[] wherevalues = whereValue.split(",");
			price1 = Double.parseDouble(wherevalues[0]);
			price2 = Double.parseDouble(wherevalues[1]);
		}

		if ("c_name".equals(whereName)) {
			whereValue = "%" + whereValue + "%";
		}
		return orderInfoDao.getOrderInfoCountDetailsByWhere(whereName,
				whereValue, price1, price2);
	}

	/**
	 * 查询当个订单详情
	 */
	public OrderInfoDetails getOrderInfoById(String id) {
		// TODO Auto-generated method stub
		return orderInfoDao.getOrderInfoById(id);
	}

}
