package com.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.bean.Brand;
import com.bean.Goods;
import com.bean.Kind;

public interface GoodsMapper {
//��ѯ ģ����ѯ
	List<Goods> select(Goods goods);
//	��ѯƷ��
	@Select("select * from tb_brand")
	List<Brand> selBrand();
//	��ѯ����
	@Select("select * from tb_goodskind")
	List<Kind> selKind();
//	���
	@Insert("insert into tb_goods set gyname=#{gyname},gzname=#{gzname},bid=#{bid},zid=#{zid},sice=#{sice},prize=#{prize},shu=#{shu},biao=#{biao},img=#{img}")
	int insert(Goods goods);
	
}
