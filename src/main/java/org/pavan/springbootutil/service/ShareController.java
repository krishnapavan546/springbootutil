package org.pavan.springbootutil.service;

import java.util.List;

import org.pavan.springbootutil.bean.Share;
import org.pavan.springbootutil.utiltutorials.ShareRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShareController {

	@Autowired
	private ShareRepository repository;
	/**
	 * @param share
	 * @return
	 * 
	 * Add Service in between otherwise side effects would happen.
	 * 
	 */
	@PostMapping(path="/shares",consumes="application/json")
	public Share addShare(@RequestBody Share share)
	{
		repository.save(share);
		return share;
		
	}
	
	@GetMapping("/shares")
	public List<Share> getShares()
	{
		List<Share> shares=(List<Share>) repository.findAll();
		return shares;
		
	}
	
	@PatchMapping("/shares")
	public List<Share> updateShares(List<Share> shares)
	{
		shares=repository.save(shares);
		return shares;
	}

}
