package pl.pbs.edu.zpo.notatki_lab6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class NoteServiceImpl implements NoteService{
    private final NoteRepo noteRepo;

    public NoteServiceImpl(NoteRepo noteRepo) {
        this.noteRepo = noteRepo;
    }

    @Override
    public List<Note> getAllNotes() {
        return noteRepo.findByOrderByTimestampDesc();
    }

    @Override
    public void addNote(Note note) {
        this.noteRepo.save(note);
    }
}
