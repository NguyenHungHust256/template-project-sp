package com.luyenlaptrinh.templateproject.payload.request;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

/**
 * Create by
 *
 * @author : Nguyen Ba Hung
 * @since : 9/21/2022, Wed
 **/
@Getter
@Setter
public class UpdateEmployeeReq {
    @NotBlank
    private Long id;

    private String name;

    private String email;

    private String gender;
}
