package com.main.homePage.dto.car;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder
@Getter
@ToString
public class CarListDto {

    private Integer pageNo ;
    private Integer pageSize ;
    private String carType ;
    private String carCd ;
    private String carNm ;

}
