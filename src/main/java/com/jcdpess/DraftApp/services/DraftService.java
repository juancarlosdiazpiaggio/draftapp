package com.jcdpess.DraftApp.services;

import com.jcdpess.DraftApp.entities.Draft;
import com.jcdpess.DraftApp.repositories.DraftRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class DraftService {
    private final DraftRepository draftRepository;
    public List<Draft> getAllDrafts(){
        return draftRepository.findAll();
    }

    public void createDraft(Draft draft){
        draftRepository.insert(draft);
    }
}
