package top.zhonglinhao.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import top.zhonglinhao.entity.Admin;
import top.zhonglinhao.mapper.AdminMapper;
import top.zhonglinhao.service.IAdminService;

@Service
public class AdminService implements IAdminService {

	@Autowired
	private AdminMapper adminMapper;
	
	@Override
	public Admin findAll() {
		return adminMapper.findAll();
	}
}
