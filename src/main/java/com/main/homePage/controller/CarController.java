package com.main.homePage.controller;


import com.main.homePage.dto.car.CarListDto;
import com.main.homePage.service.CarService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CarController {

    private final CarService carService ;

    @PreAuthorize("isAuthenticated() and (hasRole('ROLE_H'))")
    @Operation(summary = "차량 조회" , description = "차량 조회 API")
    @GetMapping(value = "/v1.0.0/car")
    public void GetCarList(@RequestParam Integer pageNo,
                              @RequestParam Integer pageSize,
                              @RequestParam(required = false) String carType ,
                              @RequestParam(required = false) String carCd,
                              @RequestParam(required = false) String carNm) {

        carService.getCarList(CarListDto.builder()
                        .pageNo(pageNo)
                        .pageSize(pageSize)
                        .carType(carType)
                        .carCd(carCd)
                        .carNm(carNm)
                        .build());

    }
}
