package service;

import java.util.List;

import dao.ManagerDao;
import domain.Manager;
import domain.PageBean;

public class ManagerServiceImpl  implements ManagerService{
            //ע��DAO
	  private ManagerDao managerDao;

	public void setManagerDao(ManagerDao managerDao) {
		this.managerDao = managerDao;
	}
//�������Ա��Ϣ����
	@Override
	public void save(Manager manager) {
		
		 managerDao.save(manager);
		
	}
// ��ҳ��ѯ����Ա��Ϣ����
	@Override
	public PageBean<Manager> findByPage(Integer currPage) {
	         PageBean<Manager> pageBean=new  PageBean<Manager>();
	       //��װ��ǰҳ��
	 		pageBean.setCurrPage(currPage);
	 		//��װÿҳ��ʾ��¼��
	 		int pageSize=4;
	 		pageBean.setPageSize(pageSize);
	 		//��װ�ܼ�¼��
	 		int  totalCount=managerDao.findCount();
	 		pageBean.setTotalCount(totalCount);
			//��װ��ҳ��
			double tc =totalCount;
		    Double num=	Math.ceil(tc/pageSize);
		   pageBean.setTotalPage(num.intValue());
		   //��װÿҳ��ʾ������
		   int begin =(currPage-1)*pageSize;
		   List<Manager> list= managerDao.findByPage(begin,pageSize);
		   pageBean.setList(list);
	 		
		return pageBean;
	}
	//ɾ������Ա��Ϣ
	@Override
	public void delete(Manager manager) {
	 
		 managerDao.delete(manager);
	}
	//����ID��ѯ����Ա
	@Override
	public Manager findById(Integer mid) {
	            
		return managerDao.findById(mid);
	}
	
	@Override
	//��ѯѧ���Ƿ��ǹ���Ա����
	public Manager findByMno(Manager manager) {
	   return managerDao.findByMno(manager);
	
	}
	@Override
	//��Ȩ����Ա���淽��
	public void save1(Manager manager) {
		managerDao.save1(manager);
		
	}
	  
}
