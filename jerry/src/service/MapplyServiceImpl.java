package service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import dao.MapplyDao;
import domain.Mapply;
import domain.PageBean;


/*
 * ҵ���ʵ����
 */
@Transactional
public class MapplyServiceImpl  implements MapplyService{
         //ע���������Ա��ϢDAO
	private MapplyDao mapplyDao;

	public void setMapplyDao(MapplyDao mapplyDao) {
		this.mapplyDao = mapplyDao;
	}
	 //ҵ��㱣����Ϣ�ķ���
	@Override
	public void save(Mapply mapply) {
		
		   mapplyDao.save(mapply);
		
	}
	//��ҳ��ѯ����
	@Override
	public PageBean<Mapply> findByPage(Integer currPage) {
		
		PageBean<Mapply> pageBean=new PageBean<Mapply>();
		//��װ��ǰҳ��
		pageBean.setCurrPage(currPage);
		//��װÿҳ��ʾ��¼��
		int pageSize=4;
		pageBean.setPageSize(pageSize);
		//��װ�ܼ�¼��
		int  totalCount=mapplyDao.findCount();
		pageBean.setTotalCount(totalCount);
		//��װ��ҳ��
		double tc =totalCount;
	    Double num=	Math.ceil(tc/pageSize);
	   pageBean.setTotalPage(num.intValue());
	   //��װÿҳ��ʾ������
	   int begin =(currPage-1)*pageSize;
		List<Mapply> list =mapplyDao.findByPage(begin,pageSize);
		pageBean.setList(list);
		
		
		return pageBean;
	}
	@Override
	//����ID��ѯѧ��������Ϣ
	public Mapply findById(Integer mid) {
		
		return mapplyDao.findById(mid);
	}
	//����ID��ѯ��Ϣ
	@Override
	public Mapply edit(Mapply mapply) {
		   Mapply  existMapply= mapplyDao.findByMid(mapply);
		return existMapply;
	}
	@Override
	public Mapply edit1(Mapply mapply) {
		 Mapply  existMapply= mapplyDao.findByMid(mapply);
			return existMapply;
	}
	/*
	 * ɾ��������Ϣ�ķ���
	 */
	@Override
	public void delete(Mapply mapply) {
		
		mapplyDao.delete(mapply);
	}
	  
	  
	
}
