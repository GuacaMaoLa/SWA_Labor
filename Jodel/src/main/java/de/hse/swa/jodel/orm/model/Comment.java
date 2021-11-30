/*========================================================================*
 *                                                                        *
 * This software is governed by the GPL version 2.                        *
 *                                                                        *
 * Copyright: Joerg Friedrich, University of Applied Sciences Esslingen   *
 *                                                                        *
 * $Id:$
 *                                                                        *
 *========================================================================*/
package de.hse.swa.jodel.orm.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

//import com.fasterxml.jackson.annotation.JsonIdentityInfo;
//import com.fasterxml.jackson.annotation.JsonIgnore;
//import com.fasterxml.jackson.annotation.ObjectIdGenerators;


/**
 * The persistent class for the `COMMENT` database table.
 * 
 */
@Entity
public class Comment implements Serializable {
	private static final long serialVersionUID = 1L;
	
    @Id
    @SequenceGenerator(name = "commentSeq", sequenceName = "ZSEQ_COMMENT_ID", allocationSize = 1, initialValue = 10)
    @GeneratedValue(generator = "commentSeq")

    @Column(name = "id")
    private Long id;

    @Column(name = "text")
    private String text;

    @Column(name = "longitude")
    private Double longitude;

    @Column(name = "latitude")
    private Double latitude;

    @Column(name = "postedat")
    private Date postedat;

    @Column(name = "authorId")
    public Long authorId;


    @Column(name = "postId")
    public Long postId;

    public Comment() {
    }

    public Comment(String text, double longitude, double latitude, Long userId, Long postId) {
        this.text =text;
        this.longitude = longitude;
        this.latitude = latitude;
        this.authorId = userId;
        this.postId = postId;
        this.postedat = new Date();
    }

    public Comment(String text) {
        this.text = text;
    }

    public Long getId() {
        return id;
    }

    public void setId (Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public Date getPostedat() {
        return postedat;
    }

    public void setPostedat(){
        this.postedat = new Date();
    }

    public Long getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Long authorId) {
        this.authorId = authorId;
    }

    public Long getPostId() {
        return postId;
    }

    public void setPostId(Long postId) {
        this.postId = postId;
    }


}