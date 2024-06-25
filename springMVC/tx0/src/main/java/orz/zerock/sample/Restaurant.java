package orz.zerock.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;
import lombok.ToString;

@RequiredArgsConstructor
@Component
@ToString
public class Restaurant {
	
	
	private final Chef chef;

}
