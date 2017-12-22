import dao.UserMapper;
import model.User;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import service.query;
import util.PagedResult;

/**
 * Created by ${MIND-ZR} on 2017/12/22.
 */



@ContextConfiguration(locations = {"classpath:application.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class CURD {
    Logger logger=Logger.getLogger(CURD.class);
    @Autowired
    private UserMapper userMapper;

        @Autowired
        private query query1;
    //查找操作
    @Test
    public void select(){
        PagedResult<User> pagedResult = query1.queryByPage("小三",1,10);//null表示查全部
        logger.debug("查找结果" + pagedResult);
    }


}
