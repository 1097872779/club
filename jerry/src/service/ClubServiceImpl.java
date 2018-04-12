package service;

import java.util.List;

import dao.ClubDao;
import domain.Club;
import domain.ListBean;

public class ClubServiceImpl  implements ClubService{
	
	//注入DAO
        private ClubDao clubDao;

		public void setClubDao(ClubDao clubDao) {
			this.clubDao = clubDao;
		}

		@Override
		//根据社团名查询社团成员
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
		//保存成员信息的方法
		public void save(Club club) {
			clubDao.save(club);
			
		}

		@Override
		//根据CID查询成员信息的方法
		public Club findByCid(Integer cid) {
			return clubDao.findByCid(cid);
		}

		@Override
		//根据CID删除成员信息的方法
		public void delete(Club club) {
			clubDao.delete(club);
			
		}
        
        
        
}
