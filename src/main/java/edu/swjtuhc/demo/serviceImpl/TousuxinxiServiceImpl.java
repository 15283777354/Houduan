package edu.swjtuhc.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.swjtuhc.demo.mapper.TousuxinxiMapper;
import edu.swjtuhc.demo.model.SysUser;
import edu.swjtuhc.demo.model.tousuxinxi;
import edu.swjtuhc.demo.service.TousuxinxiService;

@Service
public class TousuxinxiServiceImpl implements TousuxinxiService{

	@Autowired
	TousuxinxiMapper TousuxinxiMapper;
	@Override
	public List<tousuxinxi> getAllXinxi() {
		// TODO Auto-generated method stub
		return TousuxinxiMapper.selectAllXinxi();
	}
	@Override
	public int Weixiutousu(tousuxinxi tousu) {
		// TODO Auto-generated method stub
		tousuxinxi t0 = TousuxinxiMapper.selectTousuByOrders(tousu.getOrders());
		int i = -1;
		if (t0==null) {
			i=TousuxinxiMapper.inserttousu(tousu);
		}else {
			i = 2;
		}
		return i;
	}
	}


