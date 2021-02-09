package P2021_02_09;

class MyDate06 {
	private int year; // 필드, 멤버변수
	private int month;	// 초기값은 0
	private int day;

//  public MyDate06(){//default 생성자
//  } 

	public MyDate06(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

	public int getYear() {
		return year;
	}

	public int getMonth() {
		return month;
	}

	public int getDay() {
		return day;
	}

	public void setYear(int year) {		// setter method
		this.year = year;	//2018
	}

	public void setMonth(int month) {
		this.month = month;	// 8
	}

	public void setDay(int day) {
		this.day = day;
	}

	public void print() {
		System.out.println(year + "/" + month + "/" + day);
	}
}

public class ConstructorTest06 {
	public static void main(String[] args) {
		MyDate06 d = new MyDate06(2017, 7, 19); // 생성자 호출
		d.print();

		d.setYear(2018); // 변경되지 않음
		d.print();

		d.setMonth(8); // 변경됨
		d.print();

		System.out.println(d.getYear());
		System.out.println(d.getMonth());
		System.out.println(d.getDay());

	}
}
