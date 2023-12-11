package cat.tecnocampus.notes2324.api;

import cat.tecnocampus.notes2324.application.NotesService;
import cat.tecnocampus.notes2324.application.PermissionService;
import cat.tecnocampus.notes2324.application.dtos.*;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class NotesController {

    private final NotesService notesService;
    private final PermissionService permissionService;


    public NotesController(NotesService notesService, PermissionService permissionService) {
        this.notesService = notesService;
        this.permissionService = permissionService;
    }

    @GetMapping("/users/{userId}/notes/canView")
    public List<NoteDTO> getNotesUserCanView(@PathVariable long userId) {
        return permissionService.getNotesUserCanView(userId);
    }

    @GetMapping("/users/{id}/permissions")
    public List<PermissionDTO> getUserPermissions(@PathVariable long id) {
        return permissionService.getUserPermissions(id);
    }

    @PostMapping("/users/{ownerId}/permissions")
    @ResponseStatus(HttpStatus.CREATED)
    public void newPermission(@PathVariable long ownerId, @RequestBody PermissionCreation permissionCreation) {
        permissionService.createNotePermissions(ownerId, permissionCreation);
    }

    @GetMapping("/users/{userId}/notes")
    public List<NoteDTO> getUserNotes(@PathVariable long userId) {
        return notesService.getUserNotes(userId);
    }

    @GetMapping("/notes/{noteId}/users/canView")
    public List<UserDTO> getUsersCanViewNote(@PathVariable long noteId) {
        return permissionService.getUsersCanViewNote(noteId);
    }

    @GetMapping("/notes/{noteId}/users/canEdit")
    public List<UserDTO> getUsersWithPermissionCanEdit(@PathVariable long noteId) {
        return permissionService.getUsersWithPermissionCanEdit(noteId);
    }

    @PostMapping("/users/{ownerId}/notes")
    @ResponseStatus(HttpStatus.CREATED)
    public void newUserNote(@PathVariable long ownerId, @RequestBody NoteCreate noteCreate) {
        notesService.createUserNote(ownerId, noteCreate);
    }

    @PutMapping("/users/{ownerId}/notes")
    public void updateUserNote(@PathVariable long ownerId, @RequestBody NoteCreate noteUpdate) {
        notesService.updateUserNote(ownerId, noteUpdate);
    }
}
