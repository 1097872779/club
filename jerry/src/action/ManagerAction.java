package action;

import service.ManagerService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import domain.Manager;
import domain.PageBean;
/*
 * 存放管理员信息的Action类
 */
public class ManagerAction extends ActionSupport implements ModelDriven<Manager>{
                   
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//模型驱动使用的对象：
	 private Manager manager=new Manager();

	@Override
	public Manager getModel() {
		
		return manager;
	}
	//注入Service
	private ManagerService managerService;

	public void setManagerService(ManagerService managerService) {
		this.managerService = managerService;
	}
	
	/*
	 * 保存管理员信息的方法
	 */
	public String save(){
		managerService.save1(manager);
		return "saveOK";
	}
	/*
	 * 授权管理员方法
	 */
	public String save1(){
		managerService.save(manager);
		return "saveSuccess";
	}
	
	   //接收当前页数
		 	private Integer  currPage =1 ;
	/*
	 * 分页查询管理员信息
	 */
	public String findAll(){
		PageBean<Manager> pageBean=managerService.findByPage(currPage);
		//将pageBean存入到值栈中
		ActionContext.getContext().getValueStack().push(pageBean);
    	return "findAll";
	}
	 /*
     * 根据ID查询申请信息并删除的方法
     */
	  public String delete(){
		     manager  =managerService.findById(manager.getMid());
		     managerService.delete(manager);
		     return "deleteSuccess";
	  }
	  /*
	   * 根据学号查询该学生是否在管理员列表中
	   */
	  public String find(){
		     Manager existManager=managerService.findByMno(manager);
		     if(existManager==null){
		    	 System.out.println("返回NO");
		    	 return "buhao";
		     }else{
		    	 ActionContext.getContext().getSession().put("existManager",existManager);
		    	 System.out.println("返回YES");
		    	 return "hao";
		     }
	  }
	    
	   /*
	    * 根据学号查询学生是否在管理员列表中方法2
	    */
	  public String findinfo(){
		     Manager existManager=managerService.findByMno(manager);
		     if(existManager==null){
		    	 System.out.println("返回NO");
		    	 return "buhao";
		     }else{
		    	 ActionContext.getContext().getSession().put("existManager",existManager);
		    	 System.out.println("返回YES");
		    	 return "Success";
		     }
	  }
}
