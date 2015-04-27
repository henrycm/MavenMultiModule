package com.jhcm.audit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.jhcm.audit.aop.AuditInterceptor;

@Configuration
@EnableAspectJAutoProxy
public class AOPConfig {

	@Bean
	public AuditInterceptor getAudit() {
		return new AuditInterceptor();
	}
}
