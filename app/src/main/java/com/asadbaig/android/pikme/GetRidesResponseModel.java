package com.asadbaig.android.pikme;

import java.util.List;

public class GetRidesResponseModel{
	private List<Object> history;
	private List<Object> current;

	public void setHistory(List<Object> history){
		this.history = history;
	}

	public List<Object> getHistory(){
		return history;
	}

	public void setCurrent(List<Object> current){
		this.current = current;
	}

	public List<Object> getCurrent(){
		return current;
	}

	@Override
 	public String toString(){
		return 
			"GetRidesResponseModel{" + 
			"history = '" + history + '\'' + 
			",current = '" + current + '\'' + 
			"}";
		}
}