package com.thd.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.thd.framework.bean.ResponseBean;
import com.thd.framework.controller.BaseController;
import com.thd.project.entity.Person;
import com.thd.springboottest.customstarter.HelloService;
@Controller
@RequestMapping("/customStarterTest")
public class CustomStarterTestController extends BaseController {
	@Autowired
	private HelloService helloService;
	
	
	/**
	 * 测试自定义starter
	 * @return
	 */
	//新增person
	@RequestMapping(value="/test",method=RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<ResponseBean> testTransaction(){
		this.getLogger().info("----- 测试自定义 starter ------");
		String str = helloService.sayHello();
		ResponseBean rb = new ResponseBean();
		rb.setResult(str);
		return rb.success();
	}
	
}
