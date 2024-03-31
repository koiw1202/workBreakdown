package com.main.cc;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class CommonDto {

    private Integer pageNo ;
    private Integer pageSize ;

}
