package hotel;

public class HotelVO {
	private String rno;
	private String guest_name;
	private String guest_tel;
	private int guest_age;
	private String guest_gen ;
	private String is_empty ;
	private String check_in_time;
	private String check_out_time;
	
	
	
	
	public HotelVO() {}
	
	
	
	
	
	//입실
	
	public HotelVO(String rno, String guest_name, int guest_age, String guest_gen) {
		
		this.rno = rno;
		this.guest_name = guest_name;
		this.guest_age = guest_age;
		this.guest_gen = guest_gen;
	}
	
	public HotelVO(String rno, String guest_name, String guest_tel, int guest_age, String guest_gen, String is_empty,
			String check_in_time, String check_out_time) {
		super();
		this.rno = rno;
		this.guest_name = guest_name;
		this.guest_tel = guest_tel;
		this.guest_age = guest_age;
		this.guest_gen = guest_gen;
		this.is_empty = is_empty;
		this.check_in_time = check_in_time;
		this.check_out_time = check_out_time;
	}







	






	





	public String getRno() {
		return rno;
	}
	public void setRno(String rno) {
		this.rno = rno;
	}
	public String getGuest_name() {
		return guest_name;
	}
	public void setGuest_name(String guest_name) {
		this.guest_name = guest_name;
	}
	public String getGuest_tel() {
		return guest_tel;
	}
	public void setGuest_tel(String guest_tel) {
		this.guest_tel = guest_tel;
	}
	public int getGuest_age() {
		return guest_age;
	}
	public void setGuest_age(int guest_age) {
		this.guest_age = guest_age;
	}
	public String getGuest_gen() {
		return guest_gen;
	}
	public void setGuest_gen(String guest_gen) {
		this.guest_gen = guest_gen;
	}
	public String getIs_empty() {
		return is_empty;
	}
	public void setIs_empty(String is_empty) {
		this.is_empty = is_empty;
	}
	public String getCheck_in_time() {
		return check_in_time;
	}
	public void setCheck_in_time(String check_in_time) {
		this.check_in_time = check_in_time;
	}
	public String getCheck_out_time() {
		return check_out_time;
	}
	public void setCheck_out_time(String check_out_time) {
		this.check_out_time = check_out_time;
	}







	@Override
	public String toString() {
		return "HotelVO [rno=" + rno + ", guest_name=" + guest_name + ", guest_tel=" + guest_tel + ", guest_age="
				+ guest_age + ", guest_gen=" + guest_gen + ", is_empty=" + is_empty + ", check_in_time=" + check_in_time
				+ ", check_out_time=" + check_out_time + "]";
	}
	
	
}
