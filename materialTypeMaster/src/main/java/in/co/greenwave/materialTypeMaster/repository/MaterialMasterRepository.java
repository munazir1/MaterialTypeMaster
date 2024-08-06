package in.co.greenwave.materialTypeMaster.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import in.co.greenwave.materialTypeMaster.entity.MaterialMaster;

@Repository

public interface MaterialMasterRepository extends JpaRepository<MaterialMaster, Long> {
	
	
	
	@Query(value="SELECT  distinct material_name  FROM [dbo].[material_type_master] where  active=1", nativeQuery = true)
	public List<Object> getMaterialData( ) ;
	
	@Query(value="SELECT distinct [sapcode] FROM [dbo].[material_master]  where  active=1 and material_name=:materialName",nativeQuery = true)
	public List<String> getSapCode(@Param("materialName") String materialName ) ;

	/*
	 * @Query(value="",nativeQuery = true)
	 * 
	 * public String saveMaterialMAster() ;
	 * 
	 */
	// ;
	
	
	
}
