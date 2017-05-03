package com.mx.quartz;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;

import com.mx.entity.OrderInfo;
import com.mx.service.OrderInfoService;
/**
 * 自动job
 * @author Mathartsys
 *
 */
public class OrderInfoJob {

	private String[] names = { "苹果", "香蕉", "菠萝", "芒果", "哈哈", "草莓" };

	@Autowired
	private OrderInfoService orderInfoService;
	//随机数对象
	private Random random = new Random();
	//自动添加订单
	public void job() {
		OrderInfo orderInfo = new OrderInfo();
		orderInfo.setC_name_of_purchaser(names[random.nextInt(names.length)]);
		orderInfoService.add(orderInfo);
	}
}
