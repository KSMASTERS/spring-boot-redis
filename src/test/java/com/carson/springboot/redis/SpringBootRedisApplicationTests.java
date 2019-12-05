package com.carson.springboot.redis;

import com.carson.springboot.redis.util.RedisUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootRedisApplicationTests {

	@Autowired
	private RedisUtil redisUtil;

	@Test
	void contextLoads() {

		redisUtil.set("1","wangkaishuang");
		redisUtil.set("2","maziqing", 10);
	}

}
