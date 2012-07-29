package net.pdp7.webapp.spring;

import net.pdp7.commons.spring.context.SimpleWebAppInitializer;

public class WebAppInitializer extends SimpleWebAppInitializer {

	@Override
	protected Class<?>[] getAppConfigurationClasses() {
		return new Class<?>[] { AppConfig.class, };
	}

	@Override
	protected Class<?>[] getDispatcherConfigurationClasses() {
		return new Class<?>[] { DispatcherConfig.class, };
	}
}
