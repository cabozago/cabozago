package com.cheonmoim.cabozago.domain.star.repository;

import com.cheonmoim.cabozago.domain.star.entity.Star;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StarRepository extends JpaRepository<Star,Integer> {

    //starGroupName, starName, starRealName 으로 스타 검색
    List<Star> findByStarNameOrStarRealNameOrStarGroupName(String StarName, String StarRealName, String StarGroupName);
}
