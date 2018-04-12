package service;

import java.util.List;

import dao.ApplyDao;
import domain.Apply;
import domain.ListBean;

/*
 * ������Ϣҵ���ʵ����
 */
public class ApplyServiceImpl  implements ApplyService{
           
	      //ע��������Ϣ��DAO��
	private ApplyDao applyDao;

	public void setApplyDao(ApplyDao applyDao) {
		this.applyDao = applyDao;
	}
//ҵ��㱣��������Ϣ�ķ���
	@Override
	public void save(Apply apply) {
		
		applyDao.save(apply);
		
	}
	@Override
	//������������ѯ������Ϣ
	public ListBean<Apply> findByClub(String aclub) {
		ListBean<Apply> listBean=new ListBean<Apply>();
		List<Apply> list=applyDao.findByClub(aclub);
		listBean.setList(list);
		return listBean;
	}
	@Override
	//����DID��ѯ������Ϣ�ķ���
	public Apply findByDid(Integer did) {
		
		return applyDao.findByDid(did);
	}
	@Override
	//����DIDɾ��������Ϣ�ķ���
	public void delete(Apply apply) {
		applyDao.delete(apply);
		
	}
	@Override
	//����DID��ѯ��Ϣ�ķ���
	public Apply edit(Apply apply) {
	   Apply existApply=applyDao.findById(apply);
		return existApply;
	}
	
	
}
