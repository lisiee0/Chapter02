package com.javaex.ex07;

public class TV {
	
	// 필드 
	private int channel;
	private int volume;
	private boolean power;
	
	// 생성자
	public TV() {
		
	}
	
	public TV(int channel, int volume, boolean power) {
		this.channel= channel;
		this.volume= volume;
		this.power= power;
	}
	
	// 메소드 g/s
	public int getChannel() {
		return channel;
	}
	
	public int getVolume() {
		return volume;
	}
	// 메소드 

	public void power(boolean on) {
		if(on==true) {
			power= true;
		}
		else if(on==false) {
			power= false;
		}
	}
	public void channel(int channel) {
		if(channel<1||channel>255) {
			System.out.println("1~255 사이의 채널을 입력하세요.");
		}
		else {
			this.channel= channel;
		}
	}
	public void channel(boolean up) {
		if(up==true) {
			if(channel<255&&channel>=1) {
				channel++;
			}
			else {

			}
		}
		else if(up==false) {
			if(channel<=255&&channel>1) {
				channel--;
			}
			else {
				
			}
		}
	}
	
	public void volume(int volume) {
		if(volume>=0&&volume<=100) {
			this.volume= volume;
		}
		else if(volume<0) {
			this.volume= 0;
		}
		else if(volume>100) {
			this.volume= 100;
		}
	}
	public void volume(boolean up) {
		if(up==true) {
			if(volume>=0&&volume<100) {
				volume++;
			}
			else {

			}
		}
		else if(up==false) {
			if(volume<=100&&volume>0) {
				volume--;
			}
			else {
				
			}
		}
	}
	
	public String status() {
		return "TV [channel= " + channel + ", volume= " + volume + ", power= " + power + "]";
	}


}
