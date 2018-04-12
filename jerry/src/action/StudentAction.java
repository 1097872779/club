package action;

import service.StudentService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import domain.PageBean;
import domain.Student;

/**
 * ѧ����Action��
 * @author Jerry Liang
 *
 */
public class StudentAction  extends ActionSupport  implements  ModelDriven<Student>{
	   
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//ģ������ʹ�õĶ���
	 private Student student =new Student();

	@Override
	public Student getModel() {
	
		return student;
	}
	
	//ע��ҵ�����:
	private StudentService  studentService;
	
	
	
	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}

    //���յ�ǰҳ��
	private Integer  currPage =1 ;
	 

	public void setCurrPage(Integer currPage) {
		this.currPage = currPage;
	}

	/**
	    * ��¼ִ�еķ���
	    * @return
	    */
	    public  String login(){
	    	            System.out.println("loginִ����...");
	    	            //����ҵ������:
	    	          Student existStudent =studentService.login(student); 
	    	          if(existStudent == null){
	    	        	  //��¼ʧ��
	    	        	     this.addActionError("�û������������");
	    	        	     return  INPUT;
	    	          }else{
	    	        	     //��¼�ɹ�
	    	        	   ActionContext.getContext().getSession().put("existStudent", existStudent);
	    	        	   return SUCCESS;
	    	          }
	    	  
	    }
	    
	    /**
	     * ����ѧ��ע����Ϣ�ķ���
	     */
	    
	    public String save(){
	    	
	    	     studentService.save(student);
	    	       return   "saveSuccess";
	    }
/**
 * ����Ա��¼����
 */
	    public  String cmdlogin(){
            
            //����ҵ������:
          Student existStudent =studentService.cmdlogin(student); 
          if(existStudent == null){
        	  //��¼ʧ��
        	     this.addActionError("�û������������,����δӵ�й���ԱȨ�ޣ�");
        	     return  INPUT;
          }else{
        	     //��¼�ɹ�
        	   ActionContext.getContext().getSession().put("existStudent", existStudent);
        	   return "loginSuccess";
          }
  
       }
	    
	    /*
	     * ��ҳ��ѯ����ѧ����Ϣ�ķ�����
	     */
	    public String findAll(){
	    	
	    PageBean<Student> pageBean=	  studentService.findByPage(currPage);
	    //��pageBean���뵽ֵջ��
	    ActionContext.getContext().getValueStack().push(pageBean);
	    	return "findAll";
	    }
	    
}