package domain;
/*
 * 信息发送实体类
 */
public class Info {
                 private Integer id;
	              private String  mno;//接受信息的学号
	              private String info;  //存储的信息
				public Integer getId() {
					return id;
				}
				public void setId(Integer id) {
					this.id = id;
				}
				public String getMno() {
					return mno;
				}
				public void setMno(String mno) {
					this.mno = mno;
				}
				public String getInfo() {
					return info;
				}
				public void setInfo(String info) {
					this.info = info;
				}
				@Override
				public String toString() {
					return "Info [id=" + id + ", mno=" + mno + ", info=" + info
							+ "]";
				}
	              
	              
}
