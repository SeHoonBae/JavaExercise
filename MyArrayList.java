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
	
	public String get(int index) throws Exception  {
		if(index > -1 && index < size())
			return list[index];
		else throw new Exception();
		
	}
	
	public int size() {
		return index;
	}
	
	public void set(int index, String value)throws Exception  {
		if(index > -1 && index < size())
			list[index] = value;
		else throw new Exception();
	}
	
	public  void remove(int index)throws Exception {
		if(index > -1 && index < size()) {
			for(int i = index; i < size()-1; i++) {
				list[i] = list[i +1];
			}
		this.index--;
		}else throw new Exception();
	}
	
	public  void add(int index, String value)throws Exception {
		if(index > -1 && index < size()) {
			if(size() == list.length) {
				String[] tmp = new String[list.length * 2];
				for(int i = 0; i < list.length; i++) {
					tmp[i] = list[i];
				}
				list = tmp;
			}
			
			for(int i = size() -1; i >= index; i--) {
				list[i+1] = list[i];
			}
			list[index] = value;
			
			this.index++;
		}else throw new Exception();
		
	}
//	
	public int indexOf(String value) {
		
		for(int i = 0; i < size(); i++) {
			if(list[i].equals(value)) return i;
		}
		return -1;
		
	}
//	
	public int lastIndexOf(String value) {
		for(int i = size()-1; i > 0; i--) {
			if(list[i].equals(value)) return size()-1-i;
		}
		return -1;
	}
//	
	public void clear() {
		String[] tmp = new String[0];
		list = tmp;
		index = 0;
	}
	
	
}
