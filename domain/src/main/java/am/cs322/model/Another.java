package am.cs322.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "\"another\"")
public class Another {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private boolean isCredit;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;


    public Another() {

    }

    public Another(boolean isCredit, User user) {
        this.isCredit = isCredit;
        this.user = user;
    }
}
