package com.stephane.propertyaccessservice.controller;

import com.stephane.propertyaccessservice.bean.PropertyAccessBean;
import com.stephane.propertyaccessservice.bean.PropertyAccessVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/access")
public class PropertyAccessController {

    @Autowired
    private PropertyAccessBean propertyAccessBean;

    @GetMapping("/accessProp")
    public PropertyAccessVO getPropertyAccess() {
        return new PropertyAccessVO(
                propertyAccessBean.getName(),
                propertyAccessBean.getDescription()
        );
    }

    @GetMapping("/accessProp2")
    public PropertyAccessBean getPropertyAccess2() {
        return propertyAccessBean;
    }

}
