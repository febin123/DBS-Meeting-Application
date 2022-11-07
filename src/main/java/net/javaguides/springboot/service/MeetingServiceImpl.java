package net.javaguides.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.javaguides.springboot.model.Meeting;
import net.javaguides.springboot.repository.MeetingRepository;

@Service
public class MeetingServiceImpl implements MeetingService {

	@Autowired
	private MeetingRepository meetingRepository;
	@Override
	public List<Meeting> getAllMeeting() {
		return meetingRepository.findAll();
	}

}
