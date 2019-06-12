package com.darwishashraf.flashchatnewfirebase.persistence;

import android.arch.lifecycle.LiveData;
import android.content.Context;

import com.darwishashraf.flashchatnewfirebase.async.DeleteAsyncTask;
import com.darwishashraf.flashchatnewfirebase.async.InsertAsyncTask;
import com.darwishashraf.flashchatnewfirebase.async.UpdateAsyncTask;
import com.darwishashraf.flashchatnewfirebase.models.Note;

import java.util.List;

public class NoteRepository {

    private NoteDatabase mNoteDatabase;

    public NoteRepository(Context context) {
        mNoteDatabase = NoteDatabase.getInstance(context);
    }

    public void insertNoteTask(Note note){
        new InsertAsyncTask(mNoteDatabase.getNoteDao()).execute(note);
    }

    public void updateNoteTask(Note note){
        new UpdateAsyncTask(mNoteDatabase.getNoteDao()).execute(note);
    }



    public LiveData<List<Note>> retrieveNotesTask() {
        return mNoteDatabase.getNoteDao().getNotes();
    }

    public void deleteNoteTask(Note note){
        new DeleteAsyncTask(mNoteDatabase.getNoteDao()).execute(note);
    }
}
