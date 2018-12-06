package me.takeontech.SpringBootWithPrometheus;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.micrometer.core.instrument.Metrics;

@RestController
public class AppRestController {

	static final io.micrometer.core.instrument.Counter counter = Metrics.counter("apicall.count", "type", "order");

	@RequestMapping("/")
	String sayHello() {
		counter.increment();
		return "Hello!!";
	}

}
