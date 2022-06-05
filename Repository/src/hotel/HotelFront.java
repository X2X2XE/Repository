package hotel;

import java.util.List;
import java.util.Scanner;

public class HotelFront {
	private Scanner sc;
	private boolean flag;
	private Service svc;
	
	public HotelFront() {
		sc = new Scanner(System.in);
		svc = new HotelService();
		flag = true;
		printMenu();
	}

	private void printMenu() {
		System.out.println("------호텔 관리 시스템-------");
		System.out.println("1:방생성 2:호텔현항 3:호텔입실 4:호텔퇴실 5:고객조회 Etc:종료");
		int menu = sc.nextInt();
		switch (menu) {
		case 1:
			create_room();
			break;
		case 2:
			show_room();
			break;
		case 3:
			insert_user();
			break;
		case 4:
			
			break;
		case 5:
			
			break;

		default:
			break;
		}
	}

	private void insert_user() {
		System.out.println("방번호 입력 >>");
		String rno = sc.next();
		System.out.println("이름 입력 >>");
		String guest_name = sc.next();
		System.out.println("나이 입력 >>");
		int guest_age = sc.nextInt();
		System.out.println("1:남자 2:여자");
		String guest_gen = sc.next();
		int isOk = svc.in_user(new HotelVO(rno, guest_name, guest_age, guest_gen));
		
		
	}

	private void show_room() {
		List<HotelVO> list = svc.list();
		for (HotelVO hvo : list) {
			System.out.println(hvo);
		}
		
	}

	private void create_room() {
		System.out.println("층수 입력 >>");
		int floor = sc.nextInt();
		System.out.println("한층에 있는 방수 입력");
		int room = sc.nextInt();
		int create = svc.creat_room(floor,room);
		if(create >0) {
			System.out.println("생성완료");
		}
		
	}
}
