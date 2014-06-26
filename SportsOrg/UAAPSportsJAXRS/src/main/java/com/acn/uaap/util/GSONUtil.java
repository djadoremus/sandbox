package com.acn.uaap.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GSONUtil {

	private static GSONUtil instance;
	
	private Gson gson;
	
	private GSONUtil(){
		gson = new GsonBuilder().create();
	}
	
	public static GSONUtil getInstance(){
		if (instance == null){
			instance = new GSONUtil();
		}
		return instance;
	}
	
	public Gson getGson(){
		return gson;
	}
}
