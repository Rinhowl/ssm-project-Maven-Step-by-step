package top.zhonglinhao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import top.zhonglinhao.entity.Admin;
import top.zhonglinhao.service.IAdminService;

@Controller
public class TestController {
	
	@Autowired
	private IAdminService adminService;
	
	@RequestMapping("/hello")
	public String hello() {
		System.out.println("请求到达Controller！");
		Admin admin = adminService.findAll();
		System.out.println(admin.getName() + ":" + admin.getAge());
		return "hello";
	}
}
