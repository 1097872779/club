package dao;

import java.util.List;

import domain.Club;

public interface ClubDao {

	List<Club> getInfoByClub(String cclub);

	List<Club> getInfoByClub1(String cclub);

	List<Club> getInfoByClub2(String cclub);

	void save(Club club);

	Club findByCid(Integer cid);

	void delete(Club club);

}
