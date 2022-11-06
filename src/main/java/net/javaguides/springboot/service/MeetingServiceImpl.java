package net.javaguides.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import net.javaguides.springboot.model.Meeting;
import net.javaguides.springboot.repository.MeetingRepository;

public class MeetingServiceImpl implements MeetingService {

	@Autowired
	private MeetingRepository meetingRepository;
	@Override
	public List<Meeting> getAllMeeting() {
		return meetingRepository.findAll();
	}

}
