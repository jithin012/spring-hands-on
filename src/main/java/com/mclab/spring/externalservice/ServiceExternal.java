package com.mclab.spring.externalservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ServiceExternal {
	
	@Value("${external.service.url}")
	private String url;
	
	public String getUrl() {
		return url;
	}
}
