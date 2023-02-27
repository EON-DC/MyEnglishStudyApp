package com.gwang.myenglishstudyapp.domain;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Meaning {

    @Column(name = "meaning_id")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String meaning;

    @ManyToOne
    @JoinColumn(name = "concept_id", nullable = false)
    private Concept concept;
}
