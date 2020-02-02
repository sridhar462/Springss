package com.learnfromexamples.bo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.learnfromexamples.modal.Mobile;

@Service
public class MobServiceImpl implements IMobService {

	List<Mobile> mobiles = new ArrayList<Mobile>(Arrays.asList(new Mobile[] { new Mobile("Nokia", "1100", "1500"),
			new Mobile("Xiomi", "A20", "1500"), new Mobile("IPhone", "X", "150000") }));

	@Override
	public List<Mobile> getMobiles() {
		return mobiles;
	}

	@Override
	public Mobile getMobile(String mobile) {
		return mobiles.stream().filter(mob -> mob.getModelNumber().equals(mobile)).findAny().orElse(null);
	}

	@Override
	public String getRate(Mobile mobile) {
		return null;
	}

	@Override
	public Mobile addMobile(Mobile mobile) {
		mobiles.add(mobile);
		return mobile;
	}

	@Override
	public Mobile updateMobile(Mobile mobile, String modelNumber) {
		for (int i = 0; i < mobiles.size(); i++) {
			Mobile mob = mobiles.get(i);
			if (mob.getModelNumber().equals(modelNumber)) {
				mobiles.set(i, mobile);
				return mobile;
			}
		}
		return null;
	}

	@Override
	public void deleteMobile(String modelNumber) {
		mobiles.removeIf(mobile ->mobile.getModelNumber().equalsIgnoreCase(modelNumber));
	}

}
