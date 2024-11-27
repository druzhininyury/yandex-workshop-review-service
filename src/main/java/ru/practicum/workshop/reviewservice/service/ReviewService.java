package ru.practicum.workshop.reviewservice.service;

import org.springframework.data.domain.Pageable;
import ru.practicum.workshop.reviewservice.model.Review;

import java.util.List;

public interface ReviewService {
    Review createReview(Review review);

    Review updateReview(Review review);

    Review getReviewById(Long id);

    List<Review> getReviewsByEvent(Long eventId, Pageable pageable);

    Long deleteReview(Long reviewId, Long authorId);

    void addLike(Long reviewId, Long evaluatorId);

    void addDislike(Long reviewId, Long evaluatorId);

    void removeLike(Long reviewId, Long evaluatorId);

    void removeDislike(Long reviewId, Long evaluatorId);
}
