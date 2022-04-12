package com.discover.student.student.model;

import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class College {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NonNull
    private Integer collegeId;
    @NotNull
    @NotEmpty(message = "College name can't be empty")
    private String collegeName;
    @NotNull
    @NotEmpty(message = "Rating can't be empty")
    @Max(value = 10, message = "Rating cannot be beyond 10")
    @Min(value = 1, message = "Rating can't be under zero")
    private Integer collegeRating;



}
