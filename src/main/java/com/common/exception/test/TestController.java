package com.common.exception.test;

import com.common.exception.response.CommonResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping(value = "/test")
public class TestController {

    @ResponseBody
    @PostMapping
    public CommonResponse<String> testCommonResonse(@Validated @RequestBody TestEntity entity) {
        log.info("in here");
        return new CommonResponse("success");
    }
}
