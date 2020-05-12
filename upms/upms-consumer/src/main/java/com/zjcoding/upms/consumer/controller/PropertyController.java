package com.zjcoding.upms.consumer.controller;

import cn.hutool.core.lang.Dict;
import com.zjcoding.upms.consumer.property.ApplicationProperty;
import com.zjcoding.upms.consumer.property.DeveloperProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 测试Controller
 * </p>
 *
 * @author Administrator
 */
@RestController
public class PropertyController {
	private final ApplicationProperty applicationProperty;
	private final DeveloperProperty developerProperty;

	@Autowired
	public PropertyController(ApplicationProperty applicationProperty, DeveloperProperty developerProperty) {
		this.applicationProperty = applicationProperty;
		this.developerProperty = developerProperty;
	}

	@GetMapping("/property")
	public Dict index() {
		return Dict.create().set("applicationProperty", applicationProperty).set("developerProperty", developerProperty);
	}
}
