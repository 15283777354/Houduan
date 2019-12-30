package edu.swjtuhc.demo.service;

import java.util.List;

import edu.swjtuhc.demo.model.Fankui;

public interface FankuiService {
	
		public int insertWeixiufankui(Fankui fankui);
		public List<Fankui> getAllFankuis();
}
