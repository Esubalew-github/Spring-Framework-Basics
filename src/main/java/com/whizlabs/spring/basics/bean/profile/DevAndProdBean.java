package com.whizlabs.spring.basics.bean.profile;

import org.springframework.stereotype.Component;

@Component
//@Profile("dev & prod")
@DevAndProdProfile
public class DevAndProdBean {
}
