package com.mx.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.dao.CommodityDao;
import com.mx.entity.Commodity;
import com.mx.service.CommodityService;

@Service
public class CommodityServiceImpl implements CommodityService {
	@Autowired
	private CommodityDao commodityDao;

	/**
	 * ��ѯ������Ʒ
	 */
	public List<Commodity> getAll() {
		return commodityDao.getAll();
	}

	/**
	 * ��ѯһ����Ʒ
	 */
	public Commodity getCommodityByRandom() {
		return commodityDao.getCommodityByRandom();
	}

}
