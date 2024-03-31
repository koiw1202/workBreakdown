package com.main.homePage.dto.option;

import lombok.Builder;
import lombok.Getter;
import lombok.experimental.WithBy;

@Getter
@Builder
public class OptionListDto {

    private Integer pageNo ;
    private Integer pageSize ;
    private String optionCd ;
    private String optionNm ;

}
