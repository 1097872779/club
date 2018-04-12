package service;



import domain.Info;
import domain.ListBean;


public interface InfoService {

	void save(Info info);

	
	ListBean<Info> getFindAll(String mno);


	Info findById(Integer id);


	void delete(Info info);


}
