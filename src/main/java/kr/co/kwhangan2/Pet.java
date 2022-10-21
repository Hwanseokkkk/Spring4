package kr.co.kwhangan2;

import org.springframework.stereotype.Component; //이제부터 Bean이 관리하겠다.

import lombok.Data; //기본Bean이 있어야하는 메소드들을 얘가 만들어준다(getter, setter 등등)

@Component
@Data
public class Pet {
	
	private String name;
	private int age;
	

}
