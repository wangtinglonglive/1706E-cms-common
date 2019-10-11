package com.service;

import java.util.List;

import com.bean.Brand;
import com.bean.Goods;
import com.bean.Kind;
import com.github.pagehelper.PageInfo;

public interface GoodsService {

	PageInfo<Goods> select( int pageNum,Goods goods);
	
	List<Brand> selBrand();
	
	List<Kind> selKind();
	
	int insert (Goods goods);


}
