package dao;


import java.util.List;

import domain.Info;

public interface InfoDao {

	void save(Info info);

	List<Info> getInfoByMno(String mno);

	Info findById(Integer id);

	void delete(Info info);


}
