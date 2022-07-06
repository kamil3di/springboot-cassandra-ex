package net.techtter.cassandra.springcassandraintegration.model;

import lombok.*;
import org.springframework.data.annotation.QueryAnnotation;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;
import org.springframework.data.cassandra.repository.Query;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;

@Table("Cohort")
//@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Student implements Serializable {

    @PrimaryKey
    private int id;
    @Column("student_info")
    private  Set<Indv_Student> studentDetails;
    @Column("avg_class")
    private int avg_class;
    //@Query("SELECT AVG (student_info.student_grade) FROM Cohort GROUP BY id")
    //private int avgNums;
}
