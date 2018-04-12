package service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import dao.StudentDao;
import domain.PageBean;
import domain.Student;

/**
 * ҵ���ʵ����
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
			 * ҵ���ĵ�¼������
			 */
                      public Student login(Student student){
				            Student existStudent=  studentDao.findByUsernameAndPassword(student);
				           return existStudent;
			}
			@Override
			//ҵ��㱣��ѧ����Ϣ�ķ�����
			 public void save(Student student){
				
				    studentDao.save(student);
			}
			@Override
			/*
			 * ҵ���Ĺ���Ա��¼������
			 */
                      public Student cmdlogin(Student student){
				            Student existStudent=  studentDao.findByUsernameAndSright(student);
				           return existStudent;
			
                  }

			@Override
			 //��ҳ��ѯѧ����Ϣ�ķ���:
			public PageBean<Student> findByPage(Integer currPage) {
				PageBean<Student> pageBean=new PageBean<Student>();
				//��װ��ǰҳ��
				pageBean.setCurrPage(currPage);
				//��װÿҳ��ʾ��¼��
				int pageSize=4;
				pageBean.setPageSize(pageSize);
				//��װ�ܼ�¼��
				int  totalCount=studentDao.findCount();
				pageBean.setTotalCount(totalCount);
				//��װ��ҳ��
				double tc =totalCount;
			    Double num=	Math.ceil(tc/pageSize);
			   pageBean.setTotalPage(num.intValue());
			   //��װÿҳ��ʾ������
			   int begin =(currPage-1)*pageSize;
				List<Student> list =studentDao.findByPage(begin,pageSize);
				pageBean.setList(list);
				
				
				return pageBean;
				
				
				
			}
       
}
