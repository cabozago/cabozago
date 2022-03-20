package com.cheonmoim.cabozago.domain.cafe.entity;

import com.cheonmoim.cabozago.domain.cafe.controller.response.ResCafeDto;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@NoArgsConstructor
@Entity
public class Cafe {

    @Id
    private Long cafeId;

    private String cafeName;

    private String cafeAddress;

    @Builder
    public Cafe(Long cafeId, String cafeName, String cafeAddress) {
        this.cafeId = cafeId;
        this.cafeName = cafeName;
        this.cafeAddress = cafeAddress;
    }

    public ResCafeDto toSingleCafeDto() {
        return ResCafeDto.builder()
                .cafeId(cafeId)
                .cafeName(cafeName)
                .cafeAddress(cafeAddress)
                .build();
    }
}
