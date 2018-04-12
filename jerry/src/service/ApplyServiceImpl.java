package service;

import java.util.List;

import dao.ApplyDao;
import domain.Apply;
import domain.ListBean;

/*
 * 申请信息业务层实现类
 */
public class ApplyServiceImpl  implements ApplyService{
           
	      //注入申请信息的DAO：
	private ApplyDao applyDao;

	public void setApplyDao(ApplyDao applyDao) {
		this.applyDao = applyDao;
	}
//业务层保存申请信息的方法
	@Override
	public void save(Apply apply) {
		
		applyDao.save(apply);
		
	}
	@Override
	//根据社团名查询申请信息
	public ListBean<Apply> findByClub(String aclub) {
		ListBean<Apply> listBean=new ListBean<Apply>();
		List<Apply> list=applyDao.findByClub(aclub);
		listBean.setList(list);
		return listBean;
	}
	@Override
	//根据DID查询申请信息的方法
	public Apply findByDid(Integer did) {
		
		return applyDao.findByDid(did);
	}
	@Override
	//根据DID删除申请信息的方法
	public void delete(Apply apply) {
		applyDao.delete(apply);
		
	}
	@Override
	//根据DID查询信息的方法
	public Apply edit(Apply apply) {
	   Apply existApply=applyDao.findById(apply);
		return existApply;
	}
	
	
}
