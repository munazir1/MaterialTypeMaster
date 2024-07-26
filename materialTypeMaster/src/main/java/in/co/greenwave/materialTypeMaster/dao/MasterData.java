package in.co.greenwave.materialTypeMaster.dao;

import java.time.LocalDateTime;



public class MasterData {
	 private LocalDateTime entryTime;
	    private String userId;
	    private String materialName;
	    private String internalMaterialCode;
	    private String sapCode;
	    private String description;
	    private int active;
	    private String updatedBy;
	    private LocalDateTime updateTime;
	    private String materialCode;
	    private String grnEntity;
	    private String consumptionEntity;
	    private String grnStdQty;
	    private String uom;
	    
	    
		public MasterData() {
			super();
			// TODO Auto-generated constructor stub
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
		public String getMaterialCode() {
			return materialCode;
		}
		public void setMaterialCode(String materialCode) {
			this.materialCode = materialCode;
		}
		public String getGrnEntity() {
			return grnEntity;
		}
		public void setGrnEntity(String grnEntity) {
			this.grnEntity = grnEntity;
		}
		public String getConsumptionEntity() {
			return consumptionEntity;
		}
		public void setConsumptionEntity(String consumptionEntity) {
			this.consumptionEntity = consumptionEntity;
		}
		public String getGrnStdQty() {
			return grnStdQty;
		}
		public void setGrnStdQty(String grnStdQty) {
			this.grnStdQty = grnStdQty;
		}
		public String getUom() {
			return uom;
		}
		public void setUom(String uom) {
			this.uom = uom;
		}
	    
		public MasterData(LocalDateTime entryTime, String userId, String materialName, String internalMaterialCode,
				String sapCode, String description, int active, String updatedBy, LocalDateTime updateTime,
				String materialCode, String grnEntity, String consumptionEntity, String grnStdQty, String uom) {
			super();
			this.entryTime = entryTime;
			this.userId = userId;
			this.materialName = materialName;
			this.internalMaterialCode = internalMaterialCode;
			this.sapCode = sapCode;
			this.description = description;
			this.active = active;
			this.updatedBy = updatedBy;
			this.updateTime = updateTime;
			this.materialCode = materialCode;
			this.grnEntity = grnEntity;
			this.consumptionEntity = consumptionEntity;
			this.grnStdQty = grnStdQty;
			this.uom = uom;
		}
	
	    

}
