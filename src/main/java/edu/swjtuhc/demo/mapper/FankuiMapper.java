package edu.swjtuhc.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import edu.swjtuhc.demo.model.Fankui;
import edu.swjtuhc.demo.model.conplaint;

@Mapper
public interface FankuiMapper {
	
	public Fankui selectFankuiByOrders(int orders);
	public List<Fankui> selectAllFankuis();
	public int insertWeixiufankui(Fankui fankui);
}
