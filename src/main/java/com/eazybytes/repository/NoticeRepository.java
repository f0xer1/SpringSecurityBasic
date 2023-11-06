package com.eazybytes.repository;

import java.util.List;

import com.eazybytes.model.Notice;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface NoticeRepository extends CrudRepository<Notice, Long> {
	
	@Query(value = "FROM Notice n WHERE current_date BETWEEN n.noticBegDt AND n.noticEndDt")
	List<Notice> findAllActiveNotices();

}
