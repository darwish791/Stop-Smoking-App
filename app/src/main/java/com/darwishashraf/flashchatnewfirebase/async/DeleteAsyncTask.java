package com.darwishashraf.flashchatnewfirebase.async;

import android.os.AsyncTask;

import com.darwishashraf.flashchatnewfirebase.models.Note;
import com.darwishashraf.flashchatnewfirebase.persistence.NoteDao;

public class DeleteAsyncTask extends AsyncTask<Note, Void, Void> {

    private NoteDao mNoteDao;

    public DeleteAsyncTask(NoteDao dao) {
        mNoteDao = dao;
    }

    @Override
    protected Void doInBackground(Note... notes) {
        mNoteDao.delete(notes);
        return null;
    }

}