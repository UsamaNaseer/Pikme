package com.asadbaig.android.pikme;

import java.util.ArrayList;
import java.util.List;

public class GetRidesResponseModel{
	private HistoryItem[] current ;
	private HistoryItem[] History;


	public void setHistory(HistoryItem[] history){
		this.History = history;
	}

	public HistoryItem[] getHistory(){
		return History;
	}

	public void setCurrent(HistoryItem[] current){
		this.current = current;
	}

	public HistoryItem[] getCurrent(){
		return current;
	}

	@Override
 	public String toString(){
		return 
			"GetRidesResponseModel{" + 
			"current = '" + current + '\'' +
			",history = '" + History + '\'' +
			"}";
		}
}