package dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import domain.Club;

public class ClubDaoImpl extends HibernateDaoSupport  implements ClubDao {

	@Override
	//������������ѯ���ų�Ա
	public List<Club> getInfoByClub(String cclub) {
		String hql="select a from Club a where a.cclub=?";
		String shetuan="������";
		List<Club> list=this.getHibernateTemplate().find(hql,shetuan);
		return list.size() == 0 || list == null?null : list;
	}

	@Override
	public List<Club> getInfoByClub1(String cclub) {
		String hql="select a from Club a where a.cclub=?";
		String shetuan="������";
		List<Club> list=this.getHibernateTemplate().find(hql,shetuan);
		return list.size() == 0 || list == null?null : list;
	}

	@Override
	public List<Club> getInfoByClub2(String cclub) {
		String hql="select a from Club a where a.cclub=?";
		String shetuan="�����Э��";
		List<Club> list=this.getHibernateTemplate().find(hql,shetuan);
		return list.size() == 0 || list == null?null : list;
	}

	@Override
	//�����Ա��Ϣ�ķ���
	public void save(Club club) {
		this.getHibernateTemplate().save(club);
		
	}

	@Override
	//����CID��ѯ��Ա��Ϣ�ķ���
	public Club findByCid(Integer cid) {
		
		return this.getHibernateTemplate().get(Club.class,cid);
	}

	@Override
	public void delete(Club club) {
		this.getHibernateTemplate().delete(club);
		
	}
      
}
