package com.project.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "course_id")
    private List<Review> reviews;

    @ManyToMany
    @JoinTable(
        name = "course_student",
        joinColumns = @JoinColumn(name = "course_id"),
        inverseJoinColumns = @JoinColumn(name = "student_id")
    )
    private List<Student> students;

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

    public List<Review> getReviews() { return reviews; }

    public void setReviews(List<Review> reviews) { this.reviews = reviews; }

    public void addReview(Review review) {
        if (review==null)
            reviews = new ArrayList<Review>();
        // commented since we need uni directional
//        review.setCourse(this);

        reviews.add(review);
    }

    public void addStudent(Student student) {
        if (students ==null)
            students = new ArrayList<Student>();
        students.add(student);
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id + '\'' +
                ", title='" + title + '\'' +
                ", reviews = { " + Arrays.toString(reviews.toArray())+
                "}\n";
    }
}
