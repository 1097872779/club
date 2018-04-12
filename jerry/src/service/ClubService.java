package service;

import domain.Club;
import domain.ListBean;

public interface ClubService {

	ListBean<Club> getFindAll(String cclub);

	ListBean<Club> getFindAll1(String cclub);

	ListBean<Club> getFindAll2(String cclub);

	void save(Club club);

	Club findByCid(Integer cid);

	void delete(Club club);

}
