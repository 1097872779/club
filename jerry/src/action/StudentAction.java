package action;

import service.StudentService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import domain.PageBean;
import domain.Student;

/**
 * 学生的Action类
 * @author Jerry Liang
 *
 */
public class StudentAction  extends ActionSupport  implements  ModelDriven<Student>{
	   
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//模型驱动使用的对象
	 private Student student =new Student();

	@Override
	public Student getModel() {
	
		return student;
	}
	
	//注入业务层类:
	private StudentService  studentService;
	
	
	
	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}

    //接收当前页数
	private Integer  currPage =1 ;
	 

	public void setCurrPage(Integer currPage) {
		this.currPage = currPage;
	}

	/**
	    * 登录执行的方法
	    * @return
	    */
	    public  String login(){
	    	            System.out.println("login执行了...");
	    	            //调用业务层的类:
	    	          Student existStudent =studentService.login(student); 
	    	          if(existStudent == null){
	    	        	  //登录失败
	    	        	     this.addActionError("用户名或密码错误！");
	    	        	     return  INPUT;
	    	          }else{
	    	        	     //登录成功
	    	        	   ActionContext.getContext().getSession().put("existStudent", existStudent);
	    	        	   return SUCCESS;
	    	          }
	    	  
	    }
	    
	    /**
	     * 保存学生注册信息的方法
	     */
	    
	    public String save(){
	    	
	    	     studentService.save(student);
	    	       return   "saveSuccess";
	    }
/**
 * 管理员登录方法
 */
	    public  String cmdlogin(){
            
            //调用业务层的类:
          Student existStudent =studentService.cmdlogin(student); 
          if(existStudent == null){
        	  //登录失败
        	     this.addActionError("用户名或密码错误,或你未拥有管理员权限！");
        	     return  INPUT;
          }else{
        	     //登录成功
        	   ActionContext.getContext().getSession().put("existStudent", existStudent);
        	   return "loginSuccess";
          }
  
       }
	    
	    /*
	     * 分页查询所有学生信息的方法：
	     */
	    public String findAll(){
	    	
	    PageBean<Student> pageBean=	  studentService.findByPage(currPage);
	    //将pageBean存入到值栈中
	    ActionContext.getContext().getValueStack().push(pageBean);
	    	return "findAll";
	    }
	    
}