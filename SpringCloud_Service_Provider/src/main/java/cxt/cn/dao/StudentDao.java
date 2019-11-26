package cxt.cn.dao;

import cxt.cn.pojo.Student;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

/**
 * @Author:陈啸掭
 * @Description:
 * @CreateTime: 2019/11/24 21:16
 */
@Repository
public interface StudentDao extends Mapper<Student> {
}
