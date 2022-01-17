package com.darshan.z;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.MapKeyColumn;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class Zmap {
	    @Autowired
	    Z x;
	    @Id
	    private int y= x.getE_id();
	    
		@ElementCollection
		//@MapKeyColumn(name ="y")
		private Map<Integer, Z> map=new HashMap<>();

		public int getY() {
			return y;
		}

		public void setY(int y) {
			this.y = y;
		}

		public Map<Integer, Z> getMap() {
			return map;
		}

		public void setMap(Map<Integer, Z> map) {
			this.map = map;
		}
		

	}
