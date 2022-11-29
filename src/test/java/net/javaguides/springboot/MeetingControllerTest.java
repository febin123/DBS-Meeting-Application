package com.example.demo.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MeetingControllerTest {

	@Test
	void professor() {
		MeetingController controller=new MeetingController();
		String response=controller.professor("Paul");
		assertEquals("Paul",response);
	}


}
