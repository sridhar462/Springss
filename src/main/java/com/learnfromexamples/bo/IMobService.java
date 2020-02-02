package com.learnfromexamples.bo;

import java.util.List;

import com.learnfromexamples.modal.Mobile;

public interface IMobService {
	
	public List<Mobile> getMobiles();
	public Mobile getMobile(String mobile);
	public String getRate(Mobile mobile);
	public Mobile addMobile(Mobile mobile);
	public Mobile updateMobile(Mobile mobile, String modelNumber);
	public void deleteMobile(String modelNumber);
}
