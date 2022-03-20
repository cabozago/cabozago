package com.cheonmoim.cabozago.domain.cafe.service;

import com.cheonmoim.cabozago.domain.cafe.controller.response.ResCafeDto;
import com.cheonmoim.cabozago.domain.cafe.controller.response.ResCafeListDto;
import com.cheonmoim.cabozago.domain.cafe.entity.Cafe;
import com.cheonmoim.cabozago.domain.cafe.repository.CafeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class CafeService {

    private final CafeRepository cafeRepository;

    public ResCafeListDto getCafeList() {
        List<Cafe> cafeList = cafeRepository.findAll();

        List<ResCafeDto> resCafeDtoList =
                cafeList.stream()
                        .map(cafe -> cafe.toSingleCafeDto())
                        .collect(Collectors.toList());

        return ResCafeListDto.builder()
                .cafeList(resCafeDtoList).build();
    }
}
