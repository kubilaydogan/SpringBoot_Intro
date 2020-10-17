import service.FullTimeMentor;
import service.MentorAccount;

public class CybertekApp {
    public static void main(String[] args) {

        FullTimeMentor fulltime = new FullTimeMentor();

        MentorAccount mentor = new MentorAccount(fulltime);
        mentor.manageAccount();

    }
}
