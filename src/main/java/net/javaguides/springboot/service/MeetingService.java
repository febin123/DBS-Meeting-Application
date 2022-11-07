package net.javaguides.springboot.service;

import java.util.List;

import net.javaguides.springboot.model.Meeting;

public interface MeetingService {
List<Meeting> getAllMeeting();
  void saveMeeting(Meeting meeting);
}
