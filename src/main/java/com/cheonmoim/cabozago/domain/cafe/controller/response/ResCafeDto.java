package com.cheonmoim.cabozago.domain.cafe.controller.response;

import lombok.Builder;
import lombok.Getter;

@Getter
public class ResCafeDto {

    private Long cafeId;

    private String cafeName;

    private String cafeAddress;

    @Builder
    private ResCafeDto(Long cafeId, String cafeName, String cafeAddress) {
        this.cafeId = cafeId;
        this.cafeName = cafeName;
        this.cafeAddress = cafeAddress;
    }
}
