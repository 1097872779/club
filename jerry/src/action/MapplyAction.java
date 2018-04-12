package action;


import service.MapplyService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import domain.Mapply;
import domain.PageBean;


/*
 * 管理员申请Action类
 */
public class MapplyAction  extends ActionSupport implements ModelDriven<Mapply>{
          
	
	private static final long serialVersionUID = 1L;
	//模型驱动使用的对象
	  private Mapply mapply= new Mapply();

	  @Override
		public Mapply getModel() {
		
			return mapply;
		}
	//注入申请信息的Service
	     private MapplyService mapplyService;
		
	     
	     public void setMapplyService(MapplyService mapplyService) {
			this.mapplyService = mapplyService;
		}
	   //接收当前页数
	 	private Integer  currPage =1 ;
	 	 

	 	public void setCurrPage(Integer currPage) {
	 		this.currPage = currPage;
	 	}
	     /*
	      * 保存申请信息的方法
	      */
	     
	     
	     public String save(){
		    	
		     mapplyService.save(mapply);
		       return   "saveSuccess";
	}
	     
	     
		    /*
		     * 分页查询所有申请信息的方法：
		     */
		    public String findAll(){
		    	
		    PageBean<Mapply> pageBean=	  mapplyService.findByPage(currPage);
		    //将pageBean存入到值栈中
		    ActionContext.getContext().getValueStack().push(pageBean);
		    	return "findAll";
		    }
	    /*
	     * 根据ID查询申请信息并删除的方法
	     */
		  public String delete(){
			     mapply  =mapplyService.findById(mapply.getMid());
			     mapplyService.delete(mapply);
			     return "deleteSuccess";
		  }
		  /*
		   * 根据ID查询申请方法
		   */
		public String edit(){
			Mapply existMapply=mapplyService.edit(mapply);
			 ActionContext.getContext().getSession().put("existMapply",existMapply);
			 return "editSuccess";
		}
		  /*
		   * 根据ID查询申请方法
		   */
		public String edit1(){
			Mapply existMapply=mapplyService.edit1(mapply);
			 ActionContext.getContext().getSession().put("existMapply",existMapply);
			 return "edit1Success";
		}
	
		
}
