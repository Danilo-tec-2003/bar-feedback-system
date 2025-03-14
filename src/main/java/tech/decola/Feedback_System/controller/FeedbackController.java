package tech.decola.Feedback_System.controller;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tech.decola.Feedback_System.models.Feedback;
import tech.decola.Feedback_System.service.FeedbackService;

import java.util.List;

@RestController
@RequestMapping("/feedbacks")
public class FeedbackController {

    @Autowired
    private FeedbackService feedbackService;

    // Cria um feedback
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Feedback> createFeedback(@Valid @RequestBody Feedback feedback) {
        Feedback savedFeedback = feedbackService.saveFeedback(feedback); // Usando o serviço
        return ResponseEntity.status(HttpStatus.CREATED).body(savedFeedback); // Retorna o feedback criado
    }

    // Busca todos os feedbacks
    @GetMapping
    public ResponseEntity<List<Feedback>> getAllFeedbacks() {
        List<Feedback> feedbackList = feedbackService.getAllFeedbacks(); // Método para pegar todos os feedbacks
        if (feedbackList.isEmpty()) {
            return ResponseEntity.noContent().build(); // Retorna 204 se não houver feedbacks
        } else {
            return ResponseEntity.ok(feedbackList); // Retorna a lista de feedbacks com status 200
        }
    }

    // Busca um feedback por ID
    @GetMapping("/{id}")
    public ResponseEntity<Feedback> searchFeedbackById(@PathVariable Long id) {
        return feedbackService.searchFeedbackById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // Deleta um feedback por ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteFeedback(@PathVariable Long id) {
        if (feedbackService.searchFeedbackById(id).isPresent()) {
            feedbackService.deleteFeedback(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
