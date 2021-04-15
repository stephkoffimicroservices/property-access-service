package com.stephane.propertyaccessservice.bean;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "property-file")
@Data
public class PropertyAccessBean {

    private String name;
    private String description;

}
