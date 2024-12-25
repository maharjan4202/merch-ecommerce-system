package cm.ex.merch.entity.user;

import cm.ex.merch.entity.User;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "user_notification")
public class Notification {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id")
    private UUID id;

    @NotBlank(message="please enter notification data")
    @Column(name = "message")
    private String message;

    @Column(name = "datetime")
    private LocalDateTime datetime;

    @JoinColumn(name = "email")
    private boolean email;

    @ManyToOne
    @JoinColumn(name = "moderator_id")
    @NotBlank(message="please enter notification data")
    private User moderator;
}
