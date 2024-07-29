package in.co.greenwave.materialTypeMaster.entity;

import java.sql.Date;
import java.time.LocalDateTime;
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
	    private LocalDateTime entryTime;

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
	    @Column(name = "UpdateTime")
	    private LocalDateTime updateTime;
	    
	    

		public MaterialMaster() {
			super();
		}

		public MaterialMaster(Long id, LocalDateTime entryTime, String userId, String materialName,
				String internalMaterialCode, String sapCode, String description, int active, String updatedBy,
				LocalDateTime updateTime) {
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

		public LocalDateTime getEntryTime() {
			return entryTime;
		}

		public void setEntryTime(LocalDateTime entryTime) {
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

		public LocalDateTime getUpdateTime() {
			return updateTime;
		}

		public void setUpdateTime(LocalDateTime updateTime) {
			this.updateTime = updateTime;
		}

		@Override
		public String toString() {
			return "MaterialMaster [id=" + id + ", entryTime=" + entryTime + ", userId=" + userId + ", materialName="
					+ materialName + ", internalMaterialCode=" + internalMaterialCode + ", sapCode=" + sapCode
					+ ", description=" + description + ", active=" + active + ", updatedBy=" + updatedBy
					+ ", updateTime=" + updateTime + "]";
		}

		public MaterialMaster(String string, String string2, int i, LocalDateTime localDateTime, String string3, String string4, String string5) {
			super();
		}

		public MaterialMaster(String userId2, String internalMaterialCode2, int active2, LocalDateTime updateTime2,
				String description2, String sapCode2) {
			// TODO Auto-generated constructor stub
		}

	  
	    
	    
	    
	    
	    
	    
}