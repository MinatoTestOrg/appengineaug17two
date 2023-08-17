package com.minatogithuborganization.appengineaug17two.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.slf4j.ext.XLogger;
import org.slf4j.ext.XLoggerFactory;
import org.springframework.http.ResponseEntity;
import com.vs.rappit.base.factory.InstanceFactory;
import com.minatogithuborganization.appengineaug17two.base.controller.Aug17twoBaseController;
import com.minatogithuborganization.appengineaug17two.service.IAug17twoService;
import com.minatogithuborganization.appengineaug17two.service.Aug17twoService;
import com.minatogithuborganization.appengineaug17two.model.Aug17two;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "rest/aug17twos/", produces = "application/json")
public class Aug17twoController extends Aug17twoBaseController<IAug17twoService<Aug17two>, Aug17two> {
	private static XLogger LOGGER = XLoggerFactory.getXLogger(Aug17twoController.class);
	public Aug17twoController(Aug17twoService aug17twoService) {
		super(aug17twoService);
	}
}
