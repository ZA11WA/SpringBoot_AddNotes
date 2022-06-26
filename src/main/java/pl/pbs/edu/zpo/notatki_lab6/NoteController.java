package pl.pbs.edu.zpo.notatki_lab6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class NoteController {
    @Autowired
    private NoteService noteService;


    @GetMapping("/showNotes")
    public String showNotes(Model model, Model model2){
        model.addAttribute("listNotes",noteService.getAllNotes());
        Note note = new Note();
        model2.addAttribute("newNote",note);
        return "index";
    }

    @PostMapping("/addNote")
    public String SaveNote(@ModelAttribute("newNote")Note note){
        noteService.addNote(note);
        return "redirect:/showNotes";
    }
}
