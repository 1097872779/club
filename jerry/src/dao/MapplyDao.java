package dao;

import java.util.List;

import domain.Mapply;

public interface MapplyDao {

	void save(Mapply mapply);

	int findCount();

	List<Mapply> findByPage(int begin, int pageSize);

	Mapply findById(Integer mid);

	Mapply findByMid(Mapply mapply);

	void delete(Mapply mapply);

}
