package com.monitoring.prometheus;

import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.autoconfigure.metrics.MeterRegistryCustomizer;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PrometheusApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrometheusApplication.class, args);
	}

	@Bean
	MeterRegistryCustomizer meterRegistryCustomizer(MeterRegistry meterRegistry) {
		return meterRegistry1 -> {
			meterRegistry.config()
					.commonTags("application", "micrometer-monitoring-example");
		};
	}

}
