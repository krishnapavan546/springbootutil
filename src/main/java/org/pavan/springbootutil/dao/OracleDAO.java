package org.pavan.springbootutil.dao;

import java.util.List;

import org.pavan.springbootutil.bean.Finance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OracleDAO {

/*	@Autowired
	DataSource datasource;*/
	
	@Autowired
	FinanceRepository financeRepository;
	
	public boolean insert(Object obj) {
		return false;
	}
	
	public boolean delete(Object obj) {
		return false;
	}

	public boolean update(Object obj, Object updateObject) {
		return false;
	}

	/*public List<Finance> get(Object obj) {
		List<Finance> finances = new ArrayList<>();
		Iterable<Finance> financeIterator=financeRepository.findAll();
		financeIterator.iterator().forEachRemaining((finance)->));
		Iterator<Finance> itemIter=financeIterator.iterator();
		itemIter.
		return finances;
	}*/
	
	public List<Finance> getItems(Object obj) {
		return financeRepository.findByItems(obj.toString());
	}	
	private boolean insertFinanceData(Object obj) {
		if (obj != null && obj.getClass() == Finance.class) {
			return true;
		} else {
			return false;
		}
	}
}
