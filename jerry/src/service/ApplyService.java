package service;

import domain.Apply;
import domain.ListBean;

/*
 * ������Ϣҵ���ӿ�
 */
public interface ApplyService {

	void save(Apply apply);

	ListBean<Apply> findByClub(String aclub);

	Apply findByDid(Integer did);

	void delete(Apply apply);

	Apply edit(Apply apply);

}
