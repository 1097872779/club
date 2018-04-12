package action;

import service.ApplyService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import domain.Apply;
import domain.ListBean;

/**
 * ������Ϣ����Action��
 * @author Jerry Liang
 *
 */
public class ApplyAction  extends ActionSupport implements ModelDriven<Apply> {
     
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//ģ������ʹ�õĶ���
	private Apply apply= new Apply();
	@Override
	public Apply getModel() {
	
		return apply;
	}
	
	//ע��������Ϣ��Service
     private ApplyService applyService;
	
     
     public void setApplyService(ApplyService applyService) {
		this.applyService = applyService;
	}
	   
     /*
      * ����������Ϣ�ķ���
      */
     
     
     public String save(){
	    	
	     applyService.save(apply);
	       return   "saveOk";
        }
     /*
      * ������������ѯ������Ϣ
      */
    public  String  find(){
    	System.out.println("hello"+apply.getAclub());
    	ListBean<Apply> listBean=applyService.findByClub(apply.getAclub());
    	ActionContext.getContext().getValueStack().push(listBean);
    	System.out.println("��ִ��find");
    	 return "OK";
     }
      /*
       * ����DID��ѯ��ɾ������������Ϣ�ķ���
       */
    public String delete(){
    	apply =applyService.findByDid(apply.getDid());
    	applyService.delete(apply);
    	return "deleteOK";
    }
    /*
     * ����DID��ѯ��������ķ���
     */
    public String edit(){
    	   Apply existApply=applyService.edit(apply);
    	   ActionContext.getContext().getSession().put("existApply",existApply);
    	   return "editSuccess";
    }
    /*
     * ����DID��ѯ��������ķ���
     */
    public String edit1(){
 	   Apply existApply=applyService.edit(apply);
 	   ActionContext.getContext().getSession().put("existApply",existApply);
 	   return "edit1Success";
 }
}
