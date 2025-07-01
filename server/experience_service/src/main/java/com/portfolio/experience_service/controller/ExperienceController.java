package com.portfolio.experience_service.controller;

import com.portfolio.experience_service.dto.ExperienceDTO;
import com.portfolio.experience_service.service.ExperienceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/experiences")
@CrossOrigin(origins = "*") // puedes limitarlo a tu frontend luego
public class ExperienceController {

    @Autowired
    private ExperienceService experienceService;

    @PostMapping
    public ResponseEntity<ExperienceDTO> createExperience(@RequestBody ExperienceDTO dto) {
        ExperienceDTO created = experienceService.createExperience(dto);
        return ResponseEntity.ok(created);
    }

    @GetMapping
    public ResponseEntity<List<ExperienceDTO>> getAllExperiences() {
        return ResponseEntity.ok(experienceService.getAllExperiences());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ExperienceDTO> getExperienceById(@PathVariable Integer id) {
        ExperienceDTO experience = experienceService.getExperienceById(id);
        if (experience != null) {
            return ResponseEntity.ok(experience);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<ExperienceDTO> updateExperience(@PathVariable Integer id, @RequestBody ExperienceDTO dto) {
        ExperienceDTO updated = experienceService.updateExperience(id, dto);
        if (updated != null) {
            return ResponseEntity.ok(updated);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteExperience(@PathVariable Integer id) {
        experienceService.deleteExperience(id);
        return ResponseEntity.noContent().build();
    }
}
