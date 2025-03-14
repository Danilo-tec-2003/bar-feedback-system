package tech.decola.Feedback_System.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.decola.Feedback_System.models.Feedback;
import tech.decola.Feedback_System.repositories.FeedbackRepository;

import java.util.List;
import java.util.Optional;

@Service
public class FeedbackService {

    @Autowired
    private FeedbackRepository feedbackRepository;

    public Feedback saveFeedback(Feedback feedback) {
        return feedbackRepository.save(feedback);
    }

    public Optional<Feedback> searchFeedbackById(Long id) {
        return feedbackRepository.findById(id);
    }

    public List<Feedback> getAllFeedbacks() {
        return feedbackRepository.findAll(); // Retorna todos os feedbacks
    }

    public void deleteFeedback(Long id) {
        feedbackRepository.deleteById(id);
    }
}
