package edu.swjtuhc.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.swjtuhc.demo.mapper.FankuiMapper;
import edu.swjtuhc.demo.model.Fankui;
import edu.swjtuhc.demo.service.FankuiService;

@Service
public class FankuiServiceImpl implements FankuiService {

	@Autowired
	FankuiMapper fankuiMapper;
	
	@Override
	public int insertWeixiufankui(Fankui fankui) {
		// TODO Auto-generated method stub
		Fankui f0=fankuiMapper.selectFankuiByOrders(fankui.getOrders());
		int i=-1;
		if(f0==null) {
			i=fankuiMapper.insertWeixiufankui(fankui);
		}else {
			i=2;
		}
		return i;
	}

	@Override
	public List<Fankui> getAllFankuis() {
		// TODO Auto-generated method stub
		return fankuiMapper.selectAllFankuis();
	}

	
}