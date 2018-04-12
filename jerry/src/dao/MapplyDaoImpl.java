package dao;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import domain.Mapply;


/*
 * DAO接口实现
 */
public class MapplyDaoImpl  extends HibernateDaoSupport  implements MapplyDao {

	@Override
	public void save(Mapply mapply) {
		
		this.getHibernateTemplate().save(mapply);
	}

	@Override
	public int findCount() {
		String hql="select count(*) from Mapply";
		   List<Long> list = this.getHibernateTemplate().find(hql);
		   if(list.size()>0){
			   return list.get(0).intValue();
		   }
			return 0;
		
	}

	@Override
	public List<Mapply> findByPage(int begin, int pageSize) {
		DetachedCriteria criteria =DetachedCriteria.forClass(Mapply.class);
		List<Mapply> list=	this.getHibernateTemplate().findByCriteria(criteria,begin,pageSize);
		return list;
		
	}

	@Override
	//DAO中根据id查询申请信息方法
	public Mapply findById(Integer mid) {
		System.out.println("DAO执行了");
		return this.getHibernateTemplate().get(Mapply.class, mid);
	}

	@Override
	public Mapply findByMid(Mapply mapply) {
		String sql="from Mapply where mid=?";
		List<Mapply>  list=this.getHibernateTemplate().find(sql,mapply.getMid());
		if(list.size()>0){
 		   return list.get(0);
 	   }
 	   
 	   
 	   return null;
    
	}

	@Override
	//删除申请信息实现方法
	public void delete(Mapply mapply) {
		this.getHibernateTemplate().delete(mapply);
		
	}
}
