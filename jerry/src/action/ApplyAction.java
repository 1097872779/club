package action;

import service.ApplyService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import domain.Apply;
import domain.ListBean;

/**
 * 申请信息管理Action类
 * @author Jerry Liang
 *
 */
public class ApplyAction  extends ActionSupport implements ModelDriven<Apply> {
     
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//模型驱动使用的对象：
	private Apply apply= new Apply();
	@Override
	public Apply getModel() {
	
		return apply;
	}
	
	//注入申请信息的Service
     private ApplyService applyService;
	
     
     public void setApplyService(ApplyService applyService) {
		this.applyService = applyService;
	}
	   
     /*
      * 保存申请信息的方法
      */
     
     
     public String save(){
	    	
	     applyService.save(apply);
	       return   "saveOk";
        }
     /*
      * 根据社团名查询申请信息
      */
    public  String  find(){
    	System.out.println("hello"+apply.getAclub());
    	ListBean<Apply> listBean=applyService.findByClub(apply.getAclub());
    	ActionContext.getContext().getValueStack().push(listBean);
    	System.out.println("已执行find");
    	 return "OK";
     }
      /*
       * 根据DID查询并删除申请入社信息的方法
       */
    public String delete(){
    	apply =applyService.findByDid(apply.getDid());
    	applyService.delete(apply);
    	return "deleteOK";
    }
    /*
     * 根据DID查询申请入社的方法
     */
    public String edit(){
    	   Apply existApply=applyService.edit(apply);
    	   ActionContext.getContext().getSession().put("existApply",existApply);
    	   return "editSuccess";
    }
    /*
     * 根据DID查询申请入社的方法
     */
    public String edit1(){
 	   Apply existApply=applyService.edit(apply);
 	   ActionContext.getContext().getSession().put("existApply",existApply);
 	   return "edit1Success";
 }
}
