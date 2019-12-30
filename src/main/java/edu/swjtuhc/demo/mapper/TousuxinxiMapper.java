package edu.swjtuhc.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import edu.swjtuhc.demo.model.Fankui;
import edu.swjtuhc.demo.model.tousuxinxi;

@Mapper
public interface TousuxinxiMapper {
public List<tousuxinxi> selectAllXinxi();
public tousuxinxi selectTousuByOrders(int orders);
public int inserttousu(tousuxinxi tousu);
}