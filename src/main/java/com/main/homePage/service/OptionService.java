package com.main.homePage.service;

import com.main.homePage.dto.option.OptionListDto;
import com.main.homePage.mapper.OptionMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OptionService {

    private final OptionMapper optionMapper ;

    public void getOptionList(OptionListDto optionListDto) {

        optionMapper.selectOptionList(optionListDto) ;

    }
}
