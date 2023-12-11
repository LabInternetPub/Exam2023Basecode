package cat.tecnocampus.notes2324.application.dtos;

import java.util.List;

public record NoteCreate(
        long noteId,
        String title,
        String content,
        List<String> tags) {
}
