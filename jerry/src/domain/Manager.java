package domain;
/**
 * 社团管理员实体类
 * @author Jerry Liang
 *
 */
public class Manager {
                private  Integer mid;
                private String mno; //管理员学号
                private String mname;//管理员姓名
                private String msex;   //         性别
                private String mclub;   //管理的社团（每人只能管理一个社团）
                private String mpassword;//管理员密码
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
				public String getMpassword() {
					return mpassword;
				}
				public void setMpassword(String mpassword) {
					this.mpassword = mpassword;
				}
                
                
                
}
