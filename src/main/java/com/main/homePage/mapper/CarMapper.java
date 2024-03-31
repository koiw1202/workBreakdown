package com.main.homePage.mapper;

import com.main.homePage.dto.car.CarListDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CarMapper {

    public void selectCarList(CarListDto carListDto) ;

}
