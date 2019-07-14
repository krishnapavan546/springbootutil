package org.pavan.springbootutil.dao;

import java.util.List;

import org.pavan.springbootutil.bean.Finance;
import org.springframework.data.repository.CrudRepository;

public interface FinanceRepository extends CrudRepository<Finance,Integer>
{
	List<Finance> findByItems(String obj);
}
