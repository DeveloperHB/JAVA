package orz.zerock.sample;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Component
@ToString
@RequiredArgsConstructor
public class SampleHotel {
	
	@NonNull
	private Chef chef;

		

}
