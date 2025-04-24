package com.ansar.interfaces.external;

import com.ansar.interfaces.internal.ReviewService;

public class ReviewServiceImpl implements ReviewService {
    public void writeReview() {
        System.out.println("Review written.");
    }
    public void editReview() {
        System.out.println("Review edited.");
    }
    public void deleteReview() {
        System.out.println("Review deleted.");
    }
}
