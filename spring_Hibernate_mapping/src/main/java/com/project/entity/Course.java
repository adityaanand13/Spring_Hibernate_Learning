package com.project.entity;

import javax.persistence.*;

@Entity
@Table(name = "course")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;

    @Column
    private String title;

    @ManyToOne(
        cascade ={
            CascadeType.DETACH,
            CascadeType.MERGE,
            CascadeType.PERSIST,
            CascadeType.REFRESH
        }
    )
    @JoinColumn(name = "instructor_id")
    private Instructor instructor;

    public Course() { }

    public Course(String title, Instructor instructor) {
        this.title = title;
        this.instructor = instructor;
    }

    public void setId(int id) { this.id = id; }

    public int getId() { return id; }

    public Course(String title) { this.title = title; }

    public String getTitle() { return title; }

    public void setTitle(String title) { this.title = title; }


    public Instructor getInstructor() { return instructor; }

    public void setInstructor(Instructor instructor) { this.instructor = instructor; }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", title='" + title + '\'' +
                "}\n";
    }
}
