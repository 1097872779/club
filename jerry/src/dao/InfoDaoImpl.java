package dao;


import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import domain.Info;

/*
 * 接口实现类
 */
public class InfoDaoImpl extends HibernateDaoSupport  implements InfoDao{

	@Override
	public void save(Info info) {
		this.getHibernateTemplate().save(info);
		
	}

	@Override
	public List<Info> getInfoByMno(String mno) {
		String hql="select a from Info a where a.mno =  "+mno;
		   List<Info> list = this.getHibernateTemplate().find(hql);		   
			return list.size() == 0 || list == null?null : list;
	}
//根据ID查询实现方法
	@Override
	public Info findById(Integer id) {
	
		return this.getHibernateTemplate().get(Info.class,id );
	}
//删除消息实现方法
	@Override
	public void delete(Info info) {
		this.getHibernateTemplate().delete(info);
		
	}


	




	

}
