package tech.decola.Feedback_System.models;

import com.fasterxml.jackson.annotation.JsonBackReference;  // Importando a anotação
import jakarta.persistence.*;
import lombok.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Max;

@Entity
@Table(name = "feedbacks")
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class Feedback {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "Comentário não pode ser nulo.")
    @Size(min = 5, max = 255, message = "Comentário deve ter entre 5 e 255 caracteres.")
    private String comments;

    @NotNull(message = "Nota não pode ser nula.")
    @Min(value = 0, message = "Nota não pode ser menor que 0.")
    @Max(value = 5, message = "Nota não pode ser maior que 5.")
    private Integer note;

    @ManyToOne  // Um cliente pode ter vários feedbacks
    @JoinColumn(name = "customer_id", nullable = false)
    @JsonBackReference  // Impede a serialização recursiva do feedback em customer
    private Customer customer;
}
