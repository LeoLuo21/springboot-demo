import com.feng.Person;
import com.feng.RedisApplication;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

@SpringBootTest(classes = RedisApplication.class)
public class RedisTest {

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    @Test
    public void testRedis() {
        ValueOperations<String, Object> ops =
                redisTemplate.opsForValue();

        ops.set("firstName","Jezos");
        ops.set("lastName","king");
    }

    @Test
    public void testSendObject() throws ParseException {
        Person p = new Person();
        p.setAge(10);
        p.setFirstName("Berry");
        p.setLastName("White");

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String dateString = format.format(new Date());
        p.setBirthDate(dateString);
        ValueOperations<String, Object> ops = redisTemplate.opsForValue();
        ops.set("person",p);

        ops.set("firstName","Jezos");
        ops.set("lastName","king");
    }

}

