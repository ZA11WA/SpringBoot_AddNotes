package pl.pbs.edu.zpo.notatki_lab6;

import java.util.List;

public interface NoteService {
    List<Note> getAllNotes();
    void addNote(Note note);
}


