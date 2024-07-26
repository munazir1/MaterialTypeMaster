package in.co.greenwave.materialTypeMaster.entity;

import java.time.LocalDateTime;
import java.util.Objects;

import org.springframework.web.bind.annotation.CrossOrigin;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="materialTypeMaster")
/*
 * @Getter
 * 
 * @Setter
 * 
 * @AllArgsConstructor
 * 
 * @NoArgsConstructor
 * 
 * @Data
 */

public class MaterialTypeMaster {
	
	   
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    @Column(name = "entryTime")
	    private LocalDateTime entryTime;

	    @Column(name = "userId")
	    private String userId;
       
	    
	    
	    @Column(name = "materialName")
	    private String materialName;

	    @Column(name = "materialCode")
	    private String materialCode;

	    @Column(name = "GRNEntity")
	    private String grnEntity;

	    @Column(name = "ConsumptionEntity")
	    private String consumptionEntity;

	    @Column(name = "GRNStdQty")
	    private String grnStdQty;

	    @Column(name = "UOM")
	    private String uom;
	    
	   
	    @Column(name = "Active")
	    private String active;

	    @Column(name = "UpdatedBy")
	    private String updatedBy;

	    @Column(name = "UpdateTime")
	    private LocalDateTime updateTime;

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

		public String getActive() {
			return active;
		}

		public void setActive(String active) {
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
		

		public MaterialTypeMaster() {
			super();
		}

		
		
		
		public MaterialTypeMaster(Long id, LocalDateTime entryTime, String userId, String materialName,
				String materialCode, String grnEntity, String consumptionEntity, String grnStdQty, String uom,
				String active, String updatedBy, LocalDateTime updateTime) {
			super();
			this.id = id;
			this.entryTime = entryTime;
			this.userId = userId;
			this.materialName = materialName;
			this.materialCode = materialCode;
			this.grnEntity = grnEntity;
			this.consumptionEntity = consumptionEntity;
			this.grnStdQty = grnStdQty;
			this.uom = uom;
			this.active = active;
			this.updatedBy = updatedBy;
			this.updateTime = updateTime;
		}

		@Override
		public String toString() {
			return "MaterialTypeMaster [id=" + id + ", entryTime=" + entryTime + ", userId=" + userId
					+ ", materialName=" + materialName + ", materialCode=" + materialCode + ", grnEntity=" + grnEntity
					+ ", consumptionEntity=" + consumptionEntity + ", grnStdQty=" + grnStdQty + ", uom=" + uom
					+ ", active=" + active + ", updatedBy=" + updatedBy + ", updateTime=" + updateTime + "]";
		}

		@Override
		public int hashCode() {
			return Objects.hash(active, consumptionEntity, entryTime, grnEntity, grnStdQty, id, materialCode,
					materialName, uom, updateTime, updatedBy, userId);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			MaterialTypeMaster other = (MaterialTypeMaster) obj;
			return Objects.equals(active, other.active) && Objects.equals(consumptionEntity, other.consumptionEntity)
					&& Objects.equals(entryTime, other.entryTime) && Objects.equals(grnEntity, other.grnEntity)
					&& Objects.equals(grnStdQty, other.grnStdQty) && Objects.equals(id, other.id)
					&& Objects.equals(materialCode, other.materialCode)
					&& Objects.equals(materialName, other.materialName) && Objects.equals(uom, other.uom)
					&& Objects.equals(updateTime, other.updateTime) && Objects.equals(updatedBy, other.updatedBy)
					&& Objects.equals(userId, other.userId);
		}

	
}
