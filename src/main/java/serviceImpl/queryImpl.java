package serviceImpl;

import com.github.pagehelper.PageHelper;
import dao.UserMapper;
import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.query;
import util.BeanUtil;
import util.PagedResult;

/**
 * Created by ${MIND-ZR} on 2017/12/22.
 */
@Service
public class queryImpl implements query {

    @Autowired
    private UserMapper userMapper;
    public PagedResult<User> queryByPage(String userName,Integer pageNo,Integer pageSize ) {
        pageNo = pageNo == null?1:pageNo;
        pageSize = pageSize == null?10:pageSize;
        PageHelper.startPage(pageNo,pageSize);  //startPage是告诉拦截器说我要开始分页了。分页参数是这两个。
        return BeanUtil.toPagedResult(userMapper.selectUserByUserName(userName));
    }
}
