package com.minatogithuborganization.appengineaug17two.service;

import com.vs.rappit.base.acl.IPerimeterManager;
import com.minatogithuborganization.appengineaug17two.base.service.Aug17twoBaseService;
import com.minatogithuborganization.appengineaug17two.model.Aug17two;
import com.minatogithuborganization.appengineaug17two.service.Aug17twoPerimeterImpl;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;


@Service("Aug17two")
public class Aug17twoService extends Aug17twoBaseService<Aug17two> implements IAug17twoService<Aug17two>{

		@Autowired
		private  Aug17twoPerimeterImpl  aug17twoPerimeterImpl;

		public Aug17twoService(ChangelogService changelogService) {
			super(Aug17two.class);	
			setChangelogService(changelogService); 
		}
	
	
}