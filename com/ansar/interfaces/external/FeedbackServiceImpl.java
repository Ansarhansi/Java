package com.ansar.interfaces.external;
import com.ansar.interfaces.internal.FeedbackService;

public class FeedbackServiceImpl implements FeedbackService {
    public void collectFeedback() {
        System.out.println("Feedback collected from user.");
    }
}
