/*
 * This file is generated by jOOQ.
 */
package database.generated.tables.pojos;


import javax.annotation.processing.Generated;
import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.13.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Courses implements Serializable {

    private static final long serialVersionUID = 120061412;

    private final Integer id;
    private final Integer epoch;
    private final String  name;
    private final String  school;
    private final String  subject;
    private final String  deptCourseId;
    private final Integer termId;

    public Courses(Courses value) {
        this.id = value.id;
        this.epoch = value.epoch;
        this.name = value.name;
        this.school = value.school;
        this.subject = value.subject;
        this.deptCourseId = value.deptCourseId;
        this.termId = value.termId;
    }

    public Courses(
        Integer id,
        Integer epoch,
        String  name,
        String  school,
        String  subject,
        String  deptCourseId,
        Integer termId
    ) {
        this.id = id;
        this.epoch = epoch;
        this.name = name;
        this.school = school;
        this.subject = subject;
        this.deptCourseId = deptCourseId;
        this.termId = termId;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getEpoch() {
        return this.epoch;
    }

    public String getName() {
        return this.name;
    }

    public String getSchool() {
        return this.school;
    }

    public String getSubject() {
        return this.subject;
    }

    public String getDeptCourseId() {
        return this.deptCourseId;
    }

    public Integer getTermId() {
        return this.termId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Courses (");

        sb.append(id);
        sb.append(", ").append(epoch);
        sb.append(", ").append(name);
        sb.append(", ").append(school);
        sb.append(", ").append(subject);
        sb.append(", ").append(deptCourseId);
        sb.append(", ").append(termId);

        sb.append(")");
        return sb.toString();
    }
}
