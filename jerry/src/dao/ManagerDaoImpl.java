package dao;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import domain.Manager;
import domain.Mapply;
/*
 * 管理员信息DAO接口实现类
 */
public class ManagerDaoImpl extends HibernateDaoSupport  implements ManagerDao{
//保存管理员信息的方法
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
	//查询实现方法
	public Manager findById(Integer mid) {
		return this.getHibernateTemplate().get(Manager.class, mid);
	}

	@Override
	//删除实现方法
	public void delete(Manager manager) {
		this.getHibernateTemplate().delete(manager);
		
	}

	@Override
	//查询该学生是否是管理员的方法
	public Manager findByMno(Manager manager) {
		
		String sql="from Manager where mno=?";
		List<Manager>  list=this.getHibernateTemplate().find(sql,manager.getMno());
		if(list.size()>0){
 		   return list.get(0);
 	   }
 	   
 	   
 	   return null;
 	
	    }

	@Override
	//授权管理员保存方法
	public void save1(Manager manager) {
		this.getHibernateTemplate().save(manager);
		
	}

}
