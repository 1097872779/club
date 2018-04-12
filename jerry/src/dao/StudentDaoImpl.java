package dao;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import domain.Student;

public class StudentDaoImpl  extends HibernateDaoSupport  implements StudentDao{
               @Override
               /**
                * DAO�и����û����������ѯ�û�������
                */
               public Student findByUsernameAndPassword(Student student){
            	   String hql="from Student where  username=? and password =?";
            	 List<Student> list=  this.getHibernateTemplate().find(hql,student.getUsername(),student.getPassword());
            	   if(list.size()>0){
            		   return list.get(0);
            	   }
            	   
            	   
            	   return null;
               }
               @Override
               //DAO�еı���ѧ����Ϣ�ķ�����
               public void save(Student student){
            	           this.getHibernateTemplate().save(student);
               }
               
               @Override
               /**
                * DAO�и����û�����Ȩ�������ѯ�û�������
                */
               public Student findByUsernameAndSright(Student student){
            	   String hql="from Student where  username=? and sright =?";
            	 List<Student> list=  this.getHibernateTemplate().find(hql,student.getUsername(),student.getPassword());
            	   if(list.size()>0){
            		   return list.get(0);
            	   }
            	   
            	   
            	   return null;
               }
			@Override
			public int findCount() {
			     String hql="select count(*) from Student";
			   List<Long> list = this.getHibernateTemplate().find(hql);
			   if(list.size()>0){
				   return list.get(0).intValue();
			   }
				return 0;
			}
			@Override
			/*
			 * ��ҳ��ѯѧ����Ϣ
			 */
			public List<Student> findByPage(int begin, int pageSize) {
				DetachedCriteria criteria =DetachedCriteria.forClass(Student.class);
				List<Student> list=	this.getHibernateTemplate().findByCriteria(criteria,begin,pageSize);
				return list;
			}
		
			
}
