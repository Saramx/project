package com.mx.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.mx.entity.Commodity;

public interface CommodityDao {

	//��ѯ������Ʒ
	public List<Commodity> getAll();
	//�����ѯһ����Ʒ
	public Commodity getCommodityByRandom();

}
