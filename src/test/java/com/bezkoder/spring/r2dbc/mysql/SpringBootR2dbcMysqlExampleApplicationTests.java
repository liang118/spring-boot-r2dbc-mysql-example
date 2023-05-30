package com.bezkoder.spring.r2dbc.mysql;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;

import java.util.Optional;

@SpringBootTest
class SpringBootR2dbcMysqlExampleApplicationTests {

	@Test
	void contextLoads() {
	}

	public static void main(String[] args) {
		Mono.empty().map(Optional::of).subscribe(System.out::println);
	}

}
