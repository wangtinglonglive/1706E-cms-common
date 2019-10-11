package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Brand;
import com.bean.Goods;
import com.bean.Kind;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mapper.GoodsMapper;

@Service
public class GoodsSerivaceImpl implements GoodsService{

	@Autowired
	GoodsMapper goodsMapper;

	@Override
	public PageInfo<Goods> select(int pageNum, Goods goods) {
		// TODO Auto-generated method stub
		PageHelper.startPage(pageNum, 3);
		List<Goods> list = goodsMapper.select(goods);
		return new PageInfo<>(list);
	}
	
	@Override
	public int insert(Goods goods) {
		// TODO Auto-generated method stub
		return goodsMapper.insert(goods);
	}

	@Override
	public List<Brand> selBrand() {
		// TODO Auto-generated method stub
		return goodsMapper.selBrand();
	}

	@Override
	public List<Kind> selKind() {
		// TODO Auto-generated method stub
		return goodsMapper.selKind();
	}



	
}
