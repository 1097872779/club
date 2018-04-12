package service;



import java.util.List;

import dao.InfoDao;
import domain.Info;
import domain.ListBean;



/*
 * ҵ���ʵ����
 */
public class InfoServiceImpl  implements InfoService{

	//ע��DAO
	private InfoDao infoDao;
	
	
	public void setInfoDao(InfoDao infoDao) {
		this.infoDao = infoDao;
	}


	@Override
	//������Ϣ�ķ���
	public void save(Info info) {
		infoDao.save(info);
		
	}


	@Override
	//����IDʵ�ֲ��ֲ�ѯ�ķ���
	public ListBean<Info> getFindAll(String mno) {
		  ListBean<Info> listBean=new ListBean<Info>();
		  List<Info> list =infoDao.getInfoByMno(mno);
		  listBean.setList(list);
		  return listBean;
	}

//����ID��ѯ
	@Override
	public Info findById(Integer id) {
	          
		return infoDao.findById(id);
	}


	@Override
	public void delete(Info info) {
		
		infoDao.delete(info);
	}


}
