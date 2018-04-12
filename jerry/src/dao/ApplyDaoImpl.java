package dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import domain.Apply;
import domain.Mapply;

/*
 * 申请信息DAO接口实现类
 */
public class ApplyDaoImpl    extends HibernateDaoSupport  implements ApplyDao {

	@Override
	//保存申请信息的方法
	public void save(Apply apply) {
		this.getHibernateTemplate().save(apply);
		
	}

	@Override
	//根据社团名称查询申请信息的方法
	public List<Apply> findByClub(String aclub) {
		//System.out.println("hello");
		String hql=" select a from Apply  a where a.aclub=?";
		List<Apply> list=this.getHibernateTemplate().find(hql,aclub);
		System.out.println(list.toString());
		//System.out.println("hello1");
		return list;
	}

	@Override
	//根据DID查询申请信息的方法
	public Apply findByDid(Integer did) {
		
		return this.getHibernateTemplate().get(Apply.class,did);
	}

	@Override
	//根据DID删除申请信息的方法
	public void delete(Apply apply) {
		this.getHibernateTemplate().delete(apply);
		
	}
//根据DID查询申请信息的方法
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
