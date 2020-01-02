package edu.swjtuhc.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.swjtuhc.demo.model.conplaint;
import edu.swjtuhc.demo.mapper.ConplaintMapper;
import edu.swjtuhc.demo.service.ConplaintService;
@Service
public class ConplaintServiceImpl implements ConplaintService{

@Autowired
	ConplaintMapper ConplaintMapper;
	@Override
	public int conplaint(conplaint conplainter) {
		// TODO Auto-generated method stub
		conplaint conplainter2 = ConplaintMapper.selectConplaintByName(conplainter.getName());
		int i = -1;
		if (conplainter2==null) {
			i = ConplaintMapper.insertConplaint(conplainter);
		}else {
			i=2;
		}
		return i;
	}
	@Override
	public List<edu.swjtuhc.demo.model.conplaint> getAllConplaints() {
		// TODO Auto-generated method stub
		return ConplaintMapper.selectAllConplaints();
	}
	@Override
	public List<edu.swjtuhc.demo.model.conplaint> weixiuzhuangtai() {
		// TODO Auto-generated method stub
		return ConplaintMapper.weixiuzhuangtai();
	}

}