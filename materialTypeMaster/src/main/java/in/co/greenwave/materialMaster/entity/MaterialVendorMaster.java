package in.co.greenwave.materialMaster.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
/*
 * @Data
 * 
 * @AllArgsConstructor
 * 
 * @NoArgsConstructor
 */
@Table(name="material_VendorMaster",uniqueConstraints = {@UniqueConstraint(columnNames = {"material_sapcode", "vendorCode", "active"})})

public class MaterialVendorMaster {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long id;
	private String userId ;
	@Column
	private LocalDateTime entryTime;
	@Column
	private String materialName;
	@Column(name="material_SAPCode")
	private String materialSAPCode;
	@Column
	private String materialCode;
	@Column
	private String description;
	@Column
	private String vendorName;
	@Column
	private String vendorCode;
	@Column
	private int usable;
	@Column
	private String statusChangedBy;
	@Column
	private int active;
	@Column
	private String updatedBy;
	@Column
	private LocalDateTime updateTime;
	
	
	
	 public MaterialVendorMaster() {
	        super();
	    }

	
	
	 public MaterialVendorMaster(String userId, LocalDateTime entryTime, String materialName, 
             String materialSAPCode, String materialCode, String description, 
             String vendorName, String vendorCode, int usable, 
             String statusChangedBy, int active, String updatedBy, 
             LocalDateTime updateTime) {
super();
this.userId = userId;
this.entryTime = entryTime;
this.materialName = materialName;
this.materialSAPCode = materialSAPCode;
this.materialCode = materialCode;
this.description = description;
this.vendorName = vendorName;
this.vendorCode = vendorCode;
this.usable = usable;
this.statusChangedBy = statusChangedBy;
this.active = active;
this.updatedBy = updatedBy;
this.updateTime = updateTime;
}

// Getters and setters
public String getUserId() {
return userId;
}

public void setUserId(String userId) {
this.userId = userId;
}

public LocalDateTime getEntryTime() {
return entryTime;
}

public void setEntryTime(LocalDateTime entryTime) {
this.entryTime = entryTime;
}

public String getMaterialName() {
return materialName;
}

public void setMaterialName(String materialName) {
this.materialName = materialName;
}

public String getMaterialSAPCode() {
return materialSAPCode;
}

public void setMaterialSAPCode(String materialSAPCode) {
this.materialSAPCode = materialSAPCode;
}

public String getMaterialCode() {
return materialCode;
}

public void setMaterialCode(String materialCode) {
this.materialCode = materialCode;
}

public String getDescription() {
return description;
}

public void setDescription(String description) {
this.description = description;
}

public String getVendorName() {
return vendorName;
}

public void setVendorName(String vendorName) {
this.vendorName = vendorName;
}

public String getVendorCode() {
return vendorCode;
}

public void setVendorCode(String vendorCode) {
this.vendorCode = vendorCode;
}

public int getUsable() {
return usable;
}

public void setUsable(int usable) {
this.usable = usable;
}

public String getStatusChangedBy() {
return statusChangedBy;
}

public void setStatusChangedBy(String statusChangedBy) {
this.statusChangedBy = statusChangedBy;
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
return "MaterialVendorMaster [userId=" + userId +
", entryTime=" + entryTime +
", materialName=" + materialName +
", materialSAPCode=" + materialSAPCode +
", materialCode=" + materialCode +
", description=" + description +
", vendorName=" + vendorName +
", vendorCode=" + vendorCode +
", usable=" + usable +
", statusChangedBy=" + statusChangedBy +
", active=" + active +
", updatedBy=" + updatedBy +
", updateTime=" + updateTime + "]";
}

	 

	
}
