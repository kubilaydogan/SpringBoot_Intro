package service;

import implementation.Mentor;

// this is the class we use to create mentor's

public class MentorAccount {
    Mentor mentor;

    public MentorAccount(Mentor mentor) {
        this.mentor = mentor;
    }

    public void manageAccount() {
        this.mentor.createAccount();
    }
}
