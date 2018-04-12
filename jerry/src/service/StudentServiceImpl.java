package service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import dao.StudentDao;
import domain.PageBean;
import domain.Student;

/**
 * 业务层实现类
 * @author Jerry Liang
 *
 */
@Transactional
public class StudentServiceImpl  implements StudentService{
                      private StudentDao  studentDao;

					public void setStudentDao(StudentDao studentDao) {
						this.studentDao = studentDao;
					}
					
			@Override
			/*
			 * 业务层的登录方法：
			 */
                      public Student login(Student student){
				            Student existStudent=  studentDao.findByUsernameAndPassword(student);
				           return existStudent;
			}
			@Override
			//业务层保存学生信息的方法：
			 public void save(Student student){
				
				    studentDao.save(student);
			}
			@Override
			/*
			 * 业务层的管理员登录方法：
			 */
                      public Student cmdlogin(Student student){
				            Student existStudent=  studentDao.findByUsernameAndSright(student);
				           return existStudent;
			
                  }

			@Override
			 //分页查询学生信息的方法:
			public PageBean<Student> findByPage(Integer currPage) {
				PageBean<Student> pageBean=new PageBean<Student>();
				//封装当前页数
				pageBean.setCurrPage(currPage);
				//封装每页显示记录数
				int pageSize=4;
				pageBean.setPageSize(pageSize);
				//封装总记录数
				int  totalCount=studentDao.findCount();
				pageBean.setTotalCount(totalCount);
				//封装总页数
				double tc =totalCount;
			    Double num=	Math.ceil(tc/pageSize);
			   pageBean.setTotalPage(num.intValue());
			   //封装每页显示的数据
			   int begin =(currPage-1)*pageSize;
				List<Student> list =studentDao.findByPage(begin,pageSize);
				pageBean.setList(list);
				
				
				return pageBean;
				
				
				
			}
       
}
