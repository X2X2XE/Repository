package hotel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class HotelDAO implements DAO{
	private Connection conn;
	private PreparedStatement pst;
	private String query ="";
	
	public HotelDAO() {
		DatabaseConnector dbc = DatabaseConnector.getInstance();
		conn = dbc.getConnection();
	}

	@Override
	public int insert(int floor, int room) {
		int fir = 1;
		int sces_2=100;
		String room_num;
		boolean scess=true;
		query = "insert into room(rno,guest_tel) values(?,'000')";
		for(int j=1; j<=floor; j++) {
			
			for(int i=1;i <=room;i++) {
				if(i<10) {
					room_num = fir + "0" + i;
				} else {
					room_num = Integer.toString(fir) + i;
				}
				try {
					pst=conn.prepareStatement(query);
					pst.setString(1, room_num);
					scess = pst.executeUpdate() > 0? true : false;
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				if(scess == false) {
					sces_2 =-1;
					break;
				}
			}
			fir+=j;
		}
		return sces_2;
	}

	@Override
	public List<HotelVO> select() {
		query = "select * from room";
		List<HotelVO> list = new ArrayList<>();
		try {
			pst = conn.prepareStatement(query);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				list.add(new HotelVO(rs.getString("rno"), rs.getString("guest_name"), rs.getString("guest_tel"), rs.getInt("guest_age"), rs.getString("guest_gen"), rs.getString("is_empty"), rs.getString("check_in_time"), rs.getString("check_out_time")));
			}
			return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int update(HotelVO hvo) {
		query = "update pruduct set is_empty = case is_empty = 0 then guest_name = ?, guest_tel = ?, guest_age = ?, check_in_time = now(), ";
		return 0;
	}
}
