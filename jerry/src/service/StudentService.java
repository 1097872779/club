package service;

import domain.PageBean;
import domain.Student;

/*
 * 学生的业务层的接口
 */
public interface StudentService {

	Student login(Student student);

	void save(Student student);

	

	Student cmdlogin(Student student);

	

	PageBean<Student> findByPage(Integer currPage);

	

	



	

	



}
