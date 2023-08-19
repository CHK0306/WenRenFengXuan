import com.test.Application;
import com.test.hellow.controller.TestController;
import com.test.hellow.pojo.MyAdd;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest(classes = Application.class)
public class AddTest {

    @Resource
    public TestController controller;
    @Test
    public void test() {
        MyAdd add = new MyAdd();
        add.setA(1);
        add.setB(2);
        int res = controller.myAdd(add);
        System.out.println(res);
    }
}
