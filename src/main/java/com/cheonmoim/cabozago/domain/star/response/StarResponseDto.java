package com.cheonmoim.cabozago.domain.star.response;

import com.cheonmoim.cabozago.domain.star.entity.Star;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class StarResponseDto {

    Integer starId;
    String starGroupName;
    String starName;
    String starRealName;
    
    //Entity에서 DTO로 변환
    public static StarResponseDto fromEntity(Star star){
        return StarResponseDto.builder()
                .starId(star.getStarId())
                .starGroupName(star.getStarGroupName())
                .starName(star.getStarName())
                .starRealName(star.getStarRealName())
                .build();
    }
}
