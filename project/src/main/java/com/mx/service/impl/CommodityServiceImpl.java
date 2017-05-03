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
	 * 查询所有商品
	 */
	public List<Commodity> getAll() {
		return commodityDao.getAll();
	}

	/**
	 * 查询一条商品
	 */
	public Commodity getCommodityByRandom() {
		return commodityDao.getCommodityByRandom();
	}

}
