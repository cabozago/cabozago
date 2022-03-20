package com.cheonmoim.cabozago.domain.cafe.controller.response;

import lombok.Builder;
import lombok.Getter;

import java.util.List;


@Getter
public class ResCafeListDto {
    private List<ResCafeDto> cafeList;

    @Builder
    public ResCafeListDto(List<ResCafeDto> cafeList) {
        this.cafeList = cafeList;
    }
}


