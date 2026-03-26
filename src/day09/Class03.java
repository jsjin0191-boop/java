package day09;

public class Class03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car c = new Car();	// 기본생성자로 생성
		c.setName("아우디");
		c.setYear(2026);
		
		c.speedUp();
		c.power();
		c.print();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.power();
		c.print();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.print();
		System.out.println("-------------------");
		Car c2 = new Car("벤츠", 2025); 
		c2.power();
		c2.print();
		c2.speedUp();
		c2.speedUp();
		c2.speedUp();
		c2.speedUp();
		c2.speedUp();
		c2.speedUp();
		c2.speedUp();
		c2.speedUp();
		c2.speedUp();
		c2.speedUp();
		c2.speedUp();
		c2.speedUp();
		c2.speedUp();
		c2.speedUp();
		c2.speedUp();
		c2.speedUp();
		c2.speedUp();
		c2.speedUp();
		c2.speedUp();
		c2.speedUp();
		c2.speedUp();
		c2.speedUp();
		c2.speedUp();
		c2.speedUp();
		c2.speedUp();
		c2.speedUp();
		c2.print();

	}

}

class Car{
	// 속도, 시동, 이름, 연식
	
	//멤버변수
	private String name;	
	private int year;	// String으로 해도 상관없음.
	private int speed;	// 속도
	private boolean power;	// 시동
	
	//생성자 - 멤버변수 아래
	/* 객체를 생성할 떄 (new) 초기값을 지정해주는 역활
	 * 기본생성자 : 컴파일러가 컴파일시 자동으로 제공
	 * - object = null / 숫자 = 0 / boolean = false
	 * - 다른 생성자가 존재하면 자동으로 주지 않음.
	 * - 기본생성자를 직접 만들수도 있음.
	 * - 생성자는 여러개 생성 가능(생성자 오버로딩)
	 * - 생성자 오버로딩 조건 : 매개변수의 개수가 다르거나, 타입이 달라야 가능.
	 * - 생성자를 만들 때 꼭 기본생성자와 같이 생성함.
	 * public 클래스명(매개변수){
	 * 멤버변수 값을 설정
	 * }
	 * - 생성자는 리턴타입이 없는 메서드와 같은형태
	 * - 이름은 반드시 클래스명을 따른다.
	 * */
	
	// 기본 생성자
	public Car() { }
	
	// 매개변수가 있는 생성자

	public Car(String name, int year) {
		this.name = name;
		this.year = year;
	}

	// 메서드
	// 1. 시동을 켜고 끄는 메서드
	// 꺼짐 => 켜짐 / 켜짐 => 꺼짐
	public void power() {
//		if(this.power == false) {
//			this.power = !(this.power);
//		}else {						// this.power == true
//			this.power = !(this.power);
//		}
		if(this.speed == 0) {
			this.power = !(this.power);
		}else {
			System.out.println("ERROR");
		}
	}
			

	// 2. 출력 메서드
	// 시동이 켜져있는가? (켜져 있으면 ON, 꺼져있으면 OFF)
	// 속도도 함께 출력
	public void print() {
//		if(this.power == false) {
//			System.out.println("OFF");
//		}else {
//			System.out.println("ON");
//		}
//		if(this.power) {		// this.power == true
//			System.out.println("ON");
//		}else {
//			System.out.println("OFF");
//		}
		System.out.println((this.power ? "ON" : "OFF") + " / " + this.speed);

	}

	// 3. speedUp (+20) - 엑셀밟기
	public void speedUp() {
//		if (this.speed == 200) {
//			System.out.println("제한속도에 도달했습니다.");
//		} else {
//			if (this.power) {
//				this.speed = this.speed + 20; // this.speed += 20
//				print();
//			} else {
//				System.out.println("시동을 켜주세요");
//			}
//
//		}
//
		if (!this.power) {
			System.out.println("시동을 켜주세요");
		} else {
			if (this.speed == 200) {
				System.out.println("제한속도에 도달했습니다.");
			} else {
				this.speed = this.speed + 20;
				print();
			}

		}
	}

	// 4. speedDown (-20) - 브레이크밟기
	public void speedDown() {
		if (!this.power) {
			System.out.println("시동을 켜주세요");
		} else {
			if (this.speed == 0) {
				System.out.println("차량이 정지했습니다");
			} else {
				this.speed = this.speed - 20;
				print();

			}
		}
	}

	// getter/setter
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return this.year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getSpeed() {
		return this.speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public boolean isPower() {
		return this.power;
	}

}