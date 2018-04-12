package dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import domain.Apply;
import domain.Mapply;

/*
 * ������ϢDAO�ӿ�ʵ����
 */
public class ApplyDaoImpl    extends HibernateDaoSupport  implements ApplyDao {

	@Override
	//����������Ϣ�ķ���
	public void save(Apply apply) {
		this.getHibernateTemplate().save(apply);
		
	}

	@Override
	//�����������Ʋ�ѯ������Ϣ�ķ���
	public List<Apply> findByClub(String aclub) {
		//System.out.println("hello");
		String hql=" select a from Apply  a where a.aclub=?";
		List<Apply> list=this.getHibernateTemplate().find(hql,aclub);
		System.out.println(list.toString());
		//System.out.println("hello1");
		return list;
	}

	@Override
	//����DID��ѯ������Ϣ�ķ���
	public Apply findByDid(Integer did) {
		
		return this.getHibernateTemplate().get(Apply.class,did);
	}

	@Override
	//����DIDɾ��������Ϣ�ķ���
	public void delete(Apply apply) {
		this.getHibernateTemplate().delete(apply);
		
	}
//����DID��ѯ������Ϣ�ķ���
	@Override
	public Apply findById(Apply apply) {
		String sql="from Apply where did=?";
		List<Apply>  list=this.getHibernateTemplate().find(sql,apply.getDid());
		if(list.size()>0){
 		   return list.get(0);
 	   }
 	   
 	   
 	   return null;
    
	}

}
