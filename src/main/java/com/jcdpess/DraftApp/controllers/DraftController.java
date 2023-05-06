package com.jcdpess.DraftApp.controllers;

import com.jcdpess.DraftApp.entities.Draft;
import com.jcdpess.DraftApp.services.DraftService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/drafts")
@AllArgsConstructor
public class DraftController {

    private final DraftService draftService;

    @GetMapping
    public List<Draft> getAllDrafts(){
        return draftService.getAllDrafts();
    }

    @PostMapping
    public void createDraft(@RequestParam Draft draft){
        draftService.createDraft(draft);
    }
}
