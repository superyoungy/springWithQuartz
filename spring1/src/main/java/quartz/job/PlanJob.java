package quartz.job;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import quartz.service.MeetingService;

public class PlanJob implements Job {
    private MeetingService meetingService=new MeetingService();
    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        meetingService.remindMeeting();
    }
}
