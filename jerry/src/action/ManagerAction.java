package action;

import service.ManagerService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import domain.Manager;
import domain.PageBean;
/*
 * ��Ź���Ա��Ϣ��Action��
 */
public class ManagerAction extends ActionSupport implements ModelDriven<Manager>{
                   
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//ģ������ʹ�õĶ���
	 private Manager manager=new Manager();

	@Override
	public Manager getModel() {
		
		return manager;
	}
	//ע��Service
	private ManagerService managerService;

	public void setManagerService(ManagerService managerService) {
		this.managerService = managerService;
	}
	
	/*
	 * �������Ա��Ϣ�ķ���
	 */
	public String save(){
		managerService.save1(manager);
		return "saveOK";
	}
	/*
	 * ��Ȩ����Ա����
	 */
	public String save1(){
		managerService.save(manager);
		return "saveSuccess";
	}
	
	   //���յ�ǰҳ��
		 	private Integer  currPage =1 ;
	/*
	 * ��ҳ��ѯ����Ա��Ϣ
	 */
	public String findAll(){
		PageBean<Manager> pageBean=managerService.findByPage(currPage);
		//��pageBean���뵽ֵջ��
		ActionContext.getContext().getValueStack().push(pageBean);
    	return "findAll";
	}
	 /*
     * ����ID��ѯ������Ϣ��ɾ���ķ���
     */
	  public String delete(){
		     manager  =managerService.findById(manager.getMid());
		     managerService.delete(manager);
		     return "deleteSuccess";
	  }
	  /*
	   * ����ѧ�Ų�ѯ��ѧ���Ƿ��ڹ���Ա�б���
	   */
	  public String find(){
		     Manager existManager=managerService.findByMno(manager);
		     if(existManager==null){
		    	 System.out.println("����NO");
		    	 return "buhao";
		     }else{
		    	 ActionContext.getContext().getSession().put("existManager",existManager);
		    	 System.out.println("����YES");
		    	 return "hao";
		     }
	  }
	    
	   /*
	    * ����ѧ�Ų�ѯѧ���Ƿ��ڹ���Ա�б��з���2
	    */
	  public String findinfo(){
		     Manager existManager=managerService.findByMno(manager);
		     if(existManager==null){
		    	 System.out.println("����NO");
		    	 return "buhao";
		     }else{
		    	 ActionContext.getContext().getSession().put("existManager",existManager);
		    	 System.out.println("����YES");
		    	 return "Success";
		     }
	  }
}
