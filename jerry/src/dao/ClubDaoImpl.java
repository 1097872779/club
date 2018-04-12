package dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import domain.Club;

public class ClubDaoImpl extends HibernateDaoSupport  implements ClubDao {

	@Override
	//根据社团名查询社团成员
	public List<Club> getInfoByClub(String cclub) {
		String hql="select a from Club a where a.cclub=?";
		String shetuan="街舞社";
		List<Club> list=this.getHibernateTemplate().find(hql,shetuan);
		return list.size() == 0 || list == null?null : list;
	}

	@Override
	public List<Club> getInfoByClub1(String cclub) {
		String hql="select a from Club a where a.cclub=?";
		String shetuan="动漫社";
		List<Club> list=this.getHibernateTemplate().find(hql,shetuan);
		return list.size() == 0 || list == null?null : list;
	}

	@Override
	public List<Club> getInfoByClub2(String cclub) {
		String hql="select a from Club a where a.cclub=?";
		String shetuan="计算机协会";
		List<Club> list=this.getHibernateTemplate().find(hql,shetuan);
		return list.size() == 0 || list == null?null : list;
	}

	@Override
	//保存成员信息的方法
	public void save(Club club) {
		this.getHibernateTemplate().save(club);
		
	}

	@Override
	//根据CID查询成员信息的方法
	public Club findByCid(Integer cid) {
		
		return this.getHibernateTemplate().get(Club.class,cid);
	}

	@Override
	public void delete(Club club) {
		this.getHibernateTemplate().delete(club);
		
	}
      
}
