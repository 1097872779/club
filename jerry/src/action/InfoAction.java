package action;





import service.InfoService;





import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import domain.Info;
import domain.ListBean;



/*
 * 消息发送Action类
 */
public class InfoAction extends ActionSupport implements ModelDriven<Info> {
    
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//模型驱动使用的对象
	private Info info= new Info();
	@Override
	public Info getModel() {
		
		return info;
	}
   // 注入Service
	private InfoService infoService;
	public void setInfoService(InfoService infoService) {
		this.infoService = infoService;
	}
	/*
	 * 发送信息保存方法
	 */
	  public String save(){
		  
		  infoService.save(info);
		  
		  return "sendSuccess";
		  
	  }
	  /*
	   * 发送信息保存方法一
	   */
  public String save1(){
		  
		  infoService.save(info);
		  
		  return "sendOK";
		  
	  }
	  
	  
	 /*
	  * 根据学号MNO查询部分信息
	  */
	  public String findAll(){
		  System.out.println("hello"+info.getMno());
		//  List<Info> list = infoService.getFindAll(info.getMno());
		  //for(Info info : list){
			//  System.out.println(info.toString());
		//  }
		  ListBean<Info> listBean=  infoService.getFindAll(info.getMno());
		 // ActionContext.getContext().getSession().put("infolist", infoList);
		  ActionContext.getContext().getValueStack().push(listBean);
		  System.out.println("hello222222222222222"+info.getMno());
		  return "OK";
	  }
	 /*
	  * 根据ID删除信息方法
	  */
	  public String delete(){
		    info =infoService.findById(info.getId());
		    infoService.delete(info);
		    return "deleteSuccess";
	  }
	  
}
