package service;

import domain.Mapply;
import domain.PageBean;

/*
 * 申请管理员业务层接口
 */
public interface MapplyService {

	void save(Mapply mapply);

	PageBean<Mapply> findByPage(Integer currPage);

	Mapply findById(Integer mid);

	Mapply edit(Mapply mapply);

	Mapply edit1(Mapply mapply);

	void delete(Mapply mapply);

	

}
