package action;

import service.ClubService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import domain.Club;
import domain.ListBean;

public class ClubAction  extends ActionSupport implements ModelDriven<Club> {
   
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
     // 模型驱动使用对象
	  private Club club=new Club();
	  
	@Override
	public Club getModel() {
	
		return club;
	}
    //注入Service
	 private ClubService clubService;

	public void setClubService(ClubService clubService) {
		this.clubService = clubService;
	}
	 
	 /*
	  * 根据社团名查询社团成员
	  */
	public String findAll(){
	    
	   
		ListBean<Club> listBean= clubService.getFindAll(club.getCclub());
		ActionContext.getContext().getValueStack().push(listBean);
		return "OK";
	}
	/*
	 * 
	 */
	public String findAll1(){
	    
		   
		ListBean<Club> listBean= clubService.getFindAll1(club.getCclub());
		ActionContext.getContext().getValueStack().push(listBean);
		return "OK";
	}
	/*
	 * 
	 */
	public String findAll2(){
	    
		   
		ListBean<Club> listBean= clubService.getFindAll2(club.getCclub());
		ActionContext.getContext().getValueStack().push(listBean);
		return "OK";
	}
	/*
	 * 保存社团成员信息
	 */
	public String save(){
		clubService.save(club);
		return "saveMember";
	}
	/*
	 * 跟据CID删除成员信息
	 */
	public String delete(){
		club =clubService.findByCid(club.getCid());
		clubService.delete(club);
		return "deleteOK";
	}
}
