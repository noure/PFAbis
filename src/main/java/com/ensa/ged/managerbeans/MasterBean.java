package com.ensa.ged.managerbeans;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MasterBean {

	
	
	public List<Object> SetToList(Set<Object> mySet) {

		List<Object> retour = new ArrayList<Object>();
		for (Object ob : mySet) {

			retour.add(ob);
		}

		return retour;

	}

	public Set<Object> ListToSet(List<Object> myList) {

		Set<Object> retour = new HashSet<>();
		for (Object ob : myList) {

			retour.add(ob);

		}
		return retour;

	}
}
