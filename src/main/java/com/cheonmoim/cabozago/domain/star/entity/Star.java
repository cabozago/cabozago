package com.cheonmoim.cabozago.domain.star.entity;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
public class Star {
    @Id
    private Integer starId;
    private String starGroupName;
    private String starName;
    private String starRealName;

}
