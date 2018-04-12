package service;

import java.util.List;

import dao.ClubDao;
import domain.Club;
import domain.ListBean;

public class ClubServiceImpl  implements ClubService{
	
	//ע��DAO
        private ClubDao clubDao;

		public void setClubDao(ClubDao clubDao) {
			this.clubDao = clubDao;
		}

		@Override
		//������������ѯ���ų�Ա
		public ListBean<Club> getFindAll(String cclub) {
			 ListBean<Club> listBean=new ListBean<Club>();
			 List<Club> list=clubDao.getInfoByClub(cclub);
			 listBean.setList(list);
			return listBean;
		}

		@Override
		public ListBean<Club> getFindAll1(String cclub) {
			ListBean<Club> listBean=new ListBean<Club>();
			 List<Club> list=clubDao.getInfoByClub1(cclub);
			 listBean.setList(list);
			return listBean;
		}

		@Override
		public ListBean<Club> getFindAll2(String cclub) {
			ListBean<Club> listBean=new ListBean<Club>();
			 List<Club> list=clubDao.getInfoByClub2(cclub);
			 listBean.setList(list);
			return listBean;
		}

		@Override
		//�����Ա��Ϣ�ķ���
		public void save(Club club) {
			clubDao.save(club);
			
		}

		@Override
		//����CID��ѯ��Ա��Ϣ�ķ���
		public Club findByCid(Integer cid) {
			return clubDao.findByCid(cid);
		}

		@Override
		//����CIDɾ����Ա��Ϣ�ķ���
		public void delete(Club club) {
			clubDao.delete(club);
			
		}
        
        
        
}
