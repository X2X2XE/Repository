package hotel;

import java.util.List;

public interface Service {

	int creat_room(int floor, int room);

	List<HotelVO> list();

	int in_user(HotelVO hotelVO);

	

}
