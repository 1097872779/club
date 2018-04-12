package dao;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import domain.Manager;
import domain.Mapply;
/*
 * ����Ա��ϢDAO�ӿ�ʵ����
 */
public class ManagerDaoImpl extends HibernateDaoSupport  implements ManagerDao{
//�������Ա��Ϣ�ķ���
	@Override
	public void save(Manager manager) {
                
		this.getHibernateTemplate().save(manager);
		
	}

	@Override
	public int findCount() {
		String hql="select count(*) from Manager";
		   List<Long> list = this.getHibernateTemplate().find(hql);
		   if(list.size()>0){
			   return list.get(0).intValue();
		   }
			return 0;
		
	}

	@Override
	public List<Manager> findByPage(int begin, int pageSize) {
		DetachedCriteria criteria =DetachedCriteria.forClass(Manager.class);
		List<Manager> list=	this.getHibernateTemplate().findByCriteria(criteria,begin,pageSize);
		return list;
	}

	@Override
	//��ѯʵ�ַ���
	public Manager findById(Integer mid) {
		return this.getHibernateTemplate().get(Manager.class, mid);
	}

	@Override
	//ɾ��ʵ�ַ���
	public void delete(Manager manager) {
		this.getHibernateTemplate().delete(manager);
		
	}

	@Override
	//��ѯ��ѧ���Ƿ��ǹ���Ա�ķ���
	public Manager findByMno(Manager manager) {
		
		String sql="from Manager where mno=?";
		List<Manager>  list=this.getHibernateTemplate().find(sql,manager.getMno());
		if(list.size()>0){
 		   return list.get(0);
 	   }
 	   
 	   
 	   return null;
 	
	    }

	@Override
	//��Ȩ����Ա���淽��
	public void save1(Manager manager) {
		this.getHibernateTemplate().save(manager);
		
	}

}
