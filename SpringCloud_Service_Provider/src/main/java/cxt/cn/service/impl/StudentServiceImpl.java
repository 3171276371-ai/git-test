package cxt.cn.service.impl;

import cxt.cn.dao.StudentDao;
import cxt.cn.pojo.Student;
import cxt.cn.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author:陈啸掭
 * @Description:
 * @CreateTime: 2019/11/24 21:17
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDao studentDao;

    @Override
    public Student findById(String id) {
        return studentDao.selectByPrimaryKey(id);
    }
}
