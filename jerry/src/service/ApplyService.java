package service;

import domain.Apply;
import domain.ListBean;

/*
 * 申请信息业务层接口
 */
public interface ApplyService {

	void save(Apply apply);

	ListBean<Apply> findByClub(String aclub);

	Apply findByDid(Integer did);

	void delete(Apply apply);

	Apply edit(Apply apply);

}
