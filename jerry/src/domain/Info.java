package domain;
/*
 * ��Ϣ����ʵ����
 */
public class Info {
                 private Integer id;
	              private String  mno;//������Ϣ��ѧ��
	              private String info;  //�洢����Ϣ
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
