package com.darwishashraf.flashchatnewfirebase.async;

import android.os.AsyncTask;

import com.darwishashraf.flashchatnewfirebase.models.Note;
import com.darwishashraf.flashchatnewfirebase.persistence.NoteDao;

public class UpdateAsyncTask extends AsyncTask<Note, Void, Void> {

    private NoteDao mNoteDao;

    public UpdateAsyncTask(NoteDao dao) {
        mNoteDao = dao;
    }

    @Override
    protected Void doInBackground(Note... notes) {
        mNoteDao.updateNotes(notes);
        return null;
    }

}