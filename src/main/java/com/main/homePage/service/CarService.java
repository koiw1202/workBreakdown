package com.main.homePage.service;

import com.main.homePage.dto.car.CarListDto;
import com.main.homePage.mapper.CarMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CarService {

    private final CarMapper carMapper ;

    public void getCarList(CarListDto carListDto) {

        carMapper.selectCarList(carListDto);

    }

}
