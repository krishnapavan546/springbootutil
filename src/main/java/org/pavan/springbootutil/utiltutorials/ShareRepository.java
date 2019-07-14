package org.pavan.springbootutil.utiltutorials;

import org.pavan.springbootutil.bean.Share;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShareRepository extends JpaRepository<Share, Long>  
{

	
}
