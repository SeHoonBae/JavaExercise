package com.test.example.collection;

public class MyArrayList {

	private String[] list;
	private int index = 0;
	
	public void add(String s) {
		
		if(index == 0)
			list = new String[4];
		
		if(index == list.length) {
			String[] tmp = new String[list.length * 2];
			for(int i = 0; i < list.length; i++) {
				tmp[i] = list[i];
			}
			list = tmp;
		}
		list[index] = s;
			
		index++;
		}
			
		
	
	
	public String get(int index) {
		
		return list[index];
	}
	
	public int size() {
		return index;
	}
	
	public void set(int index, String value) {
		list[index] = value;
	}
	
	public  void remove(int index) {
		for(int i = index; i < size()-1; i++) {
			list[i] = list[i +1];
		}
		this.index--;
	}
	
	public  void add(int index, String value) {
		if(index == list.length) {
			String[] tmp = new String[list.length * 2];
			for(int i = 0; i < list.length; i++) {
				tmp[i] = list[i];
			}
			list = tmp;
		}
		
//		for(int i = size() -1; i >= index; i++) {
//			list[i+1] = list[i];
//		}
		list[index] = value;
		
		this.index++;
		
	}
//	
	public int indexOf(String value) {
		
		for(int i = 0; i < size(); i++) {
			if(list[i].equals(value)) return i;
		}
		return -1;
		
	}
//	
//	public int lastIndexOf(String value) {
//		
//	}
//	
	public void clear() {
		String[] tmp = new String[0];
		list = tmp;
		index = 0;
	}
	
	
}
