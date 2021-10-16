package ru.pkaranda.cibinternstesttask.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude
public class Request {

    private String color;
    private int cottonPart;
    private int quantity;
}