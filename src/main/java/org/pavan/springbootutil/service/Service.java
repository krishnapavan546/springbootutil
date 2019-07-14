package org.pavan.springbootutil.service;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
public interface Service {
	
	void add();
	Object get(Object obj);
	Object update();
	

}
