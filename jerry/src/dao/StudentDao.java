package dao;

import java.util.List;

import domain.Student;

/**
 * 学生的DAO接口
 * @author Jerry Liang
 *
 */
public interface StudentDao {
       Student findByUsernameAndPassword(Student student);

	void save(Student student);

	Student findByUsernameAndSright(Student student);

	int findCount();

	List<Student> findByPage(int begin, int pageSize);

	



	

	

	

	
}
