package kr.flab.momukji.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Builder;
import lombok.Getter;

@Entity
@Table
@Getter
@Builder
public class Rider {
    @Id
    @Column(name = "rider_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "is_working", nullable = true)
    private Boolean isWorking;

    @ColumnDefault("false")
    @Column(name = "deleted", nullable = false)
    private Boolean deleted;

    @CreationTimestamp
    @Column(name = "created_timestamp", nullable = false)
    private LocalDateTime createdTimestamp;

    @UpdateTimestamp
    @Column(name = "updated_timestamp", nullable = false)
    private LocalDateTime updatedTimestamp;
}