package com.cheonmoim.cabozago.domain.star.controller;

import com.cheonmoim.cabozago.domain.star.response.StarResponseDto;
import com.cheonmoim.cabozago.domain.star.service.StarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("cabozago-api")
public class StarController {

    @Autowired
    StarService starService;

    //starGroupName, starName, starRealName 으로 스타 검색
    @GetMapping("/star")
    public List<StarResponseDto> getStar(@RequestParam String name){
        return starService.getStar(name);
    }


}
