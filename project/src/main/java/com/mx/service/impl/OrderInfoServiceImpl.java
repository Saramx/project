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
	 * ���һ������
	 */
	public void add(OrderInfo orderInfo) {
		//�����ѯ��һ����Ʒ
		Commodity commodity = commoditydao.getCommodityByRandom();
		//����Ʒ�����ۺŸ�ֵ����������
		orderInfo.setC_id(commodity.getId());
		//����Ʒ�Ľ�ֵ������
		orderInfo.setO_price(commodity.getC_price());
		//���Calendar
		Calendar c = Calendar.getInstance();
		//����ǰʱ���ȥ112��
		c.add(Calendar.DATE, -112);
		//��ʱ�丳ֵ����������
		orderInfo.setO_date(c.getTime());
		//��������ӵ����ݿ���
		orderInfoDao.add(orderInfo);
	}
	/**
	 * ��ѯ��������
	 * @param page ��ǰҳ��
	 * @param rows ��ѯ����
	 * @param whereName	��ѯ���� ������ʱ�䣬������Ʒ���ƣ�������䣩 
	 * @param whereValue ��ѯ������ֵ
	 * @return
	 */
	public List<OrderInfoDetails> getOrderInfoDetailsByWhere(int page,
			int rows, String whereName, String whereValue) {
		// ��ҳ���㹫ʽ
		page = (page - 1) * rows;
		if (page == 0) {
			page = 1;
		}
		//����ѯ��������������page+rows
		rows = page + rows;
		//��ʼ���
		double price1 = 0;
		//�������
		double price2 = 0;
		if ("o_price".equals(whereName)) {
			//����x,x��ʽ�ָ����ʼ���ͽ������
			String[] wherevalues = whereValue.split(",");
			price1 = Double.parseDouble(wherevalues[0]);
			price2 = Double.parseDouble(wherevalues[1]);
		}
		//��Ʒ���Ƶ�ģ����ѯ
		if ("c_name".equals(whereName)) {
			whereValue = "%" + whereValue + "%";
		}
		return orderInfoDao.getOrderInfoDetailsByWhere(page, rows, whereName,
				whereValue, price1, price2);
	}
	//ͬ�ϣ���ѯ�������� 
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
	 * ��ѯ������������
	 */
	public OrderInfoDetails getOrderInfoById(String id) {
		// TODO Auto-generated method stub
		return orderInfoDao.getOrderInfoById(id);
	}

}
