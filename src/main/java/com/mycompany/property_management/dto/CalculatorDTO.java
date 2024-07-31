package com.mycompany.property_management.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CalculatorDTO {
    private Double num1;
    private Double num2;
    private Double num3;
    @JsonProperty("num41")
    private Double num4;




}
