package service;



import java.util.List;

import dao.InfoDao;
import domain.Info;
import domain.ListBean;



/*
 * 业务层实现类
 */
public class InfoServiceImpl  implements InfoService{

	//注入DAO
	private InfoDao infoDao;
	
	
	public void setInfoDao(InfoDao infoDao) {
		this.infoDao = infoDao;
	}


	@Override
	//保存信息的方法
	public void save(Info info) {
		infoDao.save(info);
		
	}


	@Override
	//根据ID实现部分查询的方法
	public ListBean<Info> getFindAll(String mno) {
		  ListBean<Info> listBean=new ListBean<Info>();
		  List<Info> list =infoDao.getInfoByMno(mno);
		  listBean.setList(list);
		  return listBean;
	}

//根据ID查询
	@Override
	public Info findById(Integer id) {
	          
		return infoDao.findById(id);
	}


	@Override
	public void delete(Info info) {
		
		infoDao.delete(info);
	}


}
