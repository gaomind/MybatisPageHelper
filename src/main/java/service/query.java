package service;

import model.User;
import org.springframework.stereotype.Service;
import util.PagedResult;

/**
 * Created by ${MIND-ZR} on 2017/12/22.
 */
@Service
public interface query {
    PagedResult<User> queryByPage(String userName, Integer pageNo, Integer pageSize);
}
