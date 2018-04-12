package service;

import java.util.List;

import dao.ManagerDao;
import domain.Manager;
import domain.PageBean;

public class ManagerServiceImpl  implements ManagerService{
            //注入DAO
	  private ManagerDao managerDao;

	public void setManagerDao(ManagerDao managerDao) {
		this.managerDao = managerDao;
	}
//保存管理员信息方法
	@Override
	public void save(Manager manager) {
		
		 managerDao.save(manager);
		
	}
// 分页查询管理员信息方法
	@Override
	public PageBean<Manager> findByPage(Integer currPage) {
	         PageBean<Manager> pageBean=new  PageBean<Manager>();
	       //封装当前页数
	 		pageBean.setCurrPage(currPage);
	 		//封装每页显示记录数
	 		int pageSize=4;
	 		pageBean.setPageSize(pageSize);
	 		//封装总记录数
	 		int  totalCount=managerDao.findCount();
	 		pageBean.setTotalCount(totalCount);
			//封装总页数
			double tc =totalCount;
		    Double num=	Math.ceil(tc/pageSize);
		   pageBean.setTotalPage(num.intValue());
		   //封装每页显示的数据
		   int begin =(currPage-1)*pageSize;
		   List<Manager> list= managerDao.findByPage(begin,pageSize);
		   pageBean.setList(list);
	 		
		return pageBean;
	}
	//删除管理员信息
	@Override
	public void delete(Manager manager) {
	 
		 managerDao.delete(manager);
	}
	//根据ID查询管理员
	@Override
	public Manager findById(Integer mid) {
	            
		return managerDao.findById(mid);
	}
	
	@Override
	//查询学生是否是管理员方法
	public Manager findByMno(Manager manager) {
	   return managerDao.findByMno(manager);
	
	}
	@Override
	//授权管理员保存方法
	public void save1(Manager manager) {
		managerDao.save1(manager);
		
	}
	  
}
