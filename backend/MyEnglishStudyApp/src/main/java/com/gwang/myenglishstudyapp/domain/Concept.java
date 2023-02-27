package com.gwang.myenglishstudyapp.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor

public class Concept {

    @Column(name = "concept_id")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String word;
    @OneToMany(mappedBy = "concept", cascade = CascadeType.ALL)
    private List<ConceptExample> examples = new ArrayList<>();

    @OneToMany(mappedBy = "concept", cascade = CascadeType.ALL)
    private List<Meaning> meanings = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private Category category;


}
