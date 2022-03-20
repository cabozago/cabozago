package com.cheonmoim.cabozago.domain.star.service;

import com.cheonmoim.cabozago.domain.star.entity.Star;
import com.cheonmoim.cabozago.domain.star.repository.StarRepository;
import com.cheonmoim.cabozago.domain.star.response.StarResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StarService {

    @Autowired
    StarRepository starRepository;

    //starGroupName, starName, starRealName 으로 스타 검색
    public List<StarResponseDto> getStar(@RequestParam String name){
        //엔티티를 dto로 변환하여 리턴
        return starRepository.findByStarNameOrStarRealNameOrStarGroupName(name,name,name).stream()
                .map(StarResponseDto::fromEntity).collect(Collectors.toList());
    }
}