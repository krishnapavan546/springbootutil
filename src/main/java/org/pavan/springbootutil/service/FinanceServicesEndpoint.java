package org.pavan.springbootutil.service;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.websocket.server.PathParam;

import org.pavan.springbootutil.bean.Finance;
import org.pavan.springbootutil.dao.OracleDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class FinanceServicesEndpoint implements Service {

	@Autowired
	OracleDAO oracleDAO;

	private void service(String method) throws Exception {

	}

	/*
	 * public void insertMonthlyExpenses(Sheet sheet2, String string) { try {
	 * StringBuffer wordBuffer=new StringBuffer(string.toLowerCase());
	 * wordBuffer.equalsIgnoreCase(wordBuffer.reverse());
	 * 
	 * } catch (Exception e) { e.printStackTrace(); }
	 * 
	 * }
	 */

	public void addFinance(Iterator<Map<String, String>> iterator) {

	}

	
	@RequestMapping(value="/finances/items/expectedamount/{itemname}", method = RequestMethod.GET, produces = "application/json")
	public String getItemExpectedAmount(@PathVariable(value = "itemname") String itemName) {
		System.out.println("Path param is "+itemName);
		String value = null;
		List<Finance> finacneObj = oracleDAO.getItems(itemName);
		if (!finacneObj.isEmpty()) {
			value = String.valueOf(finacneObj.get(0).getExpectedAmount());
			System.out.println("Expected Amount for Item " + itemName + " is " + value);
		} else {
		}

		return value;
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub

	}

	
	@Override
	@RequestMapping(value="/finance", method = RequestMethod.GET, produces = "application/json")
	public Object get(Object itemName) {

		String value = null;
		List<Finance> finacneObj = oracleDAO.getItems(itemName);
		if (!finacneObj.isEmpty()) {
			value = String.valueOf(finacneObj.get(0).getExpectedAmount());
			System.out.println("Expected Amount for Item " + itemName + " is " + value);
		} else {
		}

		return value;
	}

	@Override
	public Object update() {
		return null;
	}

}
