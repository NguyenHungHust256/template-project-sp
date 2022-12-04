package com.luyenlaptrinh.templateproject.payload.request;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * Create by
 *
 * @author : Nguyen Ba Hung
 * @since : 9/21/2022, Wed
 **/
@Getter
@Setter
public class CreateEmployeeReq {
    @NotBlank
    private String name;

    @NotBlank
    private String email;

    @NotBlank
    private String gender;
}
