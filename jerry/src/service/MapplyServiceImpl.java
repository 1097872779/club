package service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import dao.MapplyDao;
import domain.Mapply;
import domain.PageBean;


/*
 * 业务层实现类
 */
@Transactional
public class MapplyServiceImpl  implements MapplyService{
         //注入申请管理员信息DAO
	private MapplyDao mapplyDao;

	public void setMapplyDao(MapplyDao mapplyDao) {
		this.mapplyDao = mapplyDao;
	}
	 //业务层保存信息的方法
	@Override
	public void save(Mapply mapply) {
		
		   mapplyDao.save(mapply);
		
	}
	//分页查询方法
	@Override
	public PageBean<Mapply> findByPage(Integer currPage) {
		
		PageBean<Mapply> pageBean=new PageBean<Mapply>();
		//封装当前页数
		pageBean.setCurrPage(currPage);
		//封装每页显示记录数
		int pageSize=4;
		pageBean.setPageSize(pageSize);
		//封装总记录数
		int  totalCount=mapplyDao.findCount();
		pageBean.setTotalCount(totalCount);
		//封装总页数
		double tc =totalCount;
	    Double num=	Math.ceil(tc/pageSize);
	   pageBean.setTotalPage(num.intValue());
	   //封装每页显示的数据
	   int begin =(currPage-1)*pageSize;
		List<Mapply> list =mapplyDao.findByPage(begin,pageSize);
		pageBean.setList(list);
		
		
		return pageBean;
	}
	@Override
	//根据ID查询学生申请信息
	public Mapply findById(Integer mid) {
		
		return mapplyDao.findById(mid);
	}
	//根据ID查询信息
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
	 * 删除申请信息的方法
	 */
	@Override
	public void delete(Mapply mapply) {
		
		mapplyDao.delete(mapply);
	}
	  
	  
	
}
