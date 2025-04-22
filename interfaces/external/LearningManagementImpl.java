package com.ansar.interfaces.external;

import com.ansar.interfaces.internal.LearningManagement;

public class LearningManagementImpl implements LearningManagement {
    @Override
    public void enrollCourse() {
        System.out.println("Enrolling in course...");
    }

    @Override
    public void startCourse() {
        System.out.println("Starting the course...");
    }

    @Override
    public void completeCourse() {
        System.out.println("Completing the course...");
    }

    @Override
    public void giveQuiz() {
        System.out.println("Giving quiz...");
    }

    @Override
    public void viewProgress() {
        System.out.println("Viewing course progress...");
    }

    @Override
    public void getCertificate() {
        System.out.println("Getting course certificate...");
    }

    @Override
    public void provideFeedback() {
        System.out.println("Providing course feedback...");
    }
}