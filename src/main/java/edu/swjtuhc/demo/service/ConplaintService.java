package edu.swjtuhc.demo.service;

import java.util.List;

import edu.swjtuhc.demo.model.conplaint;

public interface ConplaintService {
	
public int conplaint(conplaint conplainter);
public List<edu.swjtuhc.demo.model.conplaint> getAllConplaints();
}
