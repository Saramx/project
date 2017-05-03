package com.mx.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.mx.entity.Commodity;

public interface CommodityDao {

	//查询所有商品
	public List<Commodity> getAll();
	//随机查询一个商品
	public Commodity getCommodityByRandom();

}
