package com.example.project.view;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped

public class HomePage {
	private String pageID;
	
	public String gotoTugas() {
		if (pageID==null) {
		return "home";
		}
		if (pageID.equals("1")) {
			return "hello";
		}
		else if (pageID.equals("2")) {
			return "hello";
		}
		else if(pageID.equals("3")) {
			return "hello";
		}
		else {
			return "home";
		}
	}
}
