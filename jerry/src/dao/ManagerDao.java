package dao;

import java.util.List;

import domain.Manager;

/*
 * �������Ա��Ϣ�ӿ�
 */
public interface ManagerDao {

	void save(Manager manager);

	int findCount();

	List<Manager> findByPage(int begin, int pageSize);

	Manager findById(Integer mid);

	void delete(Manager manager);

	Manager findByMno(Manager manager);

	void save1(Manager manager);
	

}
