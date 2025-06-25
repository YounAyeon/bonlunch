package kr.smhrd.lunch.controller;

import kr.smhrd.lunch.BonlunchApplication;
import kr.smhrd.lunch.dto.GoodsDto;
import kr.smhrd.lunch.entity.Goods;
import kr.smhrd.lunch.repository.GoodsDetailRepository;
import kr.smhrd.lunch.service.GoodsService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping("/api")// /api메핑을 처리하겠는 설정
public class GoodsController {

    private final GoodsDetailRepository goodsDetailRepository;


   
   @Autowired
   GoodsService goodsService;


    GoodsController(GoodsDetailRepository goodsDetailRepository) {
        this.goodsDetailRepository = goodsDetailRepository;
    }
   
   
   @GetMapping("/goods_list")
   public List<GoodsDto> getGoodsList() {
      
      System.out.println("[List 출력 컨트롤러]");
      
      List<GoodsDto> goodsList = goodsService.getGoodsList();
      
      // 2Step -> Service ->Repository findAll()
      return goodsList;
   }
   
   @GetMapping("/goods_list/{id}")
   public GoodsDto getGoodsDetail(@PathVariable("id") int id) {
      System.out.println("[getGoodsDetail]");
      System.out.println("ID확인 : " + id);
      GoodsDto goodsList = goodsService.getGoodsDetail(id);
      
      return goodsList;
   }
   
}
