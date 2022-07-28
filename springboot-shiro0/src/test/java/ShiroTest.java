import com.feng.Application;
import com.feng.bean.User;
import org.apache.catalina.security.SecurityUtil;
import org.apache.shiro.SecurityUtils;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, classes = { Application.class })
@AutoConfigureMockMvc
@ExtendWith(SpringExtension.class)
public class ShiroTest {

    @Autowired
    private MockMvc mockMvc;


    @Test
    public void testShiro() throws Exception {
        MvcResult result = mockMvc.perform(MockMvcRequestBuilders.
                post("/login?username=jack&password=jackloverose"))
                .andReturn();
        String contentAsString = result.getResponse().getContentAsString();
        System.out.println(contentAsString);
    }

}
