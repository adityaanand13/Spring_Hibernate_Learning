package com.project.entity;

import javax.persistence.*;

@Entity
@Table(name = "instructor_detail")
public class InstructorDetail {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "youtube_channel")
    private String youtubeChannel;

    @Column
    private String hobby;

    // for bi-directional mapping
    //hibernate will look into the instructor class and find the data using the provided field in that class
    @OneToOne(
        mappedBy = "instructorDetail",
        // when instructor detail is deleted, the instructor should not get effected
        cascade = {
            CascadeType.DETACH,
            CascadeType.MERGE,
            CascadeType.PERSIST,
            CascadeType.REFRESH
        }
    )
    public Instructor instructor;

    public InstructorDetail() { }

    public InstructorDetail(String youtubeChannel, String hobby) {
        this.youtubeChannel = youtubeChannel;
        this.hobby = hobby;
    }

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public String getYoutubeChannel() { return youtubeChannel; }

    public void setYoutubeChannel(String youtubeChannel) { this.youtubeChannel = youtubeChannel; }

    public String getHobby() { return hobby; }

    public void setHobby(String hobby) { this.hobby = hobby; }

    public Instructor getInstructor() { return instructor; }

    public void setInstructor(Instructor instructor) { this.instructor = instructor; }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", youtubeChannel='" + youtubeChannel + '\'' +
                ", hobby='" + hobby + '\'' +
                "}";
    }
}
