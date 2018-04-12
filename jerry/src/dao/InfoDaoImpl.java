package dao;


import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import domain.Info;

/*
 * �ӿ�ʵ����
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
//����ID��ѯʵ�ַ���
	@Override
	public Info findById(Integer id) {
	
		return this.getHibernateTemplate().get(Info.class,id );
	}
//ɾ����Ϣʵ�ַ���
	@Override
	public void delete(Info info) {
		this.getHibernateTemplate().delete(info);
		
	}


	




	

}
