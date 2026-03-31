package day09;

public class ClassEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TV tv = new TV();
		tv.power();
		tv.setCh(7);
		tv.addMark();
		tv.chUp();
		tv.chUp();
		tv.addMark();
		tv.showMarkList();
	}

}

class TV{
	// 멤버변수 : brand, power, ch, vol
	private String brand;
	private boolean power;
	private int ch;
	private int vol;
	private int[] markch = new int[5];
	private int markCount = 0;
	// 생성자
	// 기본생성자
	public TV() {
		ch = 1;
	}

	// 매개변수 생성자 brand만 받기
	public TV(String brand) {
		this();
		this.brand = brand;
	}

	// 메서드
	// power on / off
	public void power() {
		this.power = !(this.power);
		System.out.println((this.power ? "ON" : "OFF"));
	}

	// 출력함수
	public void print() {
		System.out.println("채널 :" + this.ch + "번");
		System.out.println("볼륨 :" + this.vol);
		System.out.println("----");

	}

	// chUp(1~10까지 순환구조)
	public void chUp() {
		if (!this.power) {
			System.out.println("전원을 켜주세요");
		} else {
			if (this.ch == 10) {
				this.ch = 1;
			} else {
				this.ch++;
			}
			print();
		}
	}

	// chDown(1~10까지 순환구조)
	public void chDown() {
		if (!this.power) {
			System.out.println("전원을 켜주세요");
		} else {
			if (this.ch == 1) {
				this.ch = 10;
			} else {
				this.ch--;
			}
			print();
		}
	}

	// volUp(0~20까지)
	public void volUp() {
		if (!this.power) {
			System.out.println("전원을 켜주세요");
		} else {
			if (this.vol == 20) {
				System.out.println("최대볼륨입니다.");
			} else {
				this.vol++;
			}
			print();
		}
	}

	// volDown(0~20까지)
	public void volDown() {
		if (!this.power) {
			System.out.println("전원을 켜주세요");
		} else {
			if (this.vol == 0) {
				System.out.println("최저볼륨입니다.");
			} else {
				this.vol--;
			}
			print();
		}
	}
	/* 선호채널 등록
	 * 5개까지 등록가능
	 * 1.선호채널 등록 메서드
	 * - 현재 채널을 선호채널 배열에 넣기
	 */
	 public void addMark() {
        if (!this.power) {
            System.out.println("전원을 켜주세요.");
            return;
        }

        if (markCount < markch.length) {
            markch[markCount] = this.ch; 	// 현재 채널을 배열에 저장
            System.out.println(this.ch + "번 채널이 선호채널에 등록되었습니다. (" + (markCount + 1) + "/5)");
            markCount++;
        } else {
            System.out.println("선호채널이 꽉 찼습니다. (최대 5개)");
        }
    }
	 /* 2.선호채널 리스트 보기
	 * - 등록된 선호채널을 리스트로 출력
	 * */
	 public void showMarkList() {
	        if (markCount == 0) {
	            System.out.println("등록된 선호채널이 없습니다.");
	            return;
	        }
	        
	        System.out.print("선호채널 리스트: ");
	        for (int i = 0; i < markCount; i++) {
	            System.out.print(markch[i] + "번 ");
	        }
	        System.out.println("\n-----------------");
	    }
	
			
	
	// getter / setter
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public boolean isPower() {
		return power;
	}

	public int getCh() {
		return ch;
	}

	public void setCh(int ch) {
		this.ch = ch;
	}

	public int getVol() {
		return vol;
	}

	public void setVol(int vol) {
		this.vol = vol;
		
	}

	public int[] getMarkch() {
		return markch;
	}

	public void setMarkch(int[] markch) {
		this.markch = markch;
	}

}