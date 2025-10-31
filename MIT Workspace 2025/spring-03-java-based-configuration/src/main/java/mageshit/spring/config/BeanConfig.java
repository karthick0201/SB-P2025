package mageshit.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import mageshit.spring.beans.BatteryFan;
import mageshit.spring.beans.IFan;
import mageshit.spring.beans.MiTv;
import mageshit.spring.beans.Room;

@Configuration
public class BeanConfig {

	// Using Setter injection
	@Bean
	public IFan iFanBean() {
		BatteryFan fan = new BatteryFan();
		fan.setFanName("BatteryFan");
		fan.setFanState(false);
		
		return fan;
	}
	@Bean
	public Room roomBean() {
		Room room = new Room();
		room.setRoomName("Karthick's Room!!!");
		return room;
	}
	// Inject Using Constructor
	@Bean
	public MiTv miTvBean() {
		MiTv bean = new MiTv("Mi","M2025");
		return bean;
	}
	
}
