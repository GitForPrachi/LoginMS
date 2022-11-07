// package com.capgemini.lms;
// import static org.assertj.core.api.Assertions.assertThat;
// import org.junit.jupiter.api.Test;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.test.context.SpringBootTest;
// import org.springframework.web.client.RestTemplate;

// import com.capgemini.lms.dto.Login;
// import com.capgemini.lms.service.LoginService;





// @SpringBootTest
// class LoginServiceApplicationTests {
// 	RestTemplate template;
// 	@Autowired
// 	LoginService loginService;
// 	/*

// 	@Test
// 	void testAddLoginDetails() {
// 		Login login = new Login("R10003","Vinniii","Retailer");
// 		assertThat(loginService.addLoginDetails("R10003","Vinniii","Retailer").getUserId().equals("R10003"));	
// 		loginService.addLoginDetails(login.getUserId(),login.getPassword(),login.getRole());
// 	} 
// 	/*
// 	@Test
// 	void testDeleteLoginDetails() {
// 		Login login = new Login("R10003","Vinniii","Retailer");
// 		loginService.addLoginDetails("R10003","Vamsi","Retailer");
// 		assertThat(loginService.deleteLoginDetails(login.getUserId()).equals(""));
// 	}
// 	 */
// 	@Test
// 	void testUpdateLoginDetails() {
// 		Login login = new Login("F10001","vinnii","Farmer");
// 		assertThat(loginService.updateLoginDetails(login).getUserId().equals("F10001"));
// 	}

// 	@Test
// 	void testCheckLoginDetails() {
// 		assertThat(loginService.checkLoginDetails("F10001").get().getUserId().equals("F10001"));
// 	}

// 	@Test
// 	void testgetUserIdbyRole() {
// 		assertThat(loginService.getUserIdbyRole("Farmer").equals("\"F10005\""));
// 	}

// 	@Test
// 	public void testgetUserId(){
// 		Login crop = new Login();
// 		crop.setUserId("C1023");
// 		assertThat(crop.getUserId() == "C1023");
// 	}

// 	@Test
// 	public void testsetUserId(){
// 		Login crop = new Login();
// 		crop.setUserId("C1023");
// 		assertThat(crop.getUserId() == "C1023");
// 	}

// 	@Test
// 	public void testgetPassword(){
// 		Login crop = new Login();
// 		crop.setPassword("C1023");
// 		assertThat(crop.getPassword() == "C1023");
// 	}

// 	@Test
// 	public void testsetPassword(){
// 		Login crop = new Login();
// 		crop.setPassword("C1023");
// 		assertThat(crop.getPassword() == "C1023");
// 	}

// 	@Test
// 	public void testgetRole(){
// 		Login crop = new Login();
// 		crop.setRole("C1023");
// 		assertThat(crop.getRole() == "C1023");
// 	}

// 	@Test
// 	public void testsetRole(){
// 		Login crop = new Login();
// 		crop.setRole("C1023");
// 		assertThat(crop.getRole() == "C1023");
// 	}
// }

