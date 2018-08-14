package team.redrock.redis;
import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import team.redrock.redis.vo.Member;
@SpringBootTest(classes = StartSpringBootMain.class)
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
public class TestRedis {
	@Resource
	private RedisTemplate<String, Object> redisTemplate;
//	@Test
//	public void testGet() {
//		System.out.println(this.redisTemplate.opsForValue().get("redrock"));
//	}
	@Test
	public void testSet() {
		Member vo = new Member() ;
		vo.setMid("www.redrock.team");
		vo.setAge(18);
		this.redisTemplate.opsForValue().set("redrock", vo);
		System.out.println(this.redisTemplate.opsForValue().get("redrock"));
	}
}
