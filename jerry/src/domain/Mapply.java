package domain;
/*
 * 管理员申请实体类
 */
public class Mapply {
	 private  Integer mid;
     private String mno; //管理员学号
     private String mname;//管理员姓名
     private String msex;   //         性别
     private String mclub;   //申请管理的社团（每人只能管理一个社团）
	 private String reason;//申请理由
     
     

	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public Integer getMid() {
		return mid;
	}
	public void setMid(Integer mid) {
		this.mid = mid;
	}
	public String getMno() {
		return mno;
	}
	public void setMno(String mno) {
		this.mno = mno;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getMsex() {
		return msex;
	}
	public void setMsex(String msex) {
		this.msex = msex;
	}
	public String getMclub() {
		return mclub;
	}
	public void setMclub(String mclub) {
		this.mclub = mclub;
	}
     
     
     
     
     
}
