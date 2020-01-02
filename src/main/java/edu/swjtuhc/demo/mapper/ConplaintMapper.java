package edu.swjtuhc.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import edu.swjtuhc.demo.model.conplaint;

@Mapper
public interface ConplaintMapper {
public conplaint selectConplaintByName(String name);
public int insertConplaint(conplaint conplainter);
public List<conplaint> selectAllConplaints();
public List<conplaint> weixiuzhuangtai();
}