package pl.pbs.edu.zpo.notatki_lab6;


import javax.persistence.*;
import java.time.Clock;
import java.time.LocalDateTime;
@Entity
@Table
public class Note {
    @Id
    @SequenceGenerator(
            name = "note_sequence",
            sequenceName = "note_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "note_sequence"
    )
    private Long id;
    @Column(name = "importance")

    private String importance;
    @Column(name = "text")
    private String text;
    @Column(name = "timestamp")
    private LocalDateTime timestamp = LocalDateTime.now(Clock.systemUTC());


    public Note() {
    }

    public Note(Long id, String importance, String text, LocalDateTime timestamp) {
        this.id = id;
        this.importance = importance;
        this.text = text;
        this.timestamp = timestamp;
    }

    public Note(String importance, String text, LocalDateTime timestamp) {
        this.importance = importance;
        this.text = text;
        this.timestamp = timestamp;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImportance() {
        return importance;
    }

    public void setImportance(String importance) {
        this.importance = importance;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "Note{" +
                "id=" + id +
                ", importance='" + importance + '\'' +
                ", text='" + text + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }
}
