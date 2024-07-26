package in.co.greenwave.materialTypeMaster.entity;

import java.sql.Date;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Material_Master")
/*
 * @NoArgsConstructor
 * 
 * @AllArgsConstructor
 */
public class MaterialMaster {
	
	
	   @Id
	   @GeneratedValue(strategy = GenerationType.IDENTITY)
	   private Long id;
	   
	    //s@GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "EntryTime")
	    private String entryTime;

	    @Column(name = "UserId", nullable = false)
	    private String userId;

	    @Column(name = "MaterialName", nullable = false, length = 255)
	    private String materialName;

	    @Column(name = "InternalMaterialCode", nullable = false, length = 255)
	    private String internalMaterialCode;

	    @Column(name = "SAPCode", nullable = false, length = 255)
	    private String sapCode;

	    @Column(name = "Description", length = 500)
	    private String description;

	    @Column(name = "Active", nullable = false)
	    private int active;

	    @Column(name = "UpdatedBy", length = 255)
	    private String updatedBy;

	    //@Temporal(TemporalType.TIMESTAMP)
	    @Column(name = "UpdateTime", nullable = false)
	    private Date updateTime;

		public MaterialMaster(Long id, String entryTime, String userId, String materialName,
				String internalMaterialCode, String sapCode, String description, int active, String updatedBy,
				Date updateTime) {
			super();
			this.id = id;
			this.entryTime = entryTime;
			this.userId = userId;
			this.materialName = materialName;
			this.internalMaterialCode = internalMaterialCode;
			this.sapCode = sapCode;
			this.description = description;
			this.active = active;
			this.updatedBy = updatedBy;
			this.updateTime = updateTime;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getEntryTime() {
			return entryTime;
		}

		public void setEntryTime(String entryTime) {
			this.entryTime = entryTime;
		}

		public String getUserId() {
			return userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public String getMaterialName() {
			return materialName;
		}

		public void setMaterialName(String materialName) {
			this.materialName = materialName;
		}

		public String getInternalMaterialCode() {
			return internalMaterialCode;
		}

		public void setInternalMaterialCode(String internalMaterialCode) {
			this.internalMaterialCode = internalMaterialCode;
		}

		public String getSapCode() {
			return sapCode;
		}

		public void setSapCode(String sapCode) {
			this.sapCode = sapCode;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public int getActive() {
			return active;
		}

		public void setActive(int active) {
			this.active = active;
		}

		public String getUpdatedBy() {
			return updatedBy;
		}

		public void setUpdatedBy(String updatedBy) {
			this.updatedBy = updatedBy;
		}

		public Date getUpdateTime() {
			return updateTime;
		}

		public void setUpdateTime(Date updateTime) {
			this.updateTime = updateTime;
		}

		@Override
		public String toString() {
			return "MaterialMaster [id=" + id + ", entryTime=" + entryTime + ", userId=" + userId + ", materialName="
					+ materialName + ", internalMaterialCode=" + internalMaterialCode + ", sapCode=" + sapCode
					+ ", description=" + description + ", active=" + active + ", updatedBy=" + updatedBy
					+ ", updateTime=" + updateTime + "]";
		}

		public MaterialMaster() {
			super();
		}

	  
	    
	    
	    
	    
	    
	    
}