package com.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.bean.Brand;
import com.bean.Goods;
import com.bean.Kind;

public interface GoodsMapper {
//查询 模糊查询
	List<Goods> select(Goods goods);
//	查询品牌
	@Select("select * from tb_brand")
	List<Brand> selBrand();
//	查询种类
	@Select("select * from tb_goodskind")
	List<Kind> selKind();
//	添加
	@Insert("insert into tb_goods set gyname=#{gyname},gzname=#{gzname},bid=#{bid},zid=#{zid},sice=#{sice},prize=#{prize},shu=#{shu},biao=#{biao},img=#{img}")
	int insert(Goods goods);
	
}
