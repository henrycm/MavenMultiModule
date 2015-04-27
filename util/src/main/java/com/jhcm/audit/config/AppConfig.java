package com.jhcm.audit.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = { "com.jhcm.audit.backend.service",
		"com.jhcm.audit.security", "com.jhcm.audit.view" })
@Import({ PersistenceJPAConfig.class, InitialDataConfig.class, AOPConfig.class })
public class AppConfig {

}
