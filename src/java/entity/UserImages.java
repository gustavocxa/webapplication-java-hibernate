package entity;
// Generated Aug 18, 2023 1:16:26 AM by Hibernate Tools 4.3.1


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * UserImages generated by hbm2java
 */
@Entity
@Table(name="UserImages"
    ,schema="dbo"
    ,catalog="tests"
)
public class UserImages  implements java.io.Serializable {


     private int id;
     private int userId;
     private int imageTypeId;
     private byte[] imageData;
     private String imagePath;
     private String metadata;
     private boolean active;
     private Date dateCreated;
     private Date dateUpdated;
     private int createdBy;
     private Integer updatedBy;

    public UserImages() {
    }

	
    public UserImages(int id, int userId, int imageTypeId, boolean active, Date dateCreated, int createdBy) {
        this.id = id;
        this.userId = userId;
        this.imageTypeId = imageTypeId;
        this.active = active;
        this.dateCreated = dateCreated;
        this.createdBy = createdBy;
    }
    public UserImages(int id, int userId, int imageTypeId, byte[] imageData, String imagePath, String metadata, boolean active, Date dateCreated, Date dateUpdated, int createdBy, Integer updatedBy) {
       this.id = id;
       this.userId = userId;
       this.imageTypeId = imageTypeId;
       this.imageData = imageData;
       this.imagePath = imagePath;
       this.metadata = metadata;
       this.active = active;
       this.dateCreated = dateCreated;
       this.dateUpdated = dateUpdated;
       this.createdBy = createdBy;
       this.updatedBy = updatedBy;
    }
   
     @Id 

    
    @Column(name="Id", unique=true, nullable=false)
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    
    @Column(name="UserId", nullable=false)
    public int getUserId() {
        return this.userId;
    }
    
    public void setUserId(int userId) {
        this.userId = userId;
    }

    
    @Column(name="ImageTypeId", nullable=false)
    public int getImageTypeId() {
        return this.imageTypeId;
    }
    
    public void setImageTypeId(int imageTypeId) {
        this.imageTypeId = imageTypeId;
    }

    
    @Column(name="ImageData")
    public byte[] getImageData() {
        return this.imageData;
    }
    
    public void setImageData(byte[] imageData) {
        this.imageData = imageData;
    }

    
    @Column(name="ImagePath")
    public String getImagePath() {
        return this.imagePath;
    }
    
    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    
    @Column(name="Metadata")
    public String getMetadata() {
        return this.metadata;
    }
    
    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }

    
    @Column(name="Active", nullable=false)
    public boolean isActive() {
        return this.active;
    }
    
    public void setActive(boolean active) {
        this.active = active;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="DateCreated", nullable=false, length=23)
    public Date getDateCreated() {
        return this.dateCreated;
    }
    
    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="DateUpdated", length=23)
    public Date getDateUpdated() {
        return this.dateUpdated;
    }
    
    public void setDateUpdated(Date dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    
    @Column(name="CreatedBy", nullable=false)
    public int getCreatedBy() {
        return this.createdBy;
    }
    
    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }

    
    @Column(name="UpdatedBy")
    public Integer getUpdatedBy() {
        return this.updatedBy;
    }
    
    public void setUpdatedBy(Integer updatedBy) {
        this.updatedBy = updatedBy;
    }




}


