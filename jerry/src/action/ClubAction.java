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
     // ģ������ʹ�ö���
	  private Club club=new Club();
	  
	@Override
	public Club getModel() {
	
		return club;
	}
    //ע��Service
	 private ClubService clubService;

	public void setClubService(ClubService clubService) {
		this.clubService = clubService;
	}
	 
	 /*
	  * ������������ѯ���ų�Ա
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
	 * �������ų�Ա��Ϣ
	 */
	public String save(){
		clubService.save(club);
		return "saveMember";
	}
	/*
	 * ����CIDɾ����Ա��Ϣ
	 */
	public String delete(){
		club =clubService.findByCid(club.getCid());
		clubService.delete(club);
		return "deleteOK";
	}
}
