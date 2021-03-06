package pl.pbs.edu.zpo.notatki_lab6;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NoteRepo extends JpaRepository<Note, Long> {
    List<Note>  findByOrderByTimestampDesc();
}


