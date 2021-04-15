package com.stephane.propertyaccessservice.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor @AllArgsConstructor
@ToString
public class PropertyAccessVO {

    private String name;
    private String description;

}
