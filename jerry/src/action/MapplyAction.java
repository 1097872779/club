package action;


import service.MapplyService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import domain.Mapply;
import domain.PageBean;


/*
 * ����Ա����Action��
 */
public class MapplyAction  extends ActionSupport implements ModelDriven<Mapply>{
          
	
	private static final long serialVersionUID = 1L;
	//ģ������ʹ�õĶ���
	  private Mapply mapply= new Mapply();

	  @Override
		public Mapply getModel() {
		
			return mapply;
		}
	//ע��������Ϣ��Service
	     private MapplyService mapplyService;
		
	     
	     public void setMapplyService(MapplyService mapplyService) {
			this.mapplyService = mapplyService;
		}
	   //���յ�ǰҳ��
	 	private Integer  currPage =1 ;
	 	 

	 	public void setCurrPage(Integer currPage) {
	 		this.currPage = currPage;
	 	}
	     /*
	      * ����������Ϣ�ķ���
	      */
	     
	     
	     public String save(){
		    	
		     mapplyService.save(mapply);
		       return   "saveSuccess";
	}
	     
	     
		    /*
		     * ��ҳ��ѯ����������Ϣ�ķ�����
		     */
		    public String findAll(){
		    	
		    PageBean<Mapply> pageBean=	  mapplyService.findByPage(currPage);
		    //��pageBean���뵽ֵջ��
		    ActionContext.getContext().getValueStack().push(pageBean);
		    	return "findAll";
		    }
	    /*
	     * ����ID��ѯ������Ϣ��ɾ���ķ���
	     */
		  public String delete(){
			     mapply  =mapplyService.findById(mapply.getMid());
			     mapplyService.delete(mapply);
			     return "deleteSuccess";
		  }
		  /*
		   * ����ID��ѯ���뷽��
		   */
		public String edit(){
			Mapply existMapply=mapplyService.edit(mapply);
			 ActionContext.getContext().getSession().put("existMapply",existMapply);
			 return "editSuccess";
		}
		  /*
		   * ����ID��ѯ���뷽��
		   */
		public String edit1(){
			Mapply existMapply=mapplyService.edit1(mapply);
			 ActionContext.getContext().getSession().put("existMapply",existMapply);
			 return "edit1Success";
		}
	
		
}
