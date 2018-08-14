package team.redrock.redis;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@SpringBootTest(classes = StartSpringBootMain.class)
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
public class TestRedisTwo {
//	@Resource(name="redisTwo")
//	private RedisTemplate<String, Object> redisTemplate;
//	@Test
//	public void testGet() {
//		System.out.println(this.redisTemplate.opsForValue().get("redrock"));
//	}
//	@Test
//	public void testSet() {
//		Member vo = new Member() ;
//		vo.setMid("redrock.team");
//		vo.setAge(18);
//		this.redisTemplate.opsForValue().set("redrock", vo);;
//	}
}
