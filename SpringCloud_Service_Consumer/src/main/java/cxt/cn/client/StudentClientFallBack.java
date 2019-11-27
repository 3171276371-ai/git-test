package cxt.cn.client;

import cxt.cn.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author:陈啸掭
 * @Description:
 * @CreateTime: 2019/11/27 14:37
 */
@Component
public class StudentClientFallBack implements FeginClientDemo {

    @Override
    public Student findById(String id) throws InterruptedException {
        Student student = new Student();
        student.setSname("服务器正忙");
        return student;
    }
}
