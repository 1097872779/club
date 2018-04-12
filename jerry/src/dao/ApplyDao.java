package dao;

import java.util.List;

import domain.Apply;

/*
 * ������ϢDAO�ӿ�
 */
public interface ApplyDao {

	void save(Apply apply);

	List<Apply> findByClub(String aclub);

	Apply findByDid(Integer did);

	void delete(Apply apply);

	Apply findById(Apply apply);

	

}
