package com.example.orderservice.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@ToString
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RequestOrder {
    private String productId;
    private Integer qty;
    private Integer unitPrice;
}
