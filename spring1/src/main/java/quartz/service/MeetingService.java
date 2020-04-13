package quartz.service;

import org.springframework.stereotype.Service;

@Service
public class MeetingService {
    public void remindMeeting() {
        System.out.println("会议即将召开");
    }

}
