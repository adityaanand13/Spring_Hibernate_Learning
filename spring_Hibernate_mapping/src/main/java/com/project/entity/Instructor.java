package com.project.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Entity
@Table(name = "instructor")
public class Instructor {

    //cascading all = persist+remove+refresh+merge+detach
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "instructor_detail_id")//for foreign key
    private InstructorDetail instructorDetail;


    // refers to instructor property in the course class @ JoinColumn
    // to help find the associated courses for the instructor
    // the delete cascade is not defined because
    // when we want to delete the course we dont want to delete the instructor and vice versa
    @OneToMany(
//        fetch = FetchType.EAGER,
        mappedBy = "instructor",
        cascade = {
            CascadeType.DETACH,
            CascadeType.MERGE,
            CascadeType.PERSIST,
            CascadeType.REFRESH
        }
    )
    private List<Course> courses;

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column
    private String email;

    public Instructor() { }

    public Instructor(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public String getFirstName() { return firstName; }

    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }

    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public InstructorDetail getInstructorDetail() { return instructorDetail; }

    public void setInstructorDetail(InstructorDetail instructorDetail) { this.instructorDetail = instructorDetail; }

    public List<Course> getCourses() { return courses; }

    public void setCourses(List<Course> courses) { this.courses = courses; }

    public void addCourse(Course course) {
        if (courses==null)
            courses = new ArrayList<Course>();
        //bi directional mapping
        course.setInstructor(this);

        courses.add(course);
    }

    @Override
    public String toString() {
        return "Instructor{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", \ninstructorDetail={ " + instructorDetail + " }"+ '\'' +
                ", \ncourses={ " + Arrays.toString(courses.toArray()) + " }"+'\'' +
                '}';
    }
}
