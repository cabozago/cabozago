package com.cheonmoim.cabozago.domain.cafe.controller;

import com.cheonmoim.cabozago.domain.cafe.controller.response.ResCafeListDto;
import com.cheonmoim.cabozago.domain.cafe.service.CafeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/cabozago-api")
@RequiredArgsConstructor
public class CafeController {

    private final CafeService cafeService;

    // 목록 조회
    @GetMapping("/cafe-all")
    public ResponseEntity<ResCafeListDto> getAllCafeList() {
        return ResponseEntity.status(HttpStatus.OK).body(cafeService.getCafeList());
    }
}
