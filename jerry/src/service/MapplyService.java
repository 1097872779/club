package service;

import domain.Mapply;
import domain.PageBean;

/*
 * �������Աҵ���ӿ�
 */
public interface MapplyService {

	void save(Mapply mapply);

	PageBean<Mapply> findByPage(Integer currPage);

	Mapply findById(Integer mid);

	Mapply edit(Mapply mapply);

	Mapply edit1(Mapply mapply);

	void delete(Mapply mapply);

	

}
