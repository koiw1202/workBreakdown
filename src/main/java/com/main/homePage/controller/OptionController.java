package com.main.homePage.controller;

import com.main.homePage.dto.option.OptionListDto;
import com.main.homePage.service.OptionService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class OptionController {

    private final OptionService optionService ;

    @PreAuthorize("isAuthenticated() and (hasRole('ROLE_H'))")
    @Operation(summary = "옵션 조회" , description = "옵션 조회 API")
    @GetMapping(value = "/v1.0.0/option")
    public void GetCarList(@RequestParam Integer pageNo,
                           @RequestParam Integer pageSize,
                           @RequestParam(required = false) String optionCd,
                           @RequestParam(required = false) String optionNm) {

        optionService.getOptionList(OptionListDto.builder()
                .pageNo(pageNo)
                .pageSize(pageSize)
                .optionCd(optionCd)
                .optionNm(optionNm)
                .build()
        ) ;

    }

}
