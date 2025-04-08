package tech.decola.Feedback_System.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import tech.decola.Feedback_System.models.Feedback;
import tech.decola.Feedback_System.repositories.FeedbackRepository;

import java.util.Optional;

@Service
public class FeedbackService {

    @Autowired
    private FeedbackRepository feedbackRepository;

    public Feedback saveFeedback(Feedback feedback) {
        return feedbackRepository.save(feedback);
    }

    public Page<Feedback> listFeedbacksByCustomer(Long customerId, PageRequest pageRequest) {
        return feedbackRepository.findByCustomerId(customerId, pageRequest);
    }

    public void deleteFeedback(long id) {
        feedbackRepository.deleteById(id);
    }

    public Optional<Feedback> searchFeedbackById(Long id) {
        return feedbackRepository.findById(id);
    }
}
