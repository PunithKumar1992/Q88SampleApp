package com.bsol.q88.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bsol.q88.dao.Q88VslRegDtlDao;
import com.bsol.q88.model.Q88_VslRegDtl;

@Service
public class Q88VslRegDtlServiceImpl implements Q88VslRegDtlService {
	
	@Autowired
	private Q88VslRegDtlDao vslRegDtldao;

	@Override
	public void saveVslRegDtl(Q88_VslRegDtl vslregdtl) {
		vslRegDtldao.save(vslregdtl);

	}

}
