package action;





import service.InfoService;





import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import domain.Info;
import domain.ListBean;



/*
 * ��Ϣ����Action��
 */
public class InfoAction extends ActionSupport implements ModelDriven<Info> {
    
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//ģ������ʹ�õĶ���
	private Info info= new Info();
	@Override
	public Info getModel() {
		
		return info;
	}
   // ע��Service
	private InfoService infoService;
	public void setInfoService(InfoService infoService) {
		this.infoService = infoService;
	}
	/*
	 * ������Ϣ���淽��
	 */
	  public String save(){
		  
		  infoService.save(info);
		  
		  return "sendSuccess";
		  
	  }
	  /*
	   * ������Ϣ���淽��һ
	   */
  public String save1(){
		  
		  infoService.save(info);
		  
		  return "sendOK";
		  
	  }
	  
	  
	 /*
	  * ����ѧ��MNO��ѯ������Ϣ
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
	  * ����IDɾ����Ϣ����
	  */
	  public String delete(){
		    info =infoService.findById(info.getId());
		    infoService.delete(info);
		    return "deleteSuccess";
	  }
	  
}
