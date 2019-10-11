package com.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.bean.Brand;
import com.bean.Goods;
import com.bean.Kind;
import com.github.pagehelper.PageInfo;
import com.service.GoodsService;

@Controller
@RequestMapping("Goods")
public class GoodsController {

	@Autowired
	GoodsService goodsService;
	
	@RequestMapping("select.do")
	public String select(@RequestParam(defaultValue="1")int pageNum,Goods goods,Model model) {
		PageInfo<Goods> page = goodsService.select(pageNum, goods);
		model.addAttribute("page", page);
		return "list";	
	}
	
	// Ç°ÍùÌí¼Ó
		@RequestMapping(value="insert.do", method=RequestMethod.GET)
		public String toInsert(Goods goods, Model model) {
			List<Brand> selBrand = goodsService.selBrand();
			List<Kind> selKind = goodsService.selKind();
			model.addAttribute("b", selBrand);
			model.addAttribute("k", selKind);
			return "insert";
		}
	
	@RequestMapping(value="insert.do",method=RequestMethod.POST)
	public String insert(Goods goods ,MultipartFile file) throws IllegalStateException, IOException {
		String filename = file.getOriginalFilename();
		String suffixName = filename.substring(filename.lastIndexOf("."));
		
		String path = UUID.randomUUID().toString()+suffixName;
		String pic = "/pic/"+ path;
		file.transferTo(new File(pic));
		goods.setImg(pic);
		int res = goodsService.insert(goods);
		System.out.println("Ìí¼Ó"+res);
		return "redirect:select.do";
	}
}
