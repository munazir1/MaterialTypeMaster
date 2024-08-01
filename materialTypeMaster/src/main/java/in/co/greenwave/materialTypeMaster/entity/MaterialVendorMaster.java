package in.co.greenwave.materialTypeMaster.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class MaterialVendorMaster {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String userId ;
	private LocalDateTime entryTime;
	private String materialName;
	private String materialSAPCode;
	private String materialCode;
	private String description;
	private String vendorName;
	private String vendorCode;
	private int usable;
	private String statusChangedBy;
	private int active;
	private String updatedBy;
	private LocalDateTime updateTime;
	
	
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
	
	public MaterialVendorMaster(String userId, LocalDateTime entryTime, String materialName, String materialSAPCode,
			String materialCode, String description, String vendorName, String vendorCode, int usable,
			String statusChangedBy, int active, String updatedBy, LocalDateTime updateTime) {
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
	
	
	public MaterialVendorMaster() {
		super();
	}
	
	
	@Override
	public String toString() {
		return "MaterialVendorMaster [userId=" + userId + ", entryTime=" + entryTime + ", materialName=" + materialName
				+ ", materialSAPCode=" + materialSAPCode + ", materialCode=" + materialCode + ", description="
				+ description + ", vendorName=" + vendorName + ", vendorCode=" + vendorCode + ", usable=" + usable
				+ ", statusChangedBy=" + statusChangedBy + ", active=" + active + ", updatedBy=" + updatedBy
				+ ", updateTime=" + updateTime + "]";
	}

	
}
