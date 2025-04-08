package tech.decola.Feedback_System.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import tech.decola.Feedback_System.models.Feedback;

public interface FeedbackRepository extends JpaRepository<Feedback, Long> {
    Page<Feedback> findByCustomerId(Long customerId, PageRequest pageRequest);
}
