package net.javaguides.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import net.javaguides.springboot.model.Meeting;
import net.javaguides.springboot.service.MeetingService;

//creating method handler for index.html to display a list of meetings
@Controller
public class MeetingController {

	@Autowired
	private MeetingService meetingService;
	//display list of meetings
	@GetMapping("/")
	public String viewHomePage(Model model) {	
		model.addAttribute("listMeetings",meetingService.getAllMeeting());
		return "index";
	}
		@GetMapping("/showNewMeetingForm")
	public String showNewMeetingForm(Model model) {
		//create model attribute to bind form data
		Meeting meeting=new Meeting();
		model.addAttribute("meeting",meeting);
		return "new_meeting";
	}
}
