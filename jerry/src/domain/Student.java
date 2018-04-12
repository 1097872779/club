package domain;
/**
 * 学生实体
 * @author Jerry Liang
 *
 */
public class Student {
                         
	                 private  Integer sid;
	                   private   String sname;
	                   private  String sex;
	                   private  String  grade;	                   
	                   private  String  username;
                       private String password;
                       private  	String  sright;
               
                      
                       
                       
				
					public String getSright() {
						return sright;
					}
					public void setSright(String sright) {
						this.sright = sright;
					}
					public Integer getSid() {
						return sid;
					}
					public void setSid(Integer sid) {
						this.sid = sid;
					}
				
					public String getSname() {
						return sname;
					}
					public void setSname(String sname) {
						this.sname = sname;
					}
					public String getSex() {
						return sex;
					}
					public void setSex(String sex) {
						this.sex = sex;
					}
					public String getGrade() {
						return grade;
					}
					public void setGrade(String grade) {
						this.grade = grade;
					}
					public String getUsername() {
						return username;
					}
					public void setUsername(String username) {
						this.username = username;
					}
					public String getPassword() {
						return password;
					}
					public void setPassword(String password) {
						this.password = password;
					}
                       
}
