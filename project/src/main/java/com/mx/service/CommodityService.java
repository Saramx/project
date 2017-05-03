package com.mx.service;

import java.util.List;

import com.mx.entity.Commodity;

public interface CommodityService {
	// 查询所有商品
	public List<Commodity> getAll();

	// 随机查询一个商品
	public Commodity getCommodityByRandom();
}
