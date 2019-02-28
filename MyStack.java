package com.test.example.collection;

public class MyStack {

	private String[] list;
	private int index = 0;
	
	//값을 순차적으로 추가, value : 추가할 요소의 값
		public void push(String value) {
			if(this.index == 0 )
				list = new String[4];
			
			if(this.index == list.length) {
				String[] tmp = new String[list.length * 2];
				for(int i =0; i < list.length; i++)
					tmp[i] = list[i];
				list = tmp;
			}
			
			list[this.index] = value;
			this.index++;
			
		}
		
		// 값을 순차적으로 가져온다. return : 가져올 요소의 값
		public String pop() {
			
			String s = "";
			
			
			if(this.index != 0) {
				s = list[this.index-1];
				
				this.index--;
				
				return s;
			}
			
			return s;
			
		}
		
		//요소의 개수를 반환한다, return : 요소 개수
		public int size() {
			return this.index;
		}
		
		// 이번에 가져올 값을 확인한다. value : 값 반환
		public String peek() {
			if(this.index != 0) {
				return list[index-1];
			}
			return "";
		}
		
		// 배열의 모든 요소를 삭제한다
		public void clear() {
			this.index = 0;
		}
	
		// 배열안의 요소의 개수만큼 배열의 길이를 줄인다
		public void trimToSize() {
			String[] tmp = new String[this.index];
			for(int i = 0; i < this.index; i++) {
				tmp[i] = list[i];
			}
			list = tmp;
		}
	
}
