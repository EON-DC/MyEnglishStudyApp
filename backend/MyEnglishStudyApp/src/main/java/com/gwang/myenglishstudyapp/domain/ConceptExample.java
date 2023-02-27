package com.gwang.myenglishstudyapp.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class ConceptExample {
    @Column(name = "concept_example_id")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "concept_id", nullable = false)
    private Concept concept;

    @ManyToOne
    @JoinColumn(name = "example_id", nullable = false)
    private Example example;


}
