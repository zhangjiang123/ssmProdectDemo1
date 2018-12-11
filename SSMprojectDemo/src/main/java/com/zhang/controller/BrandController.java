package com.zhang.controller;


import com.zhang.service.BrandService;
import com.zhang.service.impl.BrandServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/brand")
public class BrandController {


        @Autowired
        private BrandService brandService;

        @RequestMapping("/hello")
        public ModelAndView hello(@RequestParam String id){

            ModelAndView mv = new ModelAndView();
            String brandName = brandService.getBrandName(id);
            mv.addObject("brandName",brandName);
            mv.setViewName("BrandName");
            return mv;

        }

}
