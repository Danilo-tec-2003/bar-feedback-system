package tech.decola.Feedback_System.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;  // Importando a anotação
import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@Entity
@Table(name = "customers")
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference  // Gerencia a serialização dos feedbacks do cliente
    private List<Feedback> feedbacks;
}
