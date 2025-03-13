package tech.decola.Feedback_System.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "feedbacks")
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class Feedback {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String comments;
    private Integer note; //nota min = 0, nota max = 5

    @ManyToMany
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;
}
