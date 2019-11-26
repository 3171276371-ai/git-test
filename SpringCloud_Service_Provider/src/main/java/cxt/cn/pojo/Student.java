package cxt.cn.pojo;


import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@Table(name = "student")
public class Student {

  @Id
  private String sno;
  private String sname;
  private String sex;
  private Date birth;
  private String classno;


}
