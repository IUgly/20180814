package team.redrock.redis;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.annotation.Resource;

@SpringBootTest(classes = StartSpringBootMain.class)
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
public class TestRedisDemo {
    @Resource
   private RedisTemplate<String, String> redisTemplate;
    @Test
    public void test(){
        this.redisTemplate.opsForValue().set("redrock", "www.redrock.team");
        System.out.println(this.redisTemplate.opsForValue().get("redrock"));
    }
}
