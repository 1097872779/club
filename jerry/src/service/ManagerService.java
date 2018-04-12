package service;

import domain.Manager;
import domain.PageBean;

public interface ManagerService {

	void save(Manager manager);

	PageBean<Manager> findByPage(Integer currPage);

	void delete(Manager manager);

	Manager findById(Integer mid);

	Manager findByMno(Manager manager);

	void save1(Manager manager);

}
