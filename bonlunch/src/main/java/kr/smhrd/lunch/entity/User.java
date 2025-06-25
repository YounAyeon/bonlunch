package kr.smhrd.lunch.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
	
	
	String name;
	int age;
	String gender;

}
