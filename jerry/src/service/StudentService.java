package service;

import domain.PageBean;
import domain.Student;

/*
 * ѧ����ҵ���Ľӿ�
 */
public interface StudentService {

	Student login(Student student);

	void save(Student student);

	

	Student cmdlogin(Student student);

	

	PageBean<Student> findByPage(Integer currPage);

	

	



	

	



}
