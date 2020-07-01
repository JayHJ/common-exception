package com.common.exception.test;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TestEntity {
    @NotNull
    private String stringOne;
    @NotBlank
    private String stringTwo;
}
