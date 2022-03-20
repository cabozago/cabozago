package com.cheonmoim.cabozago.domain.cafe.repository;

import com.cheonmoim.cabozago.domain.cafe.entity.Cafe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CafeRepository extends JpaRepository<Cafe, Long> {
}
